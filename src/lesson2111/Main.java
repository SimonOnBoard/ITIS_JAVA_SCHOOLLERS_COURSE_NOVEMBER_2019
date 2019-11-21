package lesson2111;

import javax.print.attribute.standard.PrinterResolution;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static List<Producer> producers = new ArrayList<>();
    public static ArrayList<Film> films = new ArrayList<>();
    public static ArrayList<Actor> actors = new ArrayList<>();
    public static ArrayList<ActorFilm> actorFilms = new ArrayList<>();
    public static Scanner sc;
    public static String s;
    public static String[] strings;


    public static void main(String[] args) throws IOException {
        loadProducers();
        loadFilms();
        loadActors();
        loadActorFilms();
        zapisatImenaGrupyKtoSegodnaBul(new String[]{"Карим Бисеров",
                "Ильдар Бикчентаев","Егор Саруханов", "Альберт насыров","Камила Дмитриева","Рома Емельянов"});
        ArrayList<Film> currentFilms = getCurrentFilmsProdAndYear(producers.get(1), 2000);
        System.out.println(producers.get(1).toString());
        for (Film film : currentFilms) {
            System.out.println(film);
        }
        ArrayList<Relations> stat = getCurrentStatProdAndActor();
        //System.out.println();
        ArrayList<Actor> currentActors = getActorsByYearDistinctProd(2011);
        //System.out.println();
    }

    private static void zapisatImenaGrupyKtoSegodnaBul(String[] strings) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("group.txt")),true);
        for(String string : strings){
            printWriter.println(string);
        }
        printWriter.close();
    }

    private static ArrayList<Actor> getActorsByYearDistinctProd(int i) {
        ArrayList<Actor> act =
                actors.stream().filter(actor -> {
                    ArrayList<Long> ids = new ArrayList<>();
                    actorFilms.stream().filter(actorFilm -> actorFilm.getIdAct() == actor.getId())
                            .forEach(actorFilm -> ids.add(actorFilm.getIdFilm()));
                    ArrayList<Film> fil = films.stream().filter(film -> (film.getYear() >= i)).filter(film -> ids.contains(film.getId())).collect(Collectors.toCollection(ArrayList::new));
                    int filSize = fil.size();
                    if (filSize != 0) {
                        long idProd = fil.get(0).getIdProd();
                        if (filSize == fil.stream().filter(film -> film.getIdProd() == idProd).count()) {
                            return true;
                        }
                    }
                    return false;
                }).collect(Collectors.toCollection(ArrayList::new));
        return act;
    }

    private static ArrayList<Relations> getCurrentStatProdAndActor() {
        ArrayList<Relations> rel = new ArrayList<>();
        for (Producer producer : producers) {
            for (Actor actor : actors) {
                long counter = 0;
                for (ActorFilm actorFilm : actorFilms) {
                    if (actorFilm.getIdAct() == actor.getId()) {
                        if (getCurrentFilm(actorFilm.getIdFilm()).getIdProd() == producer.getId()) {
                            counter++;
                        }
                    }
                }
                rel.add(new Relations(producer, actor, counter));
            }
        }
        return rel;
    }

    private static Film getCurrentFilm(long idFilm) {
        for (Film film : films) {
            if (film.getId() == idFilm) {
                return film;
            }
        }
        throw new IllegalStateException();
    }

    private static void loadActorFilms() throws FileNotFoundException {
        sc = new Scanner(new File("actorfilms.txt"));
        s = sc.nextLine();
        while (sc.hasNextLine()) {
            strings = s.split("\t");
            actorFilms.add(new ActorFilm(Long.parseLong(strings[0]), Long.parseLong(strings[1]), strings[2]));
            s = sc.nextLine();
        }
        strings = s.split("\t");
        actorFilms.add(new ActorFilm(Long.parseLong(strings[0]), Long.parseLong(strings[1]), strings[2]));
    }

    private static void loadActors() throws FileNotFoundException {
        sc = new Scanner(new File("actors.txt"));
        s = sc.nextLine();
        while (sc.hasNextLine()) {
            strings = s.split("\t");
            actors.add(new Actor(strings[0], strings[1], strings[2], Long.parseLong(strings[3]), Long.parseLong(strings[4])));
            s = sc.nextLine();
        }
        strings = s.split("\t");
        actors.add(new Actor(strings[0], strings[1], strings[2], Long.parseLong(strings[3]), Long.parseLong(strings[4])));
    }

    private static ArrayList<Film> getCurrentFilmsProdAndYear(Producer producer, int i) {
        return films.stream().filter(film -> film.getIdProd() == producer.getId() && film.getYear() < i).collect(Collectors.toCollection(ArrayList::new));
    }

    private static void loadFilms() throws FileNotFoundException {
        sc = new Scanner(new File("films.txt"));
        s = sc.nextLine();
        while (sc.hasNextLine()) {
            strings = s.split("\t");
            films.add(new Film(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3])));
            s = sc.nextLine();
        }
        strings = s.split("\t");
        films.add(new Film(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3])));
    }

    private static void loadProducers() throws FileNotFoundException {
        sc = new Scanner(new File("producer.txt"));
        s = sc.nextLine();
        while (sc.hasNextLine()) {
            //System.out.print("Haha\n");
            strings = s.split("\t");
            Producer p = new Producer(Long.parseLong(strings[0]), strings[2], strings[1], strings[3]);
            producers.add(p);
            s = sc.nextLine();
        }
        strings = s.split("\t");
        Producer p = new Producer(Integer.parseInt(strings[0]), strings[2], strings[1], strings[3]);
        producers.add(p);
    }
}
