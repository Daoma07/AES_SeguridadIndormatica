/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;
import recursos.SBox;
/**
 *
 * @author HP
 */
public class SubBytes {
    
    SBox sBox = new SBox();

    public String[][] SubBytes(String[][] caracter) {
        String[][] subytes = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                subytes[j][i] = sBox.s_box(caracter[j][i]);
            }
        }
        return subytes;
    }

}
