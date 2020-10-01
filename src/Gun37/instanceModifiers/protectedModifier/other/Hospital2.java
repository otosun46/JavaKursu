/*
Author:Otosun
Tarih :14/07/2020
*/
package Gun37.instanceModifiers.protectedModifier.other;

import Gun37.instanceModifiers.protectedModifier.same.Doctor;

public class Hospital2 {
    public static void main(String[] args) {
        //  Doctor dr3=new Doctor();  //protected olduğunda default gibi
        // diğer paketlerden kullanılamıyor.

        Doctor dr3 = new Doctor("Hasan");// bu erişim public olduğundan kullanılabildi.

        // erişim belirteci protected olduğundan kullanılamaz.
        //dr4.print();

    }
}
