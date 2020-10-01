/*
Author:Otosun
Tarih :14/07/2020
*/
package Gun37.instanceModifiers.protectedModifier.same;

public class Doctor {
   protected String name;


    protected Doctor(){

    }

    public Doctor(String name) {
        this.name = name;
    }

    protected void print(){
        System.out.println("name = " + name);
    }
}
