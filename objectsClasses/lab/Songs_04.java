package objectsClasses.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs_04 {
    static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int songsNmbr = Integer.parseInt(scanner.nextLine());
        List<Song> listSong = new ArrayList<>();
        for (int i = 0; i < songsNmbr; i++) {
            String[] inpSongArr = scanner.nextLine().split("_");
            Song song = new Song(inpSongArr[0],inpSongArr[1],inpSongArr[2]);
            listSong.add(song);
        }
        String command = scanner.nextLine();
        if(command.equals("all")){
            for (Song item : listSong) {
                System.out.println(item.getName());
            }
            }else{
                for (Song item : listSong
                     ) {
                    if(item.getTypeList().equals(command)) {
                        System.out.println(item.getName());
                    }
                }
            }
        }
    }

