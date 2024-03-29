/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sergio.Betancourt;

/**
 * Esta clase tiene los metodos necesarios para la normalizacion de algún valor 
 * numerico, tales como la media aritmetica, la tabla de normalización, desviacion
 * estandar y su respectivo valor en porcentaje.
 * 
 * Para la normalización se decidio crear dos arreglos que indican los valores 
 * de la desviacion estandar del valor numerico que se desea evaluar.
 * @author SABAGIP
 */
public class TablaNormalizacion {

    /**
     * El siguiente constructor recibe un valor numerico de tipo double, el cual
     * es la desviacion estandar de los contadores de cada idioma.
     * 
     * Contiene dos arreglos, el primero contiene la desviacion estandar y el 
     * segundo su respectivo porcentaje, esto para sacar su valor normalizado.
     * 
     */
    public double normalizacion(double numero) {
        
        // Declaracion de los arreglos y variables necesarias
        double datoNormalizado[] = new double[400];
        double porcentaje[] = new double[400];
        int posicionDato = 0;
        double valor = 0;

        datoNormalizado[0] = 0.00;
        datoNormalizado[1] = 0.01;
        datoNormalizado[2] = 0.02;
        datoNormalizado[3] = 0.03;
        datoNormalizado[4] = 0.04;
        datoNormalizado[5] = 0.05;
        datoNormalizado[6] = 0.06;
        datoNormalizado[7] = 0.07;
        datoNormalizado[8] = 0.08;
        datoNormalizado[9] = 0.09;
        datoNormalizado[10] = 0.10;
        datoNormalizado[11] = 0.11;
        datoNormalizado[12] = 0.12;
        datoNormalizado[13] = 0.13;
        datoNormalizado[14] = 0.14;
        datoNormalizado[15] = 0.15;
        datoNormalizado[16] = 0.16;
        datoNormalizado[17] = 0.17;
        datoNormalizado[18] = 0.18;
        datoNormalizado[19] = 0.19;
        datoNormalizado[20] = 0.20;
        datoNormalizado[21] = 0.21;
        datoNormalizado[22] = 0.22;
        datoNormalizado[23] = 0.23;
        datoNormalizado[24] = 0.24;
        datoNormalizado[25] = 0.25;
        datoNormalizado[26] = 0.26;
        datoNormalizado[27] = 0.27;
        datoNormalizado[28] = 0.28;
        datoNormalizado[29] = 0.29;
        datoNormalizado[30] = 0.30;
        datoNormalizado[31] = 0.31;
        datoNormalizado[32] = 0.32;
        datoNormalizado[33] = 0.33;
        datoNormalizado[34] = 0.34;
        datoNormalizado[35] = 0.35;
        datoNormalizado[36] = 0.36;
        datoNormalizado[37] = 0.37;
        datoNormalizado[38] = 0.38;
        datoNormalizado[39] = 0.39;
        datoNormalizado[40] = 0.40;
        datoNormalizado[41] = 0.41;
        datoNormalizado[42] = 0.42;
        datoNormalizado[43] = 0.43;
        datoNormalizado[44] = 0.44;
        datoNormalizado[45] = 0.45;
        datoNormalizado[46] = 0.46;
        datoNormalizado[47] = 0.47;
        datoNormalizado[48] = 0.48;
        datoNormalizado[49] = 0.49;
        datoNormalizado[50] = 0.50;
        datoNormalizado[51] = 0.51;
        datoNormalizado[52] = 0.52;
        datoNormalizado[53] = 0.53;
        datoNormalizado[54] = 0.54;
        datoNormalizado[55] = 0.55;
        datoNormalizado[56] = 0.56;
        datoNormalizado[57] = 0.57;
        datoNormalizado[58] = 0.58;
        datoNormalizado[59] = 0.59;
        datoNormalizado[60] = 0.60;
        datoNormalizado[61] = 0.61;
        datoNormalizado[62] = 0.62;
        datoNormalizado[63] = 0.63;
        datoNormalizado[64] = 0.64;
        datoNormalizado[65] = 0.65;
        datoNormalizado[66] = 0.66;
        datoNormalizado[67] = 0.67;
        datoNormalizado[68] = 0.68;
        datoNormalizado[69] = 0.69;
        datoNormalizado[70] = 0.70;
        datoNormalizado[71] = 0.71;
        datoNormalizado[72] = 0.72;
        datoNormalizado[73] = 0.73;
        datoNormalizado[74] = 0.74;
        datoNormalizado[75] = 0.75;
        datoNormalizado[76] = 0.76;
        datoNormalizado[77] = 0.77;
        datoNormalizado[78] = 0.78;
        datoNormalizado[79] = 0.79;
        datoNormalizado[80] = 0.80;
        datoNormalizado[81] = 0.81;
        datoNormalizado[82] = 0.82;
        datoNormalizado[83] = 0.83;
        datoNormalizado[84] = 0.84;
        datoNormalizado[85] = 0.85;
        datoNormalizado[86] = 0.86;
        datoNormalizado[87] = 0.87;
        datoNormalizado[88] = 0.88;
        datoNormalizado[89] = 0.89;
        datoNormalizado[90] = 0.90;
        datoNormalizado[91] = 0.91;
        datoNormalizado[92] = 0.92;
        datoNormalizado[93] = 0.93;
        datoNormalizado[94] = 0.94;
        datoNormalizado[95] = 0.95;
        datoNormalizado[96] = 0.96;
        datoNormalizado[97] = 0.97;
        datoNormalizado[98] = 0.98;
        datoNormalizado[99] = 0.99;
        datoNormalizado[100] = 1.00;
        datoNormalizado[101] = 1.01;
        datoNormalizado[102] = 1.02;
        datoNormalizado[103] = 1.03;
        datoNormalizado[104] = 1.04;
        datoNormalizado[105] = 1.05;
        datoNormalizado[106] = 1.06;
        datoNormalizado[107] = 1.07;
        datoNormalizado[108] = 1.08;
        datoNormalizado[109] = 1.09;
        datoNormalizado[110] = 1.10;
        datoNormalizado[111] = 1.11;
        datoNormalizado[112] = 1.12;
        datoNormalizado[113] = 1.13;
        datoNormalizado[114] = 1.14;
        datoNormalizado[115] = 1.15;
        datoNormalizado[116] = 1.16;
        datoNormalizado[117] = 1.17;
        datoNormalizado[118] = 1.18;
        datoNormalizado[119] = 1.19;
        datoNormalizado[120] = 1.20;
        datoNormalizado[121] = 1.21;
        datoNormalizado[122] = 1.22;
        datoNormalizado[123] = 1.23;
        datoNormalizado[124] = 1.24;
        datoNormalizado[125] = 1.25;
        datoNormalizado[126] = 1.26;
        datoNormalizado[127] = 1.27;
        datoNormalizado[128] = 1.28;
        datoNormalizado[129] = 1.29;
        datoNormalizado[130] = 1.30;
        datoNormalizado[131] = 1.31;
        datoNormalizado[132] = 1.32;
        datoNormalizado[133] = 1.33;
        datoNormalizado[134] = 1.34;
        datoNormalizado[135] = 1.35;
        datoNormalizado[136] = 1.36;
        datoNormalizado[137] = 1.37;
        datoNormalizado[138] = 1.38;
        datoNormalizado[139] = 1.39;
        datoNormalizado[140] = 1.40;
        datoNormalizado[141] = 1.41;
        datoNormalizado[142] = 1.42;
        datoNormalizado[143] = 1.43;
        datoNormalizado[144] = 1.44;
        datoNormalizado[145] = 1.45;
        datoNormalizado[146] = 1.46;
        datoNormalizado[147] = 1.47;
        datoNormalizado[148] = 1.48;
        datoNormalizado[149] = 1.49;
        datoNormalizado[150] = 1.50;
        datoNormalizado[151] = 1.51;
        datoNormalizado[152] = 1.52;
        datoNormalizado[153] = 1.53;
        datoNormalizado[154] = 1.54;
        datoNormalizado[155] = 1.55;
        datoNormalizado[156] = 1.56;
        datoNormalizado[157] = 1.57;
        datoNormalizado[158] = 1.58;
        datoNormalizado[159] = 1.59;
        datoNormalizado[160] = 1.60;
        datoNormalizado[161] = 1.61;
        datoNormalizado[162] = 1.62;
        datoNormalizado[163] = 1.63;
        datoNormalizado[164] = 1.64;
        datoNormalizado[165] = 1.65;
        datoNormalizado[166] = 1.66;
        datoNormalizado[167] = 1.67;
        datoNormalizado[168] = 1.68;
        datoNormalizado[169] = 1.69;
        datoNormalizado[170] = 1.70;
        datoNormalizado[171] = 1.71;
        datoNormalizado[172] = 1.72;
        datoNormalizado[173] = 1.73;
        datoNormalizado[174] = 1.74;
        datoNormalizado[175] = 1.75;
        datoNormalizado[176] = 1.76;
        datoNormalizado[177] = 1.77;
        datoNormalizado[178] = 1.78;
        datoNormalizado[179] = 1.79;
        datoNormalizado[180] = 1.80;
        datoNormalizado[181] = 1.81;
        datoNormalizado[182] = 1.82;
        datoNormalizado[183] = 1.83;
        datoNormalizado[184] = 1.84;
        datoNormalizado[185] = 1.85;
        datoNormalizado[186] = 1.86;
        datoNormalizado[187] = 1.87;
        datoNormalizado[188] = 1.88;
        datoNormalizado[189] = 1.89;
        datoNormalizado[190] = 1.90;
        datoNormalizado[191] = 1.91;
        datoNormalizado[192] = 1.92;
        datoNormalizado[193] = 1.93;
        datoNormalizado[194] = 1.94;
        datoNormalizado[195] = 1.95;
        datoNormalizado[196] = 1.96;
        datoNormalizado[197] = 1.97;
        datoNormalizado[198] = 1.98;
        datoNormalizado[199] = 1.99;
        datoNormalizado[200] = 2.00;
        datoNormalizado[201] = 2.01;
        datoNormalizado[202] = 2.02;
        datoNormalizado[203] = 2.03;
        datoNormalizado[204] = 2.04;
        datoNormalizado[205] = 2.05;
        datoNormalizado[206] = 2.06;
        datoNormalizado[207] = 2.07;
        datoNormalizado[208] = 2.08;
        datoNormalizado[209] = 2.09;
        datoNormalizado[210] = 2.10;
        datoNormalizado[211] = 2.11;
        datoNormalizado[212] = 2.12;
        datoNormalizado[213] = 2.13;
        datoNormalizado[214] = 2.14;
        datoNormalizado[215] = 2.15;
        datoNormalizado[216] = 2.16;
        datoNormalizado[217] = 2.17;
        datoNormalizado[218] = 2.18;
        datoNormalizado[219] = 2.19;
        datoNormalizado[220] = 2.20;
        datoNormalizado[221] = 2.21;
        datoNormalizado[222] = 2.22;
        datoNormalizado[223] = 2.23;
        datoNormalizado[224] = 2.24;
        datoNormalizado[225] = 2.25;
        datoNormalizado[226] = 2.26;
        datoNormalizado[227] = 2.27;
        datoNormalizado[228] = 2.28;
        datoNormalizado[229] = 2.29;
        datoNormalizado[230] = 2.30;
        datoNormalizado[231] = 2.31;
        datoNormalizado[232] = 2.32;
        datoNormalizado[233] = 2.33;
        datoNormalizado[234] = 2.34;
        datoNormalizado[235] = 2.35;
        datoNormalizado[236] = 2.36;
        datoNormalizado[237] = 2.37;
        datoNormalizado[238] = 2.38;
        datoNormalizado[239] = 2.39;
        datoNormalizado[240] = 2.40;
        datoNormalizado[241] = 2.41;
        datoNormalizado[242] = 2.42;
        datoNormalizado[243] = 2.43;
        datoNormalizado[244] = 2.44;
        datoNormalizado[245] = 2.45;
        datoNormalizado[246] = 2.46;
        datoNormalizado[247] = 2.47;
        datoNormalizado[248] = 2.48;
        datoNormalizado[249] = 2.49;
        datoNormalizado[250] = 2.50;
        datoNormalizado[251] = 2.51;
        datoNormalizado[252] = 2.52;
        datoNormalizado[253] = 2.53;
        datoNormalizado[254] = 2.54;
        datoNormalizado[255] = 2.55;
        datoNormalizado[256] = 2.56;
        datoNormalizado[257] = 2.57;
        datoNormalizado[258] = 2.58;
        datoNormalizado[259] = 2.59;
        datoNormalizado[260] = 2.60;
        datoNormalizado[261] = 2.61;
        datoNormalizado[262] = 2.62;
        datoNormalizado[263] = 2.63;
        datoNormalizado[264] = 2.64;
        datoNormalizado[265] = 2.65;
        datoNormalizado[266] = 2.66;
        datoNormalizado[267] = 2.67;
        datoNormalizado[268] = 2.68;
        datoNormalizado[269] = 2.69;
        datoNormalizado[270] = 2.70;
        datoNormalizado[271] = 2.71;
        datoNormalizado[272] = 2.72;
        datoNormalizado[273] = 2.73;
        datoNormalizado[274] = 2.74;
        datoNormalizado[275] = 2.75;
        datoNormalizado[276] = 2.76;
        datoNormalizado[277] = 2.77;
        datoNormalizado[278] = 2.78;
        datoNormalizado[279] = 2.79;
        datoNormalizado[280] = 2.80;
        datoNormalizado[281] = 2.81;
        datoNormalizado[282] = 2.82;
        datoNormalizado[283] = 2.83;
        datoNormalizado[284] = 2.84;
        datoNormalizado[285] = 2.85;
        datoNormalizado[286] = 2.86;
        datoNormalizado[287] = 2.87;
        datoNormalizado[288] = 2.88;
        datoNormalizado[289] = 2.89;
        datoNormalizado[290] = 2.90;
        datoNormalizado[291] = 2.91;
        datoNormalizado[292] = 2.92;
        datoNormalizado[293] = 2.93;
        datoNormalizado[294] = 2.94;
        datoNormalizado[295] = 2.95;
        datoNormalizado[296] = 2.96;
        datoNormalizado[297] = 2.97;
        datoNormalizado[298] = 2.98;
        datoNormalizado[299] = 2.99;
        datoNormalizado[300] = 3.00;
        datoNormalizado[301] = 3.01;
        datoNormalizado[302] = 3.02;
        datoNormalizado[303] = 3.03;
        datoNormalizado[304] = 3.04;
        datoNormalizado[305] = 3.05;
        datoNormalizado[306] = 3.06;
        datoNormalizado[307] = 3.07;
        datoNormalizado[308] = 3.08;
        datoNormalizado[309] = 3.09;
        datoNormalizado[310] = 3.10;
        datoNormalizado[311] = 3.11;
        datoNormalizado[312] = 3.12;
        datoNormalizado[313] = 3.13;
        datoNormalizado[314] = 3.14;
        datoNormalizado[315] = 3.15;
        datoNormalizado[316] = 3.16;
        datoNormalizado[317] = 3.17;
        datoNormalizado[318] = 3.18;
        datoNormalizado[319] = 3.19;
        datoNormalizado[320] = 3.20;
        datoNormalizado[321] = 3.21;
        datoNormalizado[322] = 3.22;
        datoNormalizado[323] = 3.23;
        datoNormalizado[324] = 3.24;
        datoNormalizado[325] = 3.25;
        datoNormalizado[326] = 3.26;
        datoNormalizado[327] = 3.27;
        datoNormalizado[328] = 3.28;
        datoNormalizado[329] = 3.29;
        datoNormalizado[330] = 3.30;
        datoNormalizado[331] = 3.31;
        datoNormalizado[332] = 3.32;
        datoNormalizado[333] = 3.33;
        datoNormalizado[334] = 3.34;
        datoNormalizado[335] = 3.35;
        datoNormalizado[336] = 3.36;
        datoNormalizado[337] = 3.37;
        datoNormalizado[338] = 3.38;
        datoNormalizado[339] = 3.39;
        datoNormalizado[340] = 3.40;
        datoNormalizado[341] = 3.41;
        datoNormalizado[342] = 3.42;
        datoNormalizado[343] = 3.43;
        datoNormalizado[344] = 3.44;
        datoNormalizado[345] = 3.45;
        datoNormalizado[346] = 3.46;
        datoNormalizado[347] = 3.47;
        datoNormalizado[348] = 3.48;
        datoNormalizado[349] = 3.49;
        datoNormalizado[350] = 3.50;
        datoNormalizado[351] = 3.51;
        datoNormalizado[352] = 3.52;
        datoNormalizado[353] = 3.53;
        datoNormalizado[354] = 3.54;
        datoNormalizado[355] = 3.55;
        datoNormalizado[356] = 3.56;
        datoNormalizado[357] = 3.57;
        datoNormalizado[358] = 3.58;
        datoNormalizado[359] = 3.59;
        datoNormalizado[360] = 3.60;
        datoNormalizado[361] = 3.61;
        datoNormalizado[362] = 3.62;
        datoNormalizado[363] = 3.63;
        datoNormalizado[364] = 3.64;
        datoNormalizado[365] = 3.65;
        datoNormalizado[366] = 3.66;
        datoNormalizado[367] = 3.67;
        datoNormalizado[368] = 3.68;
        datoNormalizado[369] = 3.69;
        datoNormalizado[370] = 3.70;
        datoNormalizado[371] = 3.71;
        datoNormalizado[372] = 3.72;
        datoNormalizado[373] = 3.73;
        datoNormalizado[374] = 3.74;
        datoNormalizado[375] = 3.75;
        datoNormalizado[376] = 3.76;
        datoNormalizado[377] = 3.77;
        datoNormalizado[378] = 3.78;
        datoNormalizado[379] = 3.79;
        datoNormalizado[380] = 3.80;
        datoNormalizado[381] = 3.81;
        datoNormalizado[382] = 3.82;
        datoNormalizado[383] = 3.83;
        datoNormalizado[384] = 3.84;
        datoNormalizado[385] = 3.85;
        datoNormalizado[386] = 3.86;
        datoNormalizado[387] = 3.87;
        datoNormalizado[388] = 3.88;
        datoNormalizado[389] = 3.89;
        datoNormalizado[390] = 3.90;
        datoNormalizado[391] = 3.91;
        datoNormalizado[392] = 3.92;
        datoNormalizado[393] = 3.93;
        datoNormalizado[394] = 3.94;
        datoNormalizado[395] = 3.95;
        datoNormalizado[396] = 3.96;
        datoNormalizado[397] = 3.97;
        datoNormalizado[398] = 3.98;
        datoNormalizado[399] = 3.99;

        porcentaje[0] = 0.00;
        porcentaje[1] = 0.40;
        porcentaje[2] = 0.80;
        porcentaje[3] = 1.20;
        porcentaje[4] = 1.60;
        porcentaje[5] = 1.99;
        porcentaje[6] = 2.39;
        porcentaje[7] = 2.79;
        porcentaje[8] = 3.19;
        porcentaje[9] = 3.59;
        porcentaje[10] = 3.98;
        porcentaje[11] = 4.38;
        porcentaje[12] = 4.78;
        porcentaje[13] = 5.17;
        porcentaje[14] = 5.57;
        porcentaje[15] = 5.96;
        porcentaje[16] = 6.36;
        porcentaje[17] = 6.75;
        porcentaje[18] = 7.14;
        porcentaje[19] = 7.54;
        porcentaje[20] = 7.93;
        porcentaje[21] = 8.32;
        porcentaje[22] = 8.71;
        porcentaje[23] = 9.10;
        porcentaje[24] = 9.48;
        porcentaje[25] = 9.87;
        porcentaje[26] = 10.26;
        porcentaje[27] = 10.64;
        porcentaje[28] = 11.03;
        porcentaje[29] = 11.41;
        porcentaje[30] = 11.79;
        porcentaje[31] = 12.17;
        porcentaje[32] = 12.55;
        porcentaje[33] = 12.93;
        porcentaje[34] = 13.31;
        porcentaje[35] = 13.68;
        porcentaje[36] = 14.06;
        porcentaje[37] = 14.43;
        porcentaje[38] = 14.80;
        porcentaje[39] = 15.17;
        porcentaje[40] = 15.54;
        porcentaje[41] = 15.91;
        porcentaje[42] = 16.28;
        porcentaje[43] = 16.64;
        porcentaje[44] = 17.00;
        porcentaje[45] = 17.36;
        porcentaje[46] = 17.72;
        porcentaje[47] = 18.08;
        porcentaje[48] = 18.44;
        porcentaje[49] = 18.79;
        porcentaje[50] = 19.15;
        porcentaje[51] = 19.50;
        porcentaje[52] = 19.85;
        porcentaje[53] = 20.19;
        porcentaje[54] = 20.54;
        porcentaje[55] = 20.88;
        porcentaje[56] = 21.23;
        porcentaje[57] = 21.57;
        porcentaje[58] = 21.90;
        porcentaje[59] = 22.24;
        porcentaje[60] = 22.58;
        porcentaje[61] = 22.91;
        porcentaje[62] = 23.24;
        porcentaje[63] = 23.57;
        porcentaje[64] = 23.89;
        porcentaje[65] = 24.22;
        porcentaje[66] = 24.54;
        porcentaje[67] = 24.86;
        porcentaje[68] = 25.18;
        porcentaje[69] = 25.49;
        porcentaje[70] = 25.80;
        porcentaje[71] = 26.12;
        porcentaje[72] = 26.42;
        porcentaje[73] = 26.73;
        porcentaje[74] = 27.04;
        porcentaje[75] = 27.34;
        porcentaje[76] = 27.64;
        porcentaje[77] = 27.94;
        porcentaje[78] = 28.23;
        porcentaje[79] = 28.52;
        porcentaje[80] = 28.81;
        porcentaje[81] = 29.10;
        porcentaje[82] = 29.39;
        porcentaje[83] = 29.67;
        porcentaje[84] = 29.96;
        porcentaje[85] = 30.23;
        porcentaje[86] = 30.51;
        porcentaje[87] = 30.78;
        porcentaje[88] = 31.06;
        porcentaje[89] = 31.33;
        porcentaje[90] = 31.59;
        porcentaje[91] = 31.86;
        porcentaje[92] = 32.12;
        porcentaje[93] = 32.38;
        porcentaje[94] = 32.64;
        porcentaje[95] = 32.89;
        porcentaje[96] = 33.15;
        porcentaje[97] = 33.40;
        porcentaje[98] = 33.65;
        porcentaje[99] = 33.89;
        porcentaje[100] = 34.13;
        porcentaje[101] = 34.38;
        porcentaje[102] = 34.61;
        porcentaje[103] = 34.85;
        porcentaje[104] = 35.08;
        porcentaje[105] = 35.31;
        porcentaje[106] = 35.54;
        porcentaje[107] = 35.77;
        porcentaje[108] = 35.99;
        porcentaje[109] = 36.21;
        porcentaje[110] = 36.43;
        porcentaje[111] = 36.65;
        porcentaje[112] = 36.86;
        porcentaje[113] = 37.08;
        porcentaje[114] = 37.29;
        porcentaje[115] = 37.49;
        porcentaje[116] = 37.70;
        porcentaje[117] = 37.90;
        porcentaje[118] = 38.10;
        porcentaje[119] = 38.30;
        porcentaje[120] = 38.49;
        porcentaje[121] = 38.69;
        porcentaje[122] = 38.88;
        porcentaje[123] = 39.07;
        porcentaje[124] = 39.25;
        porcentaje[125] = 39.44;
        porcentaje[126] = 39.62;
        porcentaje[127] = 39.80;
        porcentaje[128] = 39.97;
        porcentaje[129] = 40.15;
        porcentaje[130] = 40.32;
        porcentaje[131] = 40.49;
        porcentaje[132] = 40.66;
        porcentaje[133] = 40.82;
        porcentaje[134] = 40.99;
        porcentaje[135] = 41.15;
        porcentaje[136] = 41.31;
        porcentaje[137] = 41.47;
        porcentaje[138] = 41.62;
        porcentaje[139] = 41.77;
        porcentaje[140] = 41.92;
        porcentaje[141] = 42.07;
        porcentaje[142] = 42.22;
        porcentaje[143] = 42.36;
        porcentaje[144] = 42.51;
        porcentaje[145] = 42.65;
        porcentaje[146] = 42.79;
        porcentaje[147] = 42.92;
        porcentaje[148] = 43.06;
        porcentaje[149] = 43.19;
        porcentaje[150] = 43.32;
        porcentaje[151] = 43.45;
        porcentaje[152] = 43.57;
        porcentaje[153] = 43.70;
        porcentaje[154] = 43.82;
        porcentaje[155] = 43.94;
        porcentaje[156] = 44.06;
        porcentaje[157] = 44.18;
        porcentaje[158] = 44.29;
        porcentaje[159] = 44.41;
        porcentaje[160] = 44.52;
        porcentaje[161] = 44.63;
        porcentaje[162] = 44.74;
        porcentaje[163] = 44.84;
        porcentaje[164] = 44.95;
        porcentaje[165] = 45.05;
        porcentaje[166] = 45.15;
        porcentaje[167] = 45.25;
        porcentaje[168] = 45.35;
        porcentaje[169] = 45.45;
        porcentaje[170] = 45.54;
        porcentaje[171] = 45.64;
        porcentaje[172] = 45.73;
        porcentaje[173] = 45.82;
        porcentaje[174] = 45.91;
        porcentaje[175] = 45.99;
        porcentaje[176] = 45.08;
        porcentaje[177] = 45.16;
        porcentaje[178] = 46.25;
        porcentaje[179] = 46.33;
        porcentaje[180] = 46.41;
        porcentaje[181] = 46.49;
        porcentaje[182] = 46.56;
        porcentaje[183] = 46.64;
        porcentaje[184] = 46.71;
        porcentaje[185] = 46.78;
        porcentaje[186] = 46.86;
        porcentaje[187] = 46.93;
        porcentaje[188] = 46.99;
        porcentaje[189] = 47.06;
        porcentaje[190] = 47.13;
        porcentaje[191] = 47.19;
        porcentaje[192] = 47.26;
        porcentaje[193] = 47.32;
        porcentaje[194] = 47.38;
        porcentaje[195] = 47.44;
        porcentaje[196] = 47.50;
        porcentaje[197] = 47.56;
        porcentaje[198] = 47.61;
        porcentaje[199] = 47.67;
        porcentaje[200] = 47.72;
        porcentaje[201] = 47.78;
        porcentaje[202] = 47.83;
        porcentaje[203] = 47.88;
        porcentaje[204] = 47.93;
        porcentaje[205] = 47.98;
        porcentaje[206] = 48.03;
        porcentaje[207] = 48.08;
        porcentaje[208] = 48.12;
        porcentaje[209] = 48.17;
        porcentaje[210] = 48.21;
        porcentaje[211] = 48.26;
        porcentaje[212] = 48.30;
        porcentaje[213] = 48.34;
        porcentaje[214] = 48.38;
        porcentaje[215] = 48.42;
        porcentaje[216] = 48.46;
        porcentaje[217] = 48.50;
        porcentaje[218] = 48.54;
        porcentaje[219] = 48.57;
        porcentaje[220] = 48.61;
        porcentaje[221] = 48.64;
        porcentaje[222] = 48.68;
        porcentaje[223] = 48.71;
        porcentaje[224] = 48.75;
        porcentaje[225] = 48.78;
        porcentaje[226] = 48.81;
        porcentaje[227] = 48.84;
        porcentaje[228] = 48.87;
        porcentaje[229] = 48.90;
        porcentaje[230] = 48.93;
        porcentaje[231] = 48.96;
        porcentaje[232] = 48.98;
        porcentaje[233] = 49.01;
        porcentaje[234] = 49.04;
        porcentaje[235] = 49.06;
        porcentaje[236] = 49.09;
        porcentaje[237] = 49.11;
        porcentaje[238] = 49.13;
        porcentaje[239] = 49.16;
        porcentaje[240] = 49.18;
        porcentaje[241] = 49.20;
        porcentaje[242] = 49.22;
        porcentaje[243] = 49.25;
        porcentaje[244] = 49.27;
        porcentaje[245] = 49.29;
        porcentaje[246] = 49.31;
        porcentaje[247] = 49.32;
        porcentaje[248] = 49.34;
        porcentaje[249] = 49.36;
        porcentaje[250] = 49.38;
        porcentaje[251] = 49.40;
        porcentaje[252] = 49.41;
        porcentaje[253] = 49.43;
        porcentaje[254] = 49.45;
        porcentaje[255] = 49.46;
        porcentaje[256] = 49.48;
        porcentaje[257] = 49.49;
        porcentaje[258] = 49.51;
        porcentaje[259] = 49.52;
        porcentaje[260] = 49.53;
        porcentaje[261] = 49.55;
        porcentaje[262] = 49.56;
        porcentaje[263] = 49.57;
        porcentaje[264] = 49.59;
        porcentaje[265] = 49.60;
        porcentaje[266] = 49.61;
        porcentaje[267] = 49.62;
        porcentaje[268] = 49.63;
        porcentaje[269] = 49.64;
        porcentaje[270] = 49.65;
        porcentaje[271] = 49.66;
        porcentaje[272] = 49.67;
        porcentaje[273] = 49.68;
        porcentaje[274] = 49.69;
        porcentaje[275] = 49.70;
        porcentaje[276] = 49.71;
        porcentaje[277] = 49.72;
        porcentaje[278] = 49.73;
        porcentaje[279] = 49.74;
        porcentaje[280] = 49.74;
        porcentaje[281] = 49.75;
        porcentaje[282] = 49.76;
        porcentaje[283] = 49.77;
        porcentaje[284] = 49.77;
        porcentaje[285] = 49.78;
        porcentaje[286] = 49.79;
        porcentaje[287] = 49.79;
        porcentaje[288] = 49.80;
        porcentaje[289] = 49.81;
        porcentaje[290] = 49.81;
        porcentaje[291] = 49.82;
        porcentaje[292] = 49.82;
        porcentaje[293] = 49.83;
        porcentaje[294] = 49.84;
        porcentaje[295] = 49.84;
        porcentaje[296] = 49.85;
        porcentaje[297] = 49.85;
        porcentaje[298] = 49.86;
        porcentaje[299] = 49.86;
        porcentaje[300] = 49.87;
        porcentaje[301] = 49.87;
        porcentaje[302] = 49.87;
        porcentaje[303] = 49.88;
        porcentaje[304] = 49.88;
        porcentaje[305] = 49.89;
        porcentaje[306] = 49.89;
        porcentaje[307] = 49.89;
        porcentaje[308] = 49.90;
        porcentaje[309] = 49.90;
        porcentaje[310] = 49.90;
        porcentaje[311] = 49.91;
        porcentaje[312] = 49.91;
        porcentaje[313] = 49.91;
        porcentaje[314] = 49.92;
        porcentaje[315] = 49.92;
        porcentaje[316] = 49.92;
        porcentaje[317] = 49.92;
        porcentaje[318] = 49.93;
        porcentaje[319] = 49.93;
        porcentaje[320] = 49.93;
        porcentaje[321] = 49.93;
        porcentaje[322] = 49.94;
        porcentaje[323] = 49.94;
        porcentaje[324] = 49.94;
        porcentaje[325] = 49.94;
        porcentaje[326] = 49.94;
        porcentaje[327] = 49.95;
        porcentaje[328] = 49.95;
        porcentaje[329] = 49.95;
        porcentaje[330] = 49.95;
        porcentaje[331] = 49.95;
        porcentaje[332] = 49.95;
        porcentaje[333] = 49.96;
        porcentaje[334] = 49.96;
        porcentaje[335] = 49.96;
        porcentaje[336] = 49.96;
        porcentaje[337] = 49.96;
        porcentaje[338] = 49.96;
        porcentaje[339] = 49.97;
        porcentaje[340] = 49.97;
        porcentaje[341] = 49.97;
        porcentaje[342] = 49.97;
        porcentaje[343] = 49.97;
        porcentaje[344] = 49.97;
        porcentaje[345] = 49.97;
        porcentaje[346] = 49.97;
        porcentaje[347] = 49.97;
        porcentaje[348] = 49.97;
        porcentaje[349] = 49.98;
        porcentaje[350] = 49.98;
        porcentaje[351] = 49.98;
        porcentaje[352] = 49.98;
        porcentaje[353] = 49.98;
        porcentaje[354] = 49.98;
        porcentaje[355] = 49.98;
        porcentaje[356] = 49.98;
        porcentaje[357] = 49.98;
        porcentaje[358] = 49.98;
        porcentaje[359] = 49.98;
        porcentaje[360] = 49.98;
        porcentaje[361] = 49.98;
        porcentaje[362] = 49.99;
        porcentaje[363] = 49.99;
        porcentaje[364] = 49.99;
        porcentaje[365] = 49.99;
        porcentaje[366] = 49.99;
        porcentaje[367] = 49.99;
        porcentaje[368] = 49.99;
        porcentaje[369] = 49.99;
        porcentaje[370] = 49.99;
        porcentaje[371] = 49.99;
        porcentaje[372] = 49.99;
        porcentaje[373] = 49.99;
        porcentaje[374] = 49.99;
        porcentaje[375] = 49.99;
        porcentaje[376] = 49.99;
        porcentaje[377] = 49.99;
        porcentaje[378] = 49.99;
        porcentaje[379] = 49.99;
        porcentaje[380] = 49.99;
        porcentaje[381] = 49.99;
        porcentaje[382] = 49.99;
        porcentaje[383] = 49.99;
        porcentaje[384] = 49.99;
        porcentaje[385] = 49.99;
        porcentaje[386] = 49.99;
        porcentaje[387] = 49.99;
        porcentaje[388] = 49.99;
        porcentaje[389] = 49.99;
        porcentaje[390] = 50.00;
        porcentaje[391] = 50.00;
        porcentaje[392] = 50.00;
        porcentaje[393] = 50.00;
        porcentaje[394] = 50.00;
        porcentaje[395] = 50.00;
        porcentaje[396] = 50.00;
        porcentaje[397] = 50.00;
        porcentaje[398] = 50.00;
        porcentaje[399] = 50.00;
        
       // Se redondea el valor que se manda para ser comparado en el arreglo
        // Dato normalizado
       double redondeoNumero = redondear(numero, 2);
       
       // En caso de que el valor redondeado sea negativo, se convierte a positivo,
       // Esto para tomar solo los valores positivos de la curva normal.
       if(redondeoNumero < 0)
           redondeoNumero *= -1;
       
       // El siguiente ciclo, lo que hace es buscar el numero a evaluar en el 
       // arreglo datoNormalizado, para iniciar su normalizacion.
       for(int i = 0; i <= datoNormalizado.length - 1; i ++){
           
           //Si se encuentra una coincidencia en el arreglo
           if(datoNormalizado[i] == redondeoNumero){
               
               //guardame la posicion en la que se encuentra dicho numero
               posicionDato = i;
               //rompe el ciclo.
               break;
           }
       }
       
       // Se busca la posicion exacta del valor encontrado anteriormente para
       // encontrar su porcentaje para guardarlo en la variable valor.
       valor = porcentaje[posicionDato];
       
       
        return  valor;
        
       

    }
    
