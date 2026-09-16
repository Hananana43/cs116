package week 3;

import java.util.ArrayList;

public class Party{
    private int battlesWon;
    private ArrayList<Character> members;

    public Party{
        this.battlesWon=0;
        this.members=new ArrayList<>();

    }


    public void addCharacter(Character men){
        this members.add(men);
    }

    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0; x<this.members.size(); x++){
            this.members.
        }
    }

    //add characters
    //winBattle


    //obj:add headers to characters 
    //headers basically define wtf vars are before using them 
    Run main |Debug main
    pulic static void main(String[] args){
        Character hero1=new Character();
        Character hero2= ne Character();
        hero1.winBattle(10);
        Party party = new Party();
        party.addCharacter(hero1);
        party.addCharacter(hero2);
        party.winBattle(20);
    }
}