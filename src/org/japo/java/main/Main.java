/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {
public static final Random RND = new Random();
    public static void main(String[] args) {
        //Constantes
        final int Num_Max = 6;
        final int Num_min = 1;
        //Variable
        int Numero;
        // Tirada
        Numero = RND.nextInt(Num_Max - Num_min + 1) + Num_min;
        System.out.printf("Tirada dado .....:  %d%n", Numero);
        
    }
}