    /**
     * El siguiente metodo funciona para redondear un numero a la cantidad de 
     * decimales que el usuario desee.
     */
      public double redondear( double numero, int decimales ) {
        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
  }
      
      /***
     * *******************************************************************************************************
     * *******************************METODOS PARA SACAR LA MEDIA ARITMETICA Y *******************************
     * *******************************LA DESVIACION ESTANDAR DE LOS CONTADORES *******************************
     * *******************************************************************************************************
     * *******************************************************************************************************
    */

   
     float mediaAritmetica(int contadorEspañol, int contadorIngles, int contadorFrances) {
        float mediaAritmetica;

        mediaAritmetica = (float) (0.3333333 * (contadorEspañol + contadorFrances + contadorIngles));

        return mediaAritmetica;
    }

     float desviacionEstandar(int contadorEspañol, int contadorIngles, int contadorFrances, double mediaAritmetica) {

        float desviacionEstandar;

        mediaAritmetica = (float) (0.5 * (contadorEspañol + contadorFrances + contadorIngles));

        desviacionEstandar = (float) Math.sqrt(0.5 * (Math.pow(contadorEspañol - mediaAritmetica, 2)
                + Math.pow(contadorIngles - mediaAritmetica, 2)
                + Math.pow(contadorFrances - mediaAritmetica, 2)));

        return desviacionEstandar;

    }

     double normalizacion(double mediaAritmetica, double desviacionEstandar, int contador) {
        double datoNormalizado;

        datoNormalizado = (contador - mediaAritmetica) / desviacionEstandar;

        return datoNormalizado;
    }

}
