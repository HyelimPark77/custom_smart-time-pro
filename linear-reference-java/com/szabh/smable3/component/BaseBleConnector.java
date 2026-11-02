package com.szabh.smable3.component;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I00OX;
import com.android.mltcode.paycertificationapi.I00X;
import com.android.mltcode.paycertificationapi.I00iiX;
import com.android.mltcode.paycertificationapi.I010iI1ii;
import com.android.mltcode.paycertificationapi.I01II;
import com.android.mltcode.paycertificationapi.I01IX1XI;
import com.android.mltcode.paycertificationapi.I01OOiii;
import com.android.mltcode.paycertificationapi.I01OXOO1;
import com.android.mltcode.paycertificationapi.I0IO1i;
import com.android.mltcode.paycertificationapi.I0O1OI11;
import com.android.mltcode.paycertificationapi.I0OiOO10;
import com.android.mltcode.paycertificationapi.I0XOiOOOi;
import com.android.mltcode.paycertificationapi.I0XXXOiO;
import com.android.mltcode.paycertificationapi.I0Xi;
import com.android.mltcode.paycertificationapi.I0i1;
import com.android.mltcode.paycertificationapi.I0iI1X1I;
import com.android.mltcode.paycertificationapi.I0iX0I;
import com.android.mltcode.paycertificationapi.I1001111;
import com.android.mltcode.paycertificationapi.I1011;
import com.android.mltcode.paycertificationapi.I10110;
import com.android.mltcode.paycertificationapi.I10IIX;
import com.android.mltcode.paycertificationapi.I11OO1;
import com.android.mltcode.paycertificationapi.I1I00;
import com.android.mltcode.paycertificationapi.I1Ii00Oi;
import com.android.mltcode.paycertificationapi.I1IiI0O;
import com.android.mltcode.paycertificationapi.I1O0X1I;
import com.android.mltcode.paycertificationapi.I1O1I11i1;
import com.android.mltcode.paycertificationapi.I1OiII1O;
import com.android.mltcode.paycertificationapi.I1XXX11;
import com.android.mltcode.paycertificationapi.I1i1XO1;
import com.android.mltcode.paycertificationapi.I1iO1XIO;
import com.android.mltcode.paycertificationapi.I1iXIi0iI;
import com.android.mltcode.paycertificationapi.I1iXO1;
import com.android.mltcode.paycertificationapi.II100;
import com.android.mltcode.paycertificationapi.II1X1;
import com.android.mltcode.paycertificationapi.II1XX0X;
import com.android.mltcode.paycertificationapi.II1iIi;
import com.android.mltcode.paycertificationapi.III01I1;
import com.android.mltcode.paycertificationapi.IIIiOX0i;
import com.android.mltcode.paycertificationapi.IIOX1;
import com.android.mltcode.paycertificationapi.IIXXI0;
import com.android.mltcode.paycertificationapi.IIiIIX0Oi;
import com.android.mltcode.paycertificationapi.IO01IX00;
import com.android.mltcode.paycertificationapi.IO0IiXX1;
import com.android.mltcode.paycertificationapi.IO10I;
import com.android.mltcode.paycertificationapi.IO11XiIIi;
import com.android.mltcode.paycertificationapi.IO1IiOOO;
import com.android.mltcode.paycertificationapi.IOI111X;
import com.android.mltcode.paycertificationapi.IOI1I;
import com.android.mltcode.paycertificationapi.IOI1I0iII;
import com.android.mltcode.paycertificationapi.IOII10X;
import com.android.mltcode.paycertificationapi.IOIX1I;
import com.android.mltcode.paycertificationapi.IOIiX;
import com.android.mltcode.paycertificationapi.IOO11O0;
import com.android.mltcode.paycertificationapi.IOX0O1iII;
import com.android.mltcode.paycertificationapi.IOXOOIi;
import com.android.mltcode.paycertificationapi.IOXOX;
import com.android.mltcode.paycertificationapi.IOi01XIO;
import com.android.mltcode.paycertificationapi.IOi11iX01;
import com.android.mltcode.paycertificationapi.IOi1IIi;
import com.android.mltcode.paycertificationapi.IOiOiIi0I;
import com.android.mltcode.paycertificationapi.IOiXO;
import com.android.mltcode.paycertificationapi.IX0IOI0;
import com.android.mltcode.paycertificationapi.IX0Iii;
import com.android.mltcode.paycertificationapi.IX0O10I;
import com.android.mltcode.paycertificationapi.IX0iXO;
import com.android.mltcode.paycertificationapi.IX110X;
import com.android.mltcode.paycertificationapi.IXI101i1;
import com.android.mltcode.paycertificationapi.IXI1I1;
import com.android.mltcode.paycertificationapi.IXIIOOX;
import com.android.mltcode.paycertificationapi.IXIXIIi;
import com.android.mltcode.paycertificationapi.IXOI;
import com.android.mltcode.paycertificationapi.IXOIXXI;
import com.android.mltcode.paycertificationapi.IXXIXO01i;
import com.android.mltcode.paycertificationapi.IXi01O0O;
import com.android.mltcode.paycertificationapi.IXi0XiO;
import com.android.mltcode.paycertificationapi.Ii001XXI;
import com.android.mltcode.paycertificationapi.Ii00OO;
import com.android.mltcode.paycertificationapi.Ii0IiiI;
import com.android.mltcode.paycertificationapi.Ii0XIIX;
import com.android.mltcode.paycertificationapi.Ii1010OX;
import com.android.mltcode.paycertificationapi.Ii1IX;
import com.android.mltcode.paycertificationapi.Ii1XO;
import com.android.mltcode.paycertificationapi.IiI0IXX;
import com.android.mltcode.paycertificationapi.IiIO0ii;
import com.android.mltcode.paycertificationapi.IiO10X;
import com.android.mltcode.paycertificationapi.IiO1iOX;
import com.android.mltcode.paycertificationapi.IiOIXO;
import com.android.mltcode.paycertificationapi.IiOOOOiX;
import com.android.mltcode.paycertificationapi.IiX1XOIiX;
import com.android.mltcode.paycertificationapi.IiXI1X1I0;
import com.android.mltcode.paycertificationapi.IiXO1X;
import com.android.mltcode.paycertificationapi.IiXOIOXOX;
import com.android.mltcode.paycertificationapi.IiiXI;
import com.android.mltcode.paycertificationapi.IiiXI1iI;
import com.android.mltcode.paycertificationapi.O0001iIIi;
import com.android.mltcode.paycertificationapi.O010O1O1X;
import com.android.mltcode.paycertificationapi.O01II;
import com.android.mltcode.paycertificationapi.O01X00X;
import com.android.mltcode.paycertificationapi.O01iO;
import com.android.mltcode.paycertificationapi.O01iO1;
import com.android.mltcode.paycertificationapi.O01iiI1;
import com.android.mltcode.paycertificationapi.O0IOI0X0;
import com.android.mltcode.paycertificationapi.O0IOX101X;
import com.android.mltcode.paycertificationapi.O0IiI;
import com.android.mltcode.paycertificationapi.O0O10;
import com.android.mltcode.paycertificationapi.O0O1I;
import com.android.mltcode.paycertificationapi.O0OO0;
import com.android.mltcode.paycertificationapi.O0OOOO;
import com.android.mltcode.paycertificationapi.O0OXO0;
import com.android.mltcode.paycertificationapi.O0OiIIXX;
import com.android.mltcode.paycertificationapi.O0X10;
import com.android.mltcode.paycertificationapi.O0X111;
import com.android.mltcode.paycertificationapi.O0XO011XO;
import com.android.mltcode.paycertificationapi.O0XX10OI0;
import com.android.mltcode.paycertificationapi.O0iOI0Xi;
import com.android.mltcode.paycertificationapi.O10II100;
import com.android.mltcode.paycertificationapi.O11IIOOX;
import com.android.mltcode.paycertificationapi.O11O0i0X;
import com.android.mltcode.paycertificationapi.O11i1iI1O;
import com.android.mltcode.paycertificationapi.O1I01iOI;
import com.android.mltcode.paycertificationapi.O1OX1OXii;
import com.android.mltcode.paycertificationapi.O1OXX10I;
import com.android.mltcode.paycertificationapi.O1Oi0Ii1i;
import com.android.mltcode.paycertificationapi.O1XiOIOi;
import com.android.mltcode.paycertificationapi.OI00X1OO;
import com.android.mltcode.paycertificationapi.OI0I10O;
import com.android.mltcode.paycertificationapi.OI0O0O;
import com.android.mltcode.paycertificationapi.OI0ii01;
import com.android.mltcode.paycertificationapi.OI10II1;
import com.android.mltcode.paycertificationapi.OI10OX0I;
import com.android.mltcode.paycertificationapi.OI1OiiX1;
import com.android.mltcode.paycertificationapi.OIO0011;
import com.android.mltcode.paycertificationapi.OIXOI;
import com.android.mltcode.paycertificationapi.OIi11100I;
import com.android.mltcode.paycertificationapi.OIiOiO;
import com.android.mltcode.paycertificationapi.OIiXOI1O;
import com.android.mltcode.paycertificationapi.OIii00iX;
import com.android.mltcode.paycertificationapi.OO00Ii0;
import com.android.mltcode.paycertificationapi.OO00XiI;
import com.android.mltcode.paycertificationapi.OO01ii0;
import com.android.mltcode.paycertificationapi.OO0O0;
import com.android.mltcode.paycertificationapi.OO11;
import com.android.mltcode.paycertificationapi.OO1IiIi0;
import com.android.mltcode.paycertificationapi.OO1i0;
import com.android.mltcode.paycertificationapi.OOIIiXi;
import com.android.mltcode.paycertificationapi.OOO01;
import com.android.mltcode.paycertificationapi.OOXX1OOO1;
import com.android.mltcode.paycertificationapi.OOi01XII;
import com.android.mltcode.paycertificationapi.OOi1I;
import com.android.mltcode.paycertificationapi.OOiii1X;
import com.android.mltcode.paycertificationapi.OX0IO;
import com.android.mltcode.paycertificationapi.OXI0I;
import com.android.mltcode.paycertificationapi.OXI0OI01X;
import com.android.mltcode.paycertificationapi.OXIOi;
import com.android.mltcode.paycertificationapi.OXIX0i;
import com.android.mltcode.paycertificationapi.OXIiIOXi;
import com.android.mltcode.paycertificationapi.OXO01;
import com.android.mltcode.paycertificationapi.OXOI1O;
import com.android.mltcode.paycertificationapi.OXOIO1O1;
import com.android.mltcode.paycertificationapi.OXOOi;
import com.android.mltcode.paycertificationapi.OXX0X;
import com.android.mltcode.paycertificationapi.OXXO1Xi;
import com.android.mltcode.paycertificationapi.OXXOi1XX;
import com.android.mltcode.paycertificationapi.OXXXI1I;
import com.android.mltcode.paycertificationapi.OXi1;
import com.android.mltcode.paycertificationapi.OXi11iX;
import com.android.mltcode.paycertificationapi.OXiI0Xii;
import com.android.mltcode.paycertificationapi.OXii0O0;
import com.android.mltcode.paycertificationapi.OXii1IO;
import com.android.mltcode.paycertificationapi.Oi00Oi;
import com.android.mltcode.paycertificationapi.Oi01X;
import com.android.mltcode.paycertificationapi.Oi0I111O;
import com.android.mltcode.paycertificationapi.Oi0ii10i1;
import com.android.mltcode.paycertificationapi.Oi1XI;
import com.android.mltcode.paycertificationapi.Oi1iII;
import com.android.mltcode.paycertificationapi.OiI0I;
import com.android.mltcode.paycertificationapi.OiI0X;
import com.android.mltcode.paycertificationapi.OiI1O;
import com.android.mltcode.paycertificationapi.OiI1X0O1;
import com.android.mltcode.paycertificationapi.OiIiX;
import com.android.mltcode.paycertificationapi.OiOXXXX;
import com.android.mltcode.paycertificationapi.OiOiX;
import com.android.mltcode.paycertificationapi.OiOiiOi;
import com.android.mltcode.paycertificationapi.OiXI;
import com.android.mltcode.paycertificationapi.OiXIi1O1i;
import com.android.mltcode.paycertificationapi.OiXOO;
import com.android.mltcode.paycertificationapi.OiXi00;
import com.android.mltcode.paycertificationapi.OiiI11XOI;
import com.android.mltcode.paycertificationapi.OiiiX1I;
import com.android.mltcode.paycertificationapi.X00O;
import com.android.mltcode.paycertificationapi.X00X01;
import com.android.mltcode.paycertificationapi.X00XXi;
import com.android.mltcode.paycertificationapi.X00i0X;
import com.android.mltcode.paycertificationapi.X01II0;
import com.android.mltcode.paycertificationapi.X01XX;
import com.android.mltcode.paycertificationapi.X01i11;
import com.android.mltcode.paycertificationapi.X0I0OO;
import com.android.mltcode.paycertificationapi.X0III0X1;
import com.android.mltcode.paycertificationapi.X0IIX1;
import com.android.mltcode.paycertificationapi.X0IO1;
import com.android.mltcode.paycertificationapi.X0IX1;
import com.android.mltcode.paycertificationapi.X0O0Xi1I1;
import com.android.mltcode.paycertificationapi.X0O100;
import com.android.mltcode.paycertificationapi.X0OOIX;
import com.android.mltcode.paycertificationapi.X0Oi0OiX1;
import com.android.mltcode.paycertificationapi.X0X0IO000;
import com.android.mltcode.paycertificationapi.X0X1XO1II;
import com.android.mltcode.paycertificationapi.X0XIiO;
import com.android.mltcode.paycertificationapi.X0XXXiX;
import com.android.mltcode.paycertificationapi.X0iiIO;
import com.android.mltcode.paycertificationapi.X0iiX11;
import com.android.mltcode.paycertificationapi.X1011X;
import com.android.mltcode.paycertificationapi.X10i10;
import com.android.mltcode.paycertificationapi.X111I;
import com.android.mltcode.paycertificationapi.X1IOIX;
import com.android.mltcode.paycertificationapi.X1IXI00i0;
import com.android.mltcode.paycertificationapi.X1Ii1I;
import com.android.mltcode.paycertificationapi.X1O0O1O;
import com.android.mltcode.paycertificationapi.X1OO0;
import com.android.mltcode.paycertificationapi.X1OiO11;
import com.android.mltcode.paycertificationapi.X1X0OOiX;
import com.android.mltcode.paycertificationapi.X1Xi0;
import com.android.mltcode.paycertificationapi.X1i1IX1X;
import com.android.mltcode.paycertificationapi.X1i1XO1II;
import com.android.mltcode.paycertificationapi.X1iXX;
import com.android.mltcode.paycertificationapi.XI00;
import com.android.mltcode.paycertificationapi.XI00I0i1;
import com.android.mltcode.paycertificationapi.XI0O;
import com.android.mltcode.paycertificationapi.XI1O1OI1;
import com.android.mltcode.paycertificationapi.XIIOXiX;
import com.android.mltcode.paycertificationapi.XIO0XX;
import com.android.mltcode.paycertificationapi.XIO0iO;
import com.android.mltcode.paycertificationapi.XIO1OiiiI;
import com.android.mltcode.paycertificationapi.XIOO;
import com.android.mltcode.paycertificationapi.XIOOIiI0X;
import com.android.mltcode.paycertificationapi.XIOXOIO;
import com.android.mltcode.paycertificationapi.XIXO10II;
import com.android.mltcode.paycertificationapi.XIXXX1ii1;
import com.android.mltcode.paycertificationapi.XO0I01XOi;
import com.android.mltcode.paycertificationapi.XO0I10;
import com.android.mltcode.paycertificationapi.XO0OII1O;
import com.android.mltcode.paycertificationapi.XO0OX;
import com.android.mltcode.paycertificationapi.XO101;
import com.android.mltcode.paycertificationapi.XOIiI0;
import com.android.mltcode.paycertificationapi.XOO;
import com.android.mltcode.paycertificationapi.XOO0XX;
import com.android.mltcode.paycertificationapi.XOO1i0;
import com.android.mltcode.paycertificationapi.XOOI;
import com.android.mltcode.paycertificationapi.XOOOiIXI;
import com.android.mltcode.paycertificationapi.XOX1i0iiI;
import com.android.mltcode.paycertificationapi.XOXI1X1O;
import com.android.mltcode.paycertificationapi.XOXO;
import com.android.mltcode.paycertificationapi.XOi1IX11;
import com.android.mltcode.paycertificationapi.XOiI;
import com.android.mltcode.paycertificationapi.XOiO1I11;
import com.android.mltcode.paycertificationapi.XX01O1IiI;
import com.android.mltcode.paycertificationapi.XX0OOI1iI;
import com.android.mltcode.paycertificationapi.XX0XO01i;
import com.android.mltcode.paycertificationapi.XX1X10OX;
import com.android.mltcode.paycertificationapi.XX1XIiI;
import com.android.mltcode.paycertificationapi.XX1i;
import com.android.mltcode.paycertificationapi.XX1iOIi;
import com.android.mltcode.paycertificationapi.XXI11OO;
import com.android.mltcode.paycertificationapi.XXIIIX;
import com.android.mltcode.paycertificationapi.XXIIX;
import com.android.mltcode.paycertificationapi.XXIOIO;
import com.android.mltcode.paycertificationapi.XXIOO;
import com.android.mltcode.paycertificationapi.XXIi0;
import com.android.mltcode.paycertificationapi.XXO00O;
import com.android.mltcode.paycertificationapi.XXO1;
import com.android.mltcode.paycertificationapi.XXOX0O;
import com.android.mltcode.paycertificationapi.XXX0;
import com.android.mltcode.paycertificationapi.XXXIIiO;
import com.android.mltcode.paycertificationapi.XXXO;
import com.android.mltcode.paycertificationapi.XXXOI;
import com.android.mltcode.paycertificationapi.XXXX;
import com.android.mltcode.paycertificationapi.XXXXiX00I;
import com.android.mltcode.paycertificationapi.XXi1iIOX;
import com.android.mltcode.paycertificationapi.XXiX;
import com.android.mltcode.paycertificationapi.XXiX1O;
import com.android.mltcode.paycertificationapi.Xi0111O;
import com.android.mltcode.paycertificationapi.Xi0I0XIO;
import com.android.mltcode.paycertificationapi.Xi0XiXIi;
import com.android.mltcode.paycertificationapi.Xi1OIX;
import com.android.mltcode.paycertificationapi.Xi1Xi1I;
import com.android.mltcode.paycertificationapi.XiI0i0OO;
import com.android.mltcode.paycertificationapi.XiIOiXI;
import com.android.mltcode.paycertificationapi.XiO0Oii;
import com.android.mltcode.paycertificationapi.XiOiIOX0i;
import com.android.mltcode.paycertificationapi.XiOii000;
import com.android.mltcode.paycertificationapi.XiX011I;
import com.android.mltcode.paycertificationapi.XiXX;
import com.android.mltcode.paycertificationapi.XiXi01IOO;
import com.android.mltcode.paycertificationapi.XiXiO;
import com.android.mltcode.paycertificationapi.XiiXi;
import com.android.mltcode.paycertificationapi.Xiii0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg2;
import com.android.mltcode.paycertificationapi.h77;
import com.android.mltcode.paycertificationapi.i00I1O0;
import com.android.mltcode.paycertificationapi.i00i;
import com.android.mltcode.paycertificationapi.i0100111O;
import com.android.mltcode.paycertificationapi.i01XO;
import com.android.mltcode.paycertificationapi.i0X1I;
import com.android.mltcode.paycertificationapi.i0X1O;
import com.android.mltcode.paycertificationapi.i0XO;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.i100II;
import com.android.mltcode.paycertificationapi.i10X;
import com.android.mltcode.paycertificationapi.i10XXI;
import com.android.mltcode.paycertificationapi.i10iX1;
import com.android.mltcode.paycertificationapi.i110;
import com.android.mltcode.paycertificationapi.i1I0IO;
import com.android.mltcode.paycertificationapi.i1IXOIi;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OXI;
import com.android.mltcode.paycertificationapi.i1X;
import com.android.mltcode.paycertificationapi.i1X10000;
import com.android.mltcode.paycertificationapi.i1X1iXi;
import com.android.mltcode.paycertificationapi.i1XI00X1;
import com.android.mltcode.paycertificationapi.i1XX1IXO1;
import com.android.mltcode.paycertificationapi.i1XXIO;
import com.android.mltcode.paycertificationapi.i1iX1I;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.iI00I0OO0;
import com.android.mltcode.paycertificationapi.iI00O;
import com.android.mltcode.paycertificationapi.iI01X111X;
import com.android.mltcode.paycertificationapi.iI0IO;
import com.android.mltcode.paycertificationapi.iI0OXO;
import com.android.mltcode.paycertificationapi.iI0OiiI;
import com.android.mltcode.paycertificationapi.iI10111O;
import com.android.mltcode.paycertificationapi.iI1OIOXX0;
import com.android.mltcode.paycertificationapi.iIOOiIIII;
import com.android.mltcode.paycertificationapi.iIX0I1O;
import com.android.mltcode.paycertificationapi.iIXi0XI;
import com.android.mltcode.paycertificationapi.iIi0XO1;
import com.android.mltcode.paycertificationapi.iIiOIi;
import com.android.mltcode.paycertificationapi.iIiOiX0I;
import com.android.mltcode.paycertificationapi.iO00;
import com.android.mltcode.paycertificationapi.iO0XX11iO;
import com.android.mltcode.paycertificationapi.iO0iXi1;
import com.android.mltcode.paycertificationapi.iO1111;
import com.android.mltcode.paycertificationapi.iO1I1i;
import com.android.mltcode.paycertificationapi.iO1i0O;
import com.android.mltcode.paycertificationapi.iOIOIIX;
import com.android.mltcode.paycertificationapi.iOIOOX;
import com.android.mltcode.paycertificationapi.iOIXi;
import com.android.mltcode.paycertificationapi.iOOi0XiI;
import com.android.mltcode.paycertificationapi.iOX010iO0;
import com.android.mltcode.paycertificationapi.iOX10;
import com.android.mltcode.paycertificationapi.iOXOOX0;
import com.android.mltcode.paycertificationapi.iOXi0IOO;
import com.android.mltcode.paycertificationapi.iOXi1;
import com.android.mltcode.paycertificationapi.iOXiiX1;
import com.android.mltcode.paycertificationapi.iOi1IXXX0;
import com.android.mltcode.paycertificationapi.iOiO0I1;
import com.android.mltcode.paycertificationapi.iX01Oi1i;
import com.android.mltcode.paycertificationapi.iX01XXXO;
import com.android.mltcode.paycertificationapi.iX0iX;
import com.android.mltcode.paycertificationapi.iX1I10IX;
import com.android.mltcode.paycertificationapi.iX1i;
import com.android.mltcode.paycertificationapi.iXXOX0;
import com.android.mltcode.paycertificationapi.iXiI1Ii;
import com.android.mltcode.paycertificationapi.iXiO1iIOX;
import com.android.mltcode.paycertificationapi.ii0IX1O0X;
import com.android.mltcode.paycertificationapi.iiI1I0O;
import com.android.mltcode.paycertificationapi.iiI1X;
import com.android.mltcode.paycertificationapi.iiOO1OOX;
import com.android.mltcode.paycertificationapi.iiOOXXi;
import com.android.mltcode.paycertificationapi.iiOX1X;
import com.android.mltcode.paycertificationapi.iiOXOII1;
import com.android.mltcode.paycertificationapi.iiOiOi1i;
import com.android.mltcode.paycertificationapi.iiXX;
import com.android.mltcode.paycertificationapi.iiXiOOO;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.connector.AbsBleConnector;
import com.bestmafen.baseble.data.BleBuffer;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.blankj.utilcode.util.LogUtils;
import com.ironsource.C2985d4;
import com.ironsource.C3164n2;
import com.realsil.sdk.core.RtkConfigure;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.dfu.RtkDfu;
import com.szabh.smable3.BleCommand;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.entity.BleAICoachBeforePlan;
import com.szabh.smable3.entity.BleAICoachBeforePlanV2;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import com.szabh.smable3.entity.BleAICoachGeneratePlanV2;
import com.szabh.smable3.entity.BleAICommand;
import com.szabh.smable3.entity.BleActivity;
import com.szabh.smable3.entity.BleActivityDetail;
import com.szabh.smable3.entity.BleAddressBook;
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleAlipayBindInfo;
import com.szabh.smable3.entity.BleAlipaySettings;
import com.szabh.smable3.entity.BleAppAudioBookList;
import com.szabh.smable3.entity.BleAppInfoList;
import com.szabh.smable3.entity.BleAppOp;
import com.szabh.smable3.entity.BleAppSportState;
import com.szabh.smable3.entity.BleAppVersion;
import com.szabh.smable3.entity.BleAvgHeartRate;
import com.szabh.smable3.entity.BleBAC;
import com.szabh.smable3.entity.BleBWNaviInfo;
import com.szabh.smable3.entity.BleBacCalibration;
import com.szabh.smable3.entity.BleBandKey;
import com.szabh.smable3.entity.BleBatteryUsage;
import com.szabh.smable3.entity.BleBleAddress;
import com.szabh.smable3.entity.BleBloodGlucose;
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
import com.szabh.smable3.entity.BleBloodOxygen;
import com.szabh.smable3.entity.BleBloodPressure;
import com.szabh.smable3.entity.BleBloodPressureCalibration;
import com.szabh.smable3.entity.BleBodyStatus;
import com.szabh.smable3.entity.BleCPChat;
import com.szabh.smable3.entity.BleCPGiftsInfo;
import com.szabh.smable3.entity.BleCPListener;
import com.szabh.smable3.entity.BleCPMissYou;
import com.szabh.smable3.entity.BleCPTodo;
import com.szabh.smable3.entity.BleCPUserInfo;
import com.szabh.smable3.entity.BleCalibrationData;
import com.szabh.smable3.entity.BleCalorieIntake;
import com.szabh.smable3.entity.BleChatApp;
import com.szabh.smable3.entity.BleChatMessage;
import com.szabh.smable3.entity.BleChatVoice;
import com.szabh.smable3.entity.BleCheckInEveryDay;
import com.szabh.smable3.entity.BleCoaching;
import com.szabh.smable3.entity.BleCoachingIds;
import com.szabh.smable3.entity.BleCyWeeAlgorithm;
import com.szabh.smable3.entity.BleDeviceFile;
import com.szabh.smable3.entity.BleDeviceFile2;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleDeviceInfo2;
import com.szabh.smable3.entity.BleDeviceLanguages;
import com.szabh.smable3.entity.BleDeviceLanguages2;
import com.szabh.smable3.entity.BleDeviceSportData;
import com.szabh.smable3.entity.BleDeviceUniqueDataSettings;
import com.szabh.smable3.entity.BleDoubleScreenSettings;
import com.szabh.smable3.entity.BleDrinkWaterSettings;
import com.szabh.smable3.entity.BleECGRealtime;
import com.szabh.smable3.entity.BleEarphoneAncSettings;
import com.szabh.smable3.entity.BleEarphoneInfo;
import com.szabh.smable3.entity.BleEarphoneKey;
import com.szabh.smable3.entity.BleEarphonePower;
import com.szabh.smable3.entity.BleEarphoneSoundEffectsSettings;
import com.szabh.smable3.entity.BleEarphoneState;
import com.szabh.smable3.entity.BleEcg;
import com.szabh.smable3.entity.BleEcgSettings;
import com.szabh.smable3.entity.BleEnergyRating;
import com.szabh.smable3.entity.BleFactoryTest;
import com.szabh.smable3.entity.BleFindEarphone;
import com.szabh.smable3.entity.BleFoodBalance;
import com.szabh.smable3.entity.BleGSensorMotion;
import com.szabh.smable3.entity.BleGSensorRaw;
import com.szabh.smable3.entity.BleGSensorSHSY;
import com.szabh.smable3.entity.BleGameControl;
import com.szabh.smable3.entity.BleGestureWake;
import com.szabh.smable3.entity.BleGestureWake2;
import com.szabh.smable3.entity.BleGirlCareMonthly;
import com.szabh.smable3.entity.BleGirlCareSettings;
import com.szabh.smable3.entity.BleGoMoreSettings;
import com.szabh.smable3.entity.BleGolfMapCacheInfo;
import com.szabh.smable3.entity.BleGolfScore;
import com.szabh.smable3.entity.BleGolfSportSwitch;
import com.szabh.smable3.entity.BleGolfWatchMapInfo;
import com.szabh.smable3.entity.BleGolfWatchScore;
import com.szabh.smable3.entity.BleGolfWatchVersionInfo;
import com.szabh.smable3.entity.BleGoogleNaviInfo;
import com.szabh.smable3.entity.BleHRRaw;
import com.szabh.smable3.entity.BleHanBaoSettings;
import com.szabh.smable3.entity.BleHanBaoVibration;
import com.szabh.smable3.entity.BleHeartRate;
import com.szabh.smable3.entity.BleHeartRateZones;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import com.szabh.smable3.entity.BleHrv;
import com.szabh.smable3.entity.BleHrvBaseLine;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
import com.szabh.smable3.entity.BleHydrationSettings;
import com.szabh.smable3.entity.BleIPCException;
import com.szabh.smable3.entity.BleIPCInfo;
import com.szabh.smable3.entity.BleIPCOTAState;
import com.szabh.smable3.entity.BleIPCState;
import com.szabh.smable3.entity.BleIPCStoresInfo;
import com.szabh.smable3.entity.BleIPCWifiInfo;
import com.szabh.smable3.entity.BleIdObject;
import com.szabh.smable3.entity.BleLactateThreshold;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import com.szabh.smable3.entity.BleLeaveDay;
import com.szabh.smable3.entity.BleLocation;
import com.szabh.smable3.entity.BleLocationGga;
import com.szabh.smable3.entity.BleLocationGsv;
import com.szabh.smable3.entity.BleLogText;
import com.szabh.smable3.entity.BleLoveTap;
import com.szabh.smable3.entity.BleLoveTapUser;
import com.szabh.smable3.entity.BleMapFileList;
import com.szabh.smable3.entity.BleMatchRecord;
import com.szabh.smable3.entity.BleMatchRecord2;
import com.szabh.smable3.entity.BleMatchRecord3;
import com.szabh.smable3.entity.BleMeasurement;
import com.szabh.smable3.entity.BleMedicationAlarm;
import com.szabh.smable3.entity.BleMedicationReminder;
import com.szabh.smable3.entity.BleMeetingReminder;
import com.szabh.smable3.entity.BleMindStatus;
import com.szabh.smable3.entity.BleMusicControl;
import com.szabh.smable3.entity.BleNaviInfo;
import com.szabh.smable3.entity.BleNoDisturbSettings;
import com.szabh.smable3.entity.BleNotificationSettings2;
import com.szabh.smable3.entity.BleOfflineAsrSettings;
import com.szabh.smable3.entity.BleOptionalMapAuthInfo;
import com.szabh.smable3.entity.BlePackageStatus;
import com.szabh.smable3.entity.BlePhysicalPower;
import com.szabh.smable3.entity.BlePower2;
import com.szabh.smable3.entity.BlePpgSHSY;
import com.szabh.smable3.entity.BlePressure;
import com.szabh.smable3.entity.BlePressureTimingMeasurement;
import com.szabh.smable3.entity.BleQiblaSettings;
import com.szabh.smable3.entity.BleRealTimeMeasurement;
import com.szabh.smable3.entity.BleRealtimeLog;
import com.szabh.smable3.entity.BleReceiveFilePacket;
import com.szabh.smable3.entity.BleRecordControl;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleRelaxReminder;
import com.szabh.smable3.entity.BleRespiratoryRate;
import com.szabh.smable3.entity.BleRingVibrationSettings;
import com.szabh.smable3.entity.BleRri;
import com.szabh.smable3.entity.BleSDCardInfo;
import com.szabh.smable3.entity.BleSGCameraSet;
import com.szabh.smable3.entity.BleSGKeySet;
import com.szabh.smable3.entity.BleSGKeywordAwake;
import com.szabh.smable3.entity.BleSGSet;
import com.szabh.smable3.entity.BleSGTest;
import com.szabh.smable3.entity.BleSGTts;
import com.szabh.smable3.entity.BleSMSQuickReply;
import com.szabh.smable3.entity.BleSOSSettings;
import com.szabh.smable3.entity.BleSedentarinessSettings;
import com.szabh.smable3.entity.BleSettingWatchPassword;
import com.szabh.smable3.entity.BleSleep;
import com.szabh.smable3.entity.BleSleepNotify;
import com.szabh.smable3.entity.BleSleepQuality;
import com.szabh.smable3.entity.BleSosCallLog;
import com.szabh.smable3.entity.BleSosContact;
import com.szabh.smable3.entity.BleStandbyWatchFaceSet;
import com.szabh.smable3.entity.BleStock;
import com.szabh.smable3.entity.BleStream;
import com.szabh.smable3.entity.BleStreamPacket;
import com.szabh.smable3.entity.BleStreamProgress;
import com.szabh.smable3.entity.BleTemperature;
import com.szabh.smable3.entity.BleThirdPartyData;
import com.szabh.smable3.entity.BleTrainingStatus;
import com.szabh.smable3.entity.BleTuyaKey;
import com.szabh.smable3.entity.BleUserProfile;
import com.szabh.smable3.entity.BleVersion;
import com.szabh.smable3.entity.BleVideoCallInfo;
import com.szabh.smable3.entity.BleVitality;
import com.szabh.smable3.entity.BleWatchFaceId;
import com.szabh.smable3.entity.BleWatchFaceIndex;
import com.szabh.smable3.entity.BleWatchFaceMaxSize;
import com.szabh.smable3.entity.BleWechatPaySettings;
import com.szabh.smable3.entity.BleWorkout;
import com.szabh.smable3.entity.BleWorkout2;
import com.szabh.smable3.entity.BleWorkout3;
import com.szabh.smable3.entity.BleWorkout4;
import com.szabh.smable3.entity.BleWorkout4Segmentation;
import com.szabh.smable3.entity.BleWorldClock;
import com.szabh.smable3.entity.BleXMLYBandSet;
import com.szabh.smable3.entity.MusicAttr;
import com.szabh.smable3.entity.MusicCommand;
import com.szabh.smable3.entity.MusicEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.iO;
import kotlin.text.Charsets;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseBleConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBleConnector.kt\ncom/szabh/smable3/component/BaseBleConnector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,5102:1\n360#2,7:5103\n1563#2:5110\n1634#2,3:5111\n360#2,7:5114\n360#2,7:5121\n1563#2:5128\n1634#2,3:5129\n1869#2,2:5132\n1878#2,3:5134\n1869#2,2:5137\n774#2:5140\n865#2,2:5141\n1563#2:5143\n1634#2,3:5144\n360#2,7:5210\n360#2,7:5217\n360#2,7:5415\n360#2,7:5422\n360#2,7:5447\n360#2,7:5454\n360#2,7:5499\n360#2,7:5506\n360#2,7:5845\n360#2,7:5865\n360#2,7:6730\n360#2,7:6737\n1869#2,2:6769\n1869#2,2:6771\n1#3:5139\n277#4,5:5147\n277#4,5:5152\n277#4,5:5157\n277#4,5:5162\n277#4,5:5167\n277#4,5:5172\n277#4,5:5177\n277#4,5:5182\n277#4,5:5187\n289#4,7:5192\n277#4,5:5199\n298#4:5204\n277#4,5:5205\n277#4,5:5224\n277#4,5:5229\n277#4,5:5234\n277#4,5:5239\n277#4,5:5244\n289#4,7:5249\n277#4,5:5256\n298#4:5261\n289#4,7:5262\n277#4,5:5269\n298#4:5274\n289#4,7:5275\n277#4,5:5282\n298#4:5287\n289#4,7:5288\n277#4,5:5295\n298#4:5300\n289#4,7:5301\n277#4,5:5308\n298#4:5313\n277#4,5:5314\n289#4,7:5319\n277#4,5:5326\n298#4:5331\n277#4,5:5332\n277#4,5:5337\n277#4,5:5342\n277#4,5:5347\n277#4,5:5352\n277#4,5:5357\n277#4,5:5362\n277#4,5:5367\n277#4,5:5372\n277#4,5:5377\n277#4,5:5382\n277#4,5:5387\n277#4,5:5392\n289#4,7:5397\n277#4,5:5404\n298#4:5409\n277#4,5:5410\n289#4,7:5429\n277#4,5:5436\n298#4:5441\n277#4,5:5442\n277#4,5:5461\n277#4,5:5466\n277#4,5:5471\n277#4,5:5476\n289#4,7:5481\n277#4,5:5488\n298#4:5493\n277#4,5:5494\n277#4,5:5513\n277#4,5:5518\n277#4,5:5523\n277#4,5:5528\n277#4,5:5533\n277#4,5:5538\n277#4,5:5543\n277#4,5:5548\n277#4,5:5553\n277#4,5:5558\n277#4,5:5563\n277#4,5:5568\n277#4,5:5573\n277#4,5:5578\n277#4,5:5583\n277#4,5:5588\n277#4,5:5593\n277#4,5:5598\n277#4,5:5603\n277#4,5:5608\n277#4,5:5613\n277#4,5:5618\n277#4,5:5623\n277#4,5:5628\n277#4,5:5633\n277#4,5:5638\n277#4,5:5643\n277#4,5:5648\n277#4,5:5653\n277#4,5:5658\n277#4,5:5663\n277#4,5:5668\n277#4,5:5673\n277#4,5:5678\n277#4,5:5683\n277#4,5:5688\n277#4,5:5693\n277#4,5:5698\n277#4,5:5703\n277#4,5:5708\n277#4,5:5713\n277#4,5:5718\n277#4,5:5723\n277#4,5:5728\n277#4,5:5733\n277#4,5:5738\n277#4,5:5743\n277#4,5:5748\n277#4,5:5753\n277#4,5:5758\n277#4,5:5763\n277#4,5:5768\n277#4,5:5773\n277#4,5:5778\n277#4,5:5783\n277#4,5:5788\n277#4,5:5793\n277#4,5:5798\n277#4,5:5803\n277#4,5:5808\n277#4,5:5813\n277#4,5:5818\n277#4,5:5823\n289#4,7:5832\n277#4,5:5839\n298#4:5844\n289#4,7:5852\n277#4,5:5859\n298#4:5864\n277#4,5:5872\n277#4,5:5877\n277#4,5:5882\n277#4,5:5887\n277#4,5:5892\n277#4,5:5897\n277#4,5:5902\n289#4,7:5907\n277#4,5:5914\n298#4:5919\n289#4,7:5920\n277#4,5:5927\n298#4:5932\n289#4,7:5933\n277#4,5:5940\n298#4:5945\n289#4,7:5946\n277#4,5:5953\n298#4:5958\n289#4,7:5959\n277#4,5:5966\n298#4:5971\n289#4,7:5972\n277#4,5:5979\n298#4:5984\n289#4,7:5985\n277#4,5:5992\n298#4:5997\n289#4,7:5998\n277#4,5:6005\n298#4:6010\n289#4,7:6011\n277#4,5:6018\n298#4:6023\n289#4,7:6024\n277#4,5:6031\n298#4:6036\n289#4,7:6037\n277#4,5:6044\n298#4:6049\n289#4,7:6050\n277#4,5:6057\n298#4:6062\n289#4,7:6063\n277#4,5:6070\n298#4:6075\n289#4,7:6076\n277#4,5:6083\n298#4:6088\n289#4,7:6089\n277#4,5:6096\n298#4:6101\n289#4,7:6102\n277#4,5:6109\n298#4:6114\n289#4,7:6115\n277#4,5:6122\n298#4:6127\n289#4,7:6128\n277#4,5:6135\n298#4:6140\n277#4,5:6141\n277#4,5:6146\n289#4,7:6151\n277#4,5:6158\n298#4:6163\n289#4,7:6164\n277#4,5:6171\n298#4:6176\n289#4,7:6177\n277#4,5:6184\n298#4:6189\n289#4,7:6190\n277#4,5:6197\n298#4:6202\n289#4,7:6203\n277#4,5:6210\n298#4:6215\n289#4,7:6216\n277#4,5:6223\n298#4:6228\n289#4,7:6229\n277#4,5:6236\n298#4:6241\n289#4,7:6242\n277#4,5:6249\n298#4:6254\n289#4,7:6255\n277#4,5:6262\n298#4:6267\n277#4,5:6268\n277#4,5:6273\n289#4,7:6278\n277#4,5:6285\n298#4:6290\n277#4,5:6291\n289#4,7:6296\n277#4,5:6303\n298#4:6308\n289#4,7:6309\n277#4,5:6316\n298#4:6321\n289#4,7:6322\n277#4,5:6329\n298#4:6334\n289#4,7:6335\n277#4,5:6342\n298#4:6347\n289#4,7:6348\n277#4,5:6355\n298#4:6360\n289#4,7:6361\n277#4,5:6368\n298#4:6373\n277#4,5:6374\n277#4,5:6379\n277#4,5:6384\n277#4,5:6389\n277#4,5:6394\n277#4,5:6399\n277#4,5:6404\n277#4,5:6409\n277#4,5:6414\n277#4,5:6419\n277#4,5:6424\n277#4,5:6429\n277#4,5:6434\n277#4,5:6439\n277#4,5:6444\n277#4,5:6449\n277#4,5:6454\n277#4,5:6459\n277#4,5:6464\n277#4,5:6469\n277#4,5:6474\n277#4,5:6479\n277#4,5:6484\n277#4,5:6489\n277#4,5:6494\n277#4,5:6499\n277#4,5:6504\n277#4,5:6509\n277#4,5:6514\n277#4,5:6519\n277#4,5:6524\n277#4,5:6529\n277#4,5:6534\n277#4,5:6539\n277#4,5:6544\n277#4,5:6549\n289#4,7:6554\n277#4,5:6561\n298#4:6566\n277#4,5:6567\n277#4,5:6572\n277#4,5:6577\n277#4,5:6582\n277#4,5:6587\n277#4,5:6592\n277#4,5:6597\n277#4,5:6602\n277#4,5:6607\n277#4,5:6612\n277#4,5:6617\n277#4,5:6622\n277#4,5:6627\n277#4,5:6632\n277#4,5:6637\n277#4,5:6642\n277#4,5:6647\n277#4,5:6652\n277#4,5:6657\n277#4,5:6662\n277#4,5:6667\n277#4,5:6672\n277#4,5:6677\n277#4,5:6682\n277#4,5:6687\n277#4,5:6692\n277#4,5:6697\n277#4,5:6702\n277#4,5:6707\n289#4,7:6712\n277#4,5:6719\n298#4:6724\n277#4,5:6725\n277#4,5:6744\n277#4,5:6749\n277#4,5:6754\n277#4,5:6759\n277#4,5:6764\n11571#5:5828\n11906#5,3:5829\n*S KotlinDebug\n*F\n+ 1 BaseBleConnector.kt\ncom/szabh/smable3/component/BaseBleConnector\n*L\n441#1:5103,7\n499#1:5110\n499#1:5111,3\n510#1:5114,7\n527#1:5121,7\n554#1:5128\n554#1:5129,3\n555#1:5132,2\n570#1:5134,3\n582#1:5137,2\n870#1:5140\n870#1:5141,2\n871#1:5143\n871#1:5144,3\n1168#1:5210,7\n1184#1:5217,7\n1768#1:5415,7\n1784#1:5422,7\n1819#1:5447,7\n1836#1:5454,7\n1912#1:5499,7\n1928#1:5506,7\n2866#1:5845,7\n2901#1:5865,7\n4801#1:6730,7\n4817#1:6737,7\n4979#1:6769,2\n4985#1:6771,2\n1000#1:5147,5\n1048#1:5152,5\n1058#1:5157,5\n1068#1:5162,5\n1076#1:5167,5\n1106#1:5172,5\n1114#1:5177,5\n1125#1:5182,5\n1135#1:5187,5\n1147#1:5192,7\n1147#1:5199,5\n1147#1:5204\n1166#1:5205,5\n1192#1:5224,5\n1217#1:5229,5\n1238#1:5234,5\n1252#1:5239,5\n1262#1:5244,5\n1281#1:5249,7\n1281#1:5256,5\n1281#1:5261\n1306#1:5262,7\n1306#1:5269,5\n1306#1:5274\n1321#1:5275,7\n1321#1:5282,5\n1321#1:5287\n1336#1:5288,7\n1336#1:5295,5\n1336#1:5300\n1347#1:5301,7\n1347#1:5308,5\n1347#1:5313\n1362#1:5314,5\n1373#1:5319,7\n1373#1:5326,5\n1373#1:5331\n1390#1:5332,5\n1397#1:5337,5\n1466#1:5342,5\n1474#1:5347,5\n1529#1:5352,5\n1537#1:5357,5\n1583#1:5362,5\n1594#1:5367,5\n1611#1:5372,5\n1622#1:5377,5\n1632#1:5382,5\n1640#1:5387,5\n1654#1:5392,5\n1750#1:5397,7\n1750#1:5404,5\n1750#1:5409\n1766#1:5410,5\n1797#1:5429,7\n1797#1:5436,5\n1797#1:5441\n1812#1:5442,5\n1848#1:5461,5\n1860#1:5466,5\n1871#1:5471,5\n1883#1:5476,5\n1894#1:5481,7\n1894#1:5488,5\n1894#1:5493\n1910#1:5494,5\n1937#1:5513,5\n1949#1:5518,5\n1960#1:5523,5\n1972#1:5528,5\n1987#1:5533,5\n1998#1:5538,5\n2013#1:5543,5\n2024#1:5548,5\n2035#1:5553,5\n2043#1:5558,5\n2054#1:5563,5\n2065#1:5568,5\n2077#1:5573,5\n2087#1:5578,5\n2100#1:5583,5\n2115#1:5588,5\n2125#1:5593,5\n2136#1:5598,5\n2144#1:5603,5\n2172#1:5608,5\n2183#1:5613,5\n2195#1:5618,5\n2206#1:5623,5\n2232#1:5628,5\n2248#1:5633,5\n2259#1:5638,5\n2270#1:5643,5\n2278#1:5648,5\n2289#1:5653,5\n2304#1:5658,5\n2337#1:5663,5\n2348#1:5668,5\n2356#1:5673,5\n2382#1:5678,5\n2393#1:5683,5\n2401#1:5688,5\n2412#1:5693,5\n2446#1:5698,5\n2454#1:5703,5\n2465#1:5708,5\n2473#1:5713,5\n2484#1:5718,5\n2495#1:5723,5\n2503#1:5728,5\n2514#1:5733,5\n2522#1:5738,5\n2533#1:5743,5\n2541#1:5748,5\n2552#1:5753,5\n2563#1:5758,5\n2579#1:5763,5\n2590#1:5768,5\n2601#1:5773,5\n2612#1:5778,5\n2623#1:5783,5\n2631#1:5788,5\n2651#1:5793,5\n2662#1:5798,5\n2675#1:5803,5\n2685#1:5808,5\n2696#1:5813,5\n2719#1:5818,5\n2752#1:5823,5\n2844#1:5832,7\n2844#1:5839,5\n2844#1:5844\n2879#1:5852,7\n2879#1:5859,5\n2879#1:5864\n2918#1:5872,5\n2931#1:5877,5\n2942#1:5882,5\n2953#1:5887,5\n2964#1:5892,5\n2977#1:5897,5\n2988#1:5902,5\n3000#1:5907,7\n3000#1:5914,5\n3000#1:5919\n3017#1:5920,7\n3017#1:5927,5\n3017#1:5932\n3034#1:5933,7\n3034#1:5940,5\n3034#1:5945\n3051#1:5946,7\n3051#1:5953,5\n3051#1:5958\n3064#1:5959,7\n3064#1:5966,5\n3064#1:5971\n3081#1:5972,7\n3081#1:5979,5\n3081#1:5984\n3098#1:5985,7\n3098#1:5992,5\n3098#1:5997\n3115#1:5998,7\n3115#1:6005,5\n3115#1:6010\n3132#1:6011,7\n3132#1:6018,5\n3132#1:6023\n3145#1:6024,7\n3145#1:6031,5\n3145#1:6036\n3171#1:6037,7\n3171#1:6044,5\n3171#1:6049\n3188#1:6050,7\n3188#1:6057,5\n3188#1:6062\n3205#1:6063,7\n3205#1:6070,5\n3205#1:6075\n3222#1:6076,7\n3222#1:6083,5\n3222#1:6088\n3239#1:6089,7\n3239#1:6096,5\n3239#1:6101\n3256#1:6102,7\n3256#1:6109,5\n3256#1:6114\n3273#1:6115,7\n3273#1:6122,5\n3273#1:6127\n3290#1:6128,7\n3290#1:6135,5\n3290#1:6140\n3307#1:6141,5\n3315#1:6146,5\n3326#1:6151,7\n3326#1:6158,5\n3326#1:6163\n3339#1:6164,7\n3339#1:6171,5\n3339#1:6176\n3356#1:6177,7\n3356#1:6184,5\n3356#1:6189\n3373#1:6190,7\n3373#1:6197,5\n3373#1:6202\n3390#1:6203,7\n3390#1:6210,5\n3390#1:6215\n3403#1:6216,7\n3403#1:6223,5\n3403#1:6228\n3416#1:6229,7\n3416#1:6236,5\n3416#1:6241\n3433#1:6242,7\n3433#1:6249,5\n3433#1:6254\n3450#1:6255,7\n3450#1:6262,5\n3450#1:6267\n3471#1:6268,5\n3493#1:6273,5\n3509#1:6278,7\n3509#1:6285,5\n3509#1:6290\n3524#1:6291,5\n3539#1:6296,7\n3539#1:6303,5\n3539#1:6308\n3556#1:6309,7\n3556#1:6316,5\n3556#1:6321\n3573#1:6322,7\n3573#1:6329,5\n3573#1:6334\n3587#1:6335,7\n3587#1:6342,5\n3587#1:6347\n3605#1:6348,7\n3605#1:6355,5\n3605#1:6360\n3622#1:6361,7\n3622#1:6368,5\n3622#1:6373\n3687#1:6374,5\n3699#1:6379,5\n3740#1:6384,5\n3747#1:6389,5\n3791#1:6394,5\n3805#1:6399,5\n3818#1:6404,5\n3829#1:6409,5\n3837#1:6414,5\n3884#1:6419,5\n3895#1:6424,5\n3905#1:6429,5\n3916#1:6434,5\n3929#1:6439,5\n3939#1:6444,5\n3962#1:6449,5\n3973#1:6454,5\n3983#1:6459,5\n4006#1:6464,5\n4016#1:6469,5\n4026#1:6474,5\n4037#1:6479,5\n4045#1:6484,5\n4057#1:6489,5\n4072#1:6494,5\n4083#1:6499,5\n4110#1:6504,5\n4125#1:6509,5\n4146#1:6514,5\n4161#1:6519,5\n4172#1:6524,5\n4196#1:6529,5\n4204#1:6534,5\n4234#1:6539,5\n4281#1:6544,5\n4292#1:6549,5\n4314#1:6554,7\n4314#1:6561,5\n4314#1:6566\n4325#1:6567,5\n4332#1:6572,5\n4343#1:6577,5\n4354#1:6582,5\n4365#1:6587,5\n4409#1:6592,5\n4480#1:6597,5\n4492#1:6602,5\n4515#1:6607,5\n4527#1:6612,5\n4550#1:6617,5\n4559#1:6622,5\n4572#1:6627,5\n4581#1:6632,5\n4593#1:6637,5\n4602#1:6642,5\n4614#1:6647,5\n4624#1:6652,5\n4645#1:6657,5\n4653#1:6662,5\n4663#1:6667,5\n4708#1:6672,5\n4716#1:6677,5\n4723#1:6682,5\n4730#1:6687,5\n4741#1:6692,5\n4749#1:6697,5\n4760#1:6702,5\n4768#1:6707,5\n4780#1:6712,7\n4780#1:6719,5\n4780#1:6724\n4799#1:6725,5\n4825#1:6744,5\n4838#1:6749,5\n4851#1:6754,5\n4865#1:6759,5\n4878#1:6764,5\n2786#1:5828\n2786#1:5829,3\n*E\n"})
public abstract class BaseBleConnector extends AbsBleConnector {

    @aa1
    private static final String BLE_CH_NOTIFY = "6e400003-b5a3-f393-e0a9-e50e24dcca9e";

    @aa1
    private static final String BLE_CH_WRITE = "6e400002-b5a3-f393-e0a9-e50e24dcca9e";

    @aa1
    private static final String BLE_SERVICE = "6e400001-b5a3-f393-e0a9-e50e24dcca9e";

    @aa1
    private static final String CH_MTK_OTA_DATA = "c6a22924-f821-18bf-9704-0266f20e80fd";

    @aa1
    private static final String CH_MTK_OTA_FLAG = "c6a22922-f821-18bf-9704-0266f20e80fd";

    @aa1
    private static final String CH_MTK_OTA_MD5 = "c6a22926-f821-18bf-9704-0266f20e80fd";

    @aa1
    private static final String CH_MTK_OTA_SIZE = "c6a22920-f821-18bf-9704-0266f20e80fd";

    @aa1
    public static final Companion Companion = null;
    private static final int MTK_OTA_PACKET_SIZE = 180;

    @aa1
    private static final String SERVICE_MTK_OTA = "c6a2b98b-f821-18bf-9704-0266f20e80fd";

    @aa1
    private final String TAG;
    private boolean isConnecting;
    private boolean isDataKeyAutoDelete;
    private boolean isNeedBind;
    private boolean isNordicOtaMode;
    private boolean isRefreshDeviceInfo;
    private BaseBleCache mBleCache;

    @aa1
    private final Lazy mBleHandleCallbacks$delegate;

    @aa1
    private final Lazy mBleMessenger$delegate;

    @aa1
    private final Lazy mBleParser$delegate;
    private int mBleState;

    @tb1
    private BleStream mBleStream;

    @aa1
    private List<BleKey> mDataKeys;
    private int mDeviceId;
    private int mHidState;

    @aa1
    private final Map<MusicEntity, List<MusicAttr>> mMusicSubscriptions;

    @aa1
    private final Lazy mNotify$delegate;
    private boolean mReceivingCmTrace;

    @aa1
    private final Lazy mService$delegate;
    private int mStreamProgressCompleted;
    private int mStreamProgressTotal;
    private boolean mSupportFilterEmpty;

    @aa1
    private final Runnable mSyncTimeout;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[BleKey.values().length];
            r0[BleKey.FIRMWARE_VERSION.ordinal()] = 1;     // Catch: NoSuchFieldError -> L266
        L551:
            r0[BleKey.UI_PACK_VERSION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L267
        L563:
            r0[BleKey.GPS_FIRMWARE_VERSION.ordinal()] = 3;     // Catch: NoSuchFieldError -> L268
        L573:
            r0[BleKey.NETWORK_FIRMWARE_VERSION.ordinal()] = 4;     // Catch: NoSuchFieldError -> L269
        L577:
            r0[BleKey.IPC_VERSION.ordinal()] = 5;     // Catch: NoSuchFieldError -> L270
        L585:
            r0[BleKey.OTA.ordinal()] = 6;     // Catch: NoSuchFieldError -> L271
        L595:
            r0[BleKey.XMODEM.ordinal()] = 7;     // Catch: NoSuchFieldError -> L272
        L613:
            r0[BleKey.TIME.ordinal()] = 8;     // Catch: NoSuchFieldError -> L273
        L623:
            r0[BleKey.POWER.ordinal()] = 9;     // Catch: NoSuchFieldError -> L274
        L625:
            r0[BleKey.LANGUAGE_PACK_VERSION.ordinal()] = 10;     // Catch: NoSuchFieldError -> L275
        L635:
            r0[BleKey.BLE_ADDRESS.ordinal()] = 11;     // Catch: NoSuchFieldError -> L276
        L653:
            r0[BleKey.USER_PROFILE.ordinal()] = 12;     // Catch: NoSuchFieldError -> L277
        L663:
            r0[BleKey.STEP_GOAL.ordinal()] = 13;     // Catch: NoSuchFieldError -> L278
        L921:
            r0[BleKey.SEDENTARINESS.ordinal()] = 14;     // Catch: NoSuchFieldError -> L279
        L931:
            r0[BleKey.NO_DISTURB_RANGE.ordinal()] = 15;     // Catch: NoSuchFieldError -> L280
        L949:
            r0[BleKey.ALARM.ordinal()] = 16;     // Catch: NoSuchFieldError -> L281
        L959:
            r0[BleKey.UNIT_SET.ordinal()] = 17;     // Catch: NoSuchFieldError -> L282
        L961:
            r0[BleKey.COACHING.ordinal()] = 18;     // Catch: NoSuchFieldError -> L283
        L971:
            r0[BleKey.FIND_PHONE.ordinal()] = 19;     // Catch: NoSuchFieldError -> L284
        L989:
            r0[BleKey.HR_MONITORING.ordinal()] = 20;     // Catch: NoSuchFieldError -> L285
        L999:
            r0[BleKey.SLEEP_QUALITY.ordinal()] = 21;     // Catch: NoSuchFieldError -> L286
        L1001:
            r0[BleKey.REALTIME_LOG.ordinal()] = 22;     // Catch: NoSuchFieldError -> L287
        L1011:
            r0[BleKey.AGPS_PREREQUISITE.ordinal()] = 23;     // Catch: NoSuchFieldError -> L288
        L1029:
            r0[BleKey.GSENSOR_RAW.ordinal()] = 24;     // Catch: NoSuchFieldError -> L289
        L1039:
            r0[BleKey.GSENSOR_SHSY.ordinal()] = 25;     // Catch: NoSuchFieldError -> L290
        L1041:
            r0[BleKey.PPG_SHSY.ordinal()] = 26;     // Catch: NoSuchFieldError -> L291
        L795:
            r0[BleKey.HR_RAW.ordinal()] = 27;     // Catch: NoSuchFieldError -> L292
        L813:
            r0[BleKey.MOTION_DETECT.ordinal()] = 28;     // Catch: NoSuchFieldError -> L293
        L823:
            r0[BleKey.LOCATION_GGA.ordinal()] = 29;     // Catch: NoSuchFieldError -> L294
        L825:
            r0[BleKey.LOCATION_GSV.ordinal()] = 30;     // Catch: NoSuchFieldError -> L295
        L835:
            r0[BleKey.READ_CY_WEE_UUID.ordinal()] = 31;     // Catch: NoSuchFieldError -> L296
        L853:
            r0[BleKey.LANGUAGE.ordinal()] = 32;     // Catch: NoSuchFieldError -> L297
        L863:
            r0[BleKey.TEMPERATURE_UNIT.ordinal()] = 33;     // Catch: NoSuchFieldError -> L298
        L865:
            r0[BleKey.DATE_FORMAT.ordinal()] = 34;     // Catch: NoSuchFieldError -> L299
        L875:
            r0[BleKey.WATCH_FACE_SWITCH.ordinal()] = 35;     // Catch: NoSuchFieldError -> L300
        L893:
            r0[BleKey.DRINK_WATER.ordinal()] = 36;     // Catch: NoSuchFieldError -> L301
        L903:
            r0[BleKey.VIBRATION.ordinal()] = 37;     // Catch: NoSuchFieldError -> L302
        L905:
            r0[BleKey.VIBRATION_V2.ordinal()] = 38;     // Catch: NoSuchFieldError -> L303
        L915:
            r0[BleKey.BACK_LIGHT.ordinal()] = 39;     // Catch: NoSuchFieldError -> L304
        L677:
            r0[BleKey.GESTURE_WAKE.ordinal()] = 40;     // Catch: NoSuchFieldError -> L305
        L687:
            r0[BleKey.HOUR_SYSTEM.ordinal()] = 41;     // Catch: NoSuchFieldError -> L306
        L689:
            r0[BleKey.APP_SPORT_DATA.ordinal()] = 42;     // Catch: NoSuchFieldError -> L307
        L699:
            r0[BleKey.REAL_TIME_HEART_RATE.ordinal()] = 43;     // Catch: NoSuchFieldError -> L308
        L717:
            r0[BleKey.WATCHFACE_ID.ordinal()] = 44;     // Catch: NoSuchFieldError -> L309
        L727:
            r0[BleKey.REAL_TIME_TEMPERATURE.ordinal()] = 45;     // Catch: NoSuchFieldError -> L310
        L729:
            r0[BleKey.REAL_TIME_BLOOD_PRESSURE.ordinal()] = 46;     // Catch: NoSuchFieldError -> L311
        L739:
            r0[BleKey.SET_WATCH_PASSWORD.ordinal()] = 47;     // Catch: NoSuchFieldError -> L312
        L757:
            r0[BleKey.REALTIME_MEASUREMENT.ordinal()] = 48;     // Catch: NoSuchFieldError -> L313
        L767:
            r0[BleKey.POWER_SAVE_MODE.ordinal()] = 49;     // Catch: NoSuchFieldError -> L314
        L769:
            r0[BleKey.CALORIES_GOAL.ordinal()] = 50;     // Catch: NoSuchFieldError -> L315
        L779:
            r0[BleKey.DISTANCE_GOAL.ordinal()] = 51;     // Catch: NoSuchFieldError -> L316
        L531:
            r0[BleKey.SLEEP_GOAL.ordinal()] = 52;     // Catch: NoSuchFieldError -> L317
        L543:
            r0[BleKey.LOVE_TAP_USER.ordinal()] = 53;     // Catch: NoSuchFieldError -> L318
        L545:
            r0[BleKey.MEDICATION_REMINDER.ordinal()] = 54;     // Catch: NoSuchFieldError -> L319
        L557:
            r0[BleKey.DEVICE_INFO.ordinal()] = 55;     // Catch: NoSuchFieldError -> L320
        L581:
            r0[BleKey.HR_WARNING_SET.ordinal()] = 56;     // Catch: NoSuchFieldError -> L321
        L591:
            r0[BleKey.TUYA_KEY_SET.ordinal()] = 57;     // Catch: NoSuchFieldError -> L322
        L593:
            r0[BleKey.BAC_RESULT.ordinal()] = 58;     // Catch: NoSuchFieldError -> L323
        L603:
            r0[BleKey.MEDICATION_ALARM.ordinal()] = 59;     // Catch: NoSuchFieldError -> L324
        L621:
            r0[BleKey.PACKAGE_STATUS.ordinal()] = 60;     // Catch: NoSuchFieldError -> L325
        L631:
            r0[BleKey.NOTIFICATION_REMINDER2.ordinal()] = 61;     // Catch: NoSuchFieldError -> L326
        L633:
            r0[BleKey.ALIPAY_SET.ordinal()] = 62;     // Catch: NoSuchFieldError -> L327
        L643:
            r0[BleKey.WECHAT_PAY_SET.ordinal()] = 63;     // Catch: NoSuchFieldError -> L328
        L661:
            r0[BleKey.RECORD_PACKET.ordinal()] = 64;     // Catch: NoSuchFieldError -> L329
        L927:
            r0[BleKey.NAVI_INFO.ordinal()] = 65;     // Catch: NoSuchFieldError -> L330
        L929:
            r0[BleKey.SOS_SET.ordinal()] = 66;     // Catch: NoSuchFieldError -> L331
        L939:
            r0[BleKey.GIRL_CARE.ordinal()] = 67;     // Catch: NoSuchFieldError -> L332
        L957:
            r0[BleKey.DEVICE_LANGUAGES.ordinal()] = 68;     // Catch: NoSuchFieldError -> L333
        L967:
            r0[BleKey.DEVICE_SPORT_DATA.ordinal()] = 69;     // Catch: NoSuchFieldError -> L334
        L969:
            r0[BleKey.PRESSURE_TIMING_MEASUREMENT.ordinal()] = 70;     // Catch: NoSuchFieldError -> L335
        L979:
            r0[BleKey.BLOOD_OXYGEN_SET.ordinal()] = 71;     // Catch: NoSuchFieldError -> L336
        L997:
            r0[BleKey.STANDBY_WATCH_FACE_SET.ordinal()] = 72;     // Catch: NoSuchFieldError -> L337
        L1007:
            r0[BleKey.FALL_SET.ordinal()] = 73;     // Catch: NoSuchFieldError -> L338
        L1009:
            r0[BleKey.BW_NAVI_INFO.ordinal()] = 74;     // Catch: NoSuchFieldError -> L339
        L1019:
            r0[BleKey.SDCARD_INFO.ordinal()] = 75;     // Catch: NoSuchFieldError -> L340
        L1037:
            r0[BleKey.ACTIVITY_DETAIL.ordinal()] = 76;     // Catch: NoSuchFieldError -> L341
        L1047:
            r0[BleKey.NOTIFICATION_LIGHT_SCREEN_SET.ordinal()] = 77;     // Catch: NoSuchFieldError -> L342
        L793:
            r0[BleKey.BLOOD_PRESSURE_CALIBRATION.ordinal()] = 78;     // Catch: NoSuchFieldError -> L343
        L803:
            r0[BleKey.GOOGLE_NAVI_INFO.ordinal()] = 79;     // Catch: NoSuchFieldError -> L344
        L821:
            r0[BleKey.EARPHONE_POWER.ordinal()] = 80;     // Catch: NoSuchFieldError -> L345
        L831:
            r0[BleKey.EARPHONE_ANC_SET.ordinal()] = 81;     // Catch: NoSuchFieldError -> L346
        L833:
            r0[BleKey.EARPHONE_SOUND_EFFECTS_SET.ordinal()] = 82;     // Catch: NoSuchFieldError -> L347
        L843:
            r0[BleKey.SCREEN_BRIGHTNESS_SET.ordinal()] = 83;     // Catch: NoSuchFieldError -> L348
        L861:
            r0[BleKey.EARPHONE_INFO.ordinal()] = 84;     // Catch: NoSuchFieldError -> L349
        L871:
            r0[BleKey.EARPHONE_STATE.ordinal()] = 85;     // Catch: NoSuchFieldError -> L350
        L873:
            r0[BleKey.EARPHONE_CALL.ordinal()] = 86;     // Catch: NoSuchFieldError -> L351
        L883:
            r0[BleKey.GOMORE_SET.ordinal()] = 87;     // Catch: NoSuchFieldError -> L352
        L901:
            r0[BleKey.RING_VIBRATION_SET.ordinal()] = 88;     // Catch: NoSuchFieldError -> L353
        L911:
            r0[BleKey.ECG_SET.ordinal()] = 89;     // Catch: NoSuchFieldError -> L354
        L913:
            r0[BleKey.SPORT_DURATION_GOAL.ordinal()] = 90;     // Catch: NoSuchFieldError -> L355
        L667:
            r0[BleKey.FIND_WATCH.ordinal()] = 91;     // Catch: NoSuchFieldError -> L356
        L685:
            r0[BleKey.WATCHFACE_INDEX.ordinal()] = 92;     // Catch: NoSuchFieldError -> L357
        L695:
            r0[BleKey.SOS_CONTACT.ordinal()] = 93;     // Catch: NoSuchFieldError -> L358
        L697:
            r0[BleKey.GIRL_CARE_MONTHLY.ordinal()] = 94;     // Catch: NoSuchFieldError -> L359
        L707:
            r0[BleKey.CHECK_IN_EVERY_DAY.ordinal()] = 95;     // Catch: NoSuchFieldError -> L360
        L725:
            r0[BleKey.GESTURE_WAKE2.ordinal()] = 96;     // Catch: NoSuchFieldError -> L361
        L735:
            r0[BleKey.EARPHONE_KEY.ordinal()] = 97;     // Catch: NoSuchFieldError -> L362
        L737:
            r0[BleKey.HANBAO_SET.ordinal()] = 98;     // Catch: NoSuchFieldError -> L363
        L747:
            r0[BleKey.QIBLA_SET.ordinal()] = 99;     // Catch: NoSuchFieldError -> L364
        L765:
            r0[BleKey.FIND_EARPHONE.ordinal()] = 100;     // Catch: NoSuchFieldError -> L365
        L775:
            r0[BleKey.CALIBRATION_DATA.ordinal()] = 101;     // Catch: NoSuchFieldError -> L366
        L777:
            r0[BleKey.BATTERY_USAGE.ordinal()] = 102;     // Catch: NoSuchFieldError -> L367
        L787:
            r0[BleKey.DEVICE_UNIQUE_DATA_SET.ordinal()] = 103;     // Catch: NoSuchFieldError -> L368
        L539:
            r0[BleKey.IPC_STORES_INFO.ordinal()] = 104;     // Catch: NoSuchFieldError -> L369
        L553:
            r0[BleKey.SLEEP_QUALITY_SCORE.ordinal()] = 105;     // Catch: NoSuchFieldError -> L370
        L555:
            r0[BleKey.RELAX_REMINDER.ordinal()] = 106;     // Catch: NoSuchFieldError -> L371
        L567:
            r0[BleKey.CP_USER_INFO.ordinal()] = 107;     // Catch: NoSuchFieldError -> L372
        L589:
            r0[BleKey.POWER2.ordinal()] = 108;     // Catch: NoSuchFieldError -> L373
        L599:
            r0[BleKey.DEVICE_LANGUAGES2.ordinal()] = 109;     // Catch: NoSuchFieldError -> L374
        L601:
            r0[BleKey.IPC_INFO.ordinal()] = 110;     // Catch: NoSuchFieldError -> L375
        L611:
            r0[BleKey.IDENTITY.ordinal()] = 111;     // Catch: NoSuchFieldError -> L376
        L629:
            r0[BleKey.SESSION.ordinal()] = 112;     // Catch: NoSuchFieldError -> L377
        L639:
            r0[BleKey.MUSIC_CONTROL.ordinal()] = 113;     // Catch: NoSuchFieldError -> L378
        L641:
            r0[BleKey.SCHEDULE.ordinal()] = 114;     // Catch: NoSuchFieldError -> L379
        L651:
            r0[BleKey.WEATHER_REALTIME.ordinal()] = 115;     // Catch: NoSuchFieldError -> L380
        L925:
            r0[BleKey.WEATHER_REALTIME2.ordinal()] = 116;     // Catch: NoSuchFieldError -> L381
        L935:
            r0[BleKey.WEATHER_REALTIME3.ordinal()] = 117;     // Catch: NoSuchFieldError -> L382
        L937:
            r0[BleKey.HID.ordinal()] = 118;     // Catch: NoSuchFieldError -> L383
        L947:
            r0[BleKey.WORLD_CLOCK.ordinal()] = 119;     // Catch: NoSuchFieldError -> L384
        L965:
            r0[BleKey.STOCK.ordinal()] = 120;     // Catch: NoSuchFieldError -> L385
        L975:
            r0[BleKey.CHAT_MESSAGE.ordinal()] = 121;     // Catch: NoSuchFieldError -> L386
        L977:
            r0[BleKey.CHAT_VOICE.ordinal()] = 122;     // Catch: NoSuchFieldError -> L387
        L987:
            r0[BleKey.CP_GIFTS_INFO.ordinal()] = 123;     // Catch: NoSuchFieldError -> L388
        L1005:
            r0[BleKey.SLEEP_NOTIFY.ordinal()] = 124;     // Catch: NoSuchFieldError -> L389
        L1015:
            r0[BleKey.XMLY_BAND_SET.ordinal()] = 125;     // Catch: NoSuchFieldError -> L390
        L1017:
            r0[BleKey.BAND_KEY.ordinal()] = 126;     // Catch: NoSuchFieldError -> L391
        L1027:
            r0[BleKey.OFFLINE_ASR_SET.ordinal()] = 127;     // Catch: NoSuchFieldError -> L392
        L1045:
            r0[BleKey.ACTIVITY.ordinal()] = 128;     // Catch: NoSuchFieldError -> L393
        L799:
            r0[BleKey.HEART_RATE.ordinal()] = 129;     // Catch: NoSuchFieldError -> L394
        L801:
            r0[BleKey.BLOOD_PRESSURE.ordinal()] = 130;     // Catch: NoSuchFieldError -> L395
        L811:
            r0[BleKey.SLEEP.ordinal()] = 131;     // Catch: NoSuchFieldError -> L396
        L829:
            r0[BleKey.WORKOUT.ordinal()] = 132;     // Catch: NoSuchFieldError -> L397
        L839:
            r0[BleKey.LOCATION.ordinal()] = 133;     // Catch: NoSuchFieldError -> L398
        L841:
            r0[BleKey.TEMPERATURE.ordinal()] = 134;     // Catch: NoSuchFieldError -> L399
        L851:
            r0[BleKey.BLOOD_OXYGEN.ordinal()] = 135;     // Catch: NoSuchFieldError -> L400
        L869:
            r0[BleKey.HRV.ordinal()] = 136;     // Catch: NoSuchFieldError -> L401
        L879:
            r0[BleKey.LOG.ordinal()] = 137;     // Catch: NoSuchFieldError -> L402
        L881:
            r0[BleKey.SLEEP_RAW_DATA.ordinal()] = 138;     // Catch: NoSuchFieldError -> L403
        L891:
            r0[BleKey.RAW_SLEEP.ordinal()] = 139;     // Catch: NoSuchFieldError -> L404
        L909:
            r0[BleKey.PRESSURE.ordinal()] = 140;     // Catch: NoSuchFieldError -> L405
        L919:
            r0[BleKey.WORKOUT2.ordinal()] = 141;     // Catch: NoSuchFieldError -> L406
        L665:
            r0[BleKey.MATCH_RECORD.ordinal()] = 142;     // Catch: NoSuchFieldError -> L407
        L675:
            r0[BleKey.BLOOD_GLUCOSE.ordinal()] = 143;     // Catch: NoSuchFieldError -> L408
        L693:
            r0[BleKey.BODY_STATUS.ordinal()] = 144;     // Catch: NoSuchFieldError -> L409
        L703:
            r0[BleKey.MIND_STATUS.ordinal()] = 145;     // Catch: NoSuchFieldError -> L410
        L705:
            r0[BleKey.CALORIE_INTAKE.ordinal()] = 146;     // Catch: NoSuchFieldError -> L411
        L715:
            r0[BleKey.FOOD_BALANCE.ordinal()] = 147;     // Catch: NoSuchFieldError -> L412
        L733:
            r0[BleKey.GOLF_WATCH_SCORE.ordinal()] = 148;     // Catch: NoSuchFieldError -> L413
        L743:
            r0[BleKey.BAC.ordinal()] = 149;     // Catch: NoSuchFieldError -> L414
        L745:
            r0[BleKey.MATCH_RECORD2.ordinal()] = 150;     // Catch: NoSuchFieldError -> L415
        L755:
            r0[BleKey.AVG_HEART_RATE.ordinal()] = 151;     // Catch: NoSuchFieldError -> L416
        L773:
            r0[BleKey.ALIPAY_BIND_INFO.ordinal()] = 152;     // Catch: NoSuchFieldError -> L417
        L783:
            r0[BleKey.RRI.ordinal()] = 153;     // Catch: NoSuchFieldError -> L418
        L785:
            r0[BleKey.ECG.ordinal()] = 154;     // Catch: NoSuchFieldError -> L419
        L529:
            r0[BleKey.HANBAO_VIBRATION.ordinal()] = 155;     // Catch: NoSuchFieldError -> L420
        L549:
            r0[BleKey.SOS_CALL_LOG.ordinal()] = 156;     // Catch: NoSuchFieldError -> L421
        L561:
            r0[BleKey.WORKOUT3.ordinal()] = 157;     // Catch: NoSuchFieldError -> L422
        L565:
            r0[BleKey.WORKOUT4.ordinal()] = 158;     // Catch: NoSuchFieldError -> L423
        L579:
            r0[BleKey.WORKOUT4_SEGMENTATION.ordinal()] = 159;     // Catch: NoSuchFieldError -> L424
        L597:
            r0[BleKey.ENERGY_RATING.ordinal()] = 160;     // Catch: NoSuchFieldError -> L425
        L607:
            r0[BleKey.ECG_V2.ordinal()] = 161;     // Catch: NoSuchFieldError -> L426
        L609:
            r0[BleKey.DAILY_POWER.ordinal()] = 162;     // Catch: NoSuchFieldError -> L427
        L619:
            r0[BleKey.TRAINING_STATUS.ordinal()] = 163;     // Catch: NoSuchFieldError -> L428
        L637:
            r0[BleKey.VITALITY.ordinal()] = 164;     // Catch: NoSuchFieldError -> L429
        L647:
            r0[BleKey.RESPIRATORY_RATE.ordinal()] = 165;     // Catch: NoSuchFieldError -> L430
        L649:
            r0[BleKey.MATCH_RECORD3.ordinal()] = 166;     // Catch: NoSuchFieldError -> L431
        L659:
            r0[BleKey.CAMERA.ordinal()] = 167;     // Catch: NoSuchFieldError -> L432
        L933:
            r0[BleKey.CONTACT_US.ordinal()] = 168;     // Catch: NoSuchFieldError -> L433
        L943:
            r0[BleKey.SG_SET.ordinal()] = 169;     // Catch: NoSuchFieldError -> L434
        L945:
            r0[BleKey.SG_TTS.ordinal()] = 170;     // Catch: NoSuchFieldError -> L435
        L955:
            r0[BleKey.REQUEST_LOCATION.ordinal()] = 171;     // Catch: NoSuchFieldError -> L436
        L973:
            r0[BleKey.INCOMING_CALL.ordinal()] = 172;     // Catch: NoSuchFieldError -> L437
        L983:
            r0[BleKey.APP_SPORT_STATE.ordinal()] = 173;     // Catch: NoSuchFieldError -> L438
        L985:
            r0[BleKey.CLASSIC_BLUETOOTH_STATE.ordinal()] = 174;     // Catch: NoSuchFieldError -> L439
        L995:
            r0[BleKey.FACTORY_TEST.ordinal()] = 175;     // Catch: NoSuchFieldError -> L440
        L1013:
            r0[BleKey.DEVICE_SMS_QUICK_REPLY.ordinal()] = 176;     // Catch: NoSuchFieldError -> L441
        L1023:
            r0[BleKey.LOVE_TAP.ordinal()] = 177;     // Catch: NoSuchFieldError -> L442
        L1025:
            r0[BleKey.BAC_CALIBRATION.ordinal()] = 178;     // Catch: NoSuchFieldError -> L443
        L1035:
            r0[BleKey.INCOMING_CALL_RING.ordinal()] = 179;     // Catch: NoSuchFieldError -> L444
        L797:
            r0[BleKey.SPORT_END_NOTIFY.ordinal()] = 180;     // Catch: NoSuchFieldError -> L445
        L807:
            r0[BleKey.ONGOING_DIALOGUE.ordinal()] = 181;     // Catch: NoSuchFieldError -> L446
        L809:
            r0[BleKey.SG_KEY_SET.ordinal()] = 182;     // Catch: NoSuchFieldError -> L447
        L819:
            r0[BleKey.DOUBLE_SCREEN.ordinal()] = 183;     // Catch: NoSuchFieldError -> L448
        L837:
            r0[BleKey.FILE_PATH.ordinal()] = 184;     // Catch: NoSuchFieldError -> L449
        L847:
            r0[BleKey.APP_OP.ordinal()] = 185;     // Catch: NoSuchFieldError -> L450
        L849:
            r0[BleKey.HANBAO_VIBRATION_STATE.ordinal()] = 186;     // Catch: NoSuchFieldError -> L451
        L859:
            r0[BleKey.MEASUREMENT.ordinal()] = 187;     // Catch: NoSuchFieldError -> L452
        L877:
            r0[BleKey.GAME_CONTROL.ordinal()] = 188;     // Catch: NoSuchFieldError -> L453
        L887:
            r0[BleKey.APP_API_VERSION.ordinal()] = 189;     // Catch: NoSuchFieldError -> L454
        L889:
            r0[BleKey.DEVICE_OP.ordinal()] = 190;     // Catch: NoSuchFieldError -> L455
        L899:
            r0[BleKey.RECEIVE_DEVICE_FILE.ordinal()] = 191;     // Catch: NoSuchFieldError -> L456
        L917:
            r0[BleKey.AI_COMMAND.ordinal()] = 192;     // Catch: NoSuchFieldError -> L457
        L671:
            r0[BleKey.SG_CAMERA_SET.ordinal()] = 193;     // Catch: NoSuchFieldError -> L458
        L673:
            r0[BleKey.IPC_STATE.ordinal()] = 194;     // Catch: NoSuchFieldError -> L459
        L683:
            r0[BleKey.IPC_WIFI_INFO.ordinal()] = 195;     // Catch: NoSuchFieldError -> L460
        L701:
            r0[BleKey.AI_COACH_PLAN.ordinal()] = 196;     // Catch: NoSuchFieldError -> L461
        L711:
            r0[BleKey.AI_COACH_PLAN_V2_READ.ordinal()] = 197;     // Catch: NoSuchFieldError -> L462
        L713:
            r0[BleKey.RECORD_CONTROL.ordinal()] = 198;     // Catch: NoSuchFieldError -> L463
        L723:
            r0[BleKey.MULTIPLE_FILES_CONTROLLER.ordinal()] = 199;     // Catch: NoSuchFieldError -> L464
        L741:
            r0[BleKey.WEAR_STATE.ordinal()] = 200;     // Catch: NoSuchFieldError -> L465
        L751:
            r0[BleKey.SG_TEST.ordinal()] = 201;     // Catch: NoSuchFieldError -> L466
        L753:
            r0[BleKey.SG_KEYWORD_AWAKE.ordinal()] = 202;     // Catch: NoSuchFieldError -> L467
        L763:
            r0[BleKey.SG_SLEEP_SET.ordinal()] = 203;     // Catch: NoSuchFieldError -> L468
        L781:
            r0[BleKey.LACTATE_THRESHOLD.ordinal()] = 204;     // Catch: NoSuchFieldError -> L469
        L791:
            r0[BleKey.CHAT_APP.ordinal()] = 205;     // Catch: NoSuchFieldError -> L470
        L527:
            r0[BleKey.CP_LISTENER.ordinal()] = 206;     // Catch: NoSuchFieldError -> L471
        L537:
            r0[BleKey.IPC_EXCEPTION.ordinal()] = 207;     // Catch: NoSuchFieldError -> L472
        L559:
            r0[BleKey.IPC_OTA_STATE.ordinal()] = 208;     // Catch: NoSuchFieldError -> L473
        L571:
            r0[BleKey.HIGH_ANTI_ASSIST.ordinal()] = 209;     // Catch: NoSuchFieldError -> L474
        L575:
            r0[BleKey.HR_MONITORING_V2.ordinal()] = 210;     // Catch: NoSuchFieldError -> L475
        L587:
            r0[BleKey.HRV_BASELINE.ordinal()] = 211;     // Catch: NoSuchFieldError -> L476
        L605:
            r0[BleKey.SLEEP_MONITORING_MODE.ordinal()] = 212;     // Catch: NoSuchFieldError -> L477
        L615:
            r0[BleKey.START_DEVICE_SPORT.ordinal()] = 213;     // Catch: NoSuchFieldError -> L478
        L617:
            r0[BleKey.SLEEP_RESPIRATORY_RATE.ordinal()] = 214;     // Catch: NoSuchFieldError -> L479
        L627:
            r0[BleKey.RESTING_HEART_RATE.ordinal()] = 215;     // Catch: NoSuchFieldError -> L480
        L645:
            r0[BleKey.ZONES_HEART_RATE.ordinal()] = 216;     // Catch: NoSuchFieldError -> L481
        L655:
            r0[BleKey.VIDEO_CALL_INFO.ordinal()] = 217;     // Catch: NoSuchFieldError -> L482
        L657:
            r0[BleKey.SLEEP_RISK_LEVEL.ordinal()] = 218;     // Catch: NoSuchFieldError -> L483
        L923:
            r0[BleKey.OPTIONAL_MAP_AUTH_INFO.ordinal()] = 219;     // Catch: NoSuchFieldError -> L484
        L941:
            r0[BleKey.GET_WATCH_FACE_MAX_SIZE.ordinal()] = 220;     // Catch: NoSuchFieldError -> L485
        L951:
            r0[BleKey.ACTIVITY_RECOGNIYION.ordinal()] = 221;     // Catch: NoSuchFieldError -> L486
        L953:
            r0[BleKey.GOLF_SPORT_SWITCH.ordinal()] = 222;     // Catch: NoSuchFieldError -> L487
        L963:
            r0[BleKey.GOLF_WATCH_VERSION.ordinal()] = 223;     // Catch: NoSuchFieldError -> L488
        L981:
            r0[BleKey.GOLF_WATCH_MAP_INFO.ordinal()] = 224;     // Catch: NoSuchFieldError -> L489
        L991:
            r0[BleKey.BLE_GOLF_EDITTEXT_DATA.ordinal()] = 225;     // Catch: NoSuchFieldError -> L490
        L993:
            r0[BleKey.WATCH_FACE.ordinal()] = 226;     // Catch: NoSuchFieldError -> L491
        L1003:
            r0[BleKey.FILE_TRANSFER.ordinal()] = 227;     // Catch: NoSuchFieldError -> L492
        L1021:
            r0[BleKey.AGPS_FILE.ordinal()] = 228;     // Catch: NoSuchFieldError -> L493
        L1031:
            r0[BleKey.FONT_FILE.ordinal()] = 229;     // Catch: NoSuchFieldError -> L494
        L1033:
            r0[BleKey.CONTACT.ordinal()] = 230;     // Catch: NoSuchFieldError -> L495
        L1043:
            r0[BleKey.UI_FILE.ordinal()] = 231;     // Catch: NoSuchFieldError -> L496
        L805:
            r0[BleKey.LANGUAGE_FILE.ordinal()] = 232;     // Catch: NoSuchFieldError -> L497
        L815:
            r0[BleKey.BRAND_INFO_FILE.ordinal()] = 233;     // Catch: NoSuchFieldError -> L498
        L817:
            r0[BleKey.QRCODE.ordinal()] = 234;     // Catch: NoSuchFieldError -> L499
        L827:
            r0[BleKey.THIRD_PARTY_DATA.ordinal()] = 235;     // Catch: NoSuchFieldError -> L500
        L845:
            r0[BleKey.QRCODE2.ordinal()] = 236;     // Catch: NoSuchFieldError -> L501
        L855:
            r0[BleKey.LOGO_FILE.ordinal()] = 237;     // Catch: NoSuchFieldError -> L502
        L857:
            r0[BleKey.OTA_FILE.ordinal()] = 238;     // Catch: NoSuchFieldError -> L503
        L867:
            r0[BleKey.GPS_FIRMWARE_FILE.ordinal()] = 239;     // Catch: NoSuchFieldError -> L504
        L885:
            r0[BleKey.CONTACT_SORT.ordinal()] = 240;     // Catch: NoSuchFieldError -> L505
        L895:
            r0[BleKey.NAVI_IMAGE.ordinal()] = 241;     // Catch: NoSuchFieldError -> L506
        L897:
            r0[BleKey.APP_FILE.ordinal()] = 242;     // Catch: NoSuchFieldError -> L507
        L907:
            r0[BleKey.FAT_BIN_FILE.ordinal()] = 243;     // Catch: NoSuchFieldError -> L508
        L669:
            r0[BleKey.AGPS_FILE2.ordinal()] = 244;     // Catch: NoSuchFieldError -> L509
        L679:
            r0[BleKey.AI_COACH_PLAN_V2.ordinal()] = 245;     // Catch: NoSuchFieldError -> L510
        L681:
            r0[BleKey.CP_CHAT.ordinal()] = 246;     // Catch: NoSuchFieldError -> L511
        L691:
            r0[BleKey.CP_MISS_YOU.ordinal()] = 247;     // Catch: NoSuchFieldError -> L512
        L709:
            r0[BleKey.CP_TODO.ordinal()] = 248;     // Catch: NoSuchFieldError -> L513
        L719:
            r0[BleKey.CP_GALLERY.ordinal()] = 249;     // Catch: NoSuchFieldError -> L514
        L721:
            r0[BleKey.CP_GIFTS.ordinal()] = 250;     // Catch: NoSuchFieldError -> L515
        L731:
            r0[BleKey.CP_AVATAR.ordinal()] = 251;     // Catch: NoSuchFieldError -> L516
        L749:
            r0[BleKey.GOLF_IMAGE.ordinal()] = 252;     // Catch: NoSuchFieldError -> L517
        L759:
            r0[BleKey.GOLF_WATCH_UPDATE_MAP_INFO.ordinal()] = 253;     // Catch: NoSuchFieldError -> L518
        L761:
            r0[BleKey.SLEEP_DATA.ordinal()] = 254;     // Catch: NoSuchFieldError -> L519
        L771:
            r0[BleKey.DEVICE_FILE.ordinal()] = 255;     // Catch: NoSuchFieldError -> L520
        L789:
            r0[BleKey.HYDRATION_SET.ordinal()] = 256;     // Catch: NoSuchFieldError -> L521
        L533:
            r0[BleKey.MEETING_REMINDER_SET.ordinal()] = 257;     // Catch: NoSuchFieldError -> L522
        L535:
            r0[BleKey.GOLF_MAP_CACHE_INFO.ordinal()] = 258;     // Catch: NoSuchFieldError -> L523
        L547:
            r0[BleKey.HRV_SET.ordinal()] = 259;     // Catch: NoSuchFieldError -> L524
        L569:
            r0[BleKey.SLEEP_SET.ordinal()] = 260;     // Catch: NoSuchFieldError -> L525
        L583:
            r0[BleKey.VOICE_CONTROL.ordinal()] = 261;     // Catch: NoSuchFieldError -> L526
        L264:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: com.szabh.smable3.component.BaseBleConnector$init$1, reason: invalid class name */
    public static final class AnonymousClass1 implements XX0XO01i {
        final /* synthetic */ BaseBleConnector this$0;

        public AnonymousClass1(BaseBleConnector r1) {
            this.this$0 = r1;
        }

        public static /* synthetic */ Unit I0IIOi(BleHandleCallback r0) {
            return onConnectionStateChange$lambda$2(r0);
        }

        public static /* synthetic */ Unit IiI10X(BluetoothDevice r0, BleHandleCallback r1) {
            return onConnectionStateChange$lambda$0(r0, r1);
        }

        public static /* synthetic */ Unit OIi0(BleHandleCallback r0) {
            return onCharacteristicRead$lambda$3(r0);
        }

        public static /* synthetic */ Unit XOO0ii0(BleHandleCallback r0) {
            return onConnectionStateChange$lambda$1(r0);
        }

        private static final Unit onCharacteristicRead$lambda$3(BleHandleCallback r1) {
            Intrinsics.X0O(r1, "it");
            r1.onReadMtkOtaMeta();
            return Unit.OXO1;
        }

        private static final Unit onConnectionStateChange$lambda$0(BluetoothDevice r1, BleHandleCallback r2) {
            Intrinsics.X0O(r2, "it");
            Intrinsics.XXI(r1);
            r2.onDeviceConnected(r1);
            return Unit.OXO1;
        }

        private static final Unit onConnectionStateChange$lambda$1(BleHandleCallback r1) {
            Intrinsics.X0O(r1, "it");
            r1.onSessionStateChange(false);
            return Unit.OXO1;
        }

        private static final Unit onConnectionStateChange$lambda$2(BleHandleCallback r9) {
            Intrinsics.X0O(r9, "it");
            BleHandleCallback.onStreamProgress$default(r9, false, -1, 0, 0, null, 16, null);
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.XX0XO01i
        public void onCharacteristicChanged(byte[] r2) {
            Intrinsics.X0O(r2, "value");
            BaseBleConnector.access$handleData(this.this$0, r2);
        }

        @Override // com.android.mltcode.paycertificationapi.XX0XO01i
        public void onCharacteristicRead(String r2, byte[] r3, String r4) {
            Intrinsics.X0O(r2, "characteristicUuid");
            Intrinsics.X0O(r3, "value");
            Intrinsics.X0O(r4, "text");
            if (Intrinsics.XOO0ii0(r2, BleConnector.CH_MTK_OTA_META) == false) goto L9;
            BaseBleCache r5 = BaseBleConnector.access$getMBleCache$p(this.this$0);
            if (r5 != null) goto L7;
            Intrinsics.XXO("mBleCache");
            r5 = null;
        L7:
            r5.putMtkOtaMeta(r4);
            BaseBleConnector.access$notifyHandlers(this.this$0, new OXiI0Xii());
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.XX0XO01i
        public void onCharacteristicWrite(String r2, byte[] r3) {
            Intrinsics.X0O(r2, "characteristicUuid");
            Intrinsics.X0O(r3, "value");
            if (Intrinsics.XOO0ii0(r2, BaseBleConnector.CH_MTK_OTA_DATA) == false) goto L6;
            int r4 = BaseBleConnector.access$getMStreamProgressCompleted$p(this.this$0);
            BaseBleConnector.access$setMStreamProgressCompleted$p(this.this$0, r4 + 1);
            BaseBleConnector.access$checkStreamProgress(this.this$0);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.XX0XO01i
        public void onConnectionStateChange(boolean r6) {
            if (r6 == false) goto L10;
            BluetoothGatt r7 = this.this$0.getMBluetoothGatt();
            if (r7 == null) goto L8;
            final BluetoothDevice r8 = r7.getDevice();
            if (r8 == null) goto L8;
        L9:
            i1O0OXO1O.OXO1.OXO1(this.this$0.getTAG() + " onDeviceConnected -> " + r8);
            BaseBleConnector.access$setMBleState$p(this.this$0, 0);
            BaseBleConnector.access$notifyHandlers(this.this$0, new XXIOIO(r8));
            BaseBleConnector.access$setMStreamProgressTotal$p(this.this$0, -1);
            BaseBleConnector.access$setMStreamProgressCompleted$p(this.this$0, -1);
        L17:
            BaseBleConnector.access$setMBleStream(this.this$0, null);
            return;
        L8:
            r8 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(BaseBleConnector.access$getMTargetAddress(this.this$0));
            goto L9
        L10:
            i1O0OXO1O.OXO1.OXO1(this.this$0.getTAG() + " onSessionStateChange -> false");
            BaseBleConnector.access$setMReceivingCmTrace$p(this.this$0, false);
            BaseBleConnector.access$setMBleState$p(this.this$0, -1);
            BaseBleConnector.access$notifyHandlers(this.this$0, new IXi01O0O());
            if (BaseBleConnector.access$getMDataKeys$p(this.this$0).isEmpty() == true) goto L14;
            BaseBleConnector r9 = this.this$0;
            BaseBleConnector.access$notifySyncState(r9, -2, (BleKey) BaseBleConnector.access$getMDataKeys$p(r9).get(0));
            BaseBleConnector.access$getMDataKeys$p(this.this$0).clear();
            BaseBleConnector.access$removeSyncTimeout(this.this$0);
        L14:
            if (BaseBleConnector.access$getMBleStream$p(this.this$0) == null) goto L16;
            BaseBleConnector.access$notifyHandlers(this.this$0, new IOiXO());
        L16:
            BaseBleConnector.access$checkStreamProgress(this.this$0);
            goto L17
        }

        @Override // com.android.mltcode.paycertificationapi.XX0XO01i
        public void onMtuChanged() {
            BaseBleConnector.access$setMBleState$p(this.this$0, 1);
            if (BaseBleConnector.access$isNordicOtaMode$p(this.this$0) == true) goto L5;
            BaseBleCache r0 = BaseBleConnector.access$getMBleCache$p(this.this$0);
            if (r0 != null) goto L11;
            Intrinsics.XXO("mBleCache");
            r0 = null;
        L11:
            BleDeviceInfo r1 = r0.getMDeviceInfo();
            if (r1 != null) goto L14;
        L22:
            i1O0OXO1O.OXO1.IiI10X(this.this$0.getTAG() + " DeviceInfo is null or needs to be refreshed -> bind");
            if (this.this$0.isNeedBind() == false) goto L27;
            BaseBleConnector.access$bind(this.this$0);
            return;
        L27:
            return;
        L14:
            if (BaseBleConnector.access$isRefreshDeviceInfo$p(this.this$0) == true) goto L22;
            i1O0OXO1O.OXO1.IiI10X(this.this$0.getTAG() + " DeviceInfo not null -> login");
            if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L18;
        L19:
            this.this$0.setRefreshDeviceCache(true);
        L20:
            BaseBleConnector.access$login(this.this$0, r1.getMId());
            return;
        L18:
            if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == false) goto L20;
        L5:
            if (this.this$0.isNeedBind() == false) goto L26;
            BaseBleConnector.access$sendOta(this.this$0);
            return;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BaseBleConnector() {
        this.TAG = "BaseBleConnector";
        this.isDataKeyAutoDelete = true;
        this.mDeviceId = -1;
        this.mService$delegate = LazyKt__LazyJVMKt.iO(new iiOO1OOX());
        this.mNotify$delegate = LazyKt__LazyJVMKt.iO(new OOi01XII());
        this.mBleMessenger$delegate = LazyKt__LazyJVMKt.iO(new OIi11100I(this));
        this.mBleParser$delegate = LazyKt__LazyJVMKt.iO(new OiOiiOi());
        this.mBleHandleCallbacks$delegate = LazyKt__LazyJVMKt.iO(new XX1iOIi());
        this.mBleState = -1;
        this.mDataKeys = new ArrayList();
        this.mSyncTimeout = new OI10OX0I(this);
        this.mMusicSubscriptions = new EnumMap(MusicEntity.class);
        this.mStreamProgressTotal = -1;
        this.mStreamProgressCompleted = -1;
        this.mSupportFilterEmpty = true;
        this.isNeedBind = true;
    }

    public static /* synthetic */ Unit I0(int r0, BleHandleCallback r1) {
        return handleData$lambda$296$0(r0, r1);
    }

    public static /* synthetic */ Unit I00(int r0, BleHandleCallback r1) {
        return handleData$lambda$21(r0, r1);
    }

    public static /* synthetic */ Unit I00I01I(List r0, BleHandleCallback r1) {
        return handleData$lambda$196$0(r0, r1);
    }

    public static /* synthetic */ Unit I011X(BleSOSSettings r0, BleHandleCallback r1) {
        return handleData$lambda$100$0(r0, r1);
    }

    public static /* synthetic */ Unit I0IIOI(int r0, BleHandleCallback r1) {
        return handleData$lambda$51(r0, r1);
    }

    public static /* synthetic */ Unit I0O(BleBloodPressure r0, BleHandleCallback r1) {
        return handleData$lambda$62$0(r0, r1);
    }

    public static /* synthetic */ BleParser I0O1O() {
        return mBleParser_delegate$lambda$0();
    }

    public static /* synthetic */ Unit I0OX(BleCPGiftsInfo r0, BleHandleCallback r1) {
        return handleData$lambda$189$0(r0, r1);
    }

    public static /* synthetic */ Unit I0X(BleGolfSportSwitch r0, BleHandleCallback r1) {
        return handleData$lambda$311$0(r0, r1);
    }

    public static /* synthetic */ Unit I0XXi0X(BleEarphoneAncSettings r0, BleHandleCallback r1) {
        return handleData$lambda$122$0(r0, r1);
    }

    public static /* synthetic */ Unit I0XXiIO(BlePower2 r0, BleHandleCallback r1) {
        return handleData$lambda$163$0(r0, r1);
    }

    public static /* synthetic */ Unit I0i(String r0, BleHandleCallback r1) {
        return handleData$lambda$3$1(r0, r1);
    }

    public static /* synthetic */ Unit I0i0(BleMeetingReminder r0, BleHandleCallback r1) {
        return handleData$lambda$335(r0, r1);
    }

    public static /* synthetic */ Unit I0i1OXiI(BleQiblaSettings r0, BleHandleCallback r1) {
        return handleData$lambda$152$0(r0, r1);
    }

    public static /* synthetic */ Unit I0iOXO(BleDeviceFile r0, BleHandleCallback r1) {
        return handleData$lambda$328$0(r0, r1);
    }

    public static /* synthetic */ Unit I0iXXO(BleChatMessage r0, BleHandleCallback r1) {
        return handleData$lambda$187$0(r0, r1);
    }

    public static /* synthetic */ Unit I1(List r0, BleHandleCallback r1) {
        return handleData$lambda$219$0(r0, r1);
    }

    public static /* synthetic */ Unit I10Oi0(BleHandleCallback r0) {
        return handleData$lambda$153(r0);
    }

    public static /* synthetic */ Unit I11X11OX(int r0, BleHandleCallback r1) {
        return handleData$lambda$279$0(r0, r1);
    }

    public static /* synthetic */ String I11iXOO() {
        return mService_delegate$lambda$0();
    }

    public static /* synthetic */ Unit I1IXIOX1(List r0, BleHandleCallback r1) {
        return handleData$lambda$206$0(r0, r1);
    }

    public static /* synthetic */ Unit I1Ii(BleGestureWake r0, BleHandleCallback r1) {
        return handleData$lambda$52$0(r0, r1);
    }

    public static /* synthetic */ Unit I1OI(byte[] r0, BleHandleCallback r1) {
        return handleData$lambda$204(r0, r1);
    }

    public static /* synthetic */ Unit I1OX(BaseBleConnector r0, BleHandleCallback r1) {
        return checkStreamProgress$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XII0X(int r0, BleHandleCallback r1) {
        return handleData$lambda$40(r0, r1);
    }

    public static /* synthetic */ Unit I1XOXOX(List r0, BleHandleCallback r1) {
        return handleData$lambda$31$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(Ref.IntRef r0, BleHandleCallback r1) {
        return handleData$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit I1XXi1Oi(BleGestureWake r0, BleHandleCallback r1) {
        return handleData$lambda$53$0(r0, r1);
    }

    public static /* synthetic */ Unit II(BleCPMissYou r0, BleHandleCallback r1) {
        return handleData$lambda$326$0(r0, r1);
    }

    public static /* synthetic */ Unit II01I(BleAlipaySettings r0, BleHandleCallback r1) {
        return handleData$lambda$96$0(r0, r1);
    }

    public static /* synthetic */ Unit II0O1(int r0, BleHandleCallback r1) {
        return handleData$lambda$127(r0, r1);
    }

    public static /* synthetic */ Unit II1(String r0, BleHandleCallback r1) {
        return handleData$lambda$3$2(r0, r1);
    }

    public static /* synthetic */ Unit II1Xi0(BleEarphoneInfo r0, BleHandleCallback r1) {
        return handleData$lambda$128$0(r0, r1);
    }

    public static /* synthetic */ Unit III(BleBloodOxyGenSettings r0, BleHandleCallback r1) {
        return handleData$lambda$107$0(r0, r1);
    }

    public static /* synthetic */ Unit IIII0iI(String r0, BleHandleCallback r1) {
        return handleData$lambda$264$0(r0, r1);
    }

    public static /* synthetic */ Unit IIO11(BleGirlCareMonthly r0, BleHandleCallback r1) {
        return handleData$lambda$144$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX(BleGolfWatchVersionInfo r0, BleHandleCallback r1) {
        return handleData$lambda$314$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(BleDeviceFile r0, BleHandleCallback r1) {
        return handleData$lambda$329$0(r0, r1);
    }

    public static /* synthetic */ Unit IIXXi1(BleSedentarinessSettings r0, BleHandleCallback r1) {
        return handleData$lambda$11$0(r0, r1);
    }

    public static /* synthetic */ Unit IIi(List r0, BleHandleCallback r1) {
        return handleData$lambda$208$0(r0, r1);
    }

    public static /* synthetic */ Unit IIi10(List r0, BleHandleCallback r1) {
        return handleData$lambda$228$0(r0, r1);
    }

    public static /* synthetic */ Unit IIiiIiXiI(List r0, BleHandleCallback r1) {
        return handleData$lambda$195$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0I000XO(BleGestureWake2 r0, BleHandleCallback r1) {
        return handleData$lambda$148$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0II0i(BleOptionalMapAuthInfo r0, BleHandleCallback r1) {
        return handleData$lambda$308$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0IXI(List r0, BleHandleCallback r1) {
        return handleData$lambda$202$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0OOi(int r0, BleHandleCallback r1) {
        return handleData$lambda$281$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0iXO0O(BleStandbyWatchFaceSet r0, BleHandleCallback r1) {
        return handleData$lambda$109$0(r0, r1);
    }

    public static /* synthetic */ Unit IOI(BleRecordPacket r0, BleHandleCallback r1) {
        return handleData$lambda$98$0(r0, r1);
    }

    public static /* synthetic */ CopyOnWriteArrayList IOI0i0I() {
        return mBleHandleCallbacks_delegate$lambda$0();
    }

    public static /* synthetic */ Unit IOIX1OI0(List r0, BleHandleCallback r1) {
        return handleData$lambda$212$0(r0, r1);
    }

    public static /* synthetic */ Unit IOIi00(BleMedicationReminder r0, BleHandleCallback r1) {
        return handleData$lambda$80(r0, r1);
    }

    public static /* synthetic */ Unit IOIii0(BleEarphonePower r0, BleHandleCallback r1) {
        return handleData$lambda$121$0(r0, r1);
    }

    public static /* synthetic */ Unit IOOIXiI1(BleHrvMonitoringSettings r0, BleHandleCallback r1) {
        return handleData$lambda$341$0(r0, r1);
    }

    public static /* synthetic */ Unit IOX1(BleAppInfoList r0, BleHandleCallback r1) {
        return handleData$lambda$259$0(r0, r1);
    }

    public static /* synthetic */ Unit IOi1O0(int r0, BleHandleCallback r1) {
        return handleData$lambda$43(r0, r1);
    }

    public static /* synthetic */ Unit IX(List r0, BleHandleCallback r1) {
        return handleData$lambda$210$0(r0, r1);
    }

    public static /* synthetic */ Unit IX0(int r0, BleHandleCallback r1) {
        return handleData$lambda$9$0(r0, r1);
    }

    public static /* synthetic */ Unit IX0IXOi(BleHandleCallback r0) {
        return handleData$lambda$186(r0);
    }

    public static /* synthetic */ Unit IX0iIX(BleWorkout4Segmentation r0, BleHandleCallback r1) {
        return handleData$lambda$225$0(r0, r1);
    }

    public static /* synthetic */ Unit IX1(BleStreamProgress r0, BleKey r1, BleHandleCallback r2) {
        return handleData$lambda$321$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit IX1XiI(BleIPCWifiInfo r0, BleHandleCallback r1) {
        return handleData$lambda$271$0(r0, r1);
    }

    public static /* synthetic */ Unit IXI(int r0, BleHandleCallback r1) {
        return handleData$lambda$346(r0, r1);
    }

    public static /* synthetic */ Unit IXO0OOi(List r0, BleHandleCallback r1) {
        return handleData$lambda$183$0(r0, r1);
    }

    public static /* synthetic */ Unit IXOIIIO(int r0, BleHandleCallback r1) {
        return handleData$lambda$42(r0, r1);
    }

    public static /* synthetic */ Unit IXOiIi1O1(BleGoMoreSettings r0, BleHandleCallback r1) {
        return handleData$lambda$133$0(r0, r1);
    }

    public static /* synthetic */ Unit IXXI1(BleRelaxReminder r0, BleHandleCallback r1) {
        return handleData$lambda$161$0(r0, r1);
    }

    public static /* synthetic */ Unit IXXOO(BleSleepQuality r0, BleHandleCallback r1) {
        return handleData$lambda$25(r0, r1);
    }

    public static /* synthetic */ Unit IXi01O(int r0, BleHandleCallback r1) {
        return handleData$lambda$19(r0, r1);
    }

    public static /* synthetic */ Unit IXiOXO(int r0, BleHandleCallback r1) {
        return handleData$lambda$185(r0, r1);
    }

    public static /* synthetic */ Unit Ii(int r0, BleHandleCallback r1) {
        return handleData$lambda$47(r0, r1);
    }

    public static /* synthetic */ Unit Ii00iIX01(List r0, BleHandleCallback r1) {
        return handleData$lambda$203$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii0X0X(BleSGSet r0, BleHandleCallback r1) {
        return handleData$lambda$237$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii0i(List r0, BleHandleCallback r1) {
        return handleData$lambda$199$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii1X(BleVideoCallInfo r0, BleHandleCallback r1) {
        return handleData$lambda$306$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii1iii0(BaseBleConnector r0) {
        return checkStreamProgress$lambda$1(r0);
    }

    public static /* synthetic */ Unit IiII0(String r0, BleHandleCallback r1) {
        return handleData$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ Unit IiIiIiX(int r0, BleHandleCallback r1) {
        return handleData$lambda$345$0(r0, r1);
    }

    public static /* synthetic */ Unit IiO1X1OI(List r0, BleHandleCallback r1) {
        return handleData$lambda$35$0(r0, r1);
    }

    public static /* synthetic */ void IiOi0Oi0O(BaseBleConnector r0) {
        mSyncTimeout$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiX(List r0, BleHandleCallback r1) {
        return handleData$lambda$221$0(r0, r1);
    }

    public static /* synthetic */ Unit IiX1ii(int r0, BleHandleCallback r1) {
        return handleData$lambda$126(r0, r1);
    }

    public static /* synthetic */ Unit IiXIIX1O1(int r0, BleHandleCallback r1) {
        return handleData$lambda$117(r0, r1);
    }

    public static /* synthetic */ Unit IiiXiI0I(BleHandleCallback r0) {
        return handleData$lambda$38(r0);
    }

    public static /* synthetic */ Unit IiiiOIIi0(BleIPCOTAState r0, BleHandleCallback r1) {
        return handleData$lambda$293$0(r0, r1);
    }

    public static /* synthetic */ Unit O0(BleReceiveFilePacket r0, BleHandleCallback r1) {
        return handleData$lambda$266$0(r0, r1);
    }

    public static /* synthetic */ Unit O001I(boolean r0, BleHandleCallback r1) {
        return handleData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O00OXOXO(int r0, BleHandleCallback r1) {
        return handleData$lambda$55(r0, r1);
    }

    public static /* synthetic */ Unit O011OOIO0(BleKey r0, BleKeyFlag r1, boolean r2, BleHandleCallback r3) {
        return handleData$lambda$322(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit O0IOiOIi(BleAICommand r0, BleHandleCallback r1) {
        return handleData$lambda$267$0(r0, r1);
    }

    public static /* synthetic */ Unit O0Ii(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$15(r0, r1, r2);
    }

    public static /* synthetic */ Unit O0O(int r0, BleHandleCallback r1) {
        return handleData$lambda$48(r0, r1);
    }

    public static /* synthetic */ Unit O0O0X0iOi(BleCyWeeAlgorithm r0, BleHandleCallback r1) {
        return handleData$lambda$36$0(r0, r1);
    }

    public static /* synthetic */ Unit O0OX(List r0, BleHandleCallback r1) {
        return handleData$lambda$194$0(r0, r1);
    }

    public static /* synthetic */ Unit O0X(BleCoachingIds r0, BleHandleCallback r1) {
        return handleData$lambda$22(r0, r1);
    }

    public static /* synthetic */ void O0i(BaseBleConnector r0, Function1 r1) {
        notifyHandlers$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O0i0(int r0, BleHandleCallback r1) {
        return handleData$lambda$243$0(r0, r1);
    }

    public static /* synthetic */ Unit O0i011(List r0, BleHandleCallback r1) {
        return handleData$lambda$233$0(r0, r1);
    }

    public static /* synthetic */ Unit O1(BleMeasurement r0, BleHandleCallback r1) {
        return handleData$lambda$262$0(r0, r1);
    }

    public static /* synthetic */ Unit O101(int r0, BleHandleCallback r1) {
        return handleData$lambda$251(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(BleTemperature r0, BleHandleCallback r1) {
        return handleData$lambda$61$0(r0, r1);
    }

    public static /* synthetic */ Unit O11i0i11(BleSGKeywordAwake r0, BleHandleCallback r1) {
        return handleData$lambda$286$0(r0, r1);
    }

    public static /* synthetic */ Unit O1I(BleHandleCallback r0) {
        return mtkOta$lambda$0(r0);
    }

    public static /* synthetic */ Unit O1IO00(BleActivityDetail r0, BleHandleCallback r1) {
        return handleData$lambda$116$0(r0, r1);
    }

    public static /* synthetic */ Unit O1O(BleDrinkWaterSettings r0, BleHandleCallback r1) {
        return handleData$lambda$45$0(r0, r1);
    }

    public static /* synthetic */ Unit O1XXXX(BleDeviceLanguages r0, BleHandleCallback r1) {
        return handleData$lambda$103$0(r0, r1);
    }

    public static /* synthetic */ Unit O1i0(BleHandleCallback r0) {
        return handleData$lambda$177(r0);
    }

    public static /* synthetic */ Unit O1iXiI(BleLoveTap r0, BleHandleCallback r1) {
        return handleData$lambda$247$0(r0, r1);
    }

    public static /* synthetic */ Unit O1iii(List r0, BleHandleCallback r1) {
        return handleData$lambda$28$0(r0, r1);
    }

    public static /* synthetic */ Unit OI(BleDrinkWaterSettings r0, BleHandleCallback r1) {
        return handleData$lambda$46$0(r0, r1);
    }

    public static /* synthetic */ Unit OI10X(BleGolfWatchMapInfo r0, BleHandleCallback r1) {
        return handleData$lambda$315$0(r0, r1);
    }

    public static /* synthetic */ Unit OI1IiOO1i(List r0, BleHandleCallback r1) {
        return handleData$lambda$205$0(r0, r1);
    }

    public static /* synthetic */ Unit OI1O(List r0, BleHandleCallback r1) {
        return handleData$lambda$332$0(r0, r1);
    }

    public static /* synthetic */ Unit OI1i1i(List r0, BleHandleCallback r1) {
        return handleData$lambda$223$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(BleSettingWatchPassword r0, BleHandleCallback r1) {
        return handleData$lambda$63$0(r0, r1);
    }

    public static /* synthetic */ Unit OIIOI(List r0, BleHandleCallback r1) {
        return handleData$lambda$30$0(r0, r1);
    }

    public static /* synthetic */ Unit OIIi110I(BleSGTts r0, BleHandleCallback r1) {
        return handleData$lambda$238$0(r0, r1);
    }

    public static /* synthetic */ Unit OIOIi1XO(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$258(r0, r1, r2);
    }

    public static /* synthetic */ Unit OIX0iXi(BleSGTest r0, BleHandleCallback r1) {
        return handleData$lambda$285$0(r0, r1);
    }

    public static /* synthetic */ Unit OIXII1(BleIPCInfo r0, BleHandleCallback r1) {
        return handleData$lambda$165$0(r0, r1);
    }

    public static /* synthetic */ Unit OIXIiX111(BleAppOp r0, BleHandleCallback r1) {
        return handleData$lambda$260$0(r0, r1);
    }

    public static /* synthetic */ Unit OIXOOi(int r0, BleHandleCallback r1) {
        return handleData$lambda$49(r0, r1);
    }

    public static /* synthetic */ Unit OIXOXXi(BleWechatPaySettings r0, BleHandleCallback r1) {
        return handleData$lambda$97$0(r0, r1);
    }

    public static /* synthetic */ Unit OIi1i1iX1(List r0, BleHandleCallback r1) {
        return handleData$lambda$78$0(r0, r1);
    }

    public static /* synthetic */ Unit OIii(BleCPTodo r0, BleHandleCallback r1) {
        return handleData$lambda$327$0(r0, r1);
    }

    public static /* synthetic */ Unit OO(BleSosContact r0, BleHandleCallback r1) {
        return handleData$lambda$143$0(r0, r1);
    }

    public static /* synthetic */ Unit OO0Oi10(BleAICoachGeneratePlanV2 r0, BleHandleCallback r1) {
        return handleData$lambda$274$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OO1101010(BleGolfSportSwitch r0, BleHandleCallback r1) {
        return handleData$lambda$312$0(r0, r1);
    }

    public static /* synthetic */ Unit OO1O00iI(int r0, BleHandleCallback r1) {
        return handleData$lambda$297(r0, r1);
    }

    public static /* synthetic */ Unit OOI00O1O0(List r0, BleHandleCallback r1) {
        return handleData$lambda$209$0(r0, r1);
    }

    public static /* synthetic */ Unit OOI1i0(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$176(r0, r1, r2);
    }

    public static /* synthetic */ Unit OOIIOX(int r0, BleHandleCallback r1) {
        return handleData$lambda$71$0(r0, r1);
    }

    public static /* synthetic */ Unit OOIX(BleBWNaviInfo r0, BleHandleCallback r1) {
        return handleData$lambda$113$0(r0, r1);
    }

    public static /* synthetic */ Unit OOX(List r0, BleHandleCallback r1) {
        return handleData$lambda$222$0(r0, r1);
    }

    public static /* synthetic */ Unit OOX1I(BleEarphoneKey r0, BleHandleCallback r1) {
        return handleData$lambda$149$0(r0, r1);
    }

    public static /* synthetic */ Unit OOXiOO(BleAlarm r0, BleHandleCallback r1) {
        return handleData$lambda$20(r0, r1);
    }

    public static /* synthetic */ Unit OX(BleLanguagePackVersion r0, BleHandleCallback r1) {
        return handleData$lambda$4$0(r0, r1);
    }

    public static /* synthetic */ Unit OX0(BleGoogleNaviInfo r0, BleHandleCallback r1) {
        return handleData$lambda$120$0(r0, r1);
    }

    public static /* synthetic */ Unit OX0X1O10X(BleHrvBaseLine r0, BleHandleCallback r1) {
        return handleData$lambda$298$0(r0, r1);
    }

    public static /* synthetic */ Unit OX110i(BleSDCardInfo r0, BleHandleCallback r1) {
        return handleData$lambda$115$0(r0, r1);
    }

    public static /* synthetic */ Unit OXI0Xi(boolean r0, BleHandleCallback r1) {
        return _set_isConnecting_$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OXIX0(List r0, BleHandleCallback r1) {
        return handleData$lambda$229$0(r0, r1);
    }

    public static /* synthetic */ Unit OXOI0XII(List r0, BleHandleCallback r1) {
        return handleData$lambda$220$0(r0, r1);
    }

    public static /* synthetic */ Unit OXOIiXO1(List r0, BleHandleCallback r1) {
        return handleData$lambda$215$0(r0, r1);
    }

    public static /* synthetic */ Unit OXOO0X0i(BleRingVibrationSettings r0, BleHandleCallback r1) {
        return handleData$lambda$134$0(r0, r1);
    }

    public static /* synthetic */ Unit OXXO0O1X(BleCyWeeAlgorithm r0, BleHandleCallback r1) {
        return handleData$lambda$37$0(r0, r1);
    }

    public static /* synthetic */ Unit OXXiX0(BaseBleConnector r0, BleHandleCallback r1) {
        return checkStreamProgress$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit OXi001(int r0, BleHandleCallback r1) {
        return handleData$lambda$137$0(r0, r1);
    }

    public static /* synthetic */ Unit OXi1iX(BleMedicationAlarm r0, BleHandleCallback r1) {
        return handleData$lambda$89(r0, r1);
    }

    public static /* synthetic */ Unit OXii10I(BleFindEarphone r0, BleHandleCallback r1) {
        return handleData$lambda$154$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi(BleHandleCallback r0) {
        return handleData$lambda$1(r0);
    }

    public static /* synthetic */ Unit Oi0(int r0, BleHandleCallback r1) {
        return handleData$lambda$68$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi000O010(BleBatteryUsage r0, BleHandleCallback r1) {
        return handleData$lambda$156$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi0X1iiii(BleAICoachBeforePlanV2 r0, BleHandleCallback r1) {
        return handleData$lambda$274$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi1(List r0, BleHandleCallback r1) {
        return handleData$lambda$232$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi1I(List r0, BleHandleCallback r1) {
        return handleData$lambda$201$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi1OIX1(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$347(r0, r1, r2);
    }

    public static /* synthetic */ Unit OiIIX101O(BleRealtimeLog r0, BleHandleCallback r1) {
        return handleData$lambda$26$0(r0, r1);
    }

    public static /* synthetic */ Unit OiO(BleDeviceLanguages2 r0, BleHandleCallback r1) {
        return handleData$lambda$164$0(r0, r1);
    }

    public static /* synthetic */ Unit OiO0IOX(int r0, BleHandleCallback r1) {
        return handleData$lambda$265$0(r0, r1);
    }

    public static /* synthetic */ Unit OiO1iiO1O(BleWatchFaceMaxSize r0, BleHandleCallback r1) {
        return handleData$lambda$309$0(r0, r1);
    }

    public static /* synthetic */ Unit OiX(BleAICoachBeforePlanV2 r0, BleHandleCallback r1) {
        return handleData$lambda$275$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OiXI1OiX0(BleGolfWatchScore r0, BleHandleCallback r1) {
        return handleData$lambda$214$0(r0, r1);
    }

    public static /* synthetic */ Unit OiXX0(int r0, BleHandleCallback r1) {
        return handleData$lambda$82(r0, r1);
    }

    public static /* synthetic */ Unit OiXXXi10(BleSleepNotify r0, BleHandleCallback r1) {
        return handleData$lambda$190$0(r0, r1);
    }

    public static /* synthetic */ Unit Oii1I1I10(BleChatApp r0, BleHandleCallback r1) {
        return handleData$lambda$290$0(r0, r1);
    }

    public static /* synthetic */ Unit Oii1X1iO(BleEarphoneKey r0, BleHandleCallback r1) {
        return handleData$lambda$150$0(r0, r1);
    }

    public static /* synthetic */ Unit Oiii(BleCPChat r0, BleHandleCallback r1) {
        return handleData$lambda$325$0(r0, r1);
    }

    public static /* synthetic */ Unit X00110X(BleChatVoice r0, BleHandleCallback r1) {
        return handleData$lambda$188$0(r0, r1);
    }

    public static /* synthetic */ Unit X00O0(int r0, BleHandleCallback r1) {
        return handleData$lambda$295(r0, r1);
    }

    public static /* synthetic */ Unit X00XIX1(BleLeaveDay r0, BleHandleCallback r1) {
        return handleData$lambda$275$2$0(r0, r1);
    }

    public static /* synthetic */ Unit X00Xi1X(BleECGRealtime r0, BleHandleCallback r1) {
        return handleData$lambda$227$0(r0, r1);
    }

    public static /* synthetic */ Unit X0100I(BleSGCameraSet r0, BleHandleCallback r1) {
        return handleData$lambda$268$0(r0, r1);
    }

    public static /* synthetic */ Unit X01I0(BleEarphoneAncSettings r0, BleHandleCallback r1) {
        return handleData$lambda$123$0(r0, r1);
    }

    public static /* synthetic */ Unit X01I1OX1i(int r0, BleHandleCallback r1) {
        return handleData$lambda$283$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(int r0, BleHandleCallback r1) {
        return handleData$lambda$302(r0, r1);
    }

    public static /* synthetic */ Unit X0I1(String r0, BleHandleCallback r1) {
        return handleData$lambda$3$4(r0, r1);
    }

    public static /* synthetic */ Unit X0O(int r0, BleHandleCallback r1) {
        return handleData$lambda$294$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O1XO(int r0, BleHandleCallback r1) {
        return handleData$lambda$178$0(r0, r1);
    }

    public static /* synthetic */ Unit X0XI11I(BleHandleCallback r0) {
        return handleData$lambda$41(r0);
    }

    public static /* synthetic */ Unit X0i0(BleGolfMapCacheInfo r0, BleHandleCallback r1) {
        return handleData$lambda$340$0(r0, r1);
    }

    public static /* synthetic */ Unit X0i1101I(BleAppSportState r0, BleHandleCallback r1) {
        return handleData$lambda$241$0(r0, r1);
    }

    public static /* synthetic */ Unit X0i1O(int r0, BleHandleCallback r1) {
        return handleData$lambda$235$0(r0, r1);
    }

    public static /* synthetic */ Unit X0iO(BleHandleCallback r0) {
        return handleData$lambda$166(r0);
    }

    public static /* synthetic */ Unit X1(BleGolfWatchScore r0, BleHandleCallback r1) {
        return handleData$lambda$213$0(r0, r1);
    }

    public static /* synthetic */ Unit X100O(int r0, BleHandleCallback r1) {
        return handleData$lambda$50(r0, r1);
    }

    public static /* synthetic */ Unit X10O(BleBandKey r0, BleHandleCallback r1) {
        return handleData$lambda$192$0(r0, r1);
    }

    public static /* synthetic */ Unit X10i(BleMedicationAlarm r0, BleHandleCallback r1) {
        return handleData$lambda$92(r0, r1);
    }

    public static /* synthetic */ Unit X11(List r0, BleHandleCallback r1) {
        return handleData$lambda$197$0(r0, r1);
    }

    public static /* synthetic */ Unit X111IO(BleIPCException r0, BleHandleCallback r1) {
        return handleData$lambda$292$0(r0, r1);
    }

    public static /* synthetic */ Unit X11I(BleWatchFaceIndex r0, BleHandleCallback r1) {
        return handleData$lambda$141$0(r0, r1);
    }

    public static /* synthetic */ Unit X11iII1O1(BleDoubleScreenSettings r0, BleHandleCallback r1) {
        return handleData$lambda$256$0(r0, r1);
    }

    public static /* synthetic */ Unit X1IX(int r0, BleHandleCallback r1) {
        return handleData$lambda$300(r0, r1);
    }

    public static /* synthetic */ Unit X1OI(BaseBleConnector r0) {
        return checkStreamProgress$lambda$3(r0);
    }

    public static /* synthetic */ Unit X1OOO(BleCPListener r0, BleHandleCallback r1) {
        return handleData$lambda$291$0(r0, r1);
    }

    public static /* synthetic */ Unit X1i(int r0, BleHandleCallback r1) {
        return handleData$lambda$337(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(BleAppSportState r0, BleHandleCallback r1) {
        return handleData$lambda$242$0(r0, r1);
    }

    public static /* synthetic */ Unit XI(BleCheckInEveryDay r0, BleHandleCallback r1) {
        return handleData$lambda$145$0(r0, r1);
    }

    public static /* synthetic */ Unit XI1O1111i(int r0, BleHandleCallback r1) {
        return handleData$lambda$77(r0, r1);
    }

    public static /* synthetic */ Unit XI1OX0IO(int r0, BleHandleCallback r1) {
        return handleData$lambda$250(r0, r1);
    }

    public static /* synthetic */ Unit XII01OO1I(BleTuyaKey r0, BleHandleCallback r1) {
        return handleData$lambda$85$0(r0, r1);
    }

    public static /* synthetic */ Unit XIIIO(BleGestureWake2 r0, BleHandleCallback r1) {
        return handleData$lambda$147$0(r0, r1);
    }

    public static /* synthetic */ Unit XIIO11I(BleIPCStoresInfo r0, BleHandleCallback r1) {
        return handleData$lambda$159$0(r0, r1);
    }

    public static /* synthetic */ Unit XIO11I(BleBAC r0, BleHandleCallback r1) {
        return handleData$lambda$86$0(r0, r1);
    }

    public static /* synthetic */ Unit XIOX1(BleSOSSettings r0, BleHandleCallback r1) {
        return handleData$lambda$101$0(r0, r1);
    }

    public static /* synthetic */ Unit XIXO0iiO(BaseBleConnector r0, BleHandleCallback r1) {
        return handleData$lambda$323(r0, r1);
    }

    public static /* synthetic */ Unit XIi(int r0, BleHandleCallback r1) {
        return handleData$lambda$236$0(r0, r1);
    }

    public static /* synthetic */ Unit XIi10(BleMeetingReminder r0, BleHandleCallback r1) {
        return handleData$lambda$338(r0, r1);
    }

    public static /* synthetic */ Unit XIiIOXOOI(int r0, BleHandleCallback r1) {
        return handleData$lambda$282$0(r0, r1);
    }

    public static /* synthetic */ Unit XO00O0(int r0, BleHandleCallback r1) {
        return handleData$lambda$244$0(r0, r1);
    }

    public static /* synthetic */ Unit XO0X10iO(BleEcgSettings r0, BleHandleCallback r1) {
        return handleData$lambda$136$0(r0, r1);
    }

    public static /* synthetic */ Unit XO1(BleNoDisturbSettings r0, BleHandleCallback r1) {
        return handleData$lambda$12$0(r0, r1);
    }

    public static /* synthetic */ Unit XO11O(BleRecordControl r0, BleHandleCallback r1) {
        return handleData$lambda$276$0(r0, r1);
    }

    public static /* synthetic */ Unit XO11XXOi(BleChatApp r0, BleHandleCallback r1) {
        return handleData$lambda$289$0(r0, r1);
    }

    public static /* synthetic */ Unit XOI(BleDeviceFile2 r0, BleHandleCallback r1) {
        return handleData$lambda$319$0(r0, r1);
    }

    public static /* synthetic */ Unit XOIO0(List r0, BleHandleCallback r1) {
        return handleData$lambda$180$0(r0, r1);
    }

    public static /* synthetic */ Unit XOIO11O(int r0, BleHandleCallback r1) {
        return handleData$lambda$118(r0, r1);
    }

    public static /* synthetic */ Unit XOIX(BleBloodPressureCalibration r0, BleHandleCallback r1) {
        return handleData$lambda$119$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0XOOii(int r0, BleHandleCallback r1) {
        return handleData$lambda$278$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0Xi(BleHandleCallback r0) {
        return handleData$lambda$27(r0);
    }

    public static /* synthetic */ Unit XOOI0O(List r0, BleHandleCallback r1) {
        return handleData$lambda$226$0(r0, r1);
    }

    public static /* synthetic */ Unit XOOXII(BleWatchFaceId r0, BleHandleCallback r1) {
        return handleData$lambda$59$0(r0, r1);
    }

    public static /* synthetic */ Unit XOX0O0(int r0, BleHandleCallback r1) {
        return handleData$lambda$344(r0, r1);
    }

    public static /* synthetic */ Unit XOXOIX0Oi(BleHrWarningSettings r0, BleHandleCallback r1) {
        return handleData$lambda$84$0(r0, r1);
    }

    public static /* synthetic */ Unit XOXiX0(BleHrMonitoringSettings r0, BleHandleCallback r1) {
        return handleData$lambda$24$0(r0, r1);
    }

    public static /* synthetic */ Unit XOiXXOO(List r0, BleHandleCallback r1) {
        return handleData$lambda$33$0(r0, r1);
    }

    public static /* synthetic */ Unit XX(BleEarphoneSoundEffectsSettings r0, BleHandleCallback r1) {
        return handleData$lambda$125$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(BleCalibrationData r0, BleHandleCallback r1) {
        return handleData$lambda$155$0(r0, r1);
    }

    public static /* synthetic */ Unit XX00XX(int r0, BleHandleCallback r1) {
        return handleData$lambda$343$0(r0, r1);
    }

    public static /* synthetic */ Unit XX00i10X(List r0, BleHandleCallback r1) {
        return handleData$lambda$14$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0II1I1(boolean r0, BleHandleCallback r1) {
        return handleData$lambda$23(r0, r1);
    }

    public static /* synthetic */ Unit XX0X0(List r0, BleHandleCallback r1) {
        return handleData$lambda$218$0(r0, r1);
    }

    public static /* synthetic */ Unit XX1Oi(int r0, BleHandleCallback r1) {
        return handleData$lambda$91(r0, r1);
    }

    public static /* synthetic */ Unit XXI(BleNotificationSettings2 r0, BleHandleCallback r1) {
        return handleData$lambda$94$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI0XOIX(BaseBleConnector r0, BleHandleCallback r1) {
        return handleData$lambda$167(r0, r1);
    }

    public static /* synthetic */ Unit XXIIO1i11(List r0, BleHandleCallback r1) {
        return handleData$lambda$32$0(r0, r1);
    }

    public static /* synthetic */ Unit XXO(BleThirdPartyData r0, BleHandleCallback r1) {
        return handleData$lambda$324$0(r0, r1);
    }

    public static /* synthetic */ Unit XXOXI0(BleAICoachGeneratePlan r0, BleHandleCallback r1) {
        return handleData$lambda$272$1$0(r0, r1);
    }

    public static /* synthetic */ Unit XXOXi(BleGirlCareSettings r0, BleHandleCallback r1) {
        return handleData$lambda$102$0(r0, r1);
    }

    public static /* synthetic */ Unit XXX(BleHydrationSettings r0, BleHandleCallback r1) {
        return handleData$lambda$330$0(r0, r1);
    }

    public static /* synthetic */ Unit XXX11i(int r0, BleHandleCallback r1) {
        return handleData$lambda$307$0(r0, r1);
    }

    public static /* synthetic */ Unit XXXiXXOI(boolean r0, BleHandleCallback r1) {
        return handleData$lambda$171(r0, r1);
    }

    public static /* synthetic */ Unit XXiIiX10(BleSettingWatchPassword r0, BleHandleCallback r1) {
        return handleData$lambda$64$0(r0, r1);
    }

    public static /* synthetic */ Unit XXiO0i(BleAppAudioBookList r0, BleHandleCallback r1) {
        return handleData$lambda$257$0(r0, r1);
    }

    public static /* synthetic */ Unit XXiX1XI(int r0, BleHandleCallback r1) {
        return handleData$lambda$72$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi(BleDeviceInfo2 r0, BleHandleCallback r1) {
        return handleData$lambda$83$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi0(int r0, BleHandleCallback r1) {
        return handleData$lambda$287$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi0I(BleGolfMapCacheInfo r0, BleHandleCallback r1) {
        return handleData$lambda$339$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi1Oi(BleSGKeySet r0, BleHandleCallback r1) {
        return handleData$lambda$254$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi1X(int r0, BleHandleCallback r1) {
        return handleData$lambda$160(r0, r1);
    }

    public static /* synthetic */ Unit Xi1XO00(int r0, BleHandleCallback r1) {
        return handleData$lambda$66$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi1i0XOX0(List r0, BleHandleCallback r1) {
        return handleData$lambda$211$0(r0, r1);
    }

    public static /* synthetic */ Unit XiO000(List r0, BleHandleCallback r1) {
        return handleData$lambda$230$0(r0, r1);
    }

    public static /* synthetic */ Unit XiO1I(int r0, BleHandleCallback r1) {
        return handleData$lambda$239$0(r0, r1);
    }

    public static /* synthetic */ Unit XiO1OXXO(int r0, BleHandleCallback r1) {
        return handleData$lambda$132(r0, r1);
    }

    public static /* synthetic */ Unit XiOIO(int r0, BleHandleCallback r1) {
        return handleData$lambda$304$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(BleHydrationSettings r0, BleHandleCallback r1) {
        return handleData$lambda$331$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOOO1I1I(List r0, BleHandleCallback r1) {
        return handleData$lambda$207$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOOOi0(int r0, BleHandleCallback r1) {
        return handleData$lambda$67$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOiiXOO(BleUserProfile r0, BleHandleCallback r1) {
        return handleData$lambda$7$0(r0, r1);
    }

    public static /* synthetic */ Unit XiX0I0(int r0, BleHandleCallback r1) {
        return handleData$lambda$138(r0, r1);
    }

    public static /* synthetic */ Unit XiXIX(BleAICoachBeforePlan r0, BleHandleCallback r1) {
        return handleData$lambda$272$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Xii(BleLoveTapUser r0, BleHandleCallback r1) {
        return handleData$lambda$75(r0, r1);
    }

    public static /* synthetic */ Unit Xii11I(int r0, BleHandleCallback r1) {
        return handleData$lambda$131(r0, r1);
    }

    public static /* synthetic */ Unit Xii1O1Iii(BleHandleCallback r0) {
        return handleData$lambda$275$3(r0);
    }

    private static final Unit _set_isConnecting_$lambda$0(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeviceConnecting(r1);
        return Unit.OXO1;
    }

    public static final /* synthetic */ void access$bind(BaseBleConnector r0) {
        r0.bind();
    }

    public static final /* synthetic */ void access$checkStreamProgress(BaseBleConnector r0) {
        r0.checkStreamProgress();
    }

    public static final /* synthetic */ BaseBleCache access$getMBleCache$p(BaseBleConnector r0) {
        return r0.mBleCache;
    }

    public static final /* synthetic */ BleStream access$getMBleStream$p(BaseBleConnector r0) {
        return r0.mBleStream;
    }

    public static final /* synthetic */ List access$getMDataKeys$p(BaseBleConnector r0) {
        return r0.mDataKeys;
    }

    public static final /* synthetic */ int access$getMStreamProgressCompleted$p(BaseBleConnector r0) {
        return r0.mStreamProgressCompleted;
    }

    public static final /* synthetic */ String access$getMTargetAddress(BaseBleConnector r0) {
        return r0.getMTargetAddress();
    }

    public static final /* synthetic */ void access$handleData(BaseBleConnector r0, byte[] r1) {
        r0.handleData(r1);
    }

    public static final /* synthetic */ boolean access$isNordicOtaMode$p(BaseBleConnector r0) {
        return r0.isNordicOtaMode;
    }

    public static final /* synthetic */ boolean access$isRefreshDeviceInfo$p(BaseBleConnector r0) {
        return r0.isRefreshDeviceInfo;
    }

    public static final /* synthetic */ void access$login(BaseBleConnector r0, int r1) {
        r0.login(r1);
    }

    public static final /* synthetic */ void access$notifyHandlers(BaseBleConnector r0, Function1 r1) {
        r0.notifyHandlers(r1);
    }

    public static final /* synthetic */ void access$notifySyncState(BaseBleConnector r0, int r1, BleKey r2) {
        r0.notifySyncState(r1, r2);
    }

    public static final /* synthetic */ void access$removeSyncTimeout(BaseBleConnector r0) {
        r0.removeSyncTimeout();
    }

    public static final /* synthetic */ void access$sendOta(BaseBleConnector r0) {
        r0.sendOta();
    }

    public static final /* synthetic */ void access$setMBleState$p(BaseBleConnector r0, int r1) {
        r0.mBleState = r1;
    }

    public static final /* synthetic */ void access$setMBleStream(BaseBleConnector r0, BleStream r1) {
        r0.setMBleStream(r1);
    }

    public static final /* synthetic */ void access$setMReceivingCmTrace$p(BaseBleConnector r0, boolean r1) {
        r0.mReceivingCmTrace = r1;
    }

    public static final /* synthetic */ void access$setMStreamProgressCompleted$p(BaseBleConnector r0, int r1) {
        r0.mStreamProgressCompleted = r1;
    }

    public static final /* synthetic */ void access$setMStreamProgressTotal$p(BaseBleConnector r0, int r1) {
        r0.mStreamProgressTotal = r1;
    }

    private final void bind() {
        sendInt32$default(this, BleKey.IDENTITY, BleKeyFlag.CREATE, getDeviceId(), null, false, false, 56, null);
    }

    private final void checkStreamProgress() {
        if (isAvailable() == true) goto L5;
        int r0 = this.mStreamProgressTotal;
        if (r0 <= 0) goto L19;
        int r1 = this.mStreamProgressCompleted;
        if (r1 < 0) goto L20;
        if (r1 >= r0) goto L21;
        notifyHandlersThen(new Oi00Oi(this), new XIXXX1ii1(this));
        return;
    L21:
        return;
    L20:
        return;
    L19:
        return;
    L5:
        if (this.mStreamProgressTotal > 0) goto L7;
        return;
    L7:
        if (this.mStreamProgressCompleted <= 0) goto L18;
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " onStreamProgress -> mStreamProgressTotal=" + this.mStreamProgressTotal + ", mStreamProgressCompleted=" + this.mStreamProgressCompleted);
        notifyHandlersThen(new Xi1Xi1I(this), new O11IIOOX(this));
        return;
    }

    private static final Unit checkStreamProgress$lambda$0(BaseBleConnector r9, BleHandleCallback r10) {
        Intrinsics.X0O(r10, "it");
        BleHandleCallback.onStreamProgress$default(r10, true, 0, r9.mStreamProgressTotal, r9.mStreamProgressCompleted, null, 16, null);
        return Unit.OXO1;
    }

    private static final Unit checkStreamProgress$lambda$1(BaseBleConnector r2) {
        if (r2.mStreamProgressTotal != r2.mStreamProgressCompleted) goto L6;
        r2.mStreamProgressTotal = -1;
        r2.mStreamProgressCompleted = -1;
    L6:
        return Unit.OXO1;
    }

    private static final Unit checkStreamProgress$lambda$2(BaseBleConnector r9, BleHandleCallback r10) {
        Intrinsics.X0O(r10, "it");
        BleHandleCallback.onStreamProgress$default(r10, false, -1, r9.mStreamProgressTotal, r9.mStreamProgressCompleted, null, 16, null);
        return Unit.OXO1;
    }

    private static final Unit checkStreamProgress$lambda$3(BaseBleConnector r2) {
        if (r2.mStreamProgressTotal != r2.mStreamProgressCompleted) goto L6;
        r2.mStreamProgressTotal = -1;
        r2.mStreamProgressCompleted = -1;
    L6:
        return Unit.OXO1;
    }

    private final CopyOnWriteArrayList<BleHandleCallback> getMBleHandleCallbacks() {
        return (CopyOnWriteArrayList) getValue();
    }

    private final void handleData(byte[] r48) {
        MessageFactory r3 = MessageFactory.INSTANCE;     // Catch: Exception -> L6
        boolean r6 = r3.isReply(r48);     // Catch: Exception -> L6
        if (r6 == false) goto L9;
        getMBleMessenger().dequeueMessage();     // Catch: Exception -> L6
    L9:
        if (r3.isValid(r48) == false) goto L3953;
        final BleKey r2 = BleKey.Companion.OXO1(ByteArrayExtKt.getInt$default(r48, 6, 2, null, 4, null));     // Catch: Exception -> L6
        final BleKeyFlag r1 = BleKeyFlag.Companion.OXO1(r48[8]);     // Catch: Exception -> L6
        i1O0OXO1O r10 = i1O0OXO1O.OXO1;     // Catch: Exception -> L6
        r10.OXO1(getTAG() + " handleData -> key=" + r2 + ", keyFlag=" + r1 + ", isReply=" + r6);     // Catch: Exception -> L6
        int[] r4 = WhenMappings.$EnumSwitchMapping$0;     // Catch: Exception -> L6
        String r37 = " -> true";
        String r38 = " handleData onCommandReply ";
        String r39 = ", ";
        switch(r4[r2.ordinal()]) {
            case 1: goto L3771;
            case 2: goto L3771;
            case 3: goto L3771;
            case 4: goto L3771;
            case 5: goto L3771;
            case 6: goto L3763;
            case 7: goto L3762;
            case 8: goto L3755;
            case 9: goto L3741;
            case 10: goto L3731;
            case 11: goto L3726;
            case 12: goto L3706;
            case 13: goto L3682;
            case 14: goto L3661;
            case 15: goto L3640;
            case 16: goto L3559;
            case 17: goto L3545;
            case 18: goto L3536;
            case 19: goto L3518;
            case 20: goto L3507;
            case 21: goto L3495;
            case 22: goto L3488;
            case 23: goto L3480;
            case 24: goto L3469;
            case 25: goto L3451;
            case 26: goto L3440;
            case 27: goto L3427;
            case 28: goto L3416;
            case 29: goto L3410;
            case 30: goto L3399;
            case 31: goto L3389;
            case 32: goto L3370;
            case 33: goto L3357;
            case 34: goto L3338;
            case 35: goto L3321;
            case 36: goto L3303;
            case 37: goto L3290;
            case 38: goto L3265;
            case 39: goto L3242;
            case 40: goto L3221;
            case 41: goto L3189;
            case 42: goto L3177;
            case 43: goto L3171;
            case 44: goto L3157;
            case 45: goto L3152;
            case 46: goto L3147;
            case 47: goto L3129;
            case 48: goto L3122;
            case 49: goto L3095;
            case 50: goto L3071;
            case 51: goto L3047;
            case 52: goto L3034;
            case 53: goto L2965;
            case 54: goto L2896;
            case 55: goto L2886;
            case 56: goto L2876;
            case 57: goto L2866;
            case 58: goto L2861;
            case 59: goto L2782;
            case 60: goto L2772;
            case 61: goto L2754;
            case 62: goto L2744;
            case 63: goto L2734;
            case 64: goto L2725;
            case 65: goto L2715;
            case 66: goto L2697;
            case 67: goto L2687;
            case 68: goto L2677;
            case 69: goto L2671;
            case 70: goto L2653;
            case 71: goto L2632;
            case 72: goto L2611;
            case 73: goto L2587;
            case 74: goto L2577;
            case 75: goto L2554;
            case 76: goto L2544;
            case 77: goto L2523;
            case 78: goto L2513;
            case 79: goto L2500;
            case 80: goto L2489;
            case 81: goto L2471;
            case 82: goto L2451;
            case 83: goto L2430;
            case 84: goto L2420;
            case 85: goto L2399;
            case 86: goto L2378;
            case 87: goto L2368;
            case 88: goto L2347;
            case 89: goto L2337;
            case 90: goto L2324;
            case 91: goto L2315;
            case 92: goto L2292;
            case 93: goto L2274;
            case 94: goto L2264;
            case 95: goto L2246;
            case 96: goto L2228;
            case 97: goto L2210;
            case 98: goto L2200;
            case 99: goto L2186;
            case 100: goto L2176;
            case 101: goto L2166;
            case 102: goto L2156;
            case 103: goto L2146;
            case 104: goto L2126;
            case 105: goto L2116;
            case 106: goto L2106;
            case 107: goto L2096;
            case 108: goto L2083;
            case 109: goto L2072;
            case 110: goto L2062;
            case 111: goto L2007;
            case 112: goto L1998;
            case 113: goto L1972;
            case 114: goto L1970;
            case 115: goto L1963;
            case 116: goto L1963;
            case 117: goto L1963;
            case 118: goto L1944;
            case 119: goto L1898;
            case 120: goto L1848;
            case 121: goto L1842;
            case 122: goto L1836;
            case 123: goto L1830;
            case 124: goto L1820;
            case 125: goto L1809;
            case 126: goto L1799;
            case 127: goto L1788;
            case 128: goto L1772;
            case 129: goto L1756;
            case 130: goto L1740;
            case 131: goto L1724;
            case 132: goto L1708;
            case 133: goto L1692;
            case 134: goto L1676;
            case 135: goto L1660;
            case 136: goto L1644;
            case 137: goto L1628;
            case 138: goto L1620;
            case 139: goto L1620;
            case 140: goto L1604;
            case 141: goto L1588;
            case 142: goto L1572;
            case 143: goto L1556;
            case 144: goto L1540;
            case 145: goto L1524;
            case 146: goto L1508;
            case 147: goto L1491;
            case 148: goto L1471;
            case 149: goto L1455;
            case 150: goto L1439;
            case 151: goto L1423;
            case 152: goto L1407;
            case 153: goto L1391;
            case 154: goto L1375;
            case 155: goto L1359;
            case 156: goto L1343;
            case 157: goto L1327;
            case 158: goto L1311;
            case 159: goto L1302;
            case 160: goto L1291;
            case 161: goto L1285;
            case 162: goto L1269;
            case 163: goto L1252;
            case 164: goto L1223;
            case 165: goto L1206;
            case 166: goto L1188;
            case 167: goto L1173;
            case 168: goto L1165;
            case 169: goto L1155;
            case 170: goto L1149;
            case 171: goto L1142;
            case 172: goto L1135;
            case 173: goto L1122;
            case 174: goto L1106;
            case 175: goto L1092;
            case 176: goto L1085;
            case 177: goto L1078;
            case 178: goto L1062;
            case 179: goto L1041;
            case 180: goto L1028;
            case 181: goto L1014;
            case 182: goto L1004;
            case 183: goto L981;
            case 184: goto L967;
            case 185: goto L948;
            case 186: goto L935;
            case 187: goto L925;
            case 188: goto L919;
            case 189: goto L909;
            case 190: goto L900;
            case 191: goto L894;
            case 192: goto L888;
            case 193: goto L878;
            case 194: goto L860;
            case 195: goto L850;
            case 196: goto L830;
            case 197: goto L797;
            case 198: goto L779;
            case 199: goto L741;
            case 200: goto L725;
            case 201: goto L715;
            case 202: goto L705;
            case 203: goto L692;
            case 204: goto L677;
            case 205: goto L667;
            case 206: goto L661;
            case 207: goto L655;
            case 208: goto L647;
            case 209: goto L623;
            case 210: goto L599;
            case 211: goto L589;
            case 212: goto L565;
            case 213: goto L556;
            case 214: goto L528;
            case 215: goto L503;
            case 216: goto L490;
            case 217: goto L477;
            case 218: goto L464;
            case 219: goto L451;
            case 220: goto L438;
            case 221: goto L425;
            case 222: goto L401;
            case 223: goto L376;
            case 224: goto L351;
            case 225: goto L328;
            case 226: goto L238;
            case 227: goto L238;
            case 228: goto L238;
            case 229: goto L238;
            case 230: goto L238;
            case 231: goto L238;
            case 232: goto L238;
            case 233: goto L238;
            case 234: goto L238;
            case 235: goto L238;
            case 236: goto L238;
            case 237: goto L238;
            case 238: goto L238;
            case 239: goto L238;
            case 240: goto L238;
            case 241: goto L238;
            case 242: goto L238;
            case 243: goto L238;
            case 244: goto L238;
            case 245: goto L238;
            case 246: goto L238;
            case 247: goto L238;
            case 248: goto L238;
            case 249: goto L238;
            case 250: goto L238;
            case 251: goto L238;
            case 252: goto L238;
            case 253: goto L238;
            case 254: goto L238;
            case 255: goto L217;
            case 256: goto L199;
            case 257: goto L118;
            case 258: goto L99;
            case 259: goto L78;
            case 260: goto L54;
            case 261: goto L25;
            default: goto L14;
        };
    L14:
        if (r6 == true) goto L19;
        boolean r9 = r6;
        final BleKeyFlag r5 = r1;
        final BaseBleConnector r7 = this;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
    L20:
        Unit r0 = Unit.OXO1;     // Catch: Exception -> L17
    L21:
        r38 = r38;
        r2 = r2;
    L22:
        r37 = r37;
    L23:
        boolean r11 = r9;
    L24:
        final BleKeyFlag r12 = r5;
    L3829:
        int r8 = 0;
    L3830:
        if (r11 == true) goto L3832;
        return;
    L3832:
        if (r2.getMBleCommand() != BleCommand.DATA) goto L3871;
        BleKeyFlag r13 = BleKeyFlag.READ;     // Catch: Exception -> L17
        if (r12 != r13) goto L3871;
        if (r7.isDataKeyAutoDelete == false) goto L3871;
        r7.notifySyncState(1, r2);     // Catch: Exception -> L17
        if (r8 <= 0) goto L3841;
        sendData$default(r7, r2, BleKeyFlag.DELETE, null, false, false, 28, null);     // Catch: Exception -> L17
    L3841:
        if (r2 != BleKey.MATCH_RECORD2) goto L3843;
    L3852:
        int r14 = 0;
    L3853:
        if (r8 > r14) goto L3864;
        if (r7.mDataKeys.isEmpty() == true) goto L3858;
        r7.mDataKeys.remove(0);     // Catch: Exception -> L17
    L3858:
        if (r7.mDataKeys.isEmpty() == false) goto L3861;
        r7.removeSyncTimeout();     // Catch: Exception -> L17
        r7.notifySyncState(0, r2);     // Catch: Exception -> L17
        return;
    L3861:
        sendData$default(r7, r7.mDataKeys.get(0), r13, null, false, false, 28, null);     // Catch: Exception -> L17
        r7.postDelaySyncTimeout();     // Catch: Exception -> L17
        return;
    L3864:
        if (r7.mDataKeys.isEmpty() == true) goto L3868;
        sendData$default(r7, r7.mDataKeys.get(0), r13, null, false, false, 28, null);     // Catch: Exception -> L6
        postDelaySyncTimeout();     // Catch: Exception -> L6
        return;
    L3868:
        sendData$default(this, r2, r13, null, false, false, 28, null);     // Catch: Exception -> L17
        postDelaySyncTimeout();     // Catch: Exception -> L17
        return;
    L3843:
        if (r2 == BleKey.WORKOUT3) goto L3852;
        if (r2 == BleKey.MATCH_RECORD3) goto L3852;
        if (r2 == BleKey.WORKOUT4) goto L3852;
        if (r2 == BleKey.WORKOUT4_SEGMENTATION) goto L3852;
        r14 = 1;
    L3871:
        if (r12 != BleKeyFlag.UPDATE) goto L4037;
        r7.notifyHandlers(new XXXX(r2, r12));     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + r38 + r2 + r39 + r12 + r37);     // Catch: Exception -> L17
        return;
    L4037:
        return;
    L19:
        r5 = r1;
        r9 = r6;
        r7 = this;
        goto L20
    L25:
        BleKeyFlag r15 = r1;
        BleKey r34 = r2;
        boolean r16 = r6;
        if (r16 == true) goto L28;
    L38:
        if (r16 == false) goto L40;
    L37:
        BaseBleConnector r17 = this;
    L52:
        Unit r18 = Unit.OXO1;     // Catch: Exception -> L46
    L53:
        r7 = r17;
        r38 = r38;
        r2 = r34;
        r37 = r37;
        r11 = r16;
        r12 = r15;
        goto L3829
    L40:
        if (r15 != BleKeyFlag.UPDATE) goto L37;
        sendData$default(this, r34, r15, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r19 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onUpdateVoiceControl -> " + r19);     // Catch: Exception -> L46
        BaseBleCache r20 = r17.mBleCache;     // Catch: Exception -> L46
        if (r20 != null) goto L48;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r33 = null;
    L49:
        BaseBleCache.putInt$default(r33, r34, r19, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iOX10(r19));     // Catch: Exception -> L46
        goto L52
    L48:
        r33 = r20;
        goto L49
    L28:
        if (r15 != BleKeyFlag.READ) goto L38;
        if (r48.length < 10) goto L3954;
        final byte r21 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(getTAG() + " handleData onReadVoiceControl -> " + r21);     // Catch: Exception -> L17
        BaseBleCache r22 = this.mBleCache;     // Catch: Exception -> L17
        if (r22 != null) goto L35;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r35 = null;
    L36:
        BaseBleCache.putInt$default(r35, r34, r21, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new X1IXI00i0(r21));     // Catch: Exception -> L17
        Unit r23 = Unit.OXO1;     // Catch: Exception -> L17
        goto L37
    L35:
        r35 = r22;
        goto L36
    L3954:
        return;
    L54:
        r15 = r1;
        r34 = r2;
        r16 = r6;
        r17 = this;
        if (r16 == true) goto L57;
    L66:
        if (r16 == false) goto L68;
    L77:
        Unit r24 = Unit.OXO1;     // Catch: Exception -> L46
        goto L53
    L68:
        if (r15 != BleKeyFlag.UPDATE) goto L77;
        sendData$default(this, r34, r15, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r15 = r15;
        final int r25 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onUpdateSleepSet -> " + r25);     // Catch: Exception -> L46
        BaseBleCache r26 = r17.mBleCache;     // Catch: Exception -> L46
        if (r26 != null) goto L75;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r36 = null;
    L76:
        BaseBleCache.putInt$default(r36, r34, r25, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iI0IO(r25));     // Catch: Exception -> L46
        goto L77
    L75:
        r36 = r26;
        goto L76
    L57:
        if (r15 != BleKeyFlag.READ) goto L66;
        if (r48.length < 10) goto L3955;
        final byte r27 = r48[9];     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSleepSet -> " + r27);     // Catch: Exception -> L46
        BaseBleCache r28 = r17.mBleCache;     // Catch: Exception -> L46
        if (r28 != null) goto L64;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r310 = null;
    L65:
        BaseBleCache.putInt$default(r310, r34, r27, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IO1IiOOO(r27));     // Catch: Exception -> L46
        Unit r29 = Unit.OXO1;     // Catch: Exception -> L46
        goto L77
    L64:
        r310 = r28;
    L3955:
        return;
    L78:
        r2 = r2;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r9 == false) goto L89;
        if (r1 != BleKeyFlag.READ) goto L89;
        BleReadable.Companion r30 = BleReadable.Companion;     // Catch: Exception -> L46
        int r31 = r48.length;     // Catch: Exception -> L46
        Object r32 = BleHrvMonitoringSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r40 = (BleReadable) r32;     // Catch: Exception -> L46
        r40.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r31));     // Catch: Exception -> L46
        r40.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r32, "also(...)");     // Catch: Exception -> L46
        final BleHrvMonitoringSettings r41 = (BleHrvMonitoringSettings) ((BleReadable) r32);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadHrvMonitoringSettings -> " + r41);     // Catch: Exception -> L46
        BaseBleCache r42 = this.mBleCache;     // Catch: Exception -> L46
        if (r42 != null) goto L85;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r311 = null;
    L86:
        BaseBleCache.putObject$default(r311, r2, r41, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new XXXXiX00I(r41));     // Catch: Exception -> L46
        Unit r43 = Unit.OXO1;     // Catch: Exception -> L46
    L87:
        r7 = this;
        r5 = r1;
    L98:
        Unit r44 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L85:
        r311 = r42;
    L89:
        if (r9 == true) goto L87;
        if (r1 != BleKeyFlag.UPDATE) goto L87;
        r5 = r1;
        r7 = this;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r45 = BleReadable.Companion;     // Catch: Exception -> L17
        int r46 = r48.length;     // Catch: Exception -> L17
        Object r47 = BleHrvMonitoringSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r49 = (BleReadable) r47;     // Catch: Exception -> L17
        r49.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r46));     // Catch: Exception -> L17
        r49.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r47, "also(...)");     // Catch: Exception -> L17
        final BleHrvMonitoringSettings r50 = (BleHrvMonitoringSettings) ((BleReadable) r47);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateHrvMonitoringSettings -> " + r50);     // Catch: Exception -> L17
        BaseBleCache r51 = r7.mBleCache;     // Catch: Exception -> L17
        if (r51 != null) goto L96;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r312 = null;
    L97:
        BaseBleCache.putObject$default(r312, r2, r50, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I10110(r50));     // Catch: Exception -> L17
        Unit r52 = Unit.OXO1;     // Catch: Exception -> L17
        goto L98
    L96:
        r312 = r51;
        goto L97
    L99:
        r5 = r1;
        r2 = r2;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r9 == true) goto L102;
    L108:
        if (r9 == false) goto L110;
    L116:
        Unit r53 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L110:
        if (r5 != BleKeyFlag.UPDATE) goto L116;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r54 = BleReadable.Companion;     // Catch: Exception -> L17
        int r55 = r48.length;     // Catch: Exception -> L17
        Object r56 = BleGolfMapCacheInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r57 = (BleReadable) r56;     // Catch: Exception -> L17
        r57.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r55));     // Catch: Exception -> L17
        r57.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r56, "also(...)");     // Catch: Exception -> L17
        final BleGolfMapCacheInfo r58 = (BleGolfMapCacheInfo) ((BleReadable) r56);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfMapCacheInfo -> " + r58);     // Catch: Exception -> L17
        BaseBleCache r59 = r7.mBleCache;     // Catch: Exception -> L17
        if (r59 != null) goto L114;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r313 = null;
    L115:
        BaseBleCache.putObject$default(r313, r2, r58, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0O1OI11(r58));     // Catch: Exception -> L17
        Unit r60 = Unit.OXO1;     // Catch: Exception -> L17
        goto L116
    L114:
        r313 = r59;
        goto L115
    L102:
        if (r5 != BleKeyFlag.READ) goto L108;
        BleReadable.Companion r61 = BleReadable.Companion;     // Catch: Exception -> L17
        int r62 = r48.length;     // Catch: Exception -> L17
        Object r63 = BleGolfMapCacheInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r64 = (BleReadable) r63;     // Catch: Exception -> L17
        r64.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r62));     // Catch: Exception -> L17
        r64.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r63, "also(...)");     // Catch: Exception -> L17
        final BleGolfMapCacheInfo r65 = (BleGolfMapCacheInfo) ((BleReadable) r63);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfMapCacheInfo -> " + r65);     // Catch: Exception -> L17
        BaseBleCache r66 = r7.mBleCache;     // Catch: Exception -> L17
        if (r66 != null) goto L106;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r314 = null;
    L107:
        BaseBleCache.putObject$default(r314, r2, r65, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXOI1O(r65));     // Catch: Exception -> L17
        Unit r67 = Unit.OXO1;     // Catch: Exception -> L17
        goto L116
    L106:
        r314 = r66;
        goto L107
    L118:
        r5 = r1;
        int r110 = 9;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r9 == false) goto L135;
        if (r5 != BleKeyFlag.READ) goto L132;
        BleReadable.Companion r68 = BleReadable.Companion;     // Catch: Exception -> L17
        int r69 = r48.length;     // Catch: Exception -> L17
        final ArrayList r70 = new ArrayList();     // Catch: Exception -> L17
        int r71 = (r69 - 9) / 28;     // Catch: Exception -> L17
        if (r71 <= 0) goto L127;
        int r72 = 0;
    L125:
        if (r72 >= r71) goto L127;
        BleReadable.Companion r73 = BleReadable.Companion;     // Catch: Exception -> L17
        int r74 = (28 * r72) + r110;     // Catch: Exception -> L17
        r72 = r72 + 1;     // Catch: Exception -> L17
        byte[] r75 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r74, (28 * r72) + r110);     // Catch: Exception -> L17
        int r76 = r75.length;     // Catch: Exception -> L17
        Object r111 = BleMeetingReminder.class.newInstance();     // Catch: Exception -> L17
        BleReadable r112 = (BleReadable) r111;     // Catch: Exception -> L17
        r112.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r75, 0, r76));     // Catch: Exception -> L17
        r112.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r111, "also(...)");     // Catch: Exception -> L17
        r70.add((BleReadable) r111);     // Catch: Exception -> L17
        r71 = r71;
        r110 = 9;
    L127:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMeetingReminder -> " + r70);     // Catch: Exception -> L17
        BaseBleCache r77 = r7.mBleCache;     // Catch: Exception -> L17
        if (r77 != null) goto L130;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r315 = null;
    L131:
        BaseBleCache.putList$default(r315, r2, r70, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IIXXI0(r70));     // Catch: Exception -> L17
        Unit r78 = Unit.OXO1;     // Catch: Exception -> L17
        r2 = r2;
    L198:
        Unit r79 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L130:
        r315 = r77;
        goto L131
    L132:
        r7.notifyHandlers(new IXi0XiO(r2, r5));     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + r38 + r2 + r39 + r5 + r37);     // Catch: Exception -> L17
        return;
    L135:
        if (r5 != BleKeyFlag.UPDATE) goto L155;
        r2 = r2;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r80 = BleReadable.Companion;     // Catch: Exception -> L17
        int r81 = r48.length;     // Catch: Exception -> L17
        Object r82 = BleMeetingReminder.class.newInstance();     // Catch: Exception -> L17
        BleReadable r83 = (BleReadable) r82;     // Catch: Exception -> L17
        r83.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r81));     // Catch: Exception -> L17
        r83.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r82, "also(...)");     // Catch: Exception -> L17
        final BleMeetingReminder r84 = (BleMeetingReminder) ((BleReadable) r82);     // Catch: Exception -> L17
        BaseBleCache r85 = r7.mBleCache;     // Catch: Exception -> L17
        if (r85 != null) goto L139;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r316 = null;
    L140:
        List r86 = BaseBleCache.getList$default(r316, r2, BleMeetingReminder.class, null, 4, null);     // Catch: Exception -> L17
        Iterator r87 = r86.iterator();     // Catch: Exception -> L17
        int r88 = 0;
    L142:
        if (r87.hasNext() == false) goto L147;
        if (((BleMeetingReminder) r87.next()).getMId() == r84.getMId()) goto L148;
        r88 = r88 + 1;     // Catch: Exception -> L17
    L148:
        if (r88 <= (-1)) goto L150;
        r86.set(r88, r84);     // Catch: Exception -> L17
    L150:
        BaseBleCache r89 = r7.mBleCache;     // Catch: Exception -> L17
        if (r89 != null) goto L153;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r317 = null;
    L154:
        BaseBleCache.putList$default(r317, r2, r86, null, 4, null);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onMeetingReminderUpdate -> " + r86);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiIO0ii(r84));     // Catch: Exception -> L17
        goto L198
    L153:
        r317 = r89;
        goto L154
    L147:
        r88 = -1;
        goto L148
    L139:
        r316 = r85;
        goto L140
    L155:
        r2 = r2;
        if (r5 == BleKeyFlag.DELETE) goto L158;
        BaseBleConnector r90 = r7;
        BleKeyFlag r91 = r5;
        if (r91 == BleKeyFlag.CREATE) goto L188;
    L185:
        r7 = r90;
        r5 = r91;
        goto L198
    L188:
        r5 = r91;
        r7 = this;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r92 = BleReadable.Companion;     // Catch: Exception -> L17
        int r93 = r48.length;     // Catch: Exception -> L17
        Object r94 = BleMeetingReminder.class.newInstance();     // Catch: Exception -> L17
        BleReadable r95 = (BleReadable) r94;     // Catch: Exception -> L17
        r95.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r93));     // Catch: Exception -> L17
        r95.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r94, "also(...)");     // Catch: Exception -> L17
        final BleMeetingReminder r96 = (BleMeetingReminder) ((BleReadable) r94);     // Catch: Exception -> L17
        BaseBleCache r97 = r7.mBleCache;     // Catch: Exception -> L17
        if (r97 != null) goto L192;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r318 = null;
    L193:
        List r98 = BaseBleCache.getList$default(r318, r2, BleMeetingReminder.class, null, 4, null);     // Catch: Exception -> L17
        r98.add(r96);     // Catch: Exception -> L17
        BaseBleCache r99 = r7.mBleCache;     // Catch: Exception -> L17
        if (r99 != null) goto L196;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r319 = null;
    L197:
        BaseBleCache.putList$default(r319, r2, r98, null, 4, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMeetingReminderAdd -> " + r96);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiIiX(r96));     // Catch: Exception -> L17
        goto L198
    L196:
        r319 = r99;
        goto L197
    L192:
        r318 = r97;
        goto L193
    L158:
        if (r48.length < 10) goto L3956;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L50
        r90 = r7;
        r91 = r5;
        final int r100 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r101 = r90.mBleCache;     // Catch: Exception -> L46
        if (r101 != null) goto L165;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r320 = null;
    L166:
        List r102 = BaseBleCache.getList$default(r320, r2, BleMeetingReminder.class, null, 4, null);     // Catch: Exception -> L46
        if (r100 != 255) goto L169;
        r102.clear();     // Catch: Exception -> L46
    L180:
        BaseBleCache r103 = r90.mBleCache;     // Catch: Exception -> L46
        if (r103 != null) goto L183;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r321 = null;
    L184:
        BaseBleCache.putList$default(r321, r2, r102, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r90.getTAG() + " handleData onMeetingReminderDelete -> " + r100);     // Catch: Exception -> L46
        r90.notifyHandlers(new O1XiOIOi(r100));     // Catch: Exception -> L46
        goto L185
    L183:
        r321 = r103;
        goto L184
    L169:
        Iterator r104 = r102.iterator();     // Catch: Exception -> L46
        int r105 = 0;
    L171:
        if (r104.hasNext() == false) goto L177;
        if (((BleMeetingReminder) r104.next()).getMId() == r100) goto L174;
        r105 = r105 + 1;     // Catch: Exception -> L46
        goto L171
    L174:
        int r106 = r105;
    L178:
        if (r106 <= (-1)) goto L180;
        r102.remove(r106);     // Catch: Exception -> L46
        goto L180
    L177:
        r106 = -1;
        goto L178
    L165:
        r320 = r101;
        goto L166
    L3956:
        return;
    L199:
        r5 = r1;
        r2 = r2;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r9 == true) goto L202;
    L208:
        if (r9 == false) goto L210;
    L216:
        Unit r107 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L210:
        if (r5 != BleKeyFlag.UPDATE) goto L216;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r108 = BleReadable.Companion;     // Catch: Exception -> L17
        int r109 = r48.length;     // Catch: Exception -> L17
        Object r113 = BleHydrationSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r114 = (BleReadable) r113;     // Catch: Exception -> L17
        r114.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r109));     // Catch: Exception -> L17
        r114.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r113, "also(...)");     // Catch: Exception -> L17
        final BleHydrationSettings r115 = (BleHydrationSettings) ((BleReadable) r113);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onHydrationUpdate -> " + r115);     // Catch: Exception -> L17
        BaseBleCache r116 = r7.mBleCache;     // Catch: Exception -> L17
        if (r116 != null) goto L214;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r322 = null;
    L215:
        BaseBleCache.putObject$default(r322, r2, r115, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1iXX(r115));     // Catch: Exception -> L17
        Unit r117 = Unit.OXO1;     // Catch: Exception -> L17
        goto L216
    L214:
        r322 = r116;
        goto L215
    L202:
        if (r5 != BleKeyFlag.READ) goto L208;
        BleReadable.Companion r118 = BleReadable.Companion;     // Catch: Exception -> L17
        int r119 = r48.length;     // Catch: Exception -> L17
        Object r120 = BleHydrationSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r121 = (BleReadable) r120;     // Catch: Exception -> L17
        r121.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r119));     // Catch: Exception -> L17
        r121.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r120, "also(...)");     // Catch: Exception -> L17
        final BleHydrationSettings r122 = (BleHydrationSettings) ((BleReadable) r120);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadHydrationSettings -> " + r122);     // Catch: Exception -> L17
        BaseBleCache r123 = r7.mBleCache;     // Catch: Exception -> L17
        if (r123 != null) goto L206;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r323 = null;
    L207:
        BaseBleCache.putObject$default(r323, r2, r122, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iXXOX0(r122));     // Catch: Exception -> L17
        Unit r124 = Unit.OXO1;     // Catch: Exception -> L17
        goto L216
    L206:
        r323 = r123;
        goto L207
    L217:
        r5 = r1;
        r2 = r2;
        r9 = r6;
        r37 = r37;
        r39 = r39;
        r7 = this;
        if (r9 == true) goto L220;
    L229:
        if (r9 == false) goto L231;
    L237:
        Unit r125 = Unit.OXO1;     // Catch: Exception -> L17
        r38 = r38;
        goto L22
    L231:
        if (r5 != BleKeyFlag.UPDATE) goto L237;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r126 = BleReadable.Companion;     // Catch: Exception -> L17
        int r127 = r48.length;     // Catch: Exception -> L17
        Object r128 = BleDeviceFile.class.newInstance();     // Catch: Exception -> L17
        BleReadable r129 = (BleReadable) r128;     // Catch: Exception -> L17
        r129.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r127));     // Catch: Exception -> L17
        r129.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r128, "also(...)");     // Catch: Exception -> L17
        final BleDeviceFile r130 = (BleDeviceFile) ((BleReadable) r128);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDeviceFileUpdate -> " + r130);     // Catch: Exception -> L17
        BaseBleCache r131 = r7.mBleCache;     // Catch: Exception -> L17
        if (r131 != null) goto L235;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r324 = null;
    L236:
        BaseBleCache.putObject$default(r324, r2, r130, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOi1IIi(r130));     // Catch: Exception -> L17
        Unit r132 = Unit.OXO1;     // Catch: Exception -> L17
        goto L237
    L235:
        r324 = r131;
        goto L236
    L220:
        if (r5 != BleKeyFlag.READ) goto L222;
    L223:
        BleReadable.Companion r133 = BleReadable.Companion;     // Catch: Exception -> L17
        int r134 = r48.length;     // Catch: Exception -> L17
        Object r135 = BleDeviceFile.class.newInstance();     // Catch: Exception -> L17
        BleReadable r136 = (BleReadable) r135;     // Catch: Exception -> L17
        r136.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r134));     // Catch: Exception -> L17
        r136.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r135, "also(...)");     // Catch: Exception -> L17
        final BleDeviceFile r137 = (BleDeviceFile) ((BleReadable) r135);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceFile -> " + r137);     // Catch: Exception -> L17
        BaseBleCache r138 = r7.mBleCache;     // Catch: Exception -> L17
        if (r138 != null) goto L226;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r325 = null;
    L227:
        BaseBleCache.putObject$default(r325, r2, r137, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i1X1iXi(r137));     // Catch: Exception -> L17
        Unit r139 = Unit.OXO1;     // Catch: Exception -> L17
        goto L237
    L226:
        r325 = r138;
        goto L227
    L222:
        if (r5 != BleKeyFlag.READ_CONTINUE) goto L229;
    L238:
        r5 = r1;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r9 == false) goto L296;
        if (r2 != BleKey.FILE_TRANSFER) goto L254;
        if (r5 != BleKeyFlag.READ) goto L254;
        if (r48.length < 10) goto L3957;
        BleReadable.Companion r140 = BleReadable.Companion;     // Catch: Exception -> L17
        int r141 = r48.length;     // Catch: Exception -> L17
        Object r142 = BleDeviceFile2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r143 = (BleReadable) r142;     // Catch: Exception -> L17
        r143.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r141));     // Catch: Exception -> L17
        r143.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r142, "also(...)");     // Catch: Exception -> L17
        final BleDeviceFile2 r144 = (BleDeviceFile2) ((BleReadable) r142);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceFile -> " + r144);     // Catch: Exception -> L17
        BaseBleCache r145 = r7.mBleCache;     // Catch: Exception -> L17
        if (r145 != null) goto L250;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r326 = null;
    L251:
        BaseBleCache.putObject$default(r326, r2, r144, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiOiIOX0i(r144));     // Catch: Exception -> L17
        Unit r146 = Unit.OXO1;     // Catch: Exception -> L17
    L252:
        r2 = r2;
    L327:
        Unit r147 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L250:
        r326 = r145;
        goto L251
    L3957:
        return;
    L254:
        if (r2 == BleKey.CONTACT) goto L256;
    L265:
        BleKeyFlag r148 = BleKeyFlag.UPDATE;     // Catch: Exception -> L17
        if (r5 != r148) goto L288;
        if (r48.length < 10) goto L3959;
        BleReadable.Companion r149 = BleReadable.Companion;     // Catch: Exception -> L17
        int r150 = r48.length;     // Catch: Exception -> L17
        Object r151 = BleStreamProgress.class.newInstance();     // Catch: Exception -> L17
        BleReadable r152 = (BleReadable) r151;     // Catch: Exception -> L17
        r152.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r150));     // Catch: Exception -> L17
        r152.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r151, "also(...)");     // Catch: Exception -> L17
        final BleStreamProgress r153 = (BleStreamProgress) ((BleReadable) r151);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " onStreamProgress -> " + r153);     // Catch: Exception -> L17
        if (r153.getMStatus() == 0) goto L273;
        r7.setMBleStream(null);     // Catch: Exception -> L17
        Unit r154 = Unit.OXO1;     // Catch: Exception -> L17
    L285:
        r7.notifyHandlers(new Oi1XI(r153, r2));     // Catch: Exception -> L17
        Unit r155 = Unit.OXO1;     // Catch: Exception -> L17
        return;
    L273:
        if (r153.getMTotal() != r153.getMCompleted()) goto L276;
        r7.setMBleStream(null);     // Catch: Exception -> L17
        Unit r156 = Unit.OXO1;     // Catch: Exception -> L17
        goto L285
    L276:
        BleStream r157 = r7.mBleStream;     // Catch: Exception -> L17
        if (r157 == null) goto L285;
        int r158 = r153.getMCompleted();     // Catch: Exception -> L17
        BaseBleCache r159 = r7.mBleCache;     // Catch: Exception -> L17
        if (r159 != null) goto L281;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r159 = null;
    L281:
        BleStreamPacket r160 = r157.getPacket(r158, r159.getMIOBufferSize());     // Catch: Exception -> L17
        if (r160 == null) goto L285;
        BleStream r161 = r7.mBleStream;     // Catch: Exception -> L17
        Intrinsics.XXI(r161);     // Catch: Exception -> L17
        sendObject$default(r7, r161.getMBleKey(), r148, r160, false, false, 24, null);     // Catch: Exception -> L17
        goto L285
    L3959:
        return;
    L288:
        if (r5 == BleKeyFlag.DELETE) goto L290;
    L294:
        r2 = r2;
        goto L327
    L290:
        if (r48[9] != 0) goto L292;
        final boolean r162 = true;
    L293:
        r7.notifyHandlers(new i1OXI(r2, r5, r162));     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + r38 + r2 + r39 + r5 + i1iXIO.XO0O10 + r162);     // Catch: Exception -> L17
        goto L294
    L292:
        r162 = false;
        goto L293
    L256:
        if (r5 != BleKeyFlag.READ) goto L265;
        if (r48.length < 10) goto L3958;
        BleReadable.Companion r163 = BleReadable.Companion;     // Catch: Exception -> L17
        int r164 = r48.length;     // Catch: Exception -> L17
        Object r165 = BleAddressBook.class.newInstance();     // Catch: Exception -> L17
        BleReadable r166 = (BleReadable) r165;     // Catch: Exception -> L17
        r166.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r164));     // Catch: Exception -> L17
        r166.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r165, "also(...)");     // Catch: Exception -> L17
        final BleAddressBook r167 = (BleAddressBook) ((BleReadable) r165);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAddressBook -> " + r167);     // Catch: Exception -> L17
        BaseBleCache r168 = r7.mBleCache;     // Catch: Exception -> L17
        if (r168 != null) goto L263;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r327 = null;
    L264:
        r2 = r2;
        BaseBleCache.putObject$default(r327, r2, r167, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O01iO(r167));     // Catch: Exception -> L17
        Unit r169 = Unit.OXO1;     // Catch: Exception -> L17
        goto L327
    L263:
        r327 = r168;
        goto L264
    L3958:
        return;
    L296:
        if (r2 == BleKey.AGPS_FILE) goto L298;
    L303:
        r2 = r2;
        if (r2 != BleKey.THIRD_PARTY_DATA) goto L313;
        if (r5 != BleKeyFlag.UPDATE) goto L313;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r170 = BleReadable.Companion;     // Catch: Exception -> L17
        int r171 = r48.length;     // Catch: Exception -> L17
        Object r172 = BleThirdPartyData.class.newInstance();     // Catch: Exception -> L17
        BleReadable r173 = (BleReadable) r172;     // Catch: Exception -> L17
        r173.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r171));     // Catch: Exception -> L17
        r173.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r172, "also(...)");     // Catch: Exception -> L17
        final BleThirdPartyData r174 = (BleThirdPartyData) ((BleReadable) r172);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBleThirdPartyDataUpdate -> " + r174);     // Catch: Exception -> L17
        BaseBleCache r175 = r7.mBleCache;     // Catch: Exception -> L17
        if (r175 != null) goto L310;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r328 = null;
    L311:
        BaseBleCache.putObject$default(r328, r2, r174, null, 4, null);     // Catch: Exception -> L17
        r2 = r2;
        r7.notifyHandlers(new IXOIXXI(r174));     // Catch: Exception -> L17
        Unit r176 = Unit.OXO1;     // Catch: Exception -> L17
        goto L252
    L310:
        r328 = r175;
    L313:
        if (r2 != BleKey.CP_CHAT) goto L318;
        if (r5 != BleKeyFlag.UPDATE) goto L318;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r177 = BleReadable.Companion;     // Catch: Exception -> L17
        int r178 = r48.length;     // Catch: Exception -> L17
        Object r179 = BleCPChat.class.newInstance();     // Catch: Exception -> L17
        BleReadable r180 = (BleReadable) r179;     // Catch: Exception -> L17
        r180.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r178));     // Catch: Exception -> L17
        r180.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r179, "also(...)");     // Catch: Exception -> L17
        final BleCPChat r181 = (BleCPChat) ((BleReadable) r179);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCPChatUpdate -> " + r181);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiI1O(r181));     // Catch: Exception -> L17
        Unit r182 = Unit.OXO1;     // Catch: Exception -> L17
    L318:
        if (r2 != BleKey.CP_MISS_YOU) goto L323;
        if (r5 != BleKeyFlag.UPDATE) goto L323;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r183 = BleReadable.Companion;     // Catch: Exception -> L17
        int r184 = r48.length;     // Catch: Exception -> L17
        Object r185 = BleCPMissYou.class.newInstance();     // Catch: Exception -> L17
        BleReadable r186 = (BleReadable) r185;     // Catch: Exception -> L17
        r186.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r184));     // Catch: Exception -> L17
        r186.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r185, "also(...)");     // Catch: Exception -> L17
        final BleCPMissYou r187 = (BleCPMissYou) ((BleReadable) r185);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCPMissYouUpdate -> " + r187);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0XOiOOOi(r187));     // Catch: Exception -> L17
        Unit r188 = Unit.OXO1;     // Catch: Exception -> L17
    L323:
        if (r2 != BleKey.CP_TODO) goto L252;
        if (r5 != BleKeyFlag.UPDATE) goto L252;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        r2 = r2;
        BleReadable.Companion r189 = BleReadable.Companion;     // Catch: Exception -> L17
        int r190 = r48.length;     // Catch: Exception -> L17
        Object r191 = BleCPTodo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r192 = (BleReadable) r191;     // Catch: Exception -> L17
        r192.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r190));     // Catch: Exception -> L17
        r192.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r191, "also(...)");     // Catch: Exception -> L17
        final BleCPTodo r193 = (BleCPTodo) ((BleReadable) r191);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCPTodoUpdate -> " + r193);     // Catch: Exception -> L17
        r7.notifyHandlers(new IXI1I1(r193));     // Catch: Exception -> L17
        Unit r194 = Unit.OXO1;     // Catch: Exception -> L17
        goto L327
    L298:
        if (r5 != BleKeyFlag.UPDATE) goto L303;
        r2 = r2;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        StringBuilder r195 = new StringBuilder();     // Catch: Exception -> L17
        r195.append(r7.getTAG());     // Catch: Exception -> L17
        r195.append(" onDeviceRequestAGpsFile -> ");     // Catch: Exception -> L17
        BaseBleCache r196 = r7.mBleCache;     // Catch: Exception -> L17
        if (r196 != null) goto L302;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r196 = null;
    L302:
        r195.append(r196.getMAGpsFileUrl());     // Catch: Exception -> L17
        r10.IiI10X(r195.toString());     // Catch: Exception -> L17
        r7.notifyHandlers(new XOX1i0iiI(r7));     // Catch: Exception -> L17
        goto L252
    L328:
        r5 = r1;
        r2 = r2;
        r9 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r9 == false) goto L341;
        if (r5 != BleKeyFlag.READ) goto L341;
        if (r48.length < 10) goto L3960;
        BleReadable.Companion r197 = BleReadable.Companion;     // Catch: Exception -> L17
        int r198 = r48.length;     // Catch: Exception -> L17
        Object r199 = BleGolfScore.class.newInstance();     // Catch: Exception -> L17
        BleReadable r200 = (BleReadable) r199;     // Catch: Exception -> L17
        r200.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r198));     // Catch: Exception -> L17
        r200.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r199, "also(...)");     // Catch: Exception -> L17
        final BleGolfScore r201 = (BleGolfScore) ((BleReadable) r199);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBleGolfScore -> " + r201);     // Catch: Exception -> L17
        BaseBleCache r202 = r7.mBleCache;     // Catch: Exception -> L17
        if (r202 != null) goto L338;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r329 = null;
    L339:
        BaseBleCache.putObject$default(r329, r2, r201, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OO1i0(r201));     // Catch: Exception -> L17
        Unit r203 = Unit.OXO1;     // Catch: Exception -> L17
    L350:
        Unit r204 = Unit.OXO1;     // Catch: Exception -> L17
        goto L21
    L338:
        r329 = r202;
        goto L339
    L3960:
        return;
    L341:
        if (r5 != BleKeyFlag.UPDATE) goto L350;
        if (r9 == true) goto L345;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
    L345:
        BleReadable.Companion r205 = BleReadable.Companion;     // Catch: Exception -> L17
        int r206 = r48.length;     // Catch: Exception -> L17
        Object r207 = BleGolfScore.class.newInstance();     // Catch: Exception -> L17
        BleReadable r208 = (BleReadable) r207;     // Catch: Exception -> L17
        r208.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r206));     // Catch: Exception -> L17
        r208.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r207, "also(...)");     // Catch: Exception -> L17
        final BleGolfScore r209 = (BleGolfScore) ((BleReadable) r207);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBleGolfScore -> " + r209);     // Catch: Exception -> L17
        BaseBleCache r210 = r7.mBleCache;     // Catch: Exception -> L17
        if (r210 != null) goto L348;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r330 = null;
    L349:
        BaseBleCache.putObject$default(r330, r2, r209, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I01II(r209));     // Catch: Exception -> L17
        Unit r211 = Unit.OXO1;     // Catch: Exception -> L17
        goto L350
    L348:
        r330 = r210;
        goto L349
    L351:
        r5 = r1;
        r9 = r6;
        r38 = r38;
        r7 = this;
        if (r9 == true) goto L354;
    L364:
        if (r9 == false) goto L366;
    L375:
        Unit r212 = Unit.OXO1;     // Catch: Exception -> L17
        r37 = r37;
        r2 = r2;
        r39 = r39;
        goto L23
    L366:
        if (r5 != BleKeyFlag.UPDATE) goto L375;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3962;
        BleReadable.Companion r213 = BleReadable.Companion;     // Catch: Exception -> L17
        int r214 = r48.length;     // Catch: Exception -> L17
        Object r215 = BleGolfWatchMapInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r216 = (BleReadable) r215;     // Catch: Exception -> L17
        r216.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r214));     // Catch: Exception -> L17
        r216.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r215, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchMapInfo r217 = (BleGolfWatchMapInfo) ((BleReadable) r215);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfWatchMapInfo -> " + r9 + ' ' + r217);     // Catch: Exception -> L17
        BaseBleCache r218 = r7.mBleCache;     // Catch: Exception -> L17
        if (r218 != null) goto L373;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r331 = null;
    L374:
        BaseBleCache.putObject$default(r331, r2, r217, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Oi1iII(r217));     // Catch: Exception -> L17
        Unit r219 = Unit.OXO1;     // Catch: Exception -> L17
        goto L375
    L373:
        r331 = r218;
        goto L374
    L3962:
        return;
    L354:
        if (r5 != BleKeyFlag.UPDATE) goto L364;
        if (r48.length < 10) goto L3961;
        BleReadable.Companion r220 = BleReadable.Companion;     // Catch: Exception -> L17
        int r221 = r48.length;     // Catch: Exception -> L17
        Object r222 = BleGolfWatchMapInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r223 = (BleReadable) r222;     // Catch: Exception -> L17
        r223.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r221));     // Catch: Exception -> L17
        r223.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r222, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchMapInfo r224 = (BleGolfWatchMapInfo) ((BleReadable) r222);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfWatchMapInfo -> " + r224);     // Catch: Exception -> L17
        BaseBleCache r225 = r7.mBleCache;     // Catch: Exception -> L17
        if (r225 != null) goto L361;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r332 = null;
    L362:
        BaseBleCache.putObject$default(r332, r2, r224, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I01IX1XI(r224));     // Catch: Exception -> L17
        Unit r226 = Unit.OXO1;     // Catch: Exception -> L17
        goto L375
    L361:
        r332 = r225;
        goto L362
    L3961:
        return;
    L376:
        r5 = r1;
        BleKey r333 = r2;
        boolean r227 = r6;
        r7 = this;
        if (r227 == true) goto L379;
    L388:
        if (r227 == false) goto L390;
    L399:
        Unit r228 = Unit.OXO1;     // Catch: Exception -> L17
    L400:
        r11 = r227;
        r2 = r333;
        r39 = r39;
        goto L24
    L390:
        if (r5 != BleKeyFlag.UPDATE) goto L399;
        sendData$default(r7, r333, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3964;
        BleReadable.Companion r229 = BleReadable.Companion;     // Catch: Exception -> L17
        int r230 = r48.length;     // Catch: Exception -> L17
        Object r231 = BleGolfWatchVersionInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r232 = (BleReadable) r231;     // Catch: Exception -> L17
        r232.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r230));     // Catch: Exception -> L17
        r232.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r231, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchVersionInfo r233 = (BleGolfWatchVersionInfo) ((BleReadable) r231);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfWatchVersionInfo -> " + r227 + ' ' + r233);     // Catch: Exception -> L17
        BaseBleCache r234 = r7.mBleCache;     // Catch: Exception -> L17
        if (r234 != null) goto L397;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r334 = null;
    L398:
        BaseBleCache.putObject$default(r334, r333, r233, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0i1(r233));     // Catch: Exception -> L17
        Unit r235 = Unit.OXO1;     // Catch: Exception -> L17
        goto L399
    L397:
        r334 = r234;
        goto L398
    L3964:
        return;
    L379:
        if (r5 != BleKeyFlag.UPDATE) goto L388;
        if (r48.length < 10) goto L3963;
        BleReadable.Companion r236 = BleReadable.Companion;     // Catch: Exception -> L17
        int r237 = r48.length;     // Catch: Exception -> L17
        Object r238 = BleGolfWatchVersionInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r239 = (BleReadable) r238;     // Catch: Exception -> L17
        r239.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r237));     // Catch: Exception -> L17
        r239.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r238, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchVersionInfo r240 = (BleGolfWatchVersionInfo) ((BleReadable) r238);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfWatchVersionInfo -> " + r240);     // Catch: Exception -> L17
        BaseBleCache r241 = r7.mBleCache;     // Catch: Exception -> L17
        if (r241 != null) goto L386;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r335 = null;
    L387:
        BaseBleCache.putObject$default(r335, r333, r240, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OO0O0(r240));     // Catch: Exception -> L17
        Unit r242 = Unit.OXO1;     // Catch: Exception -> L17
        goto L399
    L386:
        r335 = r241;
        goto L387
    L3963:
        return;
    L401:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L404;
    L413:
        if (r227 == false) goto L415;
    L424:
        Unit r243 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L415:
        if (r5 != BleKeyFlag.UPDATE) goto L424;
        sendData$default(r7, r333, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3966;
        BleReadable.Companion r244 = BleReadable.Companion;     // Catch: Exception -> L17
        int r245 = r48.length;     // Catch: Exception -> L17
        Object r246 = BleGolfSportSwitch.class.newInstance();     // Catch: Exception -> L17
        BleReadable r247 = (BleReadable) r246;     // Catch: Exception -> L17
        r247.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r245));     // Catch: Exception -> L17
        r247.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r246, "also(...)");     // Catch: Exception -> L17
        final BleGolfSportSwitch r248 = (BleGolfSportSwitch) ((BleReadable) r246);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfSportSwitch ->" + r227 + ' ' + r248);     // Catch: Exception -> L17
        BaseBleCache r249 = r7.mBleCache;     // Catch: Exception -> L17
        if (r249 != null) goto L422;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r336 = null;
    L423:
        BaseBleCache.putObject$default(r336, r333, r248, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OO00XiI(r248));     // Catch: Exception -> L17
        Unit r250 = Unit.OXO1;     // Catch: Exception -> L17
        goto L424
    L422:
        r336 = r249;
        goto L423
    L3966:
        return;
    L404:
        if (r5 != BleKeyFlag.UPDATE) goto L413;
        if (r48.length < 10) goto L3965;
        BleReadable.Companion r251 = BleReadable.Companion;     // Catch: Exception -> L17
        int r252 = r48.length;     // Catch: Exception -> L17
        Object r253 = BleGolfSportSwitch.class.newInstance();     // Catch: Exception -> L17
        BleReadable r254 = (BleReadable) r253;     // Catch: Exception -> L17
        r254.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r252));     // Catch: Exception -> L17
        r254.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r253, "also(...)");     // Catch: Exception -> L17
        final BleGolfSportSwitch r255 = (BleGolfSportSwitch) ((BleReadable) r253);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleGolfSportSwitch -> " + r255);     // Catch: Exception -> L17
        BaseBleCache r256 = r7.mBleCache;     // Catch: Exception -> L17
        if (r256 != null) goto L411;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r337 = null;
    L412:
        BaseBleCache.putObject$default(r337, r333, r255, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XI0O(r255));     // Catch: Exception -> L17
        Unit r257 = Unit.OXO1;     // Catch: Exception -> L17
        goto L424
    L411:
        r337 = r256;
        goto L412
    L3965:
        return;
    L425:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == false) goto L428;
    L437:
        Unit r258 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L428:
        if (r5 != BleKeyFlag.UPDATE) goto L437;
        sendData$default(r7, r333, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3967;
        final byte r259 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onActivityRecognitionUpdate -> " + r259);     // Catch: Exception -> L17
        BaseBleCache r260 = r7.mBleCache;     // Catch: Exception -> L17
        if (r260 != null) goto L435;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r338 = null;
    L436:
        BaseBleCache.putInt$default(r338, r333, r259, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiXIi1O1i(r259));     // Catch: Exception -> L17
        goto L437
    L435:
        r338 = r260;
        goto L436
    L3967:
        return;
    L438:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L441;
    L450:
        Unit r261 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L441:
        if (r5 != BleKeyFlag.READ) goto L450;
        if (r48.length < 10) goto L3968;
        BleReadable.Companion r262 = BleReadable.Companion;     // Catch: Exception -> L17
        int r263 = r48.length;     // Catch: Exception -> L17
        Object r264 = BleWatchFaceMaxSize.class.newInstance();     // Catch: Exception -> L17
        BleReadable r265 = (BleReadable) r264;     // Catch: Exception -> L17
        r265.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r263));     // Catch: Exception -> L17
        r265.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r264, "also(...)");     // Catch: Exception -> L17
        final BleWatchFaceMaxSize r266 = (BleWatchFaceMaxSize) ((BleReadable) r264);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWatchFaceMaxSize -> " + r266);     // Catch: Exception -> L17
        BaseBleCache r267 = r7.mBleCache;     // Catch: Exception -> L17
        if (r267 != null) goto L448;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r339 = null;
    L449:
        BaseBleCache.putObject$default(r339, r333, r266, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOO0XX(r266));     // Catch: Exception -> L17
        Unit r268 = Unit.OXO1;     // Catch: Exception -> L17
        goto L450
    L448:
        r339 = r267;
        goto L449
    L3968:
        return;
    L451:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L454;
    L463:
        Unit r269 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L454:
        if (r5 != BleKeyFlag.READ) goto L463;
        if (r48.length < 10) goto L3969;
        BleReadable.Companion r270 = BleReadable.Companion;     // Catch: Exception -> L17
        int r271 = r48.length;     // Catch: Exception -> L17
        Object r272 = BleOptionalMapAuthInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r273 = (BleReadable) r272;     // Catch: Exception -> L17
        r273.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r271));     // Catch: Exception -> L17
        r273.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r272, "also(...)");     // Catch: Exception -> L17
        final BleOptionalMapAuthInfo r274 = (BleOptionalMapAuthInfo) ((BleReadable) r272);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadOptionalMapAuthInfo -> " + r274);     // Catch: Exception -> L17
        BaseBleCache r275 = r7.mBleCache;     // Catch: Exception -> L17
        if (r275 != null) goto L461;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r340 = null;
    L462:
        BaseBleCache.putObject$default(r340, r333, r274, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new ii0IX1O0X(r274));     // Catch: Exception -> L17
        Unit r276 = Unit.OXO1;     // Catch: Exception -> L17
        goto L463
    L461:
        r340 = r275;
        goto L462
    L3969:
        return;
    L464:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L467;
    L476:
        Unit r277 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L467:
        if (r5 != BleKeyFlag.READ) goto L476;
        if (r48.length < 10) goto L3970;
        final byte r278 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSleepRiskLevel -> " + r278);     // Catch: Exception -> L17
        BaseBleCache r279 = r7.mBleCache;     // Catch: Exception -> L17
        if (r279 != null) goto L474;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r341 = null;
    L475:
        BaseBleCache.putInt$default(r341, r333, r278, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOX010iO0(r278));     // Catch: Exception -> L17
        Unit r280 = Unit.OXO1;     // Catch: Exception -> L17
        goto L476
    L474:
        r341 = r279;
        goto L475
    L3970:
        return;
    L477:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L480;
    L489:
        Unit r281 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L480:
        if (r5 != BleKeyFlag.UPDATE) goto L489;
        if (r48.length < 10) goto L3971;
        BleReadable.Companion r282 = BleReadable.Companion;     // Catch: Exception -> L17
        int r283 = r48.length;     // Catch: Exception -> L17
        Object r284 = BleVideoCallInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r285 = (BleReadable) r284;     // Catch: Exception -> L17
        r285.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r283));     // Catch: Exception -> L17
        r285.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r284, "also(...)");     // Catch: Exception -> L17
        final BleVideoCallInfo r286 = (BleVideoCallInfo) ((BleReadable) r284);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadHeartRateZones -> " + r286);     // Catch: Exception -> L17
        BaseBleCache r287 = r7.mBleCache;     // Catch: Exception -> L17
        if (r287 != null) goto L487;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r342 = null;
    L488:
        BaseBleCache.putObject$default(r342, r333, r286, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXXO1Xi(r286));     // Catch: Exception -> L17
        Unit r288 = Unit.OXO1;     // Catch: Exception -> L17
        goto L489
    L487:
        r342 = r287;
        goto L488
    L3971:
        return;
    L490:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == true) goto L493;
    L502:
        Unit r289 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L493:
        if (r5 != BleKeyFlag.READ) goto L502;
        if (r48.length < 10) goto L3972;
        BleReadable.Companion r290 = BleReadable.Companion;     // Catch: Exception -> L17
        int r291 = r48.length;     // Catch: Exception -> L17
        Object r292 = BleHeartRateZones.class.newInstance();     // Catch: Exception -> L17
        BleReadable r293 = (BleReadable) r292;     // Catch: Exception -> L17
        r293.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r291));     // Catch: Exception -> L17
        r293.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r292, "also(...)");     // Catch: Exception -> L17
        final BleHeartRateZones r294 = (BleHeartRateZones) ((BleReadable) r292);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadHeartRateZones -> " + r294);     // Catch: Exception -> L17
        BaseBleCache r295 = r7.mBleCache;     // Catch: Exception -> L17
        if (r295 != null) goto L500;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r343 = null;
    L501:
        BaseBleCache.putObject$default(r343, r333, r294, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i1XX1IXO1(r294));     // Catch: Exception -> L17
        Unit r296 = Unit.OXO1;     // Catch: Exception -> L17
        goto L502
    L500:
        r343 = r295;
        goto L501
    L3972:
        return;
    L503:
        r5 = r1;
        r333 = r2;
        r227 = r6;
        r7 = this;
        if (r227 == false) goto L516;
        if (r5 != BleKeyFlag.READ) goto L516;
        if (r48.length < 10) goto L3973;
        final byte r297 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadRestingHeartRate -> " + r297);     // Catch: Exception -> L17
        BaseBleCache r298 = r7.mBleCache;     // Catch: Exception -> L17
        if (r298 != null) goto L513;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r344 = null;
    L514:
        BaseBleCache.putInt$default(r344, r333, r297, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiXOO(r297));     // Catch: Exception -> L17
        Unit r299 = Unit.OXO1;     // Catch: Exception -> L17
    L527:
        Unit r300 = Unit.OXO1;     // Catch: Exception -> L17
        goto L400
    L513:
        r344 = r298;
        goto L514
    L3973:
        return;
    L516:
        if (r227 == true) goto L527;
        if (r5 != BleKeyFlag.UPDATE) goto L527;
        if (r48.length < 10) goto L3974;
        final byte r301 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadRestingHeartRate -> " + r301);     // Catch: Exception -> L17
        BaseBleCache r302 = r7.mBleCache;     // Catch: Exception -> L17
        if (r302 != null) goto L525;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r345 = null;
    L526:
        BaseBleCache.putInt$default(r345, r333, r301, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iiXX(r301));     // Catch: Exception -> L17
        Unit r303 = Unit.OXO1;     // Catch: Exception -> L17
        goto L527
    L525:
        r345 = r302;
        goto L526
    L3974:
        return;
    L528:
        BleKeyFlag r304 = r1;
        BleKey r346 = r2;
        r11 = r6;
        if (r11 == true) goto L531;
    L541:
        if (r11 == false) goto L543;
    L540:
        r17 = this;
    L551:
        Unit r305 = Unit.OXO1;     // Catch: Exception -> L46
    L552:
        r7 = r17;
    L553:
        r12 = r304;
    L554:
        r2 = r346;
    L555:
        r39 = r39;
        goto L3829
    L543:
        if (r304 != BleKeyFlag.UPDATE) goto L540;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r306 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSleepRespiratoryRate -> " + r306);     // Catch: Exception -> L46
        BaseBleCache r307 = r17.mBleCache;     // Catch: Exception -> L46
        if (r307 != null) goto L549;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r347 = null;
    L550:
        BaseBleCache.putInt$default(r347, r346, r306, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iiOiOi1i(r306));     // Catch: Exception -> L46
        goto L551
    L549:
        r347 = r307;
        goto L550
    L531:
        if (r304 != BleKeyFlag.READ) goto L541;
        if (r48.length < 10) goto L3975;
        final byte r308 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(getTAG() + " handleData onReadSleepRespiratoryRate -> " + r308);     // Catch: Exception -> L17
        BaseBleCache r309 = this.mBleCache;     // Catch: Exception -> L17
        if (r309 != null) goto L538;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r348 = null;
    L539:
        BaseBleCache.putInt$default(r348, r346, r308, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new OI10II1(r308));     // Catch: Exception -> L17
        Unit r349 = Unit.OXO1;     // Catch: Exception -> L17
        goto L540
    L538:
        r348 = r309;
        goto L539
    L3975:
        return;
    L556:
        r346 = r2;
        r11 = r6;
        if (r11 == false) goto L559;
    L562:
        r7 = this;
        final BleKeyFlag r350 = r1;
    L563:
        Unit r351 = Unit.OXO1;     // Catch: Exception -> L17
    L564:
        r12 = r350;
        goto L554
    L559:
        if (r1 != BleKeyFlag.UPDATE) goto L562;
        r350 = r1;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        goto L563
    L565:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        if (r11 == true) goto L568;
    L578:
        if (r11 == false) goto L580;
    L577:
        r17 = this;
    L588:
        Unit r352 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L580:
        if (r304 != BleKeyFlag.UPDATE) goto L577;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r353 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSleepMonitoringMode -> " + r353);     // Catch: Exception -> L46
        BaseBleCache r354 = r17.mBleCache;     // Catch: Exception -> L46
        if (r354 != null) goto L586;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r355 = null;
    L587:
        BaseBleCache.putInt$default(r355, r346, r353, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iI0OXO(r353));     // Catch: Exception -> L46
        goto L588
    L586:
        r355 = r354;
        goto L587
    L568:
        if (r304 != BleKeyFlag.READ) goto L578;
        if (r48.length < 10) goto L3976;
        final byte r356 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(getTAG() + " handleData onReadSleepMonitoringMode -> " + r356);     // Catch: Exception -> L17
        BaseBleCache r357 = this.mBleCache;     // Catch: Exception -> L17
        if (r357 != null) goto L575;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r358 = null;
    L576:
        BaseBleCache.putInt$default(r358, r346, r356, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new XIOXOIO(r356));     // Catch: Exception -> L17
        Unit r359 = Unit.OXO1;     // Catch: Exception -> L17
        goto L577
    L575:
        r358 = r357;
        goto L576
    L3976:
        return;
    L589:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L592;
    L598:
        Unit r360 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L592:
        if (r304 != BleKeyFlag.READ) goto L598;
        BleReadable.Companion r361 = BleReadable.Companion;     // Catch: Exception -> L46
        int r362 = r48.length;     // Catch: Exception -> L46
        Object r363 = BleHrvBaseLine.class.newInstance();     // Catch: Exception -> L46
        BleReadable r364 = (BleReadable) r363;     // Catch: Exception -> L46
        r364.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r362));     // Catch: Exception -> L46
        r364.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r363, "also(...)");     // Catch: Exception -> L46
        final BleHrvBaseLine r365 = (BleHrvBaseLine) ((BleReadable) r363);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadHrvBaseLine -> " + r365);     // Catch: Exception -> L46
        BaseBleCache r366 = r17.mBleCache;     // Catch: Exception -> L46
        if (r366 != null) goto L596;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r367 = null;
    L597:
        BaseBleCache.putObject$default(r367, r346, r365, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new Ii1IX(r365));     // Catch: Exception -> L46
        Unit r368 = Unit.OXO1;     // Catch: Exception -> L46
        goto L598
    L596:
        r367 = r366;
        goto L597
    L599:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L602;
    L611:
        if (r11 == false) goto L613;
    L622:
        Unit r369 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L613:
        if (r304 != BleKeyFlag.UPDATE) goto L622;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r304 = r304;
        final int r370 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadHrMonitoringSettingsV2 -> " + r370);     // Catch: Exception -> L46
        BaseBleCache r371 = r17.mBleCache;     // Catch: Exception -> L46
        if (r371 != null) goto L620;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r372 = null;
    L621:
        BaseBleCache.putInt$default(r372, r346, r370, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new I11OO1(r370));     // Catch: Exception -> L46
        goto L622
    L620:
        r372 = r371;
        goto L621
    L602:
        if (r304 != BleKeyFlag.READ) goto L611;
        if (r48.length < 10) goto L3955;
        final byte r373 = r48[9];     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadHrMonitoringSettingsV2 -> " + r373);     // Catch: Exception -> L46
        BaseBleCache r374 = r17.mBleCache;     // Catch: Exception -> L46
        if (r374 != null) goto L609;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r375 = null;
    L610:
        BaseBleCache.putInt$default(r375, r346, r373, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IXIXIIi(r373));     // Catch: Exception -> L46
        Unit r376 = Unit.OXO1;     // Catch: Exception -> L46
        goto L622
    L609:
        r375 = r374;
        goto L610
    L623:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L626;
    L635:
        if (r11 == false) goto L637;
    L646:
        Unit r377 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L637:
        if (r304 != BleKeyFlag.UPDATE) goto L646;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r304 = r304;
        final int r378 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onHighAntiAssistChange -> " + r378);     // Catch: Exception -> L46
        BaseBleCache r379 = r17.mBleCache;     // Catch: Exception -> L46
        if (r379 != null) goto L644;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r380 = null;
    L645:
        BaseBleCache.putInt$default(r380, r346, r378, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iOi1IXXX0(r378));     // Catch: Exception -> L46
        goto L646
    L644:
        r380 = r379;
        goto L645
    L626:
        if (r304 != BleKeyFlag.READ) goto L635;
        if (r48.length < 10) goto L3955;
        final byte r381 = r48[9];     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onHighAntiAssistChange -> " + r381);     // Catch: Exception -> L46
        BaseBleCache r382 = r17.mBleCache;     // Catch: Exception -> L46
        if (r382 != null) goto L633;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r383 = null;
    L634:
        BaseBleCache.putInt$default(r383, r346, r381, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new O10II100(r381));     // Catch: Exception -> L46
        Unit r384 = Unit.OXO1;     // Catch: Exception -> L46
        goto L646
    L633:
        r383 = r382;
        goto L634
    L647:
        r346 = r2;
        r11 = r6;
        if (r11 == false) goto L650;
    L653:
        r7 = this;
        r350 = r1;
    L654:
        Unit r385 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L650:
        if (r1 != BleKeyFlag.UPDATE) goto L653;
        r350 = r1;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r386 = BleReadable.Companion;     // Catch: Exception -> L17
        int r387 = r48.length;     // Catch: Exception -> L17
        Object r388 = BleIPCOTAState.class.newInstance();     // Catch: Exception -> L17
        BleReadable r389 = (BleReadable) r388;     // Catch: Exception -> L17
        r389.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r387));     // Catch: Exception -> L17
        r389.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r388, "also(...)");     // Catch: Exception -> L17
        final BleIPCOTAState r390 = (BleIPCOTAState) ((BleReadable) r388);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIPCOTAStateUpdate -> " + r390);     // Catch: Exception -> L17
        r7.notifyHandlers(new XXXIIiO(r390));     // Catch: Exception -> L17
        Unit r391 = Unit.OXO1;     // Catch: Exception -> L17
        goto L654
    L655:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L658;
    L660:
        Unit r392 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L658:
        if (r350 != BleKeyFlag.UPDATE) goto L660;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r393 = BleReadable.Companion;     // Catch: Exception -> L17
        int r394 = r48.length;     // Catch: Exception -> L17
        Object r395 = BleIPCException.class.newInstance();     // Catch: Exception -> L17
        BleReadable r396 = (BleReadable) r395;     // Catch: Exception -> L17
        r396.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r394));     // Catch: Exception -> L17
        r396.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r395, "also(...)");     // Catch: Exception -> L17
        final BleIPCException r397 = (BleIPCException) ((BleReadable) r395);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIPCExceptionUpdate -> " + r397);     // Catch: Exception -> L17
        r7.notifyHandlers(new i10XXI(r397));     // Catch: Exception -> L17
        Unit r398 = Unit.OXO1;     // Catch: Exception -> L17
        goto L660
    L661:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L664;
    L666:
        Unit r399 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L664:
        if (r350 != BleKeyFlag.UPDATE) goto L666;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r400 = BleReadable.Companion;     // Catch: Exception -> L17
        int r401 = r48.length;     // Catch: Exception -> L17
        Object r402 = BleCPListener.class.newInstance();     // Catch: Exception -> L17
        BleReadable r403 = (BleReadable) r402;     // Catch: Exception -> L17
        r403.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r401));     // Catch: Exception -> L17
        r403.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r402, "also(...)");     // Catch: Exception -> L17
        final BleCPListener r404 = (BleCPListener) ((BleReadable) r402);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCPListenerUpdate -> " + r404);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0XX10OI0(r404));     // Catch: Exception -> L17
        Unit r405 = Unit.OXO1;     // Catch: Exception -> L17
        goto L666
    L667:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L670;
    L672:
        if (r11 == false) goto L674;
    L676:
        Unit r406 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L674:
        if (r350 != BleKeyFlag.UPDATE) goto L676;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r407 = BleReadable.Companion;     // Catch: Exception -> L17
        int r408 = r48.length;     // Catch: Exception -> L17
        Object r409 = BleChatApp.class.newInstance();     // Catch: Exception -> L17
        BleReadable r410 = (BleReadable) r409;     // Catch: Exception -> L17
        r410.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r408));     // Catch: Exception -> L17
        r410.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r409, "also(...)");     // Catch: Exception -> L17
        final BleChatApp r411 = (BleChatApp) ((BleReadable) r409);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onChatAppUpdate -> " + r411);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1XXX11(r411));     // Catch: Exception -> L17
        Unit r412 = Unit.OXO1;     // Catch: Exception -> L17
        goto L676
    L670:
        if (r350 != BleKeyFlag.READ) goto L672;
        BleReadable.Companion r413 = BleReadable.Companion;     // Catch: Exception -> L17
        int r414 = r48.length;     // Catch: Exception -> L17
        Object r415 = BleChatApp.class.newInstance();     // Catch: Exception -> L17
        BleReadable r416 = (BleReadable) r415;     // Catch: Exception -> L17
        r416.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r414));     // Catch: Exception -> L17
        r416.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r415, "also(...)");     // Catch: Exception -> L17
        final BleChatApp r417 = (BleChatApp) ((BleReadable) r415);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadChatApp -> " + r417);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1OiO11(r417));     // Catch: Exception -> L17
        Unit r418 = Unit.OXO1;     // Catch: Exception -> L17
        goto L676
    L677:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L680;
    L691:
        Unit r419 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L680:
        if (r350 != BleKeyFlag.READ) goto L691;
        BleReadable.Companion r420 = BleReadable.Companion;     // Catch: Exception -> L17
        int r421 = r48.length;     // Catch: Exception -> L17
        final ArrayList r422 = new ArrayList();     // Catch: Exception -> L17
        int r1100 = 9;
        int r423 = r421 / 9;     // Catch: Exception -> L17
        if (r423 <= 0) goto L686;
        int r424 = 0;
    L684:
        if (r424 >= r423) goto L686;
        BleReadable.Companion r425 = BleReadable.Companion;     // Catch: Exception -> L17
        int r426 = r1100 * r424;     // Catch: Exception -> L17
        r424 = r424 + 1;     // Catch: Exception -> L17
        byte[] r427 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r426, r1100 * r424);     // Catch: Exception -> L17
        int r428 = r427.length;     // Catch: Exception -> L17
        Object r429 = BleLactateThreshold.class.newInstance();     // Catch: Exception -> L17
        BleReadable r430 = (BleReadable) r429;     // Catch: Exception -> L17
        r430.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r427, 0, r428));     // Catch: Exception -> L17
        r430.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r429, "also(...)");     // Catch: Exception -> L17
        r422.add((BleReadable) r429);     // Catch: Exception -> L17
        r1100 = 9;
    L686:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadLactateThreshold -> " + r422);     // Catch: Exception -> L17
        BaseBleCache r431 = r7.mBleCache;     // Catch: Exception -> L17
        if (r431 != null) goto L689;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3100 = null;
    L690:
        BaseBleCache.putList$default(r3100, r346, r422, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iiI1X(r422));     // Catch: Exception -> L17
        Unit r432 = Unit.OXO1;     // Catch: Exception -> L17
        goto L691
    L689:
        r3100 = r431;
        goto L690
    L692:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L695;
    L704:
        Unit r433 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L695:
        if (r350 != BleKeyFlag.READ) goto L704;
        if (r48.length < 10) goto L3977;
        final byte r434 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSGSleepSet -> " + r434);     // Catch: Exception -> L17
        BaseBleCache r435 = r7.mBleCache;     // Catch: Exception -> L17
        if (r435 != null) goto L702;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3101 = null;
    L703:
        BaseBleCache.putInt$default(r3101, r346, r434, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new II1iIi(r434));     // Catch: Exception -> L17
        Unit r436 = Unit.OXO1;     // Catch: Exception -> L17
        goto L704
    L702:
        r3101 = r435;
        goto L703
    L3977:
        return;
    L705:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L708;
    L714:
        Unit r437 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L708:
        if (r350 != BleKeyFlag.READ) goto L714;
        BleReadable.Companion r438 = BleReadable.Companion;     // Catch: Exception -> L17
        int r439 = r48.length;     // Catch: Exception -> L17
        Object r440 = BleSGKeywordAwake.class.newInstance();     // Catch: Exception -> L17
        BleReadable r441 = (BleReadable) r440;     // Catch: Exception -> L17
        r441.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r439));     // Catch: Exception -> L17
        r441.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r440, "also(...)");     // Catch: Exception -> L17
        final BleSGKeywordAwake r442 = (BleSGKeywordAwake) ((BleReadable) r440);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSGKeywordAwake -> " + r442);     // Catch: Exception -> L17
        BaseBleCache r443 = r7.mBleCache;     // Catch: Exception -> L17
        if (r443 != null) goto L712;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3102 = null;
    L713:
        BaseBleCache.putObject$default(r3102, r346, r442, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iI0OiiI(r442));     // Catch: Exception -> L17
        Unit r444 = Unit.OXO1;     // Catch: Exception -> L17
        goto L714
    L712:
        r3102 = r443;
        goto L713
    L715:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L718;
    L724:
        Unit r445 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L718:
        if (r350 != BleKeyFlag.UPDATE) goto L724;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r446 = BleReadable.Companion;     // Catch: Exception -> L17
        int r447 = r48.length;     // Catch: Exception -> L17
        Object r448 = BleSGTest.class.newInstance();     // Catch: Exception -> L17
        BleReadable r449 = (BleReadable) r448;     // Catch: Exception -> L17
        r449.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r447));     // Catch: Exception -> L17
        r449.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r448, "also(...)");     // Catch: Exception -> L17
        final BleSGTest r450 = (BleSGTest) ((BleReadable) r448);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSGTestUpdate -> " + r450);     // Catch: Exception -> L17
        BaseBleCache r451 = r7.mBleCache;     // Catch: Exception -> L17
        if (r451 != null) goto L722;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3103 = null;
    L723:
        BaseBleCache.putObject$default(r3103, r346, r450, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O11O0i0X(r450));     // Catch: Exception -> L17
        Unit r452 = Unit.OXO1;     // Catch: Exception -> L17
        goto L724
    L722:
        r3103 = r451;
        goto L723
    L725:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L728;
    L733:
        if (r11 == false) goto L735;
    L740:
        Unit r453 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L735:
        if (r350 != BleKeyFlag.UPDATE) goto L740;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3979;
        final byte r454 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onWearWayUpdate -> " + r454);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0XO011XO(r454));     // Catch: Exception -> L17
        Unit r455 = Unit.OXO1;     // Catch: Exception -> L17
        goto L740
    L3979:
        return;
    L728:
        if (r350 != BleKeyFlag.READ) goto L733;
        if (r48.length < 10) goto L3978;
        final byte r456 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWearWayState -> " + r456 + i0XO1.IO);     // Catch: Exception -> L17
        r7.notifyHandlers(new Xi0I0XIO(r456));     // Catch: Exception -> L17
        Unit r457 = Unit.OXO1;     // Catch: Exception -> L17
        goto L740
    L3978:
        return;
    L741:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L750;
        if (r350 != BleKeyFlag.READ) goto L750;
        if (r48.length < 10) goto L3980;
        final byte r458 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMultiFileTransferReadFile -> " + r458);     // Catch: Exception -> L17
        r7.notifyHandlers(new iO1I1i(r458));     // Catch: Exception -> L17
        Unit r459 = Unit.OXO1;     // Catch: Exception -> L17
    L778:
        Unit r460 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L3980:
        return;
    L750:
        if (r350 != BleKeyFlag.UPDATE) goto L758;
        if (r11 == true) goto L754;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
    L754:
        if (r48.length < 10) goto L3981;
        final byte r461 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMultiFileTransferResponse -> " + r461);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0OXO0(r461));     // Catch: Exception -> L17
        Unit r462 = Unit.OXO1;     // Catch: Exception -> L17
        goto L778
    L3981:
        return;
    L758:
        if (r350 != BleKeyFlag.RESET) goto L765;
        BleReadable.Companion r463 = BleReadable.Companion;     // Catch: Exception -> L17
        int r464 = r48.length;     // Catch: Exception -> L17
        Object r465 = BleMapFileList.class.newInstance();     // Catch: Exception -> L17
        BleReadable r466 = (BleReadable) r465;     // Catch: Exception -> L17
        r466.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r464));     // Catch: Exception -> L17
        r466.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r465, "also(...)");     // Catch: Exception -> L17
        final BleMapFileList r467 = (BleMapFileList) ((BleReadable) r465);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadMultiFileTransfer -> " + r467);     // Catch: Exception -> L17
        BaseBleCache r468 = r7.mBleCache;     // Catch: Exception -> L17
        if (r468 != null) goto L762;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3104 = null;
    L763:
        BaseBleCache.putObject$default(r3104, r346, r467, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1011(r467));     // Catch: Exception -> L17
        Unit r469 = Unit.OXO1;     // Catch: Exception -> L17
        goto L778
    L762:
        r3104 = r468;
        goto L763
    L765:
        if (r350 != BleKeyFlag.CREATE) goto L773;
        if (r11 == true) goto L769;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
    L769:
        if (r48.length < 10) goto L3982;
        final byte r470 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMultiFileTransferResponse -> " + r470);     // Catch: Exception -> L17
        r7.notifyHandlers(new X00X01(r470));     // Catch: Exception -> L17
        Unit r471 = Unit.OXO1;     // Catch: Exception -> L17
        goto L778
    L3982:
        return;
    L773:
        if (r350 != BleKeyFlag.DELETE) goto L778;
        r10.IiI10X(r7.getTAG() + " handleData onDeleteFileResponse ->");     // Catch: Exception -> L17
        if (r48.length < 10) goto L3983;
        final byte r472 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDeleteFileResponse -> " + r472);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOO1i0(r472));     // Catch: Exception -> L17
        Unit r473 = Unit.OXO1;     // Catch: Exception -> L17
        goto L778
    L3983:
        return;
    L779:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L782;
    L788:
        if (r11 == false) goto L790;
    L796:
        Unit r474 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L790:
        if (r350 != BleKeyFlag.UPDATE) goto L796;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r475 = BleReadable.Companion;     // Catch: Exception -> L17
        int r476 = r48.length;     // Catch: Exception -> L17
        Object r477 = BleRecordControl.class.newInstance();     // Catch: Exception -> L17
        BleReadable r478 = (BleReadable) r477;     // Catch: Exception -> L17
        r478.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r476));     // Catch: Exception -> L17
        r478.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r477, "also(...)");     // Catch: Exception -> L17
        final BleRecordControl r479 = (BleRecordControl) ((BleReadable) r477);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onRecordControlUpdate -> " + r479);     // Catch: Exception -> L17
        BaseBleCache r480 = r7.mBleCache;     // Catch: Exception -> L17
        if (r480 != null) goto L794;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3105 = null;
    L795:
        BaseBleCache.putObject$default(r3105, r346, r479, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XI00(r479));     // Catch: Exception -> L17
        Unit r481 = Unit.OXO1;     // Catch: Exception -> L17
        goto L796
    L794:
        r3105 = r480;
        goto L795
    L782:
        if (r350 != BleKeyFlag.READ) goto L788;
        BleReadable.Companion r482 = BleReadable.Companion;     // Catch: Exception -> L17
        int r483 = r48.length;     // Catch: Exception -> L17
        Object r484 = BleRecordControl.class.newInstance();     // Catch: Exception -> L17
        BleReadable r485 = (BleReadable) r484;     // Catch: Exception -> L17
        r485.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r483));     // Catch: Exception -> L17
        r485.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r484, "also(...)");     // Catch: Exception -> L17
        final BleRecordControl r486 = (BleRecordControl) ((BleReadable) r484);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadRecordControl -> " + r486);     // Catch: Exception -> L17
        BaseBleCache r487 = r7.mBleCache;     // Catch: Exception -> L17
        if (r487 != null) goto L786;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3106 = null;
    L787:
        BaseBleCache.putObject$default(r3106, r346, r486, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iO0iXi1(r486));     // Catch: Exception -> L17
        Unit r488 = Unit.OXO1;     // Catch: Exception -> L17
        goto L796
    L786:
        r3106 = r487;
        goto L787
    L797:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L800;
    L809:
        if (r11 == false) goto L811;
    L829:
        Unit r489 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L811:
        if (r350 != BleKeyFlag.UPDATE) goto L829;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3984;
        final byte r490 = r48[9];     // Catch: Exception -> L17
        if (r490 != 0) goto L818;
        BleReadable.Companion r491 = BleReadable.Companion;     // Catch: Exception -> L17
        int r492 = r48.length;     // Catch: Exception -> L17
        Object r493 = BleAICoachBeforePlanV2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r494 = (BleReadable) r493;     // Catch: Exception -> L17
        r494.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r492));     // Catch: Exception -> L17
        r494.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r493, "also(...)");     // Catch: Exception -> L17
        final BleAICoachBeforePlanV2 r495 = (BleAICoachBeforePlanV2) ((BleReadable) r493);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateAICoachGenerateBeforeInfoV2 -> " + r495);     // Catch: Exception -> L17
        r7.notifyHandlers(new IXI101i1(r495));     // Catch: Exception -> L17
        Unit r496 = Unit.OXO1;     // Catch: Exception -> L17
    L828:
        Unit r497 = Unit.OXO1;     // Catch: Exception -> L17
        goto L829
    L818:
        if (r490 != 1) goto L820;
        BleReadable.Companion r498 = BleReadable.Companion;     // Catch: Exception -> L17
        int r499 = r48.length;     // Catch: Exception -> L17
        Object r500 = BleAICoachGeneratePlanV2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r501 = (BleReadable) r500;     // Catch: Exception -> L17
        r501.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r499));     // Catch: Exception -> L17
        r501.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r500, "also(...)");     // Catch: Exception -> L17
        final BleAICoachGeneratePlanV2 r502 = (BleAICoachGeneratePlanV2) ((BleReadable) r500);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachPlanV2 -> " + r502);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1IOIX(r502));     // Catch: Exception -> L17
        Unit r503 = Unit.OXO1;     // Catch: Exception -> L17
        goto L828
    L820:
        if (r490 != 2) goto L822;
        BleReadable.Companion r504 = BleReadable.Companion;     // Catch: Exception -> L17
        int r505 = r48.length;     // Catch: Exception -> L17
        Object r506 = BleLeaveDay.class.newInstance();     // Catch: Exception -> L17
        BleReadable r507 = (BleReadable) r506;     // Catch: Exception -> L17
        r507.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r505));     // Catch: Exception -> L17
        r507.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r506, "also(...)");     // Catch: Exception -> L17
        final BleLeaveDay r508 = (BleLeaveDay) ((BleReadable) r506);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachLeaveDay -> " + r508);     // Catch: Exception -> L17
        r7.notifyHandlers(new O01II(r508));     // Catch: Exception -> L17
        Unit r509 = Unit.OXO1;     // Catch: Exception -> L17
        goto L828
    L822:
        if (r490 == 3) goto L824;
        r10.IiI10X(r7.getTAG() + " handleData onAICoachGeneratePlanUpdate -> " + r490);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOXI1X1O(r490));     // Catch: Exception -> L17
        Unit r510 = Unit.OXO1;     // Catch: Exception -> L17
        goto L828
    L824:
        r10.IiI10X(r7.getTAG() + " handleData onDeleteAICoachPlan ->");     // Catch: Exception -> L17
        r7.notifyHandlers(new iO0XX11iO());     // Catch: Exception -> L17
        Unit r511 = Unit.OXO1;     // Catch: Exception -> L17
        goto L828
    L3984:
        return;
    L800:
        if (r350 != BleKeyFlag.READ) goto L809;
        byte r512 = r48[9];     // Catch: Exception -> L17
        if (r512 != 0) goto L804;
        BleReadable.Companion r513 = BleReadable.Companion;     // Catch: Exception -> L17
        int r514 = r48.length;     // Catch: Exception -> L17
        Object r515 = BleAICoachBeforePlanV2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r516 = (BleReadable) r515;     // Catch: Exception -> L17
        r516.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r514));     // Catch: Exception -> L17
        r516.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r515, "also(...)");     // Catch: Exception -> L17
        final BleAICoachBeforePlanV2 r517 = (BleAICoachBeforePlanV2) ((BleReadable) r515);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachGenerateBeforeInfoV2 -> " + r517);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOiOiIi0I(r517));     // Catch: Exception -> L17
        Unit r518 = Unit.OXO1;     // Catch: Exception -> L17
    L808:
        Unit r519 = Unit.OXO1;     // Catch: Exception -> L17
        goto L829
    L804:
        if (r512 != 1) goto L808;
        BleReadable.Companion r520 = BleReadable.Companion;     // Catch: Exception -> L17
        int r521 = r48.length;     // Catch: Exception -> L17
        Object r522 = BleAICoachGeneratePlanV2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r523 = (BleReadable) r522;     // Catch: Exception -> L17
        r523.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r521));     // Catch: Exception -> L17
        r523.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r522, "also(...)");     // Catch: Exception -> L17
        final BleAICoachGeneratePlanV2 r524 = (BleAICoachGeneratePlanV2) ((BleReadable) r522);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachPlanV2 -> " + r524);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiiXI1iI(r524));     // Catch: Exception -> L17
        Unit r525 = Unit.OXO1;     // Catch: Exception -> L17
        goto L808
    L830:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L833;
    L842:
        if (r11 == false) goto L844;
    L849:
        Unit r526 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L844:
        if (r350 != BleKeyFlag.UPDATE) goto L849;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3985;
        final byte r527 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onAICoachGeneratePlanUpdate -> " + r527);     // Catch: Exception -> L17
        r7.notifyHandlers(new OIii00iX(r527));     // Catch: Exception -> L17
        Unit r528 = Unit.OXO1;     // Catch: Exception -> L17
        goto L849
    L3985:
        return;
    L833:
        if (r350 != BleKeyFlag.READ) goto L842;
        byte r529 = r48[9];     // Catch: Exception -> L17
        if (r529 != 0) goto L837;
        BleReadable.Companion r530 = BleReadable.Companion;     // Catch: Exception -> L17
        int r531 = r48.length;     // Catch: Exception -> L17
        Object r532 = BleAICoachBeforePlan.class.newInstance();     // Catch: Exception -> L17
        BleReadable r533 = (BleReadable) r532;     // Catch: Exception -> L17
        r533.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r531));     // Catch: Exception -> L17
        r533.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r532, "also(...)");     // Catch: Exception -> L17
        final BleAICoachBeforePlan r534 = (BleAICoachBeforePlan) ((BleReadable) r532);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachGenerateBeforeInfo -> " + r534);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOIOOX(r534));     // Catch: Exception -> L17
        Unit r535 = Unit.OXO1;     // Catch: Exception -> L17
    L841:
        Unit r536 = Unit.OXO1;     // Catch: Exception -> L17
        goto L849
    L837:
        if (r529 != 1) goto L841;
        BleReadable.Companion r537 = BleReadable.Companion;     // Catch: Exception -> L17
        int r538 = r48.length;     // Catch: Exception -> L17
        Object r539 = BleAICoachGeneratePlan.class.newInstance();     // Catch: Exception -> L17
        BleReadable r540 = (BleReadable) r539;     // Catch: Exception -> L17
        r540.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r538));     // Catch: Exception -> L17
        r540.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r539, "also(...)");     // Catch: Exception -> L17
        final BleAICoachGeneratePlan r541 = (BleAICoachGeneratePlan) ((BleReadable) r539);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAICoachPlan -> " + r541);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOIiX(r541));     // Catch: Exception -> L17
        Unit r542 = Unit.OXO1;     // Catch: Exception -> L17
        goto L841
    L850:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L853;
    L859:
        Unit r543 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L853:
        if (r350 != BleKeyFlag.UPDATE) goto L859;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r544 = BleReadable.Companion;     // Catch: Exception -> L17
        int r545 = r48.length;     // Catch: Exception -> L17
        Object r546 = BleIPCWifiInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r547 = (BleReadable) r546;     // Catch: Exception -> L17
        r547.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r545));     // Catch: Exception -> L17
        r547.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r546, "also(...)");     // Catch: Exception -> L17
        final BleIPCWifiInfo r548 = (BleIPCWifiInfo) ((BleReadable) r546);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIPCWifiInfoUpdate -> " + r548);     // Catch: Exception -> L17
        BaseBleCache r549 = r7.mBleCache;     // Catch: Exception -> L17
        if (r549 != null) goto L857;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3107 = null;
    L858:
        BaseBleCache.putObject$default(r3107, r346, r548, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IX0O10I(r548));     // Catch: Exception -> L17
        Unit r550 = Unit.OXO1;     // Catch: Exception -> L17
        goto L859
    L857:
        r3107 = r549;
        goto L858
    L860:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L863;
    L869:
        if (r11 == false) goto L871;
    L877:
        Unit r551 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L871:
        if (r350 != BleKeyFlag.UPDATE) goto L877;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r552 = BleReadable.Companion;     // Catch: Exception -> L17
        int r553 = r48.length;     // Catch: Exception -> L17
        Object r554 = BleIPCState.class.newInstance();     // Catch: Exception -> L17
        BleReadable r555 = (BleReadable) r554;     // Catch: Exception -> L17
        r555.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r553));     // Catch: Exception -> L17
        r555.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r554, "also(...)");     // Catch: Exception -> L17
        final BleIPCState r556 = (BleIPCState) ((BleReadable) r554);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIPCStateUpdate -> " + r556);     // Catch: Exception -> L17
        BaseBleCache r557 = r7.mBleCache;     // Catch: Exception -> L17
        if (r557 != null) goto L875;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3108 = null;
    L876:
        BaseBleCache.putObject$default(r3108, r346, r556, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiiXI(r556));     // Catch: Exception -> L17
        Unit r558 = Unit.OXO1;     // Catch: Exception -> L17
        goto L877
    L875:
        r3108 = r557;
        goto L876
    L863:
        if (r350 != BleKeyFlag.READ) goto L869;
        BleReadable.Companion r559 = BleReadable.Companion;     // Catch: Exception -> L17
        int r560 = r48.length;     // Catch: Exception -> L17
        Object r561 = BleIPCState.class.newInstance();     // Catch: Exception -> L17
        BleReadable r562 = (BleReadable) r561;     // Catch: Exception -> L17
        r562.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r560));     // Catch: Exception -> L17
        r562.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r561, "also(...)");     // Catch: Exception -> L17
        final BleIPCState r563 = (BleIPCState) ((BleReadable) r561);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadIPCState -> " + r563);     // Catch: Exception -> L17
        BaseBleCache r564 = r7.mBleCache;     // Catch: Exception -> L17
        if (r564 != null) goto L867;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3109 = null;
    L868:
        BaseBleCache.putObject$default(r3109, r346, r563, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0OO0(r563));     // Catch: Exception -> L17
        Unit r565 = Unit.OXO1;     // Catch: Exception -> L17
        goto L877
    L867:
        r3109 = r564;
        goto L868
    L878:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L881;
    L887:
        Unit r566 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L881:
        if (r350 != BleKeyFlag.READ) goto L887;
        BleReadable.Companion r567 = BleReadable.Companion;     // Catch: Exception -> L17
        int r568 = r48.length;     // Catch: Exception -> L17
        Object r569 = BleSGCameraSet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r570 = (BleReadable) r569;     // Catch: Exception -> L17
        r570.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r568));     // Catch: Exception -> L17
        r570.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r569, "also(...)");     // Catch: Exception -> L17
        final BleSGCameraSet r571 = (BleSGCameraSet) ((BleReadable) r569);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSGCameraSet -> " + r571);     // Catch: Exception -> L17
        BaseBleCache r572 = r7.mBleCache;     // Catch: Exception -> L17
        if (r572 != null) goto L885;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3110 = null;
    L886:
        BaseBleCache.putObject$default(r3110, r346, r571, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IIOX1(r571));     // Catch: Exception -> L17
        Unit r573 = Unit.OXO1;     // Catch: Exception -> L17
        goto L887
    L885:
        r3110 = r572;
        goto L886
    L888:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L891;
    L893:
        Unit r574 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L891:
        if (r350 != BleKeyFlag.UPDATE) goto L893;
        BleReadable.Companion r575 = BleReadable.Companion;     // Catch: Exception -> L17
        int r576 = r48.length;     // Catch: Exception -> L17
        Object r577 = BleAICommand.class.newInstance();     // Catch: Exception -> L17
        BleReadable r578 = (BleReadable) r577;     // Catch: Exception -> L17
        r578.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r576));     // Catch: Exception -> L17
        r578.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r577, "also(...)");     // Catch: Exception -> L17
        final BleAICommand r579 = (BleAICommand) ((BleReadable) r577);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onAICommandUpdate -> " + r579);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOXOOIi(r579));     // Catch: Exception -> L17
        Unit r580 = Unit.OXO1;     // Catch: Exception -> L17
        goto L893
    L894:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L897;
    L899:
        Unit r581 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L897:
        if (r350 != BleKeyFlag.UPDATE) goto L899;
        BleReadable.Companion r582 = BleReadable.Companion;     // Catch: Exception -> L17
        int r583 = r48.length;     // Catch: Exception -> L17
        Object r584 = BleReceiveFilePacket.class.newInstance();     // Catch: Exception -> L17
        BleReadable r585 = (BleReadable) r584;     // Catch: Exception -> L17
        r585.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r583));     // Catch: Exception -> L17
        r585.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r584, "also(...)");     // Catch: Exception -> L17
        final BleReceiveFilePacket r586 = (BleReceiveFilePacket) ((BleReadable) r584);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReceiveFilePacket -> " + r586);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1X0OOiX(r586));     // Catch: Exception -> L17
        Unit r587 = Unit.OXO1;     // Catch: Exception -> L17
        goto L899
    L900:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L903;
    L908:
        Unit r588 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L903:
        if (r350 != BleKeyFlag.UPDATE) goto L908;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3986;
        final byte r589 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDeviceOpUpdate -> " + r589);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiXiO(r589));     // Catch: Exception -> L17
        Unit r590 = Unit.OXO1;     // Catch: Exception -> L17
        goto L908
    L3986:
        return;
    L909:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L912;
    L918:
        Unit r591 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L912:
        if (r350 != BleKeyFlag.READ) goto L918;
        BleReadable.Companion r592 = BleReadable.Companion;     // Catch: Exception -> L17
        int r593 = r48.length;     // Catch: Exception -> L17
        Object r594 = BleAppVersion.class.newInstance();     // Catch: Exception -> L17
        BleReadable r595 = (BleReadable) r594;     // Catch: Exception -> L17
        r595.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r593));     // Catch: Exception -> L17
        r595.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r594, "also(...)");     // Catch: Exception -> L17
        final String r596 = ((BleAppVersion) ((BleReadable) r594)).getMVersion();     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAppApiVersion -> " + r596);     // Catch: Exception -> L17
        BaseBleCache r597 = r7.mBleCache;     // Catch: Exception -> L17
        if (r597 != null) goto L916;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3111 = null;
    L917:
        BaseBleCache.putString$default(r3111, r346, r596, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0OiOO10(r596));     // Catch: Exception -> L17
        Unit r598 = Unit.OXO1;     // Catch: Exception -> L17
        goto L918
    L916:
        r3111 = r597;
        goto L917
    L919:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L922;
    L924:
        Unit r599 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L922:
        if (r350 != BleKeyFlag.UPDATE) goto L924;
        BleReadable.Companion r600 = BleReadable.Companion;     // Catch: Exception -> L17
        int r601 = r48.length;     // Catch: Exception -> L17
        Object r602 = BleGameControl.class.newInstance();     // Catch: Exception -> L17
        BleReadable r603 = (BleReadable) r602;     // Catch: Exception -> L17
        r603.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r601));     // Catch: Exception -> L17
        r603.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r602, "also(...)");     // Catch: Exception -> L17
        final BleGameControl r604 = (BleGameControl) ((BleReadable) r602);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onGameControlUpdate -> " + r604);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0OiIIXX(r604));     // Catch: Exception -> L17
        Unit r605 = Unit.OXO1;     // Catch: Exception -> L17
        goto L924
    L925:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L928;
    L933:
        Unit r606 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L928:
        if (r350 != BleKeyFlag.UPDATE) goto L933;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 41) goto L3987;
        BleReadable.Companion r607 = BleReadable.Companion;     // Catch: Exception -> L17
        int r608 = r48.length;     // Catch: Exception -> L17
        Object r609 = BleMeasurement.class.newInstance();     // Catch: Exception -> L17
        BleReadable r610 = (BleReadable) r609;     // Catch: Exception -> L17
        r610.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r608));     // Catch: Exception -> L17
        r610.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r609, "also(...)");     // Catch: Exception -> L17
        final BleMeasurement r611 = (BleMeasurement) ((BleReadable) r609);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMeasurementUpdate -> " + r611);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXi11iX(r611));     // Catch: Exception -> L17
        Unit r612 = Unit.OXO1;     // Catch: Exception -> L17
        goto L933
    L3987:
        return;
    L935:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        if (r11 == false) goto L938;
    L946:
        r17 = this;
    L947:
        Unit r613 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L938:
        if (r304 != BleKeyFlag.UPDATE) goto L946;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r614 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onHanBaoVibrationStateChange -> " + r614);     // Catch: Exception -> L46
        BaseBleCache r615 = r17.mBleCache;     // Catch: Exception -> L46
        if (r615 != null) goto L944;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3112 = null;
    L945:
        BaseBleCache.putInt$default(r3112, r346, r614, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i10X(r614));     // Catch: Exception -> L46
        goto L947
    L944:
        r3112 = r615;
        goto L945
    L948:
        r346 = r2;
        r11 = r6;
        if (r11 == true) goto L951;
    L961:
        if (r11 == false) goto L963;
    L960:
        r7 = this;
        r350 = r1;
    L966:
        Unit r616 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L963:
        if (r1 != BleKeyFlag.UPDATE) goto L960;
        r350 = r1;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r617 = BleReadable.Companion;     // Catch: Exception -> L17
        int r618 = r48.length;     // Catch: Exception -> L17
        Object r619 = BleAppOp.class.newInstance();     // Catch: Exception -> L17
        BleReadable r620 = (BleReadable) r619;     // Catch: Exception -> L17
        r620.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r618));     // Catch: Exception -> L17
        r620.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r619, "also(...)");     // Catch: Exception -> L17
        final BleAppOp r621 = (BleAppOp) ((BleReadable) r619);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onAppOpUpdate -> " + r621);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOXOX(r621));     // Catch: Exception -> L17
        Unit r622 = Unit.OXO1;     // Catch: Exception -> L17
        goto L966
    L951:
        if (r1 != BleKeyFlag.READ) goto L961;
        BleReadable.Companion r623 = BleReadable.Companion;     // Catch: Exception -> L46
        int r624 = r48.length;     // Catch: Exception -> L46
        Object r625 = BleAppInfoList.class.newInstance();     // Catch: Exception -> L46
        BleReadable r626 = (BleReadable) r625;     // Catch: Exception -> L46
        r626.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r624));     // Catch: Exception -> L46
        r626.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r625, "also(...)");     // Catch: Exception -> L46
        final BleAppInfoList r627 = (BleAppInfoList) ((BleReadable) r625);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadAppInfoList -> " + r627);     // Catch: Exception -> L46
        if (r627.getMList().isEmpty() == true) goto L959;
        BaseBleCache r628 = this.mBleCache;     // Catch: Exception -> L46
        if (r628 != null) goto L957;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3113 = null;
    L958:
        BaseBleCache.putObject$default(r3113, r346, r627, null, 4, null);     // Catch: Exception -> L46
        goto L959
    L957:
        r3113 = r628;
    L959:
        notifyHandlers(new Oi0I111O(r627));     // Catch: Exception -> L46
        Unit r629 = Unit.OXO1;     // Catch: Exception -> L46
        goto L960
    L967:
        final BleKeyFlag r630 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L970;
    L976:
        r2 = r2;
        if (r630 != BleKeyFlag.DELETE) goto L979;
        r7.notifyHandlers(new iOXi0IOO(r2, r630));     // Catch: Exception -> L17
    L979:
        Unit r631 = Unit.OXO1;     // Catch: Exception -> L17
    L980:
        r12 = r630;
        goto L555
    L970:
        if (r630 != BleKeyFlag.READ) goto L976;
        BleReadable.Companion r632 = BleReadable.Companion;     // Catch: Exception -> L17
        int r633 = r48.length;     // Catch: Exception -> L17
        Object r634 = BleAppAudioBookList.class.newInstance();     // Catch: Exception -> L17
        BleReadable r635 = (BleReadable) r634;     // Catch: Exception -> L17
        r635.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r633));     // Catch: Exception -> L17
        r635.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r634, "also(...)");     // Catch: Exception -> L17
        final BleAppAudioBookList r636 = (BleAppAudioBookList) ((BleReadable) r634);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadFilePathList -> " + r636);     // Catch: Exception -> L17
        BaseBleCache r637 = r7.mBleCache;     // Catch: Exception -> L17
        if (r637 != null) goto L974;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3114 = null;
    L975:
        BaseBleCache.putObject$default(r3114, r2, r636, null, 4, null);     // Catch: Exception -> L17
        r2 = r2;
        r7.notifyHandlers(new OX0IO(r636));     // Catch: Exception -> L17
        Unit r638 = Unit.OXO1;     // Catch: Exception -> L17
        goto L979
    L974:
        r3114 = r637;
        goto L975
    L981:
        r350 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L984;
    L994:
        r346 = r2;
        if (r11 == false) goto L997;
    L1003:
        Unit r639 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L997:
        if (r350 != BleKeyFlag.UPDATE) goto L1003;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r640 = BleReadable.Companion;     // Catch: Exception -> L17
        int r641 = r48.length;     // Catch: Exception -> L17
        Object r642 = BleDoubleScreenSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r643 = (BleReadable) r642;     // Catch: Exception -> L17
        r643.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r641));     // Catch: Exception -> L17
        r643.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r642, "also(...)");     // Catch: Exception -> L17
        final BleDoubleScreenSettings r644 = (BleDoubleScreenSettings) ((BleReadable) r642);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDoubleScreenSettingsUpdate -> " + r644);     // Catch: Exception -> L17
        BaseBleCache r645 = r7.mBleCache;     // Catch: Exception -> L17
        if (r645 != null) goto L1001;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3115 = null;
    L1002:
        BaseBleCache.putObject$default(r3115, r346, r644, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XIO1OiiiI(r644));     // Catch: Exception -> L17
        Unit r646 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1003
    L1001:
        r3115 = r645;
        goto L1002
    L984:
        if (r350 != BleKeyFlag.READ) goto L994;
        BleReadable.Companion r647 = BleReadable.Companion;     // Catch: Exception -> L17
        int r648 = r48.length;     // Catch: Exception -> L17
        Object r649 = BleDoubleScreenSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r650 = (BleReadable) r649;     // Catch: Exception -> L17
        r650.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r648));     // Catch: Exception -> L17
        r650.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r649, "also(...)");     // Catch: Exception -> L17
        final BleDoubleScreenSettings r651 = (BleDoubleScreenSettings) ((BleReadable) r649);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDoubleScreenSettings -> " + r651);     // Catch: Exception -> L17
        if (r651.getMEnabled() == 31) goto L992;
        BaseBleCache r652 = r7.mBleCache;     // Catch: Exception -> L17
        if (r652 != null) goto L990;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3116 = null;
    L991:
        r346 = r2;
        BaseBleCache.putObject$default(r3116, r346, r651, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Ii0IiiI(r651));     // Catch: Exception -> L17
    L993:
        Unit r653 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1003
    L990:
        r3116 = r652;
        goto L991
    L992:
        r346 = r2;
        goto L993
    L1004:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1007;
    L1013:
        Unit r654 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1007:
        if (r350 != BleKeyFlag.READ) goto L1013;
        BleReadable.Companion r655 = BleReadable.Companion;     // Catch: Exception -> L17
        int r656 = r48.length;     // Catch: Exception -> L17
        Object r657 = BleSGKeySet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r658 = (BleReadable) r657;     // Catch: Exception -> L17
        r658.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r656));     // Catch: Exception -> L17
        r658.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r657, "also(...)");     // Catch: Exception -> L17
        final BleSGKeySet r659 = (BleSGKeySet) ((BleReadable) r657);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSGKeySet -> " + r659);     // Catch: Exception -> L17
        BaseBleCache r660 = r7.mBleCache;     // Catch: Exception -> L17
        if (r660 != null) goto L1011;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3117 = null;
    L1012:
        BaseBleCache.putObject$default(r3117, r346, r659, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiOiX(r659));     // Catch: Exception -> L17
        Unit r661 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1013
    L1011:
        r3117 = r660;
        goto L1012
    L1014:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1017;
    L1026:
        Unit r662 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1017:
        if (r350 != BleKeyFlag.READ) goto L1026;
        if (r48.length < 10) goto L3988;
        final byte r663 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadOngoingDialogue -> " + r663);     // Catch: Exception -> L17
        BaseBleCache r664 = r7.mBleCache;     // Catch: Exception -> L17
        if (r664 != null) goto L1024;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3118 = null;
    L1025:
        BaseBleCache.putInt$default(r3118, r346, r663, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0XXXiX(r663));     // Catch: Exception -> L17
        Unit r665 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1026
    L1024:
        r3118 = r664;
        goto L1025
    L3988:
        return;
    L1028:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        if (r11 == false) goto L1031;
    L1039:
        r17 = this;
    L1040:
        Unit r666 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L1031:
        if (r304 != BleKeyFlag.UPDATE) goto L1039;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r667 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onSportEndNotifyUpdate -> " + r667);     // Catch: Exception -> L46
        BaseBleCache r668 = r17.mBleCache;     // Catch: Exception -> L46
        if (r668 != null) goto L1037;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3119 = null;
    L1038:
        BaseBleCache.putInt$default(r3119, r346, r667, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new X111I(r667));     // Catch: Exception -> L46
        goto L1040
    L1037:
        r3119 = r668;
        goto L1038
    L1041:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L1044;
    L1050:
        if (r11 == false) goto L1052;
    L1061:
        Unit r669 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L1052:
        if (r304 != BleKeyFlag.UPDATE) goto L1061;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r304 = r304;
        final int r670 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onIncomingCallRingUpdate -> " + r670);     // Catch: Exception -> L46
        BaseBleCache r671 = r17.mBleCache;     // Catch: Exception -> L46
        if (r671 != null) goto L1059;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3120 = null;
    L1060:
        BaseBleCache.putInt$default(r3120, r346, r670, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OOiii1X(r670));     // Catch: Exception -> L46
        goto L1061
    L1059:
        r3120 = r671;
        goto L1060
    L1044:
        if (r304 != BleKeyFlag.READ) goto L1050;
        final int r672 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadIncomingCallRing -> " + r672);     // Catch: Exception -> L46
        BaseBleCache r673 = r17.mBleCache;     // Catch: Exception -> L46
        if (r673 != null) goto L1048;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3121 = null;
    L1049:
        BaseBleCache.putInt$default(r3121, r346, r672, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new I1Ii00Oi(r672));     // Catch: Exception -> L46
        goto L1061
    L1048:
        r3121 = r673;
        goto L1049
    L1062:
        r346 = r2;
        r11 = r6;
        if (r11 == true) goto L1065;
    L1072:
        if (r11 == false) goto L1074;
    L1071:
        r7 = this;
        r350 = r1;
    L1077:
        Unit r674 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1074:
        if (r1 != BleKeyFlag.UPDATE) goto L1071;
        r350 = r1;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r675 = BleReadable.Companion;     // Catch: Exception -> L17
        int r676 = r48.length;     // Catch: Exception -> L17
        Object r677 = BleBacCalibration.class.newInstance();     // Catch: Exception -> L17
        BleReadable r678 = (BleReadable) r677;     // Catch: Exception -> L17
        r678.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r676));     // Catch: Exception -> L17
        r678.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r677, "also(...)");     // Catch: Exception -> L17
        final BleBacCalibration r679 = (BleBacCalibration) ((BleReadable) r677);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData BAC_CALIBRATION update -> " + r679);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1i1XO1II(r679, r350));     // Catch: Exception -> L17
        Unit r680 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1077
    L1065:
        if (r1 != BleKeyFlag.READ) goto L1072;
        BleReadable.Companion r681 = BleReadable.Companion;     // Catch: Exception -> L46
        int r682 = r48.length;     // Catch: Exception -> L46
        Object r683 = BleBacCalibration.class.newInstance();     // Catch: Exception -> L46
        BleReadable r684 = (BleReadable) r683;     // Catch: Exception -> L46
        r684.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r682));     // Catch: Exception -> L46
        r684.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r683, "also(...)");     // Catch: Exception -> L46
        final BleBacCalibration r685 = (BleBacCalibration) ((BleReadable) r683);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData BAC_CALIBRATION read -> " + r685);     // Catch: Exception -> L46
        BaseBleCache r686 = this.mBleCache;     // Catch: Exception -> L46
        if (r686 != null) goto L1069;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3122 = null;
    L1070:
        BaseBleCache.putObject$default(r3122, r346, r685, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new OOO01(r685, r1));     // Catch: Exception -> L46
        Unit r687 = Unit.OXO1;     // Catch: Exception -> L46
        goto L1071
    L1069:
        r3122 = r686;
        goto L1070
    L1078:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1081;
    L1084:
        Unit r688 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1081:
        if (r48.length < 10) goto L3989;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r689 = BleReadable.Companion;     // Catch: Exception -> L17
        int r690 = r48.length;     // Catch: Exception -> L17
        Object r691 = BleLoveTap.class.newInstance();     // Catch: Exception -> L17
        BleReadable r692 = (BleReadable) r691;     // Catch: Exception -> L17
        r692.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r690));     // Catch: Exception -> L17
        r692.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r691, "also(...)");     // Catch: Exception -> L17
        final BleLoveTap r693 = (BleLoveTap) ((BleReadable) r691);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onLoveTapUpdate -> " + r693);     // Catch: Exception -> L17
        r7.notifyHandlers(new OI1OiiX1(r693));     // Catch: Exception -> L17
        Unit r694 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1084
    L3989:
        return;
    L1085:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1088;
    L1091:
        Unit r695 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1088:
        if (r48.length < 10) goto L3990;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r696 = BleReadable.Companion;     // Catch: Exception -> L17
        int r697 = r48.length;     // Catch: Exception -> L17
        Object r698 = BleSMSQuickReply.class.newInstance();     // Catch: Exception -> L17
        BleReadable r699 = (BleReadable) r698;     // Catch: Exception -> L17
        r699.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r697));     // Catch: Exception -> L17
        r699.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r698, "also(...)");     // Catch: Exception -> L17
        final BleSMSQuickReply r700 = (BleSMSQuickReply) ((BleReadable) r698);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDeviceSMSQuickReply -> " + r700);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiI0X(r700));     // Catch: Exception -> L17
        Unit r701 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1091
    L3990:
        return;
    L1092:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r350 != BleKeyFlag.UPDATE) goto L1105;
        if (r11 == true) goto L1097;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
    L1097:
        if (r48.length < 10) goto L3991;
        BleReadable.Companion r702 = BleReadable.Companion;     // Catch: Exception -> L17
        int r703 = r48.length;     // Catch: Exception -> L17
        Object r704 = BleFactoryTest.class.newInstance();     // Catch: Exception -> L17
        BleReadable r705 = (BleReadable) r704;     // Catch: Exception -> L17
        r705.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r703));     // Catch: Exception -> L17
        r705.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r704, "also(...)");     // Catch: Exception -> L17
        final BleFactoryTest r706 = (BleFactoryTest) ((BleReadable) r704);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onFactoryTestUpdate -> " + r706);     // Catch: Exception -> L17
        BaseBleCache r707 = r7.mBleCache;     // Catch: Exception -> L17
        if (r707 != null) goto L1102;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3123 = null;
    L1103:
        BaseBleCache.putObject$default(r3123, r346, r706, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0Oi0OiX1(r706));     // Catch: Exception -> L17
        Unit r708 = Unit.OXO1;     // Catch: Exception -> L17
        return;
    L1102:
        r3123 = r707;
        goto L1103
    L3991:
        return;
    L1105:
        Unit r709 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1106:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1109;
    L1114:
        if (r11 == false) goto L1116;
    L1121:
        Unit r710 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1116:
        if (r350 != BleKeyFlag.UPDATE) goto L1121;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L3993;
        final byte r711 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onClassicBluetoothStateChange -> " + ClassicBluetoothState.INSTANCE.getState(r711));     // Catch: Exception -> L17
        r7.notifyHandlers(new Xiii0(r711));     // Catch: Exception -> L17
        Unit r712 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1121
    L3993:
        return;
    L1109:
        if (r350 != BleKeyFlag.READ) goto L1114;
        if (r48.length < 10) goto L3992;
        final byte r713 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadClassicBluetoothState -> " + ClassicBluetoothState.INSTANCE.getState(r713));     // Catch: Exception -> L17
        r7.notifyHandlers(new iiOX1X(r713));     // Catch: Exception -> L17
        Unit r714 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1121
    L3992:
        return;
    L1122:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1129;
        if (r48.length < 10) goto L3994;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r715 = BleReadable.Companion;     // Catch: Exception -> L17
        int r716 = r48.length;     // Catch: Exception -> L17
        Object r717 = BleAppSportState.class.newInstance();     // Catch: Exception -> L17
        BleReadable r718 = (BleReadable) r717;     // Catch: Exception -> L17
        r718.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r716));     // Catch: Exception -> L17
        r718.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r717, "also(...)");     // Catch: Exception -> L17
        final BleAppSportState r719 = (BleAppSportState) ((BleReadable) r717);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateAppSportState -> " + r719);     // Catch: Exception -> L17
        r7.notifyHandlers(new O01iO1(r719));     // Catch: Exception -> L17
        Unit r720 = Unit.OXO1;     // Catch: Exception -> L17
    L1134:
        Unit r721 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L3994:
        return;
    L1129:
        if (r350 != BleKeyFlag.READ) goto L1134;
        if (r48.length < 10) goto L3995;
        BleReadable.Companion r722 = BleReadable.Companion;     // Catch: Exception -> L17
        int r723 = r48.length;     // Catch: Exception -> L17
        Object r724 = BleAppSportState.class.newInstance();     // Catch: Exception -> L17
        BleReadable r725 = (BleReadable) r724;     // Catch: Exception -> L17
        r725.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r723));     // Catch: Exception -> L17
        r725.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r724, "also(...)");     // Catch: Exception -> L17
        final BleAppSportState r726 = (BleAppSportState) ((BleReadable) r724);     // Catch: Exception -> L17
        r10.IiI10X(BleConnector.INSTANCE.getTAG() + " handleData onReadAppSportState -> " + r726);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiXX(r726));     // Catch: Exception -> L17
        Unit r727 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1134
    L3995:
        return;
    L1135:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1138;
    L1141:
        Unit r728 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1138:
        if (r48.length < 10) goto L3996;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        final byte r729 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIncomingCallResponse -> status=" + r729);     // Catch: Exception -> L17
        r7.notifyHandlers(new IIiIIX0Oi(r729));     // Catch: Exception -> L17
        Unit r730 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1141
    L3996:
        return;
    L1142:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1145;
    L1148:
        Unit r731 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1145:
        if (r48.length < 10) goto L3997;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        final byte r732 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onRequestLocation -> " + WorkoutState.INSTANCE.getState(r732));     // Catch: Exception -> L17
        r7.notifyHandlers(new IOIX1I(r732));     // Catch: Exception -> L17
        Unit r733 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1148
    L3997:
        return;
    L1149:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1152;
    L1154:
        Unit r734 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1152:
        if (r350 != BleKeyFlag.UPDATE) goto L1154;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r735 = BleReadable.Companion;     // Catch: Exception -> L17
        int r736 = r48.length;     // Catch: Exception -> L17
        Object r737 = BleSGTts.class.newInstance();     // Catch: Exception -> L17
        BleReadable r738 = (BleReadable) r737;     // Catch: Exception -> L17
        r738.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r736));     // Catch: Exception -> L17
        r738.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r737, "also(...)");     // Catch: Exception -> L17
        final BleSGTts r739 = (BleSGTts) ((BleReadable) r737);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSGTtsUpdate -> " + r739);     // Catch: Exception -> L17
        r7.notifyHandlers(new OOIIiXi(r739));     // Catch: Exception -> L17
        Unit r740 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1154
    L1155:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1158;
    L1164:
        Unit r741 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1158:
        if (r350 != BleKeyFlag.READ) goto L1164;
        BleReadable.Companion r742 = BleReadable.Companion;     // Catch: Exception -> L17
        int r743 = r48.length;     // Catch: Exception -> L17
        Object r744 = BleSGSet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r745 = (BleReadable) r744;     // Catch: Exception -> L17
        r745.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r743));     // Catch: Exception -> L17
        r745.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r744, "also(...)");     // Catch: Exception -> L17
        final BleSGSet r746 = (BleSGSet) ((BleReadable) r744);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSGSet -> " + r746);     // Catch: Exception -> L17
        BaseBleCache r747 = r7.mBleCache;     // Catch: Exception -> L17
        if (r747 != null) goto L1162;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3124 = null;
    L1163:
        BaseBleCache.putObject$default(r3124, r346, r746, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0iiIO(r746));     // Catch: Exception -> L17
        Unit r748 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1164
    L1162:
        r3124 = r747;
        goto L1163
    L1165:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L1172;
        if (r48.length < 10) goto L3998;
        sendData$default(r7, r346, r304, new byte[]{r48[9]}, true, false, 16, null);     // Catch: Exception -> L17
        final byte r749 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onContactUsStateChange -> " + ContactUsState.INSTANCE.getState(r749));     // Catch: Exception -> L17
        r7.notifyHandlers(new I1001111(r749));     // Catch: Exception -> L17
        Unit r750 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1172
    L3998:
        return;
    L1172:
        Unit r751 = Unit.OXO1;     // Catch: Exception -> L17
        goto L553
    L1173:
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1184;
        if (r48.length >= 11) goto L1179;
        return;
    L1179:
        if (r48[9] != 0) goto L1181;
        final boolean r752 = true;
    L1182:
        final byte r753 = r48[10];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCameraResponse -> status=" + r752 + ", cameraState=" + CameraState.INSTANCE.getState(r753));     // Catch: Exception -> L17
        r7.notifyHandlers(new OIO0011(r752, r753));     // Catch: Exception -> L17
        r350 = r1;
    L1187:
        Unit r754 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1181:
        r752 = false;
        goto L1182
    L1184:
        if (r48.length < 10) goto L4000;
        r350 = r1;
        sendData$default(r7, r346, r350, new byte[]{r48[9]}, true, false, 16, null);     // Catch: Exception -> L17
        final byte r755 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCameraStateChange -> " + CameraState.INSTANCE.getState(r755));     // Catch: Exception -> L17
        r7.notifyHandlers(new X01XX(r755));     // Catch: Exception -> L17
        Unit r756 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1187
    L4000:
        return;
    L1188:
        BleKeyFlag r757 = r1;
        r11 = r6;
        r7 = this;
        if (r757 != BleKeyFlag.READ) goto L1202;
        if (r11 == false) goto L1202;
        BleReadable.Companion r758 = BleReadable.Companion;     // Catch: Exception -> L17
        int r759 = r48.length;     // Catch: Exception -> L17
        final ArrayList r760 = new ArrayList();     // Catch: Exception -> L17
        int r1101 = 9;
        int r761 = (r759 - 9) / BleMatchRecord3.ITEM_LENGTH;     // Catch: Exception -> L17
        if (r761 <= 0) goto L1196;
        int r762 = 0;
    L1194:
        if (r762 >= r761) goto L1196;
        BleReadable.Companion r763 = BleReadable.Companion;     // Catch: Exception -> L17
        int r764 = r1101 + (BleMatchRecord3.ITEM_LENGTH * r762);     // Catch: Exception -> L17
        r762 = r762 + 1;     // Catch: Exception -> L17
        byte[] r765 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r764, r1101 + (BleMatchRecord3.ITEM_LENGTH * r762));     // Catch: Exception -> L17
        int r766 = r765.length;     // Catch: Exception -> L17
        Object r767 = BleMatchRecord3.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1102 = (BleReadable) r767;     // Catch: Exception -> L17
        r1102.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r765, 0, r766));     // Catch: Exception -> L17
        r1102.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r767, "also(...)");     // Catch: Exception -> L17
        r760.add((BleReadable) r767);     // Catch: Exception -> L17
        r1101 = 9;
    L1196:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMatchRecord3 -> " + r760);     // Catch: Exception -> L17
        r8 = r760.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1199;
    L1200:
        r7.notifyHandlers(new XIXO10II(r760));     // Catch: Exception -> L17
    L1201:
        Unit r768 = Unit.OXO1;     // Catch: Exception -> L17
    L1203:
        Unit r769 = Unit.OXO1;     // Catch: Exception -> L17
    L1204:
        r12 = r757;
        r2 = r2;
    L1205:
        r39 = r39;
        goto L3830
    L1199:
        if (r760.isEmpty() == true) goto L1201;
    L1202:
        r8 = 0;
        goto L1203
    L1206:
        r757 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1209;
    L1221:
        r8 = 0;
    L1222:
        Unit r770 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1204
    L1209:
        if (r757 != BleKeyFlag.READ) goto L1221;
        BleReadable.Companion r771 = BleReadable.Companion;     // Catch: Exception -> L17
        int r772 = r48.length;     // Catch: Exception -> L17
        final ArrayList r773 = new ArrayList();     // Catch: Exception -> L17
        int r1103 = 9;
        int r774 = (r772 - 9) / 6;     // Catch: Exception -> L17
        if (r774 <= 0) goto L1215;
        int r775 = 0;
    L1213:
        if (r775 >= r774) goto L1215;
        BleReadable.Companion r776 = BleReadable.Companion;     // Catch: Exception -> L17
        int r777 = r1103 + (6 * r775);     // Catch: Exception -> L17
        r775 = r775 + 1;     // Catch: Exception -> L17
        byte[] r778 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r777, r1103 + (6 * r775));     // Catch: Exception -> L17
        int r779 = r778.length;     // Catch: Exception -> L17
        Object r780 = BleRespiratoryRate.class.newInstance();     // Catch: Exception -> L17
        BleReadable r781 = (BleReadable) r780;     // Catch: Exception -> L17
        r781.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r778, 0, r779));     // Catch: Exception -> L17
        r781.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r780, "also(...)");     // Catch: Exception -> L17
        r773.add((BleReadable) r780);     // Catch: Exception -> L17
        r1103 = 9;
    L1215:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadRespiratoryRate -> " + r773);     // Catch: Exception -> L17
        r8 = r773.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1218;
    L1219:
        r7.notifyHandlers(new iOIXi(r773));     // Catch: Exception -> L17
    L1220:
        Unit r782 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1222
    L1218:
        if (r773.isEmpty() == true) goto L1220;
    L1223:
        BleKeyFlag r1104 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1226;
    L1237:
        if (r11 == false) goto L1239;
    L1249:
        r1104 = r1104;
        BleKey r783 = r2;
        int r784 = 0;
    L1250:
        Unit r785 = Unit.OXO1;     // Catch: Exception -> L17
    L1251:
        r8 = r784;
        r2 = r783;
        r12 = r1104;
        goto L1205
    L1239:
        if (r1104 != BleKeyFlag.UPDATE) goto L1249;
        sendData$default(r7, r2, r1104, null, true, false, 16, null);     // Catch: Exception -> L17
        r783 = r2;
        BleReadable.Companion r786 = BleReadable.Companion;     // Catch: Exception -> L17
        int r787 = r48.length;     // Catch: Exception -> L17
        final ArrayList r788 = new ArrayList();     // Catch: Exception -> L17
        int r1105 = 9;
        int r789 = (r787 - 9) / 16;     // Catch: Exception -> L17
        if (r789 <= 0) goto L1245;
        int r790 = 0;
    L1243:
        if (r790 >= r789) goto L1245;
        BleReadable.Companion r791 = BleReadable.Companion;     // Catch: Exception -> L17
        int r792 = r1105 + (16 * r790);     // Catch: Exception -> L17
        r790 = r790 + 1;     // Catch: Exception -> L17
        byte[] r793 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r792, r1105 + (16 * r790));     // Catch: Exception -> L17
        int r794 = r793.length;     // Catch: Exception -> L17
        Object r795 = BleVitality.class.newInstance();     // Catch: Exception -> L17
        BleReadable r796 = (BleReadable) r795;     // Catch: Exception -> L17
        r796.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r793, 0, r794));     // Catch: Exception -> L17
        r796.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r795, "also(...)");     // Catch: Exception -> L17
        r788.add((BleReadable) r795);     // Catch: Exception -> L17
        r1105 = 9;
    L1245:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadVitalityValue -> " + r788);     // Catch: Exception -> L17
        int r797 = r788.size();     // Catch: Exception -> L17
        if (r788.isEmpty() == true) goto L1248;
        r7.notifyHandlers(new O1Oi0Ii1i(r788));     // Catch: Exception -> L17
    L1248:
        Unit r798 = Unit.OXO1;     // Catch: Exception -> L17
    L1236:
        r784 = r797;
        goto L1250
    L1226:
        if (r1104 != BleKeyFlag.READ) goto L1237;
        BleReadable.Companion r799 = BleReadable.Companion;     // Catch: Exception -> L17
        int r800 = r48.length;     // Catch: Exception -> L17
        final ArrayList r801 = new ArrayList();     // Catch: Exception -> L17
        int r1106 = 9;
        int r802 = (r800 - 9) / 16;     // Catch: Exception -> L17
        if (r802 <= 0) goto L1232;
        int r803 = 0;
    L1230:
        if (r803 >= r802) goto L1232;
        BleReadable.Companion r804 = BleReadable.Companion;     // Catch: Exception -> L17
        int r805 = r1106 + (16 * r803);     // Catch: Exception -> L17
        r803 = r803 + 1;     // Catch: Exception -> L17
        byte[] r806 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r805, r1106 + (16 * r803));     // Catch: Exception -> L17
        int r807 = r806.length;     // Catch: Exception -> L17
        Object r808 = BleVitality.class.newInstance();     // Catch: Exception -> L17
        BleReadable r809 = (BleReadable) r808;     // Catch: Exception -> L17
        r809.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r806, 0, r807));     // Catch: Exception -> L17
        r809.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r808, "also(...)");     // Catch: Exception -> L17
        r801.add((BleReadable) r808);     // Catch: Exception -> L17
        r1106 = 9;
    L1232:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadVitalityValue -> " + r801);     // Catch: Exception -> L17
        r797 = r801.size();     // Catch: Exception -> L17
        if (r801.isEmpty() == true) goto L1235;
        r7.notifyHandlers(new I1O1I11i1(r801));     // Catch: Exception -> L17
    L1235:
        Unit r810 = Unit.OXO1;     // Catch: Exception -> L17
        r783 = r2;
        goto L1236
    L1252:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1255;
    L1267:
        r784 = 0;
    L1268:
        Unit r811 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1255:
        if (r1104 != BleKeyFlag.READ) goto L1267;
        BleReadable.Companion r812 = BleReadable.Companion;     // Catch: Exception -> L17
        int r813 = r48.length;     // Catch: Exception -> L17
        final ArrayList r814 = new ArrayList();     // Catch: Exception -> L17
        int r1107 = 9;
        int r815 = (r813 - 9) / 12;     // Catch: Exception -> L17
        if (r815 <= 0) goto L1261;
        int r816 = 0;
    L1259:
        if (r816 >= r815) goto L1261;
        BleReadable.Companion r817 = BleReadable.Companion;     // Catch: Exception -> L17
        int r818 = r1107 + (12 * r816);     // Catch: Exception -> L17
        r816 = r816 + 1;     // Catch: Exception -> L17
        byte[] r819 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r818, r1107 + (12 * r816));     // Catch: Exception -> L17
        int r820 = r819.length;     // Catch: Exception -> L17
        Object r821 = BleTrainingStatus.class.newInstance();     // Catch: Exception -> L17
        BleReadable r822 = (BleReadable) r821;     // Catch: Exception -> L17
        r822.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r819, 0, r820));     // Catch: Exception -> L17
        r822.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r821, "also(...)");     // Catch: Exception -> L17
        r814.add((BleReadable) r821);     // Catch: Exception -> L17
        r1107 = 9;
    L1261:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadTrainingStatus -> " + r814);     // Catch: Exception -> L17
        int r823 = r814.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1264;
    L1265:
        r7.notifyHandlers(new I00iiX(r814));     // Catch: Exception -> L17
    L1266:
        Unit r824 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r823;
        goto L1268
    L1264:
        if (r814.isEmpty() == true) goto L1266;
    L1269:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1283;
        if (r11 == false) goto L1283;
        BleReadable.Companion r825 = BleReadable.Companion;     // Catch: Exception -> L17
        int r826 = r48.length;     // Catch: Exception -> L17
        final ArrayList r827 = new ArrayList();     // Catch: Exception -> L17
        int r1108 = 9;
        int r828 = (r826 - 9) / 6;     // Catch: Exception -> L17
        if (r828 <= 0) goto L1277;
        int r829 = 0;
    L1275:
        if (r829 >= r828) goto L1277;
        BleReadable.Companion r830 = BleReadable.Companion;     // Catch: Exception -> L17
        int r831 = r1108 + (6 * r829);     // Catch: Exception -> L17
        r829 = r829 + 1;     // Catch: Exception -> L17
        byte[] r832 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r831, r1108 + (6 * r829));     // Catch: Exception -> L17
        int r833 = r832.length;     // Catch: Exception -> L17
        Object r834 = BlePhysicalPower.class.newInstance();     // Catch: Exception -> L17
        BleReadable r835 = (BleReadable) r834;     // Catch: Exception -> L17
        r835.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r832, 0, r833));     // Catch: Exception -> L17
        r835.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r834, "also(...)");     // Catch: Exception -> L17
        r827.add((BleReadable) r834);     // Catch: Exception -> L17
        r1108 = 9;
    L1277:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadDailyPower -> " + r827);     // Catch: Exception -> L17
        int r836 = r827.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1280;
    L1281:
        r7.notifyHandlers(new X00O(r827));     // Catch: Exception -> L17
    L1282:
        Unit r837 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r836;
    L1284:
        Unit r838 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1280:
        if (r827.isEmpty() == true) goto L1282;
    L1283:
        r784 = 0;
        goto L1284
    L1285:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1289;
        if (r11 == false) goto L1289;
        BleReadable.Companion r839 = BleReadable.Companion;     // Catch: Exception -> L17
        int r840 = r48.length;     // Catch: Exception -> L17
        Object r841 = BleECGRealtime.class.newInstance();     // Catch: Exception -> L17
        BleReadable r842 = (BleReadable) r841;     // Catch: Exception -> L17
        r842.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r840));     // Catch: Exception -> L17
        r842.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r841, "also(...)");     // Catch: Exception -> L17
        final BleECGRealtime r843 = (BleECGRealtime) ((BleReadable) r841);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadECGRealtime -> " + r843);     // Catch: Exception -> L17
        int r844 = r843.getMCount();     // Catch: Exception -> L17
        r7.notifyHandlers(new I00X(r843));     // Catch: Exception -> L17
        Unit r845 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r844;
    L1290:
        Unit r846 = Unit.OXO1;     // Catch: Exception -> L17
    L1289:
        r784 = 0;
        goto L1290
    L1291:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1300;
        if (r11 == false) goto L1300;
        BleReadable.Companion r847 = BleReadable.Companion;     // Catch: Exception -> L17
        int r848 = r48.length;     // Catch: Exception -> L17
        final ArrayList r849 = new ArrayList();     // Catch: Exception -> L17
        int r1109 = 9;
        int r850 = (r848 - 9) / 6;     // Catch: Exception -> L17
        if (r850 <= 0) goto L1299;
        int r851 = 0;
    L1297:
        if (r851 >= r850) goto L1299;
        BleReadable.Companion r852 = BleReadable.Companion;     // Catch: Exception -> L17
        int r853 = r1109 + (6 * r851);     // Catch: Exception -> L17
        r851 = r851 + 1;     // Catch: Exception -> L17
        byte[] r854 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r853, r1109 + (6 * r851));     // Catch: Exception -> L17
        int r855 = r854.length;     // Catch: Exception -> L17
        Object r856 = BleEnergyRating.class.newInstance();     // Catch: Exception -> L17
        BleReadable r857 = (BleReadable) r856;     // Catch: Exception -> L17
        r857.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r854, 0, r855));     // Catch: Exception -> L17
        r857.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r856, "also(...)");     // Catch: Exception -> L17
        r849.add((BleReadable) r856);     // Catch: Exception -> L17
        r1109 = 9;
    L1299:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadEnergyRating -> " + r849);     // Catch: Exception -> L17
        int r858 = r849.size();     // Catch: Exception -> L17
        r7.notifyHandlers(new XXX0(r849));     // Catch: Exception -> L17
        Unit r859 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r858;
    L1301:
        Unit r860 = Unit.OXO1;     // Catch: Exception -> L17
    L1300:
        r784 = 0;
        goto L1301
    L1302:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1308;
        if (r11 == false) goto L1308;
        if (r48.length >= 11) goto L1309;
        r10.IiI10X(r7.getTAG() + " handleData onReadWorkout4Segmentation -> []");     // Catch: Exception -> L17
        goto L1308
    L1309:
        BleReadable.Companion r861 = BleReadable.Companion;     // Catch: Exception -> L17
        int r862 = r48.length;     // Catch: Exception -> L17
        Object r863 = BleWorkout4Segmentation.class.newInstance();     // Catch: Exception -> L17
        BleReadable r864 = (BleReadable) r863;     // Catch: Exception -> L17
        r864.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r862));     // Catch: Exception -> L17
        r864.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r863, "also(...)");     // Catch: Exception -> L17
        final BleWorkout4Segmentation r865 = (BleWorkout4Segmentation) ((BleReadable) r863);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWorkout4Segmentation -> " + r865);     // Catch: Exception -> L17
        r7.notifyHandlers(new i00I1O0(r865));     // Catch: Exception -> L17
        Unit r866 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = 1;
    L1310:
        Unit r867 = Unit.OXO1;     // Catch: Exception -> L17
    L1308:
        r784 = 0;
        goto L1310
    L1311:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        BleKeyFlag r868 = BleKeyFlag.READ;     // Catch: Exception -> L17
        if (r1104 != r868) goto L1324;
        if (r11 == false) goto L1324;
        r10.IiI10X(r7.getTAG() + " handleData onReadWorkout4 -> " + r48.length + " , LENGTH_BEFORE_DATA = 9  ");     // Catch: Exception -> L17
        if (r48.length >= 11) goto L1317;
    L1316:
        r784 = 0;
    L1326:
        Unit r869 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1317:
        BleReadable.Companion r870 = BleReadable.Companion;     // Catch: Exception -> L17
        int r871 = r48.length;     // Catch: Exception -> L17
        Object r872 = BleWorkout4.class.newInstance();     // Catch: Exception -> L17
        BleReadable r873 = (BleReadable) r872;     // Catch: Exception -> L17
        r873.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r871));     // Catch: Exception -> L17
        r873.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r872, "also(...)");     // Catch: Exception -> L17
        BleWorkout4 r874 = (BleWorkout4) ((BleReadable) r872);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWorkout4 -> " + r874);     // Catch: Exception -> L17
        final ArrayList r875 = new ArrayList();     // Catch: Exception -> L17
        r875.add(r874);     // Catch: Exception -> L17
        r784 = r875.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1320;
    L1321:
        r7.notifyHandlers(new i10iX1(r875));     // Catch: Exception -> L17
    L1322:
        Unit r876 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1326
    L1320:
        if (r875.isEmpty() == true) goto L1322;
    L1324:
        if (r1104 != BleKeyFlag.UPDATE) goto L1316;
        sendData$default(r7, BleKey.DATA_ALL, r868, null, false, false, 28, null);     // Catch: Exception -> L17
        goto L1316
    L1327:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1341;
        if (r11 == false) goto L1341;
        BleReadable.Companion r877 = BleReadable.Companion;     // Catch: Exception -> L17
        int r878 = r48.length;     // Catch: Exception -> L17
        final ArrayList r879 = new ArrayList();     // Catch: Exception -> L17
        int r1110 = 9;
        int r880 = 2048;
        int r881 = (r878 - 9) / 2048;     // Catch: Exception -> L17
        if (r881 <= 0) goto L1335;
        int r882 = 0;
    L1333:
        if (r882 >= r881) goto L1335;
        BleReadable.Companion r883 = BleReadable.Companion;     // Catch: Exception -> L17
        int r884 = r1110 + (r880 * r882);     // Catch: Exception -> L17
        r882 = r882 + 1;     // Catch: Exception -> L17
        byte[] r885 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r884, r1110 + (r880 * r882));     // Catch: Exception -> L17
        int r886 = r885.length;     // Catch: Exception -> L17
        Object r887 = BleWorkout3.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1111 = (BleReadable) r887;     // Catch: Exception -> L17
        r1111.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r885, 0, r886));     // Catch: Exception -> L17
        r1111.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r887, "also(...)");     // Catch: Exception -> L17
        r879.add((BleReadable) r887);     // Catch: Exception -> L17
        r880 = 2048;
        r1110 = 9;
    L1335:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadWorkout3 -> " + r879);     // Catch: Exception -> L17
        int r888 = r879.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1338;
    L1339:
        r7.notifyHandlers(new I0XXXOiO(r879));     // Catch: Exception -> L17
    L1340:
        Unit r889 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r888;
    L1342:
        Unit r890 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1338:
        if (r879.isEmpty() == true) goto L1340;
    L1341:
        r784 = 0;
        goto L1342
    L1343:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1357;
        if (r11 == false) goto L1357;
        BleReadable.Companion r891 = BleReadable.Companion;     // Catch: Exception -> L17
        int r892 = r48.length;     // Catch: Exception -> L17
        final ArrayList r893 = new ArrayList();     // Catch: Exception -> L17
        int r1112 = 9;
        int r894 = 48;
        int r895 = (r892 - 9) / 48;     // Catch: Exception -> L17
        if (r895 <= 0) goto L1351;
        int r896 = 0;
    L1349:
        if (r896 >= r895) goto L1351;
        BleReadable.Companion r897 = BleReadable.Companion;     // Catch: Exception -> L17
        int r898 = r1112 + (r894 * r896);     // Catch: Exception -> L17
        r896 = r896 + 1;     // Catch: Exception -> L17
        byte[] r899 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r898, r1112 + (r894 * r896));     // Catch: Exception -> L17
        int r900 = r899.length;     // Catch: Exception -> L17
        Object r901 = BleSosCallLog.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1113 = (BleReadable) r901;     // Catch: Exception -> L17
        r1113.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r899, 0, r900));     // Catch: Exception -> L17
        r1113.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r901, "also(...)");     // Catch: Exception -> L17
        r893.add((BleReadable) r901);     // Catch: Exception -> L17
        r894 = 48;
        r1112 = 9;
    L1351:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadSosCallLog -> " + r893);     // Catch: Exception -> L17
        int r902 = r893.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1354;
    L1355:
        r7.notifyHandlers(new XIOOIiI0X(r893));     // Catch: Exception -> L17
    L1356:
        Unit r903 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r902;
    L1358:
        Unit r904 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1354:
        if (r893.isEmpty() == true) goto L1356;
    L1357:
        r784 = 0;
        goto L1358
    L1359:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1373;
        if (r11 == false) goto L1373;
        BleReadable.Companion r905 = BleReadable.Companion;     // Catch: Exception -> L17
        int r906 = r48.length;     // Catch: Exception -> L17
        final ArrayList r907 = new ArrayList();     // Catch: Exception -> L17
        int r1114 = 9;
        int r908 = (r906 - 9) / 8;     // Catch: Exception -> L17
        if (r908 <= 0) goto L1367;
        int r909 = 0;
    L1365:
        if (r909 >= r908) goto L1367;
        BleReadable.Companion r910 = BleReadable.Companion;     // Catch: Exception -> L17
        int r911 = r1114 + (8 * r909);     // Catch: Exception -> L17
        r909 = r909 + 1;     // Catch: Exception -> L17
        byte[] r912 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r911, r1114 + (8 * r909));     // Catch: Exception -> L17
        int r913 = r912.length;     // Catch: Exception -> L17
        Object r914 = BleHanBaoVibration.class.newInstance();     // Catch: Exception -> L17
        BleReadable r915 = (BleReadable) r914;     // Catch: Exception -> L17
        r915.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r912, 0, r913));     // Catch: Exception -> L17
        r915.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r914, "also(...)");     // Catch: Exception -> L17
        r907.add((BleReadable) r914);     // Catch: Exception -> L17
        r1114 = 9;
    L1367:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadHanBaoVibration -> " + r907);     // Catch: Exception -> L17
        int r916 = r907.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1370;
    L1371:
        r7.notifyHandlers(new iI10111O(r907));     // Catch: Exception -> L17
    L1372:
        Unit r917 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r916;
    L1374:
        Unit r918 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1370:
        if (r907.isEmpty() == true) goto L1372;
    L1373:
        r784 = 0;
        goto L1374
    L1375:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1389;
        if (r11 == false) goto L1389;
        BleReadable.Companion r919 = BleReadable.Companion;     // Catch: Exception -> L17
        int r920 = r48.length;     // Catch: Exception -> L17
        final ArrayList r921 = new ArrayList();     // Catch: Exception -> L17
        int r1115 = 9;
        int r922 = (r920 - 9) / 6;     // Catch: Exception -> L17
        if (r922 <= 0) goto L1383;
        int r923 = 0;
    L1381:
        if (r923 >= r922) goto L1383;
        BleReadable.Companion r924 = BleReadable.Companion;     // Catch: Exception -> L17
        int r925 = r1115 + (6 * r923);     // Catch: Exception -> L17
        r923 = r923 + 1;     // Catch: Exception -> L17
        byte[] r926 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r925, r1115 + (6 * r923));     // Catch: Exception -> L17
        int r927 = r926.length;     // Catch: Exception -> L17
        Object r928 = BleEcg.class.newInstance();     // Catch: Exception -> L17
        BleReadable r929 = (BleReadable) r928;     // Catch: Exception -> L17
        r929.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r926, 0, r927));     // Catch: Exception -> L17
        r929.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r928, "also(...)");     // Catch: Exception -> L17
        r921.add((BleReadable) r928);     // Catch: Exception -> L17
        r1115 = 9;
    L1383:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadEcg -> " + r921);     // Catch: Exception -> L17
        int r930 = r921.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1386;
    L1387:
        r7.notifyHandlers(new IX0iXO(r921));     // Catch: Exception -> L17
    L1388:
        Unit r931 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r930;
    L1390:
        Unit r932 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1386:
        if (r921.isEmpty() == true) goto L1388;
    L1389:
        r784 = 0;
        goto L1390
    L1391:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1405;
        if (r11 == false) goto L1405;
        BleReadable.Companion r933 = BleReadable.Companion;     // Catch: Exception -> L17
        int r934 = r48.length;     // Catch: Exception -> L17
        final ArrayList r935 = new ArrayList();     // Catch: Exception -> L17
        int r1116 = 9;
        int r936 = (r934 - 9) / 8;     // Catch: Exception -> L17
        if (r936 <= 0) goto L1399;
        int r937 = 0;
    L1397:
        if (r937 >= r936) goto L1399;
        BleReadable.Companion r938 = BleReadable.Companion;     // Catch: Exception -> L17
        int r939 = r1116 + (8 * r937);     // Catch: Exception -> L17
        r937 = r937 + 1;     // Catch: Exception -> L17
        byte[] r940 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r939, r1116 + (8 * r937));     // Catch: Exception -> L17
        int r941 = r940.length;     // Catch: Exception -> L17
        Object r942 = BleRri.class.newInstance();     // Catch: Exception -> L17
        BleReadable r943 = (BleReadable) r942;     // Catch: Exception -> L17
        r943.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r940, 0, r941));     // Catch: Exception -> L17
        r943.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r942, "also(...)");     // Catch: Exception -> L17
        r935.add((BleReadable) r942);     // Catch: Exception -> L17
        r1116 = 9;
    L1399:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadRri -> " + r935);     // Catch: Exception -> L17
        int r944 = r935.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1402;
    L1403:
        r7.notifyHandlers(new O010O1O1X(r935));     // Catch: Exception -> L17
    L1404:
        Unit r945 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r944;
    L1406:
        Unit r946 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1402:
        if (r935.isEmpty() == true) goto L1404;
    L1405:
        r784 = 0;
        goto L1406
    L1407:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1421;
        if (r11 == false) goto L1421;
        BleReadable.Companion r947 = BleReadable.Companion;     // Catch: Exception -> L17
        int r948 = r48.length;     // Catch: Exception -> L17
        final ArrayList r949 = new ArrayList();     // Catch: Exception -> L17
        int r1117 = 9;
        int r950 = (r948 - 9) / 8;     // Catch: Exception -> L17
        if (r950 <= 0) goto L1415;
        int r951 = 0;
    L1413:
        if (r951 >= r950) goto L1415;
        BleReadable.Companion r952 = BleReadable.Companion;     // Catch: Exception -> L17
        int r953 = r1117 + (8 * r951);     // Catch: Exception -> L17
        r951 = r951 + 1;     // Catch: Exception -> L17
        byte[] r954 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r953, r1117 + (8 * r951));     // Catch: Exception -> L17
        int r955 = r954.length;     // Catch: Exception -> L17
        Object r956 = BleAlipayBindInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r957 = (BleReadable) r956;     // Catch: Exception -> L17
        r957.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r954, 0, r955));     // Catch: Exception -> L17
        r957.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r956, "also(...)");     // Catch: Exception -> L17
        r949.add((BleReadable) r956);     // Catch: Exception -> L17
        r1117 = 9;
    L1415:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadAlipayBindInfo -> " + r949);     // Catch: Exception -> L17
        int r958 = r949.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1418;
    L1419:
        r7.notifyHandlers(new I10IIX(r949));     // Catch: Exception -> L17
    L1420:
        Unit r959 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r958;
    L1422:
        Unit r960 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1418:
        if (r949.isEmpty() == true) goto L1420;
    L1421:
        r784 = 0;
        goto L1422
    L1423:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1437;
        if (r11 == false) goto L1437;
        BleReadable.Companion r961 = BleReadable.Companion;     // Catch: Exception -> L17
        int r962 = r48.length;     // Catch: Exception -> L17
        final ArrayList r963 = new ArrayList();     // Catch: Exception -> L17
        int r1118 = 9;
        int r964 = (r962 - 9) / 8;     // Catch: Exception -> L17
        if (r964 <= 0) goto L1431;
        int r965 = 0;
    L1429:
        if (r965 >= r964) goto L1431;
        BleReadable.Companion r966 = BleReadable.Companion;     // Catch: Exception -> L17
        int r967 = r1118 + (8 * r965);     // Catch: Exception -> L17
        r965 = r965 + 1;     // Catch: Exception -> L17
        byte[] r968 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r967, r1118 + (8 * r965));     // Catch: Exception -> L17
        int r969 = r968.length;     // Catch: Exception -> L17
        Object r970 = BleAvgHeartRate.class.newInstance();     // Catch: Exception -> L17
        BleReadable r971 = (BleReadable) r970;     // Catch: Exception -> L17
        r971.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r968, 0, r969));     // Catch: Exception -> L17
        r971.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r970, "also(...)");     // Catch: Exception -> L17
        r963.add((BleReadable) r970);     // Catch: Exception -> L17
        r1118 = 9;
    L1431:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadAvgHeartRate -> " + r963);     // Catch: Exception -> L17
        int r972 = r963.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1434;
    L1435:
        r7.notifyHandlers(new XOO(r963));     // Catch: Exception -> L17
    L1436:
        Unit r973 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r972;
    L1438:
        Unit r974 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1434:
        if (r963.isEmpty() == true) goto L1436;
    L1437:
        r784 = 0;
        goto L1438
    L1439:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1453;
        if (r11 == false) goto L1453;
        BleReadable.Companion r975 = BleReadable.Companion;     // Catch: Exception -> L17
        int r976 = r48.length;     // Catch: Exception -> L17
        final ArrayList r977 = new ArrayList();     // Catch: Exception -> L17
        int r1119 = 9;
        int r978 = BleMatchRecord2.ITEM_LENGTH;
        int r979 = (r976 - 9) / BleMatchRecord2.ITEM_LENGTH;     // Catch: Exception -> L17
        if (r979 <= 0) goto L1447;
        int r980 = 0;
    L1445:
        if (r980 >= r979) goto L1447;
        BleReadable.Companion r981 = BleReadable.Companion;     // Catch: Exception -> L17
        int r982 = r1119 + (r978 * r980);     // Catch: Exception -> L17
        r980 = r980 + 1;     // Catch: Exception -> L17
        byte[] r983 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r982, r1119 + (r978 * r980));     // Catch: Exception -> L17
        int r984 = r983.length;     // Catch: Exception -> L17
        Object r985 = BleMatchRecord2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1120 = (BleReadable) r985;     // Catch: Exception -> L17
        r1120.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r983, 0, r984));     // Catch: Exception -> L17
        r1120.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r985, "also(...)");     // Catch: Exception -> L17
        r977.add((BleReadable) r985);     // Catch: Exception -> L17
        r978 = BleMatchRecord2.ITEM_LENGTH;
        r1119 = 9;
    L1447:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMatchRecord2 -> " + r977);     // Catch: Exception -> L17
        int r986 = r977.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1450;
    L1451:
        r7.notifyHandlers(new XiO0Oii(r977));     // Catch: Exception -> L17
    L1452:
        Unit r987 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r986;
    L1454:
        Unit r988 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1450:
        if (r977.isEmpty() == true) goto L1452;
    L1453:
        r784 = 0;
        goto L1454
    L1455:
        r1104 = r1;
        r783 = r2;
        r11 = r6;
        r7 = this;
        if (r1104 != BleKeyFlag.READ) goto L1469;
        if (r11 == false) goto L1469;
        BleReadable.Companion r989 = BleReadable.Companion;     // Catch: Exception -> L17
        int r990 = r48.length;     // Catch: Exception -> L17
        final ArrayList r991 = new ArrayList();     // Catch: Exception -> L17
        int r1121 = 9;
        int r992 = (r990 - 9) / 12;     // Catch: Exception -> L17
        if (r992 <= 0) goto L1463;
        int r993 = 0;
    L1461:
        if (r993 >= r992) goto L1463;
        BleReadable.Companion r994 = BleReadable.Companion;     // Catch: Exception -> L17
        int r995 = r1121 + (12 * r993);     // Catch: Exception -> L17
        r993 = r993 + 1;     // Catch: Exception -> L17
        byte[] r996 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r995, r1121 + (12 * r993));     // Catch: Exception -> L17
        int r997 = r996.length;     // Catch: Exception -> L17
        Object r998 = BleBAC.class.newInstance();     // Catch: Exception -> L17
        BleReadable r999 = (BleReadable) r998;     // Catch: Exception -> L17
        r999.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r996, 0, r997));     // Catch: Exception -> L17
        r999.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r998, "also(...)");     // Catch: Exception -> L17
        r991.add((BleReadable) r998);     // Catch: Exception -> L17
        r1121 = 9;
    L1463:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBAC -> " + r991);     // Catch: Exception -> L17
        int r1000 = r991.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1466;
    L1467:
        r7.notifyHandlers(new XXiX(r991));     // Catch: Exception -> L17
    L1468:
        Unit r1001 = Unit.OXO1;     // Catch: Exception -> L17
        r784 = r1000;
    L1470:
        Unit r1002 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1251
    L1466:
        if (r991.isEmpty() == true) goto L1468;
    L1469:
        r784 = 0;
        goto L1470
    L1471:
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1474;
    L1481:
        BleKey r3125 = r2;
        if (r11 == false) goto L1484;
    L1480:
        r630 = r1;
        r2 = r3125;
    L1490:
        Unit r1003 = Unit.OXO1;     // Catch: Exception -> L17
        goto L980
    L1484:
        if (r1 != BleKeyFlag.UPDATE) goto L1480;
        r630 = r1;
        sendData$default(r7, r3125, r630, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1004 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1005 = r48.length;     // Catch: Exception -> L17
        Object r1006 = BleGolfWatchScore.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1007 = (BleReadable) r1006;     // Catch: Exception -> L17
        r1007.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1005));     // Catch: Exception -> L17
        r1007.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1006, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchScore r1008 = (BleGolfWatchScore) ((BleReadable) r1006);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadGolfScore -> " + r1008);     // Catch: Exception -> L17
        BaseBleCache r1009 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1009 != null) goto L1488;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3126 = null;
    L1489:
        BaseBleCache.putObject$default(r3126, r3125, r1008, null, 4, null);     // Catch: Exception -> L17
        r2 = r3125;
        r7.notifyHandlers(new iIiOIi(r1008));     // Catch: Exception -> L17
        Unit r1010 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1490
    L1488:
        r3126 = r1009;
        goto L1489
    L1474:
        if (r1 != BleKeyFlag.READ) goto L1481;
        BleReadable.Companion r1011 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1012 = r48.length;     // Catch: Exception -> L17
        Object r1013 = BleGolfWatchScore.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1014 = (BleReadable) r1013;     // Catch: Exception -> L17
        r1014.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1012));     // Catch: Exception -> L17
        r1014.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1013, "also(...)");     // Catch: Exception -> L17
        final BleGolfWatchScore r1015 = (BleGolfWatchScore) ((BleReadable) r1013);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadGolfScore -> " + r1015);     // Catch: Exception -> L17
        BaseBleCache r1016 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1016 != null) goto L1478;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3127 = null;
    L1479:
        r3125 = r2;
        BaseBleCache.putObject$default(r3127, r3125, r1015, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiiXi(r1015));     // Catch: Exception -> L17
        Unit r1017 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1480
    L1478:
        r3127 = r1016;
        goto L1479
    L1491:
        BleKeyFlag r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1505;
        if (r11 == false) goto L1505;
        BleReadable.Companion r1019 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1020 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1021 = new ArrayList();     // Catch: Exception -> L17
        int r1122 = 9;
        int r1022 = (r1020 - 9) / 12;     // Catch: Exception -> L17
        if (r1022 <= 0) goto L1499;
        int r1023 = 0;
    L1497:
        if (r1023 >= r1022) goto L1499;
        BleReadable.Companion r1024 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1025 = r1122 + (12 * r1023);     // Catch: Exception -> L17
        r1023 = r1023 + 1;     // Catch: Exception -> L17
        byte[] r1026 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1025, r1122 + (12 * r1023));     // Catch: Exception -> L17
        int r1027 = r1026.length;     // Catch: Exception -> L17
        Object r1028 = BleFoodBalance.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1123 = (BleReadable) r1028;     // Catch: Exception -> L17
        r1123.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1026, 0, r1027));     // Catch: Exception -> L17
        r1123.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1028, "also(...)");     // Catch: Exception -> L17
        r1021.add((BleReadable) r1028);     // Catch: Exception -> L17
        r1122 = 9;
    L1499:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadFoodBalance -> " + r1021);     // Catch: Exception -> L17
        r8 = r1021.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1502;
    L1503:
        r7.notifyHandlers(new O0iOI0Xi(r1021));     // Catch: Exception -> L17
    L1504:
        Unit r1029 = Unit.OXO1;     // Catch: Exception -> L17
    L1506:
        Unit r1030 = Unit.OXO1;     // Catch: Exception -> L17
    L1507:
        r12 = r1018;
        goto L1205
    L1502:
        if (r1021.isEmpty() == true) goto L1504;
    L1505:
        r8 = 0;
        goto L1506
    L1508:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1522;
        if (r11 == false) goto L1522;
        BleReadable.Companion r1031 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1032 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1033 = new ArrayList();     // Catch: Exception -> L17
        int r1124 = 9;
        int r1034 = (r1032 - 9) / 12;     // Catch: Exception -> L17
        if (r1034 <= 0) goto L1516;
        int r1035 = 0;
    L1514:
        if (r1035 >= r1034) goto L1516;
        BleReadable.Companion r1036 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1037 = r1124 + (12 * r1035);     // Catch: Exception -> L17
        r1035 = r1035 + 1;     // Catch: Exception -> L17
        byte[] r1038 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1037, r1124 + (12 * r1035));     // Catch: Exception -> L17
        int r1039 = r1038.length;     // Catch: Exception -> L17
        Object r1040 = BleCalorieIntake.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1125 = (BleReadable) r1040;     // Catch: Exception -> L17
        r1125.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1038, 0, r1039));     // Catch: Exception -> L17
        r1125.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1040, "also(...)");     // Catch: Exception -> L17
        r1033.add((BleReadable) r1040);     // Catch: Exception -> L17
        r1124 = 9;
    L1516:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadCalorieIntake -> " + r1033);     // Catch: Exception -> L17
        r8 = r1033.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1519;
    L1520:
        r7.notifyHandlers(new XXi1iIOX(r1033));     // Catch: Exception -> L17
    L1521:
        Unit r1041 = Unit.OXO1;     // Catch: Exception -> L17
    L1523:
        Unit r1042 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1519:
        if (r1033.isEmpty() == true) goto L1521;
    L1522:
        r8 = 0;
        goto L1523
    L1524:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1538;
        if (r11 == false) goto L1538;
        BleReadable.Companion r1043 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1044 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1045 = new ArrayList();     // Catch: Exception -> L17
        int r1126 = 9;
        int r1046 = (r1044 - 9) / 6;     // Catch: Exception -> L17
        if (r1046 <= 0) goto L1532;
        int r1047 = 0;
    L1530:
        if (r1047 >= r1046) goto L1532;
        BleReadable.Companion r1048 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1049 = r1126 + (6 * r1047);     // Catch: Exception -> L17
        r1047 = r1047 + 1;     // Catch: Exception -> L17
        byte[] r1050 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1049, r1126 + (6 * r1047));     // Catch: Exception -> L17
        int r1051 = r1050.length;     // Catch: Exception -> L17
        Object r1052 = BleMindStatus.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1127 = (BleReadable) r1052;     // Catch: Exception -> L17
        r1127.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1050, 0, r1051));     // Catch: Exception -> L17
        r1127.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1052, "also(...)");     // Catch: Exception -> L17
        r1045.add((BleReadable) r1052);     // Catch: Exception -> L17
        r1126 = 9;
    L1532:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMindStatus -> " + r1045);     // Catch: Exception -> L17
        r8 = r1045.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1535;
    L1536:
        r7.notifyHandlers(new i1X10000(r1045));     // Catch: Exception -> L17
    L1537:
        Unit r1053 = Unit.OXO1;     // Catch: Exception -> L17
    L1539:
        Unit r1054 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1535:
        if (r1045.isEmpty() == true) goto L1537;
    L1538:
        r8 = 0;
        goto L1539
    L1540:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1554;
        if (r11 == false) goto L1554;
        BleReadable.Companion r1055 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1056 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1057 = new ArrayList();     // Catch: Exception -> L17
        int r1128 = 9;
        int r1058 = (r1056 - 9) / 6;     // Catch: Exception -> L17
        if (r1058 <= 0) goto L1548;
        int r1059 = 0;
    L1546:
        if (r1059 >= r1058) goto L1548;
        BleReadable.Companion r1060 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1061 = r1128 + (6 * r1059);     // Catch: Exception -> L17
        r1059 = r1059 + 1;     // Catch: Exception -> L17
        byte[] r1062 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1061, r1128 + (6 * r1059));     // Catch: Exception -> L17
        int r1063 = r1062.length;     // Catch: Exception -> L17
        Object r1064 = BleBodyStatus.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1129 = (BleReadable) r1064;     // Catch: Exception -> L17
        r1129.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1062, 0, r1063));     // Catch: Exception -> L17
        r1129.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1064, "also(...)");     // Catch: Exception -> L17
        r1057.add((BleReadable) r1064);     // Catch: Exception -> L17
        r1128 = 9;
    L1548:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBodyStatus -> " + r1057);     // Catch: Exception -> L17
        r8 = r1057.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1551;
    L1552:
        r7.notifyHandlers(new i0X1I(r1057));     // Catch: Exception -> L17
    L1553:
        Unit r1065 = Unit.OXO1;     // Catch: Exception -> L17
    L1555:
        Unit r1066 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1551:
        if (r1057.isEmpty() == true) goto L1553;
    L1554:
        r8 = 0;
        goto L1555
    L1556:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1570;
        if (r11 == false) goto L1570;
        BleReadable.Companion r1067 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1068 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1069 = new ArrayList();     // Catch: Exception -> L17
        int r1130 = 9;
        int r1070 = (r1068 - 9) / 6;     // Catch: Exception -> L17
        if (r1070 <= 0) goto L1564;
        int r1071 = 0;
    L1562:
        if (r1071 >= r1070) goto L1564;
        BleReadable.Companion r1072 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1073 = r1130 + (6 * r1071);     // Catch: Exception -> L17
        r1071 = r1071 + 1;     // Catch: Exception -> L17
        byte[] r1074 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1073, r1130 + (6 * r1071));     // Catch: Exception -> L17
        int r1075 = r1074.length;     // Catch: Exception -> L17
        Object r1076 = BleBloodGlucose.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1131 = (BleReadable) r1076;     // Catch: Exception -> L17
        r1131.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1074, 0, r1075));     // Catch: Exception -> L17
        r1131.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1076, "also(...)");     // Catch: Exception -> L17
        r1069.add((BleReadable) r1076);     // Catch: Exception -> L17
        r1130 = 9;
    L1564:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBloodGlucose -> " + r1069);     // Catch: Exception -> L17
        r8 = r1069.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1567;
    L1568:
        r7.notifyHandlers(new i0100111O(r1069));     // Catch: Exception -> L17
    L1569:
        Unit r1077 = Unit.OXO1;     // Catch: Exception -> L17
    L1571:
        Unit r1078 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1567:
        if (r1069.isEmpty() == true) goto L1569;
    L1570:
        r8 = 0;
        goto L1571
    L1572:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1586;
        if (r11 == false) goto L1586;
        BleReadable.Companion r1079 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1080 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1081 = new ArrayList();     // Catch: Exception -> L17
        int r1132 = 9;
        int r1082 = BleMatchRecord.ITEM_LENGTH;
        int r1083 = (r1080 - 9) / BleMatchRecord.ITEM_LENGTH;     // Catch: Exception -> L17
        if (r1083 <= 0) goto L1580;
        int r1084 = 0;
    L1578:
        if (r1084 >= r1083) goto L1580;
        BleReadable.Companion r1085 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1086 = r1132 + (r1082 * r1084);     // Catch: Exception -> L17
        r1084 = r1084 + 1;     // Catch: Exception -> L17
        byte[] r1087 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1086, r1132 + (r1082 * r1084));     // Catch: Exception -> L17
        int r1088 = r1087.length;     // Catch: Exception -> L17
        Object r1133 = BleMatchRecord.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1134 = (BleReadable) r1133;     // Catch: Exception -> L17
        r1134.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1087, 0, r1088));     // Catch: Exception -> L17
        r1134.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1133, "also(...)");     // Catch: Exception -> L17
        r1081.add((BleReadable) r1133);     // Catch: Exception -> L17
        r1082 = BleMatchRecord.ITEM_LENGTH;
        r1132 = 9;
    L1580:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMatchRecord -> " + r1081);     // Catch: Exception -> L17
        r8 = r1081.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1583;
    L1584:
        r7.notifyHandlers(new iI00I0OO0(r1081));     // Catch: Exception -> L17
    L1585:
        Unit r1089 = Unit.OXO1;     // Catch: Exception -> L17
    L1587:
        Unit r1090 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1583:
        if (r1081.isEmpty() == true) goto L1585;
    L1586:
        r8 = 0;
        goto L1587
    L1588:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1602;
        if (r11 == false) goto L1602;
        BleReadable.Companion r1091 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1092 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1093 = new ArrayList();     // Catch: Exception -> L17
        int r1135 = 9;
        int r1094 = 128;
        int r1095 = (r1092 - 9) / 128;     // Catch: Exception -> L17
        if (r1095 <= 0) goto L1596;
        int r1096 = 0;
    L1594:
        if (r1096 >= r1095) goto L1596;
        BleReadable.Companion r1097 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1098 = r1135 + (r1094 * r1096);     // Catch: Exception -> L17
        r1096 = r1096 + 1;     // Catch: Exception -> L17
        byte[] r1099 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1098, r1135 + (r1094 * r1096));     // Catch: Exception -> L17
        int r1136 = r1099.length;     // Catch: Exception -> L17
        Object r1137 = BleWorkout2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1138 = (BleReadable) r1137;     // Catch: Exception -> L17
        r1138.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1099, 0, r1136));     // Catch: Exception -> L17
        r1138.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1137, "also(...)");     // Catch: Exception -> L17
        r1093.add((BleReadable) r1137);     // Catch: Exception -> L17
        r1094 = 128;
        r1135 = 9;
    L1596:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadWorkout2 -> " + r1093);     // Catch: Exception -> L17
        r8 = r1093.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1599;
    L1600:
        r7.notifyHandlers(new I1I00(r1093));     // Catch: Exception -> L17
    L1601:
        Unit r1139 = Unit.OXO1;     // Catch: Exception -> L17
    L1603:
        Unit r1140 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1599:
        if (r1093.isEmpty() == true) goto L1601;
    L1602:
        r8 = 0;
        goto L1603
    L1604:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1618;
        if (r11 == false) goto L1618;
        BleReadable.Companion r1141 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1142 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1143 = new ArrayList();     // Catch: Exception -> L17
        int r1144 = 9;
        int r1145 = (r1142 - 9) / 6;     // Catch: Exception -> L17
        if (r1145 <= 0) goto L1612;
        int r1146 = 0;
    L1610:
        if (r1146 >= r1145) goto L1612;
        BleReadable.Companion r1147 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1148 = r1144 + (6 * r1146);     // Catch: Exception -> L17
        r1146 = r1146 + 1;     // Catch: Exception -> L17
        byte[] r1149 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1148, r1144 + (6 * r1146));     // Catch: Exception -> L17
        int r1150 = r1149.length;     // Catch: Exception -> L17
        Object r1151 = BlePressure.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1152 = (BleReadable) r1151;     // Catch: Exception -> L17
        r1152.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1149, 0, r1150));     // Catch: Exception -> L17
        r1152.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1151, "also(...)");     // Catch: Exception -> L17
        r1143.add((BleReadable) r1151);     // Catch: Exception -> L17
        r1144 = 9;
    L1612:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadPressure -> " + r1143);     // Catch: Exception -> L17
        r8 = r1143.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1615;
    L1616:
        r7.notifyHandlers(new XXXO(r1143));     // Catch: Exception -> L17
    L1617:
        Unit r1153 = Unit.OXO1;     // Catch: Exception -> L17
    L1619:
        Unit r1154 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1615:
        if (r1143.isEmpty() == true) goto L1617;
    L1618:
        r8 = 0;
        goto L1619
    L1620:
        r630 = r1;
        r11 = r6;
        r7 = this;
        if (r630 != BleKeyFlag.READ) goto L1627;
        if (r11 == false) goto L1627;
        if (r48.length < 10) goto L4001;
        final byte[] r1155 = ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r48.length);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiI0i0OO(r1155));     // Catch: Exception -> L17
        goto L1627
    L4001:
        return;
    L1627:
        Unit r1156 = Unit.OXO1;     // Catch: Exception -> L17
        goto L980
    L1628:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1642;
        if (r11 == false) goto L1642;
        BleReadable.Companion r1157 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1158 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1159 = new ArrayList();     // Catch: Exception -> L17
        int r1160 = 9;
        int r1161 = 64;
        int r1162 = (r1158 - 9) / 64;     // Catch: Exception -> L17
        if (r1162 <= 0) goto L1636;
        int r1163 = 0;
    L1634:
        if (r1163 >= r1162) goto L1636;
        BleReadable.Companion r1164 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1165 = r1160 + (r1161 * r1163);     // Catch: Exception -> L17
        r1163 = r1163 + 1;     // Catch: Exception -> L17
        byte[] r1166 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1165, r1160 + (r1161 * r1163));     // Catch: Exception -> L17
        int r1167 = r1166.length;     // Catch: Exception -> L17
        Object r1168 = BleLogText.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1169 = (BleReadable) r1168;     // Catch: Exception -> L17
        r1169.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1166, 0, r1167));     // Catch: Exception -> L17
        r1169.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1168, "also(...)");     // Catch: Exception -> L17
        r1159.add((BleReadable) r1168);     // Catch: Exception -> L17
        r1161 = 64;
        r1160 = 9;
    L1636:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBleLogText -> " + r1159);     // Catch: Exception -> L17
        r8 = r1159.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1639;
    L1640:
        r7.notifyHandlers(new XX1i(r1159));     // Catch: Exception -> L17
    L1641:
        Unit r1170 = Unit.OXO1;     // Catch: Exception -> L17
    L1643:
        Unit r1171 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1639:
        if (r1159.isEmpty() == true) goto L1641;
    L1642:
        r8 = 0;
        goto L1643
    L1644:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1658;
        if (r11 == false) goto L1658;
        BleReadable.Companion r1172 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1173 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1174 = new ArrayList();     // Catch: Exception -> L17
        int r1175 = 9;
        int r1176 = (r1173 - 9) / 6;     // Catch: Exception -> L17
        if (r1176 <= 0) goto L1652;
        int r1177 = 0;
    L1650:
        if (r1177 >= r1176) goto L1652;
        BleReadable.Companion r1178 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1179 = r1175 + (6 * r1177);     // Catch: Exception -> L17
        r1177 = r1177 + 1;     // Catch: Exception -> L17
        byte[] r1180 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1179, r1175 + (6 * r1177));     // Catch: Exception -> L17
        int r1181 = r1180.length;     // Catch: Exception -> L17
        Object r1182 = BleHrv.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1183 = (BleReadable) r1182;     // Catch: Exception -> L17
        r1183.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1180, 0, r1181));     // Catch: Exception -> L17
        r1183.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1182, "also(...)");     // Catch: Exception -> L17
        r1174.add((BleReadable) r1182);     // Catch: Exception -> L17
        r1175 = 9;
    L1652:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBleHrv -> " + r1174);     // Catch: Exception -> L17
        r8 = r1174.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1655;
    L1656:
        r7.notifyHandlers(new I1iO1XIO(r1174));     // Catch: Exception -> L17
    L1657:
        Unit r1184 = Unit.OXO1;     // Catch: Exception -> L17
    L1659:
        Unit r1185 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1655:
        if (r1174.isEmpty() == true) goto L1657;
    L1658:
        r8 = 0;
        goto L1659
    L1660:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1674;
        if (r11 == false) goto L1674;
        BleReadable.Companion r1186 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1187 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1188 = new ArrayList();     // Catch: Exception -> L17
        int r1189 = 9;
        int r1190 = (r1187 - 9) / 6;     // Catch: Exception -> L17
        if (r1190 <= 0) goto L1668;
        int r1191 = 0;
    L1666:
        if (r1191 >= r1190) goto L1668;
        BleReadable.Companion r1192 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1193 = r1189 + (6 * r1191);     // Catch: Exception -> L17
        r1191 = r1191 + 1;     // Catch: Exception -> L17
        byte[] r1194 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1193, r1189 + (6 * r1191));     // Catch: Exception -> L17
        int r1195 = r1194.length;     // Catch: Exception -> L17
        Object r1196 = BleBloodOxygen.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1197 = (BleReadable) r1196;     // Catch: Exception -> L17
        r1197.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1194, 0, r1195));     // Catch: Exception -> L17
        r1197.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1196, "also(...)");     // Catch: Exception -> L17
        r1188.add((BleReadable) r1196);     // Catch: Exception -> L17
        r1189 = 9;
    L1668:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBloodOxygen -> " + r1188);     // Catch: Exception -> L17
        r8 = r1188.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1671;
    L1672:
        r7.notifyHandlers(new O0001iIIi(r1188));     // Catch: Exception -> L17
    L1673:
        Unit r1198 = Unit.OXO1;     // Catch: Exception -> L17
    L1675:
        Unit r1199 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1671:
        if (r1188.isEmpty() == true) goto L1673;
    L1674:
        r8 = 0;
        goto L1675
    L1676:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1690;
        if (r11 == false) goto L1690;
        BleReadable.Companion r1200 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1201 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1202 = new ArrayList();     // Catch: Exception -> L17
        int r1203 = 9;
        int r1204 = (r1201 - 9) / 6;     // Catch: Exception -> L17
        if (r1204 <= 0) goto L1684;
        int r1205 = 0;
    L1682:
        if (r1205 >= r1204) goto L1684;
        BleReadable.Companion r1206 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1207 = r1203 + (6 * r1205);     // Catch: Exception -> L17
        r1205 = r1205 + 1;     // Catch: Exception -> L17
        byte[] r1208 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1207, r1203 + (6 * r1205));     // Catch: Exception -> L17
        int r1209 = r1208.length;     // Catch: Exception -> L17
        Object r1210 = BleTemperature.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1211 = (BleReadable) r1210;     // Catch: Exception -> L17
        r1211.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1208, 0, r1209));     // Catch: Exception -> L17
        r1211.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1210, "also(...)");     // Catch: Exception -> L17
        r1202.add((BleReadable) r1210);     // Catch: Exception -> L17
        r1203 = 9;
    L1684:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadTemperature -> " + r1202);     // Catch: Exception -> L17
        r8 = r1202.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1687;
    L1688:
        r7.notifyHandlers(new OXI0I(r1202));     // Catch: Exception -> L17
    L1689:
        Unit r1212 = Unit.OXO1;     // Catch: Exception -> L17
    L1691:
        Unit r1213 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1687:
        if (r1202.isEmpty() == true) goto L1689;
    L1690:
        r8 = 0;
        goto L1691
    L1692:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1706;
        if (r11 == false) goto L1706;
        BleReadable.Companion r1214 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1215 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1216 = new ArrayList();     // Catch: Exception -> L17
        int r1217 = 9;
        int r1218 = (r1215 - 9) / 16;     // Catch: Exception -> L17
        if (r1218 <= 0) goto L1700;
        int r1219 = 0;
    L1698:
        if (r1219 >= r1218) goto L1700;
        BleReadable.Companion r1220 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1221 = r1217 + (16 * r1219);     // Catch: Exception -> L17
        r1219 = r1219 + 1;     // Catch: Exception -> L17
        byte[] r1222 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1221, r1217 + (16 * r1219));     // Catch: Exception -> L17
        int r1223 = r1222.length;     // Catch: Exception -> L17
        Object r1224 = BleLocation.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1225 = (BleReadable) r1224;     // Catch: Exception -> L17
        r1225.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1222, 0, r1223));     // Catch: Exception -> L17
        r1225.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1224, "also(...)");     // Catch: Exception -> L17
        r1216.add((BleReadable) r1224);     // Catch: Exception -> L17
        r1217 = 9;
    L1700:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadLocation -> " + r1216);     // Catch: Exception -> L17
        r8 = r1216.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1703;
    L1704:
        r7.notifyHandlers(new I1iXIi0iI(r1216));     // Catch: Exception -> L17
    L1705:
        Unit r1226 = Unit.OXO1;     // Catch: Exception -> L17
    L1707:
        Unit r1227 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1703:
        if (r1216.isEmpty() == true) goto L1705;
    L1706:
        r8 = 0;
        goto L1707
    L1708:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1722;
        if (r11 == false) goto L1722;
        BleReadable.Companion r1228 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1229 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1230 = new ArrayList();     // Catch: Exception -> L17
        int r1231 = 9;
        int r1232 = 48;
        int r1233 = (r1229 - 9) / 48;     // Catch: Exception -> L17
        if (r1233 <= 0) goto L1716;
        int r1234 = 0;
    L1714:
        if (r1234 >= r1233) goto L1716;
        BleReadable.Companion r1235 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1236 = r1231 + (r1232 * r1234);     // Catch: Exception -> L17
        r1234 = r1234 + 1;     // Catch: Exception -> L17
        byte[] r1237 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1236, r1231 + (r1232 * r1234));     // Catch: Exception -> L17
        int r1238 = r1237.length;     // Catch: Exception -> L17
        Object r1239 = BleWorkout.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1240 = (BleReadable) r1239;     // Catch: Exception -> L17
        r1240.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1237, 0, r1238));     // Catch: Exception -> L17
        r1240.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1239, "also(...)");     // Catch: Exception -> L17
        r1230.add((BleReadable) r1239);     // Catch: Exception -> L17
        r1232 = 48;
        r1231 = 9;
    L1716:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadWorkout -> " + r1230);     // Catch: Exception -> L17
        r8 = r1230.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1719;
    L1720:
        r7.notifyHandlers(new iXiI1Ii(r1230));     // Catch: Exception -> L17
    L1721:
        Unit r1241 = Unit.OXO1;     // Catch: Exception -> L17
    L1723:
        Unit r1242 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1719:
        if (r1230.isEmpty() == true) goto L1721;
    L1722:
        r8 = 0;
        goto L1723
    L1724:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1738;
        if (r11 == false) goto L1738;
        BleReadable.Companion r1243 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1244 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1245 = new ArrayList();     // Catch: Exception -> L17
        int r1246 = 9;
        int r1247 = 7;
        int r1248 = (r1244 - 9) / 7;     // Catch: Exception -> L17
        if (r1248 <= 0) goto L1732;
        int r1249 = 0;
    L1730:
        if (r1249 >= r1248) goto L1732;
        BleReadable.Companion r1250 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1251 = r1246 + (r1247 * r1249);     // Catch: Exception -> L17
        r1249 = r1249 + 1;     // Catch: Exception -> L17
        byte[] r1252 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1251, r1246 + (r1247 * r1249));     // Catch: Exception -> L17
        int r1253 = r1252.length;     // Catch: Exception -> L17
        Object r1254 = BleSleep.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1255 = (BleReadable) r1254;     // Catch: Exception -> L17
        r1255.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1252, 0, r1253));     // Catch: Exception -> L17
        r1255.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1254, "also(...)");     // Catch: Exception -> L17
        r1245.add((BleReadable) r1254);     // Catch: Exception -> L17
        r1247 = 7;
        r1246 = 9;
    L1732:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadSleep -> " + r1245);     // Catch: Exception -> L17
        r8 = r1245.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1735;
    L1736:
        r7.notifyHandlers(new OO00Ii0(r1245));     // Catch: Exception -> L17
    L1737:
        Unit r1256 = Unit.OXO1;     // Catch: Exception -> L17
    L1739:
        Unit r1257 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1735:
        if (r1245.isEmpty() == true) goto L1737;
    L1738:
        r8 = 0;
        goto L1739
    L1740:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1754;
        if (r11 == false) goto L1754;
        BleReadable.Companion r1258 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1259 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1260 = new ArrayList();     // Catch: Exception -> L17
        int r1261 = 9;
        int r1262 = (r1259 - 9) / 6;     // Catch: Exception -> L17
        if (r1262 <= 0) goto L1748;
        int r1263 = 0;
    L1746:
        if (r1263 >= r1262) goto L1748;
        BleReadable.Companion r1264 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1265 = r1261 + (6 * r1263);     // Catch: Exception -> L17
        r1263 = r1263 + 1;     // Catch: Exception -> L17
        byte[] r1266 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1265, r1261 + (6 * r1263));     // Catch: Exception -> L17
        int r1267 = r1266.length;     // Catch: Exception -> L17
        Object r1268 = BleBloodPressure.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1269 = (BleReadable) r1268;     // Catch: Exception -> L17
        r1269.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1266, 0, r1267));     // Catch: Exception -> L17
        r1269.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1268, "also(...)");     // Catch: Exception -> L17
        r1260.add((BleReadable) r1268);     // Catch: Exception -> L17
        r1261 = 9;
    L1748:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadBloodPressure -> " + r1260);     // Catch: Exception -> L17
        r8 = r1260.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1751;
    L1752:
        r7.notifyHandlers(new XOIiI0(r1260));     // Catch: Exception -> L17
    L1753:
        Unit r1270 = Unit.OXO1;     // Catch: Exception -> L17
    L1755:
        Unit r1271 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1751:
        if (r1260.isEmpty() == true) goto L1753;
    L1754:
        r8 = 0;
        goto L1755
    L1756:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1770;
        if (r11 == false) goto L1770;
        BleReadable.Companion r1272 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1273 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1274 = new ArrayList();     // Catch: Exception -> L17
        int r1275 = 9;
        int r1276 = (r1273 - 9) / 6;     // Catch: Exception -> L17
        if (r1276 <= 0) goto L1764;
        int r1277 = 0;
    L1762:
        if (r1277 >= r1276) goto L1764;
        BleReadable.Companion r1278 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1279 = r1275 + (6 * r1277);     // Catch: Exception -> L17
        r1277 = r1277 + 1;     // Catch: Exception -> L17
        byte[] r1280 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1279, r1275 + (6 * r1277));     // Catch: Exception -> L17
        int r1281 = r1280.length;     // Catch: Exception -> L17
        Object r1282 = BleHeartRate.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1283 = (BleReadable) r1282;     // Catch: Exception -> L17
        r1283.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1280, 0, r1281));     // Catch: Exception -> L17
        r1283.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1282, "also(...)");     // Catch: Exception -> L17
        r1274.add((BleReadable) r1282);     // Catch: Exception -> L17
        r1275 = 9;
    L1764:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadHeartRate -> " + r1274);     // Catch: Exception -> L17
        r8 = r1274.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1767;
    L1768:
        r7.notifyHandlers(new O0IiI(r1274));     // Catch: Exception -> L17
    L1769:
        Unit r1284 = Unit.OXO1;     // Catch: Exception -> L17
    L1771:
        Unit r1285 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1767:
        if (r1274.isEmpty() == true) goto L1769;
    L1770:
        r8 = 0;
        goto L1771
    L1772:
        r1018 = r1;
        r11 = r6;
        r7 = this;
        if (r1018 != BleKeyFlag.READ) goto L1786;
        if (r11 == false) goto L1786;
        BleReadable.Companion r1286 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1287 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1288 = new ArrayList();     // Catch: Exception -> L17
        int r1289 = 9;
        int r1290 = (r1287 - 9) / 16;     // Catch: Exception -> L17
        if (r1290 <= 0) goto L1780;
        int r1291 = 0;
    L1778:
        if (r1291 >= r1290) goto L1780;
        BleReadable.Companion r1292 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1293 = r1289 + (16 * r1291);     // Catch: Exception -> L17
        r1291 = r1291 + 1;     // Catch: Exception -> L17
        byte[] r1294 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1293, r1289 + (16 * r1291));     // Catch: Exception -> L17
        int r1295 = r1294.length;     // Catch: Exception -> L17
        Object r1296 = BleActivity.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1297 = (BleReadable) r1296;     // Catch: Exception -> L17
        r1297.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1294, 0, r1295));     // Catch: Exception -> L17
        r1297.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1296, "also(...)");     // Catch: Exception -> L17
        r1288.add((BleReadable) r1296);     // Catch: Exception -> L17
        r1289 = 9;
    L1780:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadActivity -> " + r1288);     // Catch: Exception -> L17
        r8 = r1288.size();     // Catch: Exception -> L17
        if (r7.mSupportFilterEmpty == true) goto L1783;
    L1784:
        r7.notifyHandlers(new X1OO0(r1288));     // Catch: Exception -> L17
    L1785:
        Unit r1298 = Unit.OXO1;     // Catch: Exception -> L17
    L1787:
        Unit r1299 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1507
    L1783:
        if (r1288.isEmpty() == true) goto L1785;
    L1786:
        r8 = 0;
        goto L1787
    L1788:
        r350 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1791;
    L1797:
        r346 = r2;
    L1798:
        Unit r1300 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1791:
        if (r350 != BleKeyFlag.READ) goto L1797;
        BleReadable.Companion r1301 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1302 = r48.length;     // Catch: Exception -> L17
        Object r1303 = BleOfflineAsrSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1304 = (BleReadable) r1303;     // Catch: Exception -> L17
        r1304.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1302));     // Catch: Exception -> L17
        r1304.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1303, "also(...)");     // Catch: Exception -> L17
        final BleOfflineAsrSettings r1305 = (BleOfflineAsrSettings) ((BleReadable) r1303);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadOfflineAsrSettings -> " + r1305);     // Catch: Exception -> L17
        BaseBleCache r1306 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1306 != null) goto L1795;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3128 = null;
    L1796:
        r346 = r2;
        BaseBleCache.putObject$default(r3128, r346, r1305, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IX110X(r1305));     // Catch: Exception -> L17
        Unit r1307 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1798
    L1795:
        r3128 = r1306;
        goto L1796
    L1799:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1802;
    L1808:
        Unit r1308 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1802:
        if (r350 != BleKeyFlag.UPDATE) goto L1808;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1309 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1310 = r48.length;     // Catch: Exception -> L17
        Object r1311 = BleBandKey.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1312 = (BleReadable) r1311;     // Catch: Exception -> L17
        r1312.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1310));     // Catch: Exception -> L17
        r1312.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1311, "also(...)");     // Catch: Exception -> L17
        final BleBandKey r1313 = (BleBandKey) ((BleReadable) r1311);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBandKeyUpdate -> " + r1313);     // Catch: Exception -> L17
        BaseBleCache r1314 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1314 != null) goto L1806;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3129 = null;
    L1807:
        BaseBleCache.putObject$default(r3129, r346, r1313, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiXOIOXOX(r1313));     // Catch: Exception -> L17
        Unit r1315 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1808
    L1806:
        r3129 = r1314;
        goto L1807
    L1809:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == true) goto L1812;
    L1819:
        Unit r1316 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1812:
        if (r350 != BleKeyFlag.UPDATE) goto L1819;
        BleReadable.Companion r1317 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1318 = r48.length;     // Catch: Exception -> L17
        Object r1319 = BleXMLYBandSet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1320 = (BleReadable) r1319;     // Catch: Exception -> L17
        r1320.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1318));     // Catch: Exception -> L17
        r1320.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1319, "also(...)");     // Catch: Exception -> L17
        final BleXMLYBandSet r1321 = (BleXMLYBandSet) ((BleReadable) r1319);     // Catch: Exception -> L17
        r10.OXO1(r7.getTAG() + " handleData onXMLYBandSetUpdate -> " + r1321);     // Catch: Exception -> L17
        BaseBleCache r1322 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1322 != null) goto L1816;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3130 = null;
    L1817:
        BaseBleCache.putObject$default(r3130, r346, r1321, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XO0OX(r1321));     // Catch: Exception -> L17
        Unit r1323 = Unit.OXO1;     // Catch: Exception -> L17
        return;
    L1816:
        r3130 = r1322;
        goto L1817
    L1820:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1823;
    L1829:
        Unit r1324 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1823:
        if (r350 != BleKeyFlag.UPDATE) goto L1829;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1325 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1326 = r48.length;     // Catch: Exception -> L17
        Object r1327 = BleSleepNotify.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1328 = (BleReadable) r1327;     // Catch: Exception -> L17
        r1328.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1326));     // Catch: Exception -> L17
        r1328.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1327, "also(...)");     // Catch: Exception -> L17
        final BleSleepNotify r1329 = (BleSleepNotify) ((BleReadable) r1327);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSleepNotifyUpdate -> " + r1329);     // Catch: Exception -> L17
        BaseBleCache r1330 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1330 != null) goto L1827;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3131 = null;
    L1828:
        BaseBleCache.putObject$default(r3131, r346, r1329, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X00i0X(r1329));     // Catch: Exception -> L17
        Unit r1331 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1829
    L1827:
        r3131 = r1330;
        goto L1828
    L1830:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1833;
    L1835:
        Unit r1332 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1833:
        if (r350 != BleKeyFlag.UPDATE) goto L1835;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1333 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1334 = r48.length;     // Catch: Exception -> L17
        Object r1335 = BleCPGiftsInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1336 = (BleReadable) r1335;     // Catch: Exception -> L17
        r1336.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1334));     // Catch: Exception -> L17
        r1336.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1335, "also(...)");     // Catch: Exception -> L17
        final BleCPGiftsInfo r1337 = (BleCPGiftsInfo) ((BleReadable) r1335);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCPGiftsInfoUpdate -> " + r1337);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0IO1i(r1337));     // Catch: Exception -> L17
        Unit r1338 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1835
    L1836:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r350 != BleKeyFlag.UPDATE) goto L1841;
        if (r11 == true) goto L1840;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
    L1840:
        BleReadable.Companion r1339 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1340 = r48.length;     // Catch: Exception -> L17
        Object r1341 = BleChatVoice.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1342 = (BleReadable) r1341;     // Catch: Exception -> L17
        r1342.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1340));     // Catch: Exception -> L17
        r1342.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1341, "also(...)");     // Catch: Exception -> L17
        final BleChatVoice r1343 = (BleChatVoice) ((BleReadable) r1341);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onChatVoiceUpdate -> " + r1343);     // Catch: Exception -> L17
        r7.notifyHandlers(new OOi1I(r1343));     // Catch: Exception -> L17
        Unit r1344 = Unit.OXO1;     // Catch: Exception -> L17
    L1841:
        Unit r1345 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1842:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1845;
    L1847:
        Unit r1346 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1845:
        if (r350 != BleKeyFlag.UPDATE) goto L1847;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1347 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1348 = r48.length;     // Catch: Exception -> L17
        Object r1349 = BleChatMessage.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1350 = (BleReadable) r1349;     // Catch: Exception -> L17
        r1350.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1348));     // Catch: Exception -> L17
        r1350.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1349, "also(...)");     // Catch: Exception -> L17
        final BleChatMessage r1351 = (BleChatMessage) ((BleReadable) r1349);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onChatMessageUpdate -> " + r1351);     // Catch: Exception -> L17
        r7.notifyHandlers(new iiOXOII1(r1351));     // Catch: Exception -> L17
        Unit r1352 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1847
    L1848:
        r350 = r1;
        r346 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1863;
        if (r350 != BleKeyFlag.READ) goto L1897;
        BleReadable.Companion r1353 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1354 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1355 = new ArrayList();     // Catch: Exception -> L17
        int r1356 = 9;
        int r1357 = (r1354 - 9) / 84;     // Catch: Exception -> L17
        if (r1357 <= 0) goto L1857;
        int r1358 = 0;
    L1855:
        if (r1358 >= r1357) goto L1857;
        BleReadable.Companion r1359 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1360 = r1356 + (84 * r1358);     // Catch: Exception -> L17
        r1358 = r1358 + 1;     // Catch: Exception -> L17
        byte[] r1361 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1360, r1356 + (84 * r1358));     // Catch: Exception -> L17
        int r1362 = r1361.length;     // Catch: Exception -> L17
        Object r1363 = BleStock.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1364 = (BleReadable) r1363;     // Catch: Exception -> L17
        r1364.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1361, 0, r1362));     // Catch: Exception -> L17
        r1364.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1363, "also(...)");     // Catch: Exception -> L17
        r1355.add((BleReadable) r1363);     // Catch: Exception -> L17
        r1356 = 9;
    L1857:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadStock -> " + r1355);     // Catch: Exception -> L17
        BaseBleCache r1365 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1365 != null) goto L1860;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3132 = null;
    L1861:
        BaseBleCache.putList$default(r3132, r346, r1355, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0iiX11(r1355));     // Catch: Exception -> L17
        Unit r1366 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1897
    L1860:
        r3132 = r1365;
    L1897:
        Unit r1367 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L1863:
        if (r350 == BleKeyFlag.DELETE) goto L1865;
        BaseBleConnector r1368 = r7;
        BleKeyFlag r1369 = r350;
        if (r1369 == BleKeyFlag.READ) goto L1895;
    L1892:
        r7 = r1368;
        r350 = r1369;
        goto L1897
    L1895:
        r350 = r1369;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadStock -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new XOXO());     // Catch: Exception -> L17
        goto L1897
    L1865:
        if (r48.length < 10) goto L4002;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L50
        r1368 = r7;
        r1369 = r350;
        final int r1370 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r1371 = r1368.mBleCache;     // Catch: Exception -> L46
        if (r1371 != null) goto L1872;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3133 = null;
    L1873:
        List r1372 = BaseBleCache.getList$default(r3133, r346, BleStock.class, null, 4, null);     // Catch: Exception -> L46
        if (r1370 != 255) goto L1876;
        r1372.clear();     // Catch: Exception -> L46
    L1887:
        BaseBleCache r1373 = r1368.mBleCache;     // Catch: Exception -> L46
        if (r1373 != null) goto L1890;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3134 = null;
    L1891:
        BaseBleCache.putList$default(r3134, r346, r1372, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r1368.getTAG() + " handleData onStockDelete -> " + r1370);     // Catch: Exception -> L46
        r1368.notifyHandlers(new I0iI1X1I(r1370));     // Catch: Exception -> L46
        goto L1892
    L1890:
        r3134 = r1373;
        goto L1891
    L1876:
        Iterator r1374 = r1372.iterator();     // Catch: Exception -> L46
        int r1375 = 0;
    L1878:
        if (r1374.hasNext() == false) goto L1884;
        if (((BleStock) r1374.next()).getMId() == r1370) goto L1881;
        r1375 = r1375 + 1;     // Catch: Exception -> L46
        goto L1878
    L1881:
        int r1376 = r1375;
    L1885:
        if (r1376 <= (-1)) goto L1887;
        r1372.remove(r1376);     // Catch: Exception -> L46
        goto L1887
    L1884:
        r1376 = -1;
        goto L1885
    L1872:
        r3133 = r1371;
        goto L1873
    L4002:
        return;
    L1898:
        r304 = r1;
        r346 = r2;
        r11 = r6;
        if (r11 == false) goto L1914;
        if (r304 != BleKeyFlag.READ) goto L1912;
        BleReadable.Companion r1377 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1378 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1379 = new ArrayList();     // Catch: Exception -> L17
        int r1380 = 9;
        int r1381 = (r1378 - 9) / 68;     // Catch: Exception -> L17
        if (r1381 <= 0) goto L1907;
        int r1382 = 0;
    L1905:
        if (r1382 >= r1381) goto L1907;
        BleReadable.Companion r1383 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1384 = r1380 + (68 * r1382);     // Catch: Exception -> L17
        r1382 = r1382 + 1;     // Catch: Exception -> L17
        byte[] r1385 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1384, r1380 + (68 * r1382));     // Catch: Exception -> L17
        int r1386 = r1385.length;     // Catch: Exception -> L17
        Object r1387 = BleWorldClock.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1388 = (BleReadable) r1387;     // Catch: Exception -> L17
        r1388.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1385, 0, r1386));     // Catch: Exception -> L17
        r1388.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1387, "also(...)");     // Catch: Exception -> L17
        r1379.add((BleReadable) r1387);     // Catch: Exception -> L17
        r1380 = 9;
    L1907:
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " handleData onReadWorldClock -> " + r1379);     // Catch: Exception -> L17
        BaseBleCache r1389 = this.mBleCache;     // Catch: Exception -> L17
        if (r1389 != null) goto L1910;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3135 = null;
    L1911:
        BaseBleCache.putList$default(r3135, r346, r1379, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new IOI1I(r1379));     // Catch: Exception -> L17
        Unit r1390 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1912
    L1910:
        r3135 = r1389;
    L1912:
        r17 = this;
    L1943:
        Unit r1391 = Unit.OXO1;     // Catch: Exception -> L46
        goto L552
    L1914:
        if (r304 != BleKeyFlag.DELETE) goto L1912;
        if (r48.length < 10) goto L4003;
        sendData$default(this, r346, r304, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r1392 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r1393 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1393 != null) goto L1923;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3136 = null;
    L1924:
        List r1394 = BaseBleCache.getList$default(r3136, r346, BleWorldClock.class, null, 4, null);     // Catch: Exception -> L46
        if (r1392 != 255) goto L1927;
        r1394.clear();     // Catch: Exception -> L46
    L1938:
        BaseBleCache r1395 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1395 != null) goto L1941;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3137 = null;
    L1942:
        BaseBleCache.putList$default(r3137, r346, r1394, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r17.getTAG() + " handleData onWorldClockDelete -> " + r1392);     // Catch: Exception -> L46
        r17.notifyHandlers(new IXIIOOX(r1392));     // Catch: Exception -> L46
        goto L1943
    L1941:
        r3137 = r1395;
        goto L1942
    L1927:
        Iterator r1396 = r1394.iterator();     // Catch: Exception -> L46
        int r1397 = 0;
    L1929:
        if (r1396.hasNext() == false) goto L1935;
        if (((BleWorldClock) r1396.next()).getMId() == r1392) goto L1932;
        r1397 = r1397 + 1;     // Catch: Exception -> L46
        goto L1929
    L1932:
        int r1398 = r1397;
    L1936:
        if (r1398 <= (-1)) goto L1938;
        r1394.remove(r1398);     // Catch: Exception -> L46
        goto L1938
    L1935:
        r1398 = -1;
        goto L1936
    L1923:
        r3136 = r1393;
        goto L1924
    L4003:
        return;
    L1944:
        r346 = r2;
        r11 = r6;
        if (r1 != BleKeyFlag.READ) goto L1954;
        if (r11 == true) goto L1949;
        r350 = r1;
        r7 = this;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
    L1951:
        if (r48.length < 10) goto L4004;
        final byte r1399 = r48[9];     // Catch: Exception -> L17
        r7.mHidState = r1399;     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onHIDState -> " + HIDState.INSTANCE.getState(r1399));     // Catch: Exception -> L17
        r7.notifyHandlers(new OO11(r1399));     // Catch: Exception -> L17
        Unit r1400 = Unit.OXO1;     // Catch: Exception -> L17
    L1962:
        Unit r1401 = Unit.OXO1;     // Catch: Exception -> L17
        goto L564
    L4004:
        return;
    L1949:
        r7 = this;
        r350 = r1;
        goto L1951
    L1954:
        r7 = this;
        r350 = r1;
        if (r11 == true) goto L1962;
        if (r350 != BleKeyFlag.UPDATE) goto L1962;
        sendData$default(r7, r346, r350, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4005;
        final byte r1402 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onHIDValueChange -> " + HIDValue.INSTANCE.getValue(r1402));     // Catch: Exception -> L17
        r7.notifyHandlers(new iIXi0XI(r1402));     // Catch: Exception -> L17
        Unit r1403 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1962
    L4005:
        return;
    L1963:
        r630 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L1966;
    L1968:
        r2 = r2;
    L1969:
        Unit r1404 = Unit.OXO1;     // Catch: Exception -> L17
        goto L980
    L1966:
        if (r630 != BleKeyFlag.READ) goto L1968;
        r2 = r2;
        sendData$default(r7, r2, r630, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWeatherRealTime -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new iI1OIOXX0());     // Catch: Exception -> L17
        goto L1969
    L1970:
        notifyHandlers(new iI01X111X(r2, r1));     // Catch: Exception -> L17
        r10.IiI10X(getTAG() + r38 + r2 + r39 + r1 + r37);     // Catch: Exception -> L17
        return;
    L1972:
        BleKeyFlag r1405 = r1;
        r11 = r6;
        byte r1406 = 255;
        r7 = this;
        if (r11 == true) goto L1975;
    L1987:
        BleKey r3138 = r2;
    L1988:
        if (r11 == false) goto L1990;
    L1995:
        Unit r1407 = Unit.OXO1;     // Catch: Exception -> L17
    L1996:
        r12 = r1405;
        r39 = r39;
    L1997:
        r2 = r3138;
        goto L3829
    L1990:
        if (r1405 != BleKeyFlag.UPDATE) goto L1995;
        if (r48.length < 10) goto L4007;
        sendData$default(r7, r3138, r1405, null, true, false, 16, null);     // Catch: Exception -> L17
        final MusicCommand r1408 = MusicCommand.Companion.of(r48[9]);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveMusicCommand -> " + r1408);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOXiiX1(r1408));     // Catch: Exception -> L17
        goto L1995
    L4007:
        return;
    L1975:
        if (r1405 != BleKeyFlag.READ) goto L1987;
        if (r48.length < 10) goto L4006;
        r7.mMusicSubscriptions.clear();     // Catch: Exception -> L17
        byte[] r1409 = ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r48.length);     // Catch: Exception -> L17
        int r1410 = 0;
    L1981:
        if (r1410 >= (r1409.length - 1)) goto L1986;
        MusicEntity r1411 = MusicEntity.Companion.of(r1409[r1410]);     // Catch: Exception -> L17
        int r1412 = r1409[r1410 + 1] & r1406;     // Catch: Exception -> L17
        int r1413 = r1410 + 2;     // Catch: Exception -> L17
        byte[] r1414 = ArraysKt___ArraysJvmKt.I0IIOI(r1409, r1413, r1413 + r1412);     // Catch: Exception -> L17
        ArrayList r1415 = new ArrayList(r1414.length);     // Catch: Exception -> L17
        int r1416 = r1414.length;     // Catch: Exception -> L17
        int r1417 = 0;
    L1983:
        if (r1417 >= r1416) goto L1985;
        r1415.add(MusicAttr.Companion.of(r1411, r1414[r1417]));     // Catch: Exception -> L17
        r1417 = r1417 + 1;     // Catch: Exception -> L17
        r1409 = r1409;
        r2 = r2;
        goto L1983
    L1985:
        r7.mMusicSubscriptions.put(r1411, r1415);     // Catch: Exception -> L17
        r1410 = r1410 + (r1412 + 2);     // Catch: Exception -> L17
        r1409 = r1409;
        r2 = r2;
        r1406 = 255;
        goto L1981
    L1986:
        r3138 = r2;
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData mMusicSubscriptions -> " + r7.mMusicSubscriptions);     // Catch: Exception -> L17
        goto L1988
    L4006:
        return;
    L1998:
        r1405 = r1;
        r3138 = r2;
        r11 = r6;
        r7 = this;
        if (r1405 == BleKeyFlag.CREATE) goto L2001;
    L2006:
        Unit r1418 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1996
    L2001:
        if (r48.length >= 10) goto L2004;
        return;
    L2004:
        if (r48[9] != 0) goto L2006;
        r10.IiI10X(r7.getTAG() + " handleData onSessionStateChange -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new OiXi00());     // Catch: Exception -> L17
        goto L2006
    L2007:
        final BleKeyFlag r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r48.length >= 10) goto L2011;
        return;
    L2011:
        if (r48[9] != 0) goto L2013;
        final boolean r1420 = true;
    L2015:
        if (r1419 != BleKeyFlag.CREATE) goto L2019;
        if (r1420 == true) goto L2060;
        r10.IiI10X(r7.getTAG() + " handleData onIdentityCreate -> false");     // Catch: Exception -> L17
        r7.notifyHandlers(new iIiOiX0I());     // Catch: Exception -> L17
    L2060:
        Unit r1421 = Unit.OXO1;     // Catch: Exception -> L17
    L2061:
        r12 = r1419;
        goto L1997
    L2019:
        if (r1419 != BleKeyFlag.UPDATE) goto L2038;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r1420 == false) goto L2036;
        BaseBleCache r1422 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1422 != null) goto L2025;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r1422 = null;
    L2025:
        BleReadable.Companion r1423 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1424 = r48.length;     // Catch: Exception -> L17
        Object r1425 = BleDeviceInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1426 = (BleReadable) r1425;     // Catch: Exception -> L17
        r1426.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r1424));     // Catch: Exception -> L17
        r1426.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1425, "also(...)");     // Catch: Exception -> L17
        r1422.setMDeviceInfo((BleDeviceInfo) ((BleReadable) r1425));     // Catch: Exception -> L17
        StringBuilder r1427 = new StringBuilder();     // Catch: Exception -> L17
        r1427.append(r7.getTAG());     // Catch: Exception -> L17
        r1427.append(" handleData onIdentityCreate -> true, ");     // Catch: Exception -> L17
        BaseBleCache r1428 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1428 != null) goto L2028;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r1428 = null;
    L2028:
        r1427.append(r1428.getMDeviceInfo());     // Catch: Exception -> L17
        r10.IiI10X(r1427.toString());     // Catch: Exception -> L17
        BaseBleCache r1429 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1429 != null) goto L2031;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3139 = null;
    L2032:
        BaseBleCache r1430 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1430 != null) goto L2035;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r1430 = null;
    L2035:
        BaseBleCache.putObject$default(r3139, r3138, r1430.getMDeviceInfo(), null, 4, null);     // Catch: Exception -> L17
        r7.onActivateMultiDeviceActiveBleCache();     // Catch: Exception -> L17
        r7.isRefreshDeviceInfo = false;     // Catch: Exception -> L17
        r7.notifyHandlersThen(new IO01IX00(r7), new X00XXi(r7));     // Catch: Exception -> L17
        goto L2060
    L2031:
        r3139 = r1429;
        goto L2032
    L2036:
        r10.IiI10X(r7.getTAG() + " handleData onIdentityCreate -> false");     // Catch: Exception -> L17
        r7.notifyHandlers(new X0IO1());     // Catch: Exception -> L17
        goto L2060
    L2038:
        if (r1419 != BleKeyFlag.DELETE) goto L2046;
        if (r11 == false) goto L2044;
        r10.IiI10X(r7.getTAG() + " handleData onIdentityDelete -> status=" + r1420);     // Catch: Exception -> L17
        if (r1420 == false) goto L2043;
        r7.unbind();     // Catch: Exception -> L17
    L2043:
        r7.notifyHandlers(new iX1I10IX(r1420));     // Catch: Exception -> L17
        goto L2060
    L2044:
        r10.IiI10X(r7.getTAG() + " handleData onIdentityDeleteByDevice -> status=" + r1420);     // Catch: Exception -> L17
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOXOOX0(r1420));     // Catch: Exception -> L17
        goto L2060
    L2046:
        if (r1419 != BleKeyFlag.READ) goto L2060;
        if (r48.length < 26) goto L4010;
        BleReadable.Companion r1431 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1432 = r48.length;     // Catch: Exception -> L17
        Object r1433 = BleDeviceInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1434 = (BleReadable) r1433;     // Catch: Exception -> L17
        r1434.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 10, r1432));     // Catch: Exception -> L17
        r1434.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1433, "also(...)");     // Catch: Exception -> L17
        final BleDeviceInfo r1435 = (BleDeviceInfo) ((BleReadable) r1433);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceInfo -> " + r1420 + r39 + r1435);     // Catch: Exception -> L17
        if (r1420 == false) goto L2060;
        BaseBleCache r1436 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1436 != null) goto L2055;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r1436 = null;
    L2055:
        r1436.setMDeviceInfo(r1435);     // Catch: Exception -> L17
        BaseBleCache r1437 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1437 != null) goto L2058;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3140 = null;
    L2059:
        BaseBleCache.putObject$default(r3140, r3138, r1435, null, 4, null);     // Catch: Exception -> L17
        r7.isRefreshDeviceInfo = false;     // Catch: Exception -> L17
        r7.notifyHandlers(new Ii001XXI(r1435));     // Catch: Exception -> L17
        goto L2060
    L2058:
        r3140 = r1437;
        goto L2059
    L4010:
        return;
    L2013:
        r1420 = false;
        goto L2015
    L2062:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2065;
    L2071:
        Unit r1438 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2065:
        if (r1419 != BleKeyFlag.READ) goto L2071;
        BleReadable.Companion r1439 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1440 = r48.length;     // Catch: Exception -> L17
        Object r1441 = BleIPCInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1442 = (BleReadable) r1441;     // Catch: Exception -> L17
        r1442.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1440));     // Catch: Exception -> L17
        r1442.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1441, "also(...)");     // Catch: Exception -> L17
        final BleIPCInfo r1443 = (BleIPCInfo) ((BleReadable) r1441);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadIPCInfo -> " + r1443);     // Catch: Exception -> L17
        BaseBleCache r1444 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1444 != null) goto L2069;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3141 = null;
    L2070:
        BaseBleCache.putObject$default(r3141, r3138, r1443, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0XIiO(r1443));     // Catch: Exception -> L17
        Unit r1445 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2071
    L2069:
        r3141 = r1444;
        goto L2070
    L2072:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2075;
    L2081:
        Unit r1446 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2075:
        if (r1419 != BleKeyFlag.READ) goto L2081;
        BleReadable.Companion r1447 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1448 = r48.length;     // Catch: Exception -> L17
        Object r1449 = BleDeviceLanguages2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1450 = (BleReadable) r1449;     // Catch: Exception -> L17
        r1450.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1448));     // Catch: Exception -> L17
        r1450.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1449, "also(...)");     // Catch: Exception -> L17
        final BleDeviceLanguages2 r1451 = (BleDeviceLanguages2) ((BleReadable) r1449);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceLanguages2 -> " + r1451);     // Catch: Exception -> L17
        BaseBleCache r1452 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1452 != null) goto L2079;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3142 = null;
    L2080:
        BaseBleCache.putObject$default(r3142, r3138, r1451, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O01X00X(r1451));     // Catch: Exception -> L17
        Unit r1453 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2081
    L2079:
        r3142 = r1452;
        goto L2080
    L2083:
        BleKeyFlag r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2089;
        sendData$default(r17, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
    L2089:
        BleReadable.Companion r1455 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1456 = r48.length;     // Catch: Exception -> L46
        Object r1457 = BlePower2.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1458 = (BleReadable) r1457;     // Catch: Exception -> L46
        r1458.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1456));     // Catch: Exception -> L46
        r1458.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1457, "also(...)");     // Catch: Exception -> L46
        final BlePower2 r1459 = (BlePower2) ((BleReadable) r1457);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadPower2 -> " + r1459);     // Catch: Exception -> L46
        BaseBleCache r1460 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1460 != null) goto L2092;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3143 = null;
    L2093:
        BaseBleCache.putObject$default(r3143, r3138, r1459, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXii0O0(r1459));     // Catch: Exception -> L46
        Unit r1461 = Unit.OXO1;     // Catch: Exception -> L46
    L2094:
        r7 = r17;
    L2095:
        r12 = r1454;
        goto L1997
    L2092:
        r3143 = r1460;
        goto L2093
    L2096:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2099;
    L2105:
        Unit r1462 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2099:
        if (r1454 != BleKeyFlag.READ) goto L2105;
        BleReadable.Companion r1463 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1464 = r48.length;     // Catch: Exception -> L46
        Object r1465 = BleCPUserInfo.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1466 = (BleReadable) r1465;     // Catch: Exception -> L46
        r1466.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1464));     // Catch: Exception -> L46
        r1466.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1465, "also(...)");     // Catch: Exception -> L46
        final BleCPUserInfo r1467 = (BleCPUserInfo) ((BleReadable) r1465);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadCPUserInfo -> " + r1467);     // Catch: Exception -> L46
        BaseBleCache r1468 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1468 != null) goto L2103;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3144 = null;
    L2104:
        BaseBleCache.putObject$default(r3144, r3138, r1467, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new Ii00OO(r1467));     // Catch: Exception -> L46
        Unit r1469 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2105
    L2103:
        r3144 = r1468;
        goto L2104
    L2106:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2109;
    L2115:
        Unit r1470 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2109:
        if (r1454 != BleKeyFlag.READ) goto L2115;
        BleReadable.Companion r1471 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1472 = r48.length;     // Catch: Exception -> L46
        Object r1473 = BleRelaxReminder.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1474 = (BleReadable) r1473;     // Catch: Exception -> L46
        r1474.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1472));     // Catch: Exception -> L46
        r1474.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1473, "also(...)");     // Catch: Exception -> L46
        final BleRelaxReminder r1475 = (BleRelaxReminder) ((BleReadable) r1473);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadRelaxReminder -> " + r1475);     // Catch: Exception -> L46
        BaseBleCache r1476 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1476 != null) goto L2113;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3145 = null;
    L2114:
        BaseBleCache.putObject$default(r3145, r3138, r1475, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new XXO00O(r1475));     // Catch: Exception -> L46
        Unit r1477 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2115
    L2113:
        r3145 = r1476;
        goto L2114
    L2116:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2119;
    L2125:
        Unit r1478 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2119:
        if (r1454 != BleKeyFlag.READ) goto L2125;
        final int r1479 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSleepQualityScore -> " + r1479);     // Catch: Exception -> L46
        BaseBleCache r1480 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1480 != null) goto L2123;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3146 = null;
    L2124:
        BaseBleCache.putInt$default(r3146, r3138, r1479, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OIiOiO(r1479));     // Catch: Exception -> L46
        goto L2125
    L2123:
        r3146 = r1480;
        goto L2124
    L2126:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r11 == true) goto L2129;
    L2136:
        if (r11 == false) goto L2138;
    L2135:
        r7 = this;
        r1419 = r1;
    L2145:
        Unit r1481 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2138:
        if (r1 != BleKeyFlag.UPDATE) goto L2135;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1482 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1483 = r48.length;     // Catch: Exception -> L17
        Object r1484 = BleIPCStoresInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1485 = (BleReadable) r1484;     // Catch: Exception -> L17
        r1485.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1483));     // Catch: Exception -> L17
        r1485.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1484, "also(...)");     // Catch: Exception -> L17
        final BleIPCStoresInfo r1486 = (BleIPCStoresInfo) ((BleReadable) r1484);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onIPCStoresInfoUpdate -> " + r1486);     // Catch: Exception -> L17
        BaseBleCache r1487 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1487 != null) goto L2143;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3147 = null;
    L2144:
        BaseBleCache.putObject$default(r3147, r3138, r1486, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOOi0XiI(r1486));     // Catch: Exception -> L17
        Unit r1488 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2145
    L2143:
        r3147 = r1487;
        goto L2144
    L2129:
        if (r1 != BleKeyFlag.READ) goto L2136;
        BleReadable.Companion r1489 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1490 = r48.length;     // Catch: Exception -> L46
        Object r1491 = BleIPCStoresInfo.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1492 = (BleReadable) r1491;     // Catch: Exception -> L46
        r1492.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1490));     // Catch: Exception -> L46
        r1492.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1491, "also(...)");     // Catch: Exception -> L46
        final BleIPCStoresInfo r1493 = (BleIPCStoresInfo) ((BleReadable) r1491);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadIPCStoresInfo -> " + r1493);     // Catch: Exception -> L46
        BaseBleCache r1494 = this.mBleCache;     // Catch: Exception -> L46
        if (r1494 != null) goto L2133;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3148 = null;
    L2134:
        BaseBleCache.putObject$default(r3148, r3138, r1493, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new XXO1(r1493));     // Catch: Exception -> L46
        Unit r1495 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2135
    L2133:
        r3148 = r1494;
        goto L2134
    L2146:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2149;
    L2155:
        Unit r1496 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2149:
        if (r1419 != BleKeyFlag.READ) goto L2155;
        BleReadable.Companion r1497 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1498 = r48.length;     // Catch: Exception -> L17
        Object r1499 = BleDeviceUniqueDataSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1500 = (BleReadable) r1499;     // Catch: Exception -> L17
        r1500.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1498));     // Catch: Exception -> L17
        r1500.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1499, "also(...)");     // Catch: Exception -> L17
        final BleDeviceUniqueDataSettings r1501 = (BleDeviceUniqueDataSettings) ((BleReadable) r1499);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceUniqueDataSettings -> " + r1501);     // Catch: Exception -> L17
        BaseBleCache r1502 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1502 != null) goto L2153;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3149 = null;
    L2154:
        BaseBleCache.putObject$default(r3149, r3138, r1501, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new II1X1(r1501));     // Catch: Exception -> L17
        Unit r1503 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2155
    L2153:
        r3149 = r1502;
        goto L2154
    L2156:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2159;
    L2165:
        Unit r1504 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2159:
        if (r1419 != BleKeyFlag.READ) goto L2165;
        BleReadable.Companion r1505 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1506 = r48.length;     // Catch: Exception -> L17
        Object r1507 = BleBatteryUsage.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1508 = (BleReadable) r1507;     // Catch: Exception -> L17
        r1508.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1506));     // Catch: Exception -> L17
        r1508.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1507, "also(...)");     // Catch: Exception -> L17
        final BleBatteryUsage r1509 = (BleBatteryUsage) ((BleReadable) r1507);     // Catch: Exception -> L17
        r10.OXO1(r7.getTAG() + " handleData onReadBatteryUsage -> " + r1509);     // Catch: Exception -> L17
        BaseBleCache r1510 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1510 != null) goto L2163;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3150 = null;
    L2164:
        BaseBleCache.putObject$default(r3150, r3138, r1509, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Xi1OIX(r1509));     // Catch: Exception -> L17
        Unit r1511 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2165
    L2163:
        r3150 = r1510;
        goto L2164
    L2166:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2169;
    L2175:
        Unit r1512 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2169:
        if (r1419 != BleKeyFlag.READ) goto L2175;
        BleReadable.Companion r1513 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1514 = r48.length;     // Catch: Exception -> L17
        Object r1515 = BleCalibrationData.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1516 = (BleReadable) r1515;     // Catch: Exception -> L17
        r1516.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1514));     // Catch: Exception -> L17
        r1516.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1515, "also(...)");     // Catch: Exception -> L17
        final BleCalibrationData r1517 = (BleCalibrationData) ((BleReadable) r1515);     // Catch: Exception -> L17
        r10.OXO1(r7.getTAG() + " handleData onReadCalibrationData -> " + r1517);     // Catch: Exception -> L17
        BaseBleCache r1518 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1518 != null) goto L2173;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3151 = null;
    L2174:
        BaseBleCache.putObject$default(r3151, r3138, r1517, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i100II(r1517));     // Catch: Exception -> L17
        Unit r1519 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2175
    L2173:
        r3151 = r1518;
        goto L2174
    L2176:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2179;
    L2185:
        Unit r1520 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2179:
        if (r1419 != BleKeyFlag.UPDATE) goto L2185;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1521 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1522 = r48.length;     // Catch: Exception -> L17
        Object r1523 = BleFindEarphone.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1524 = (BleReadable) r1523;     // Catch: Exception -> L17
        r1524.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1522));     // Catch: Exception -> L17
        r1524.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1523, "also(...)");     // Catch: Exception -> L17
        final BleFindEarphone r1525 = (BleFindEarphone) ((BleReadable) r1523);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onFindEarphoneUpdate -> " + r1525);     // Catch: Exception -> L17
        BaseBleCache r1526 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1526 != null) goto L2183;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3152 = null;
    L2184:
        BaseBleCache.putObject$default(r3152, r3138, r1525, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new III01I1(r1525));     // Catch: Exception -> L17
        Unit r1527 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2185
    L2183:
        r3152 = r1526;
        goto L2184
    L2186:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2189;
    L2195:
        if (r11 == false) goto L2197;
    L2199:
        Unit r1528 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2197:
        if (r1419 != BleKeyFlag.UPDATE) goto L2199;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onQiblaSettingsUpdate");     // Catch: Exception -> L17
        r7.notifyHandlers(new OiI1X0O1());     // Catch: Exception -> L17
        goto L2199
    L2189:
        if (r1419 != BleKeyFlag.READ) goto L2195;
        BleReadable.Companion r1529 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1530 = r48.length;     // Catch: Exception -> L17
        Object r1531 = BleQiblaSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1532 = (BleReadable) r1531;     // Catch: Exception -> L17
        r1532.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1530));     // Catch: Exception -> L17
        r1532.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1531, "also(...)");     // Catch: Exception -> L17
        final BleQiblaSettings r1533 = (BleQiblaSettings) ((BleReadable) r1531);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadQiblaSettings -> " + r1533);     // Catch: Exception -> L17
        BaseBleCache r1534 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1534 != null) goto L2193;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3153 = null;
    L2194:
        BaseBleCache.putObject$default(r3153, r3138, r1533, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iX01Oi1i(r1533));     // Catch: Exception -> L17
        Unit r1535 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2199
    L2193:
        r3153 = r1534;
        goto L2194
    L2200:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2203;
    L2209:
        Unit r1536 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2203:
        if (r1419 != BleKeyFlag.READ) goto L2209;
        BleReadable.Companion r1537 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1538 = r48.length;     // Catch: Exception -> L17
        Object r1539 = BleHanBaoSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1540 = (BleReadable) r1539;     // Catch: Exception -> L17
        r1540.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1538));     // Catch: Exception -> L17
        r1540.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1539, "also(...)");     // Catch: Exception -> L17
        final BleHanBaoSettings r1541 = (BleHanBaoSettings) ((BleReadable) r1539);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadHanBaoSettings -> " + r1541);     // Catch: Exception -> L17
        BaseBleCache r1542 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1542 != null) goto L2207;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3154 = null;
    L2208:
        BaseBleCache.putObject$default(r3154, r3138, r1541, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iXiO1iIOX(r1541));     // Catch: Exception -> L17
        Unit r1543 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2209
    L2207:
        r3154 = r1542;
        goto L2208
    L2210:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2213;
    L2219:
        if (r11 == false) goto L2221;
    L2227:
        Unit r1544 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2221:
        if (r1419 != BleKeyFlag.UPDATE) goto L2227;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1545 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1546 = r48.length;     // Catch: Exception -> L17
        Object r1547 = BleEarphoneKey.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1548 = (BleReadable) r1547;     // Catch: Exception -> L17
        r1548.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1546));     // Catch: Exception -> L17
        r1548.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1547, "also(...)");     // Catch: Exception -> L17
        final BleEarphoneKey r1549 = (BleEarphoneKey) ((BleReadable) r1547);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onEarphoneKeyUpdate -> " + r1549);     // Catch: Exception -> L17
        BaseBleCache r1550 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1550 != null) goto L2225;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3155 = null;
    L2226:
        BaseBleCache.putObject$default(r3155, r3138, r1549, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O11i1iI1O(r1549));     // Catch: Exception -> L17
        Unit r1551 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2227
    L2225:
        r3155 = r1550;
        goto L2226
    L2213:
        if (r1419 != BleKeyFlag.READ) goto L2219;
        BleReadable.Companion r1552 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1553 = r48.length;     // Catch: Exception -> L17
        Object r1554 = BleEarphoneKey.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1555 = (BleReadable) r1554;     // Catch: Exception -> L17
        r1555.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1553));     // Catch: Exception -> L17
        r1555.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1554, "also(...)");     // Catch: Exception -> L17
        final BleEarphoneKey r1556 = (BleEarphoneKey) ((BleReadable) r1554);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadEarphoneKey -> " + r1556);     // Catch: Exception -> L17
        BaseBleCache r1557 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1557 != null) goto L2217;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3156 = null;
    L2218:
        BaseBleCache.putObject$default(r3156, r3138, r1556, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iIX0I1O(r1556));     // Catch: Exception -> L17
        Unit r1558 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2227
    L2217:
        r3156 = r1557;
        goto L2218
    L2228:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2231;
    L2237:
        if (r11 == false) goto L2239;
    L2245:
        Unit r1559 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2239:
        if (r1419 != BleKeyFlag.UPDATE) goto L2245;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1560 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1561 = r48.length;     // Catch: Exception -> L17
        Object r1562 = BleGestureWake2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1563 = (BleReadable) r1562;     // Catch: Exception -> L17
        r1563.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1561));     // Catch: Exception -> L17
        r1563.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1562, "also(...)");     // Catch: Exception -> L17
        final BleGestureWake2 r1564 = (BleGestureWake2) ((BleReadable) r1562);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onGestureWake2Update -> " + r1564);     // Catch: Exception -> L17
        BaseBleCache r1565 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1565 != null) goto L2243;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3157 = null;
    L2244:
        BaseBleCache.putObject$default(r3157, r3138, r1564, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iX1i(r1564));     // Catch: Exception -> L17
        Unit r1566 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2245
    L2243:
        r3157 = r1565;
        goto L2244
    L2231:
        if (r1419 != BleKeyFlag.READ) goto L2237;
        BleReadable.Companion r1567 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1568 = r48.length;     // Catch: Exception -> L17
        Object r1569 = BleGestureWake2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1570 = (BleReadable) r1569;     // Catch: Exception -> L17
        r1570.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1568));     // Catch: Exception -> L17
        r1570.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1569, "also(...)");     // Catch: Exception -> L17
        final BleGestureWake2 r1571 = (BleGestureWake2) ((BleReadable) r1569);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadGestureWake2 -> " + r1571);     // Catch: Exception -> L17
        BaseBleCache r1572 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1572 != null) goto L2235;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3158 = null;
    L2236:
        BaseBleCache.putObject$default(r3158, r3138, r1571, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XXXOI(r1571));     // Catch: Exception -> L17
        Unit r1573 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2245
    L2235:
        r3158 = r1572;
        goto L2236
    L2246:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2249;
    L2255:
        if (r11 == false) goto L2257;
    L2263:
        Unit r1574 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2257:
        if (r1419 != BleKeyFlag.UPDATE) goto L2263;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1575 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1576 = r48.length;     // Catch: Exception -> L17
        Object r1577 = BleCheckInEveryDay.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1578 = (BleReadable) r1577;     // Catch: Exception -> L17
        r1578.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1576));     // Catch: Exception -> L17
        r1578.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1577, "also(...)");     // Catch: Exception -> L17
        final BleCheckInEveryDay r1579 = (BleCheckInEveryDay) ((BleReadable) r1577);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onCheckInEveryDayUpdate -> " + r1579);     // Catch: Exception -> L17
        BaseBleCache r1580 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1580 != null) goto L2261;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3159 = null;
    L2262:
        BaseBleCache.putObject$default(r3159, r3138, r1579, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OO01ii0(r1579));     // Catch: Exception -> L17
        Unit r1581 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2263
    L2261:
        r3159 = r1580;
        goto L2262
    L2249:
        if (r1419 != BleKeyFlag.READ) goto L2255;
        BleReadable.Companion r1582 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1583 = r48.length;     // Catch: Exception -> L17
        Object r1584 = BleCheckInEveryDay.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1585 = (BleReadable) r1584;     // Catch: Exception -> L17
        r1585.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1583));     // Catch: Exception -> L17
        r1585.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1584, "also(...)");     // Catch: Exception -> L17
        final BleCheckInEveryDay r1586 = (BleCheckInEveryDay) ((BleReadable) r1584);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadCheckInEveryDay -> " + r1586);     // Catch: Exception -> L17
        BaseBleCache r1587 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1587 != null) goto L2253;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3160 = null;
    L2254:
        BaseBleCache.putObject$default(r3160, r3138, r1586, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IO11XiIIi(r1586));     // Catch: Exception -> L17
        Unit r1588 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2263
    L2253:
        r3160 = r1587;
        goto L2254
    L2264:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2267;
    L2273:
        Unit r1589 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2267:
        if (r1419 != BleKeyFlag.READ) goto L2273;
        BleReadable.Companion r1590 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1591 = r48.length;     // Catch: Exception -> L17
        Object r1592 = BleGirlCareMonthly.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1593 = (BleReadable) r1592;     // Catch: Exception -> L17
        r1593.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1591));     // Catch: Exception -> L17
        r1593.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1592, "also(...)");     // Catch: Exception -> L17
        final BleGirlCareMonthly r1594 = (BleGirlCareMonthly) ((BleReadable) r1592);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadGirlCareMonthly -> " + r1594);     // Catch: Exception -> L17
        BaseBleCache r1595 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1595 != null) goto L2271;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3161 = null;
    L2272:
        BaseBleCache.putObject$default(r3161, r3138, r1594, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0IIX1(r1594));     // Catch: Exception -> L17
        Unit r1596 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2273
    L2271:
        r3161 = r1595;
        goto L2272
    L2274:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2284;
        if (r1419 != BleKeyFlag.READ) goto L2284;
        BleReadable.Companion r1597 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1598 = r48.length;     // Catch: Exception -> L17
        Object r1599 = BleSosContact.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1600 = (BleReadable) r1599;     // Catch: Exception -> L17
        r1600.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1598));     // Catch: Exception -> L17
        r1600.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1599, "also(...)");     // Catch: Exception -> L17
        final BleSosContact r1601 = (BleSosContact) ((BleReadable) r1599);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSosContact -> " + r1601);     // Catch: Exception -> L17
        BaseBleCache r1602 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1602 != null) goto L2281;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3162 = null;
    L2282:
        BaseBleCache.putObject$default(r3162, r3138, r1601, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1OiII1O(r1601));     // Catch: Exception -> L17
        Unit r1603 = Unit.OXO1;     // Catch: Exception -> L17
    L2291:
        Unit r1604 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2281:
        r3162 = r1602;
    L2284:
        if (r1419 != BleKeyFlag.UPDATE) goto L2291;
        if (r11 == true) goto L2291;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1605 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1606 = r48.length;     // Catch: Exception -> L17
        Object r1607 = BleSosContact.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1608 = (BleReadable) r1607;     // Catch: Exception -> L17
        r1608.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1606));     // Catch: Exception -> L17
        r1608.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1607, "also(...)");     // Catch: Exception -> L17
        final BleSosContact r1609 = (BleSosContact) ((BleReadable) r1607);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSosContactUpdate -> " + r1609);     // Catch: Exception -> L17
        BaseBleCache r1610 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1610 != null) goto L2289;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3163 = null;
    L2290:
        BaseBleCache.putObject$default(r3163, r3138, r1609, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOII10X(r1609));     // Catch: Exception -> L17
        Unit r1611 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2291
    L2289:
        r3163 = r1610;
        goto L2290
    L2292:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2295;
    L2297:
        if (r11 == false) goto L2306;
        if (r1419 != BleKeyFlag.READ) goto L2306;
        BleReadable.Companion r1612 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1613 = r48.length;     // Catch: Exception -> L17
        Object r1614 = BleWatchFaceIndex.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1615 = (BleReadable) r1614;     // Catch: Exception -> L17
        r1615.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1613));     // Catch: Exception -> L17
        r1615.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1614, "also(...)");     // Catch: Exception -> L17
        final BleWatchFaceIndex r1616 = (BleWatchFaceIndex) ((BleReadable) r1614);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWatchFaceIndex -> " + r1616);     // Catch: Exception -> L17
        BaseBleCache r1617 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1617 != null) goto L2303;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3164 = null;
    L2304:
        BaseBleCache.putObject$default(r3164, r3138, r1616, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OIiXOI1O(r1616));     // Catch: Exception -> L17
        Unit r1618 = Unit.OXO1;     // Catch: Exception -> L17
    L2313:
        Unit r1619 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2303:
        r3164 = r1617;
    L2306:
        if (r1419 != BleKeyFlag.UPDATE) goto L2313;
        if (r11 == true) goto L2313;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1620 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1621 = r48.length;     // Catch: Exception -> L17
        Object r1622 = BleWatchFaceIndex.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1623 = (BleReadable) r1622;     // Catch: Exception -> L17
        r1623.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1621));     // Catch: Exception -> L17
        r1623.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1622, "also(...)");     // Catch: Exception -> L17
        final BleWatchFaceIndex r1624 = (BleWatchFaceIndex) ((BleReadable) r1622);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onWatchFaceIndexUpdate -> " + r1624);     // Catch: Exception -> L17
        BaseBleCache r1625 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1625 != null) goto L2311;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3165 = null;
    L2312:
        BaseBleCache.putObject$default(r3165, r3138, r1624, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X10i10(r1624));     // Catch: Exception -> L17
        Unit r1626 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2313
    L2311:
        r3165 = r1625;
        goto L2312
    L2295:
        if (r1419 != BleKeyFlag.CREATE) goto L2297;
        r10.IiI10X(r7.getTAG() + " handleData onWatchFaceIndexCreate -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new iX0iX());     // Catch: Exception -> L17
        goto L2313
    L2315:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        if (r11 == false) goto L2318;
    L2322:
        r17 = this;
    L2323:
        Unit r1627 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2318:
        if (r1454 != BleKeyFlag.UPDATE) goto L2322;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r1628 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadFindWatch -> " + r1628);     // Catch: Exception -> L46
        r17.notifyHandlers(new X0O0Xi1I1(r1628));     // Catch: Exception -> L46
        goto L2323
    L2324:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2327;
    L2336:
        Unit r1629 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2327:
        if (r1454 != BleKeyFlag.READ) goto L2336;
        if (r48.length < 13) goto L3955;
        final int r3166 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r1630 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1630 != null) goto L2334;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3167 = null;
    L2335:
        BaseBleCache.putInt$default(r3167, r3138, r3166, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSportDurationGoal -> " + r3166);     // Catch: Exception -> L46
        r17.notifyHandlers(new Ii1010OX(r3166));     // Catch: Exception -> L46
        Unit r1631 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2336
    L2334:
        r3167 = r1630;
        goto L2335
    L2337:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2340;
    L2346:
        Unit r1632 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2340:
        if (r1454 != BleKeyFlag.READ) goto L2346;
        BleReadable.Companion r1633 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1634 = r48.length;     // Catch: Exception -> L46
        Object r1635 = BleEcgSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1636 = (BleReadable) r1635;     // Catch: Exception -> L46
        r1636.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1634));     // Catch: Exception -> L46
        r1636.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1635, "also(...)");     // Catch: Exception -> L46
        final BleEcgSettings r1637 = (BleEcgSettings) ((BleReadable) r1635);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadEcgSettings -> " + r1637);     // Catch: Exception -> L46
        BaseBleCache r1638 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1638 != null) goto L2344;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3168 = null;
    L2345:
        BaseBleCache.putObject$default(r3168, r3138, r1637, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new X1011X(r1637));     // Catch: Exception -> L46
        Unit r1639 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2346
    L2344:
        r3168 = r1638;
        goto L2345
    L2347:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2350;
    L2356:
        if (r11 == false) goto L2358;
    L2367:
        Unit r1640 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2358:
        if (r1454 != BleKeyFlag.UPDATE) goto L2367;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        BleReadable.Companion r1641 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1642 = r48.length;     // Catch: Exception -> L46
        Object r1643 = BleRingVibrationSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1644 = (BleReadable) r1643;     // Catch: Exception -> L46
        r1644.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1642));     // Catch: Exception -> L46
        r1644.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1643, "also(...)");     // Catch: Exception -> L46
        final BleRingVibrationSettings r1645 = (BleRingVibrationSettings) ((BleReadable) r1643);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onRingVibrationSetUpdate -> " + r1645);     // Catch: Exception -> L46
        BaseBleCache r1646 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1646 != null) goto L2365;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3169 = null;
    L2366:
        BaseBleCache.putObject$default(r3169, r3138, r1645, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OiiiX1I(r1645));     // Catch: Exception -> L46
        Unit r1647 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2367
    L2365:
        r3169 = r1646;
        goto L2366
    L2350:
        if (r1454 != BleKeyFlag.READ) goto L2356;
        BleReadable.Companion r1648 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1649 = r48.length;     // Catch: Exception -> L46
        Object r1650 = BleRingVibrationSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1651 = (BleReadable) r1650;     // Catch: Exception -> L46
        r1651.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1649));     // Catch: Exception -> L46
        r1651.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1650, "also(...)");     // Catch: Exception -> L46
        final BleRingVibrationSettings r1652 = (BleRingVibrationSettings) ((BleReadable) r1650);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadRingVibrationSet -> " + r1652);     // Catch: Exception -> L46
        BaseBleCache r1653 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1653 != null) goto L2354;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3170 = null;
    L2355:
        BaseBleCache.putObject$default(r3170, r3138, r1652, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new XiOii000(r1652));     // Catch: Exception -> L46
        Unit r1654 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2367
    L2354:
        r3170 = r1653;
        goto L2355
    L2368:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2371;
    L2377:
        Unit r1655 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2371:
        if (r1454 != BleKeyFlag.READ) goto L2377;
        BleReadable.Companion r1656 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1657 = r48.length;     // Catch: Exception -> L46
        Object r1658 = BleGoMoreSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1659 = (BleReadable) r1658;     // Catch: Exception -> L46
        r1659.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1657));     // Catch: Exception -> L46
        r1659.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1658, "also(...)");     // Catch: Exception -> L46
        final BleGoMoreSettings r1660 = (BleGoMoreSettings) ((BleReadable) r1658);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadGoMoreSettings -> " + r1660);     // Catch: Exception -> L46
        BaseBleCache r1661 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1661 != null) goto L2375;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3171 = null;
    L2376:
        BaseBleCache.putObject$default(r3171, r3138, r1660, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IIIiOX0i(r1660));     // Catch: Exception -> L46
        Unit r1662 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2377
    L2375:
        r3171 = r1661;
        goto L2376
    L2378:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2381;
    L2387:
        if (r11 == false) goto L2389;
    L2398:
        Unit r1663 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2389:
        if (r1454 != BleKeyFlag.UPDATE) goto L2398;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r1664 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onEarphoneCallUpdate -> " + r1664);     // Catch: Exception -> L46
        BaseBleCache r1665 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1665 != null) goto L2396;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3172 = null;
    L2397:
        BaseBleCache.putInt$default(r3172, r3138, r1664, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OI0I10O(r1664));     // Catch: Exception -> L46
        goto L2398
    L2396:
        r3172 = r1665;
        goto L2397
    L2381:
        if (r1454 != BleKeyFlag.READ) goto L2387;
        final int r1666 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadEarphoneCall -> " + r1666);     // Catch: Exception -> L46
        BaseBleCache r1667 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1667 != null) goto L2385;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3173 = null;
    L2386:
        BaseBleCache.putInt$default(r3173, r3138, r1666, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new XX01O1IiI(r1666));     // Catch: Exception -> L46
        goto L2398
    L2385:
        r3173 = r1667;
        goto L2386
    L2399:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2402;
    L2408:
        if (r11 == false) goto L2410;
    L2419:
        Unit r1668 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2410:
        if (r1454 != BleKeyFlag.UPDATE) goto L2419;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        BleReadable.Companion r1669 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1670 = r48.length;     // Catch: Exception -> L46
        Object r1671 = BleEarphoneState.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1672 = (BleReadable) r1671;     // Catch: Exception -> L46
        r1672.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1670));     // Catch: Exception -> L46
        r1672.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1671, "also(...)");     // Catch: Exception -> L46
        final BleEarphoneState r1673 = (BleEarphoneState) ((BleReadable) r1671);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onEarphoneStateUpdate -> " + r1673);     // Catch: Exception -> L46
        BaseBleCache r1674 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1674 != null) goto L2417;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3174 = null;
    L2418:
        BaseBleCache.putObject$default(r3174, r3138, r1673, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new iiI1I0O(r1673));     // Catch: Exception -> L46
        Unit r1675 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2419
    L2417:
        r3174 = r1674;
        goto L2418
    L2402:
        if (r1454 != BleKeyFlag.READ) goto L2408;
        BleReadable.Companion r1676 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1677 = r48.length;     // Catch: Exception -> L46
        Object r1678 = BleEarphoneState.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1679 = (BleReadable) r1678;     // Catch: Exception -> L46
        r1679.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1677));     // Catch: Exception -> L46
        r1679.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1678, "also(...)");     // Catch: Exception -> L46
        final BleEarphoneState r1680 = (BleEarphoneState) ((BleReadable) r1678);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadEarphoneState -> " + r1680);     // Catch: Exception -> L46
        BaseBleCache r1681 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1681 != null) goto L2406;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3175 = null;
    L2407:
        BaseBleCache.putObject$default(r3175, r3138, r1680, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXO01(r1680));     // Catch: Exception -> L46
        Unit r1682 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2419
    L2406:
        r3175 = r1681;
        goto L2407
    L2420:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2423;
    L2429:
        Unit r1683 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2423:
        if (r1454 != BleKeyFlag.READ) goto L2429;
        BleReadable.Companion r1684 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1685 = r48.length;     // Catch: Exception -> L46
        Object r1686 = BleEarphoneInfo.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1687 = (BleReadable) r1686;     // Catch: Exception -> L46
        r1687.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1685));     // Catch: Exception -> L46
        r1687.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1686, "also(...)");     // Catch: Exception -> L46
        final BleEarphoneInfo r1688 = (BleEarphoneInfo) ((BleReadable) r1686);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadEarphoneInfo -> " + r1688);     // Catch: Exception -> L46
        BaseBleCache r1689 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1689 != null) goto L2427;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3176 = null;
    L2428:
        BaseBleCache.putObject$default(r3176, r3138, r1688, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IiXO1X(r1688));     // Catch: Exception -> L46
        Unit r1690 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2429
    L2427:
        r3176 = r1689;
        goto L2428
    L2430:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2433;
    L2439:
        if (r11 == false) goto L2441;
    L2450:
        Unit r1691 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2441:
        if (r1454 != BleKeyFlag.UPDATE) goto L2450;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r1692 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onScreenBrightnessSetUpdate -> " + r1692);     // Catch: Exception -> L46
        BaseBleCache r1693 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1693 != null) goto L2448;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3177 = null;
    L2449:
        BaseBleCache.putInt$default(r3177, r3138, r1692, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i1I0IO(r1692));     // Catch: Exception -> L46
        goto L2450
    L2448:
        r3177 = r1693;
        goto L2449
    L2433:
        if (r1454 != BleKeyFlag.READ) goto L2439;
        final int r1694 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadScreenBrightnessSet -> " + r1694);     // Catch: Exception -> L46
        BaseBleCache r1695 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1695 != null) goto L2437;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3178 = null;
    L2438:
        BaseBleCache.putInt$default(r3178, r3138, r1694, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IXOI(r1694));     // Catch: Exception -> L46
        goto L2450
    L2437:
        r3178 = r1695;
        goto L2438
    L2451:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r11 == true) goto L2454;
    L2461:
        if (r11 == false) goto L2463;
    L2460:
        r7 = this;
        r1419 = r1;
    L2470:
        Unit r1696 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2463:
        if (r1 != BleKeyFlag.UPDATE) goto L2460;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1697 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1698 = r48.length;     // Catch: Exception -> L17
        Object r1699 = BleEarphoneSoundEffectsSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1700 = (BleReadable) r1699;     // Catch: Exception -> L17
        r1700.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1698));     // Catch: Exception -> L17
        r1700.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1699, "also(...)");     // Catch: Exception -> L17
        final BleEarphoneSoundEffectsSettings r1701 = (BleEarphoneSoundEffectsSettings) ((BleReadable) r1699);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onEarphoneSoundEffectsSettingsUpdate -> " + r1701);     // Catch: Exception -> L17
        BaseBleCache r1702 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1702 != null) goto L2468;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3179 = null;
    L2469:
        BaseBleCache.putObject$default(r3179, r3138, r1701, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Xi0111O(r1701));     // Catch: Exception -> L17
        Unit r1703 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2470
    L2468:
        r3179 = r1702;
        goto L2469
    L2454:
        if (r1 != BleKeyFlag.READ) goto L2461;
        BleReadable.Companion r1704 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1705 = r48.length;     // Catch: Exception -> L46
        Object r1706 = BleEarphoneSoundEffectsSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1707 = (BleReadable) r1706;     // Catch: Exception -> L46
        r1707.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1705));     // Catch: Exception -> L46
        r1707.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1706, "also(...)");     // Catch: Exception -> L46
        final BleEarphoneSoundEffectsSettings r1708 = (BleEarphoneSoundEffectsSettings) ((BleReadable) r1706);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadEarphoneSoundEffectsSettings -> " + r1708);     // Catch: Exception -> L46
        BaseBleCache r1709 = this.mBleCache;     // Catch: Exception -> L46
        if (r1709 != null) goto L2458;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3180 = null;
    L2459:
        BaseBleCache.putObject$default(r3180, r3138, r1708, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new X0OOIX(r1708));     // Catch: Exception -> L46
        Unit r1710 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2460
    L2458:
        r3180 = r1709;
        goto L2459
    L2471:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2474;
    L2480:
        if (r11 == false) goto L2482;
    L2488:
        Unit r1711 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2482:
        if (r1419 != BleKeyFlag.UPDATE) goto L2488;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1712 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1713 = r48.length;     // Catch: Exception -> L17
        Object r1714 = BleEarphoneAncSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1715 = (BleReadable) r1714;     // Catch: Exception -> L17
        r1715.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1713));     // Catch: Exception -> L17
        r1715.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1714, "also(...)");     // Catch: Exception -> L17
        final BleEarphoneAncSettings r1716 = (BleEarphoneAncSettings) ((BleReadable) r1714);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onEarphoneAncSettingsUpdate -> " + r1716);     // Catch: Exception -> L17
        BaseBleCache r1717 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1717 != null) goto L2486;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3181 = null;
    L2487:
        BaseBleCache.putObject$default(r3181, r3138, r1716, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IX0Iii(r1716));     // Catch: Exception -> L17
        Unit r1718 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2488
    L2486:
        r3181 = r1717;
        goto L2487
    L2474:
        if (r1419 != BleKeyFlag.READ) goto L2480;
        BleReadable.Companion r1719 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1720 = r48.length;     // Catch: Exception -> L17
        Object r1721 = BleEarphoneAncSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1722 = (BleReadable) r1721;     // Catch: Exception -> L17
        r1722.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1720));     // Catch: Exception -> L17
        r1722.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1721, "also(...)");     // Catch: Exception -> L17
        final BleEarphoneAncSettings r1723 = (BleEarphoneAncSettings) ((BleReadable) r1721);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadEarphoneAncSettings -> " + r1723);     // Catch: Exception -> L17
        BaseBleCache r1724 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1724 != null) goto L2478;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3182 = null;
    L2479:
        BaseBleCache.putObject$default(r3182, r3138, r1723, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new II1XX0X(r1723));     // Catch: Exception -> L17
        Unit r1725 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2488
    L2478:
        r3182 = r1724;
        goto L2479
    L2489:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2492;
    L2498:
        Unit r1726 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2492:
        if (r1419 != BleKeyFlag.READ) goto L2498;
        BleReadable.Companion r1727 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1728 = r48.length;     // Catch: Exception -> L17
        Object r1729 = BleEarphonePower.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1730 = (BleReadable) r1729;     // Catch: Exception -> L17
        r1730.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1728));     // Catch: Exception -> L17
        r1730.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1729, "also(...)");     // Catch: Exception -> L17
        final BleEarphonePower r1731 = (BleEarphonePower) ((BleReadable) r1729);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadEarphonePower -> " + r1731);     // Catch: Exception -> L17
        BaseBleCache r1732 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1732 != null) goto L2496;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3183 = null;
    L2497:
        BaseBleCache.putObject$default(r3183, r3138, r1731, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0IOI0X0(r1731));     // Catch: Exception -> L17
        Unit r1733 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2498
    L2496:
        r3183 = r1732;
        goto L2497
    L2500:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        if (r11 == false) goto L2503;
    L2511:
        r17 = this;
    L2512:
        Unit r1734 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2503:
        if (r1454 != BleKeyFlag.UPDATE) goto L2511;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        BleReadable.Companion r1735 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1736 = r48.length;     // Catch: Exception -> L46
        Object r1737 = BleGoogleNaviInfo.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1738 = (BleReadable) r1737;     // Catch: Exception -> L46
        r1738.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1736));     // Catch: Exception -> L46
        r1738.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1737, "also(...)");     // Catch: Exception -> L46
        final BleGoogleNaviInfo r1739 = (BleGoogleNaviInfo) ((BleReadable) r1737);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onGoogleNaviInfoUpdate -> " + r1739);     // Catch: Exception -> L46
        BaseBleCache r1740 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1740 != null) goto L2509;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3184 = null;
    L2510:
        BaseBleCache.putObject$default(r3184, r3138, r1739, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new Ii0XIIX(r1739));     // Catch: Exception -> L46
        Unit r1741 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2512
    L2509:
        r3184 = r1740;
        goto L2510
    L2513:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2516;
    L2522:
        Unit r1742 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2516:
        if (r1454 != BleKeyFlag.READ) goto L2522;
        BleReadable.Companion r1743 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1744 = r48.length;     // Catch: Exception -> L46
        Object r1745 = BleBloodPressureCalibration.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1746 = (BleReadable) r1745;     // Catch: Exception -> L46
        r1746.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1744));     // Catch: Exception -> L46
        r1746.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1745, "also(...)");     // Catch: Exception -> L46
        final BleBloodPressureCalibration r1747 = (BleBloodPressureCalibration) ((BleReadable) r1745);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadBloodPressureCalibration -> " + r1747);     // Catch: Exception -> L46
        BaseBleCache r1748 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1748 != null) goto L2520;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3185 = null;
    L2521:
        BaseBleCache.putObject$default(r3185, r3138, r1747, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OO1IiIi0(r1747));     // Catch: Exception -> L46
        Unit r1749 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2522
    L2520:
        r3185 = r1748;
        goto L2521
    L2523:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2526;
    L2532:
        if (r11 == false) goto L2534;
    L2543:
        Unit r1750 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2534:
        if (r1454 != BleKeyFlag.UPDATE) goto L2543;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r1751 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onNotificationLightScreenSetUpdate -> " + r1751);     // Catch: Exception -> L46
        BaseBleCache r1752 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1752 != null) goto L2541;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3186 = null;
    L2542:
        BaseBleCache.putInt$default(r3186, r3138, r1751, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXIiIOXi(r1751));     // Catch: Exception -> L46
        goto L2543
    L2541:
        r3186 = r1752;
        goto L2542
    L2526:
        if (r1454 != BleKeyFlag.READ) goto L2532;
        final int r1753 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadNotificationLightScreenSet -> " + r1753);     // Catch: Exception -> L46
        BaseBleCache r1754 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1754 != null) goto L2530;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3187 = null;
    L2531:
        BaseBleCache.putInt$default(r3187, r3138, r1753, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i1X(r1753));     // Catch: Exception -> L46
        goto L2543
    L2530:
        r3187 = r1754;
        goto L2531
    L2544:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L2547;
    L2553:
        Unit r1755 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2547:
        if (r1454 != BleKeyFlag.READ) goto L2553;
        BleReadable.Companion r1756 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1757 = r48.length;     // Catch: Exception -> L46
        Object r1758 = BleActivityDetail.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1759 = (BleReadable) r1758;     // Catch: Exception -> L46
        r1759.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1757));     // Catch: Exception -> L46
        r1759.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1758, "also(...)");     // Catch: Exception -> L46
        final BleActivityDetail r1760 = (BleActivityDetail) ((BleReadable) r1758);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadActivityDetail -> " + r1760);     // Catch: Exception -> L46
        BaseBleCache r1761 = r17.mBleCache;     // Catch: Exception -> L46
        if (r1761 != null) goto L2551;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3188 = null;
    L2552:
        BaseBleCache.putObject$default(r3188, r3138, r1760, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i1IXOIi(r1760));     // Catch: Exception -> L46
        Unit r1762 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2553
    L2551:
        r3188 = r1761;
        goto L2552
    L2554:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r11 == true) goto L2557;
    L2567:
        if (r11 == false) goto L2569;
    L2566:
        r7 = this;
        r1419 = r1;
    L2576:
        Unit r1763 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2569:
        if (r1 != BleKeyFlag.UPDATE) goto L2566;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1764 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1765 = r48.length;     // Catch: Exception -> L17
        Object r1766 = BleSDCardInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1767 = (BleReadable) r1766;     // Catch: Exception -> L17
        r1767.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1765));     // Catch: Exception -> L17
        r1767.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1766, "also(...)");     // Catch: Exception -> L17
        final BleSDCardInfo r1768 = (BleSDCardInfo) ((BleReadable) r1766);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSDCardInfoUpdate -> " + r1768);     // Catch: Exception -> L17
        BaseBleCache r1769 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1769 != null) goto L2574;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3189 = null;
    L2575:
        BaseBleCache.putObject$default(r3189, r3138, r1768, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i0XO(r1768));     // Catch: Exception -> L17
        Unit r1770 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2576
    L2574:
        r3189 = r1769;
        goto L2575
    L2557:
        if (r1 != BleKeyFlag.READ) goto L2567;
        BleReadable.Companion r1771 = BleReadable.Companion;     // Catch: Exception -> L46
        int r1772 = r48.length;     // Catch: Exception -> L46
        Object r1773 = BleSDCardInfo.class.newInstance();     // Catch: Exception -> L46
        BleReadable r1774 = (BleReadable) r1773;     // Catch: Exception -> L46
        r1774.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1772));     // Catch: Exception -> L46
        r1774.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r1773, "also(...)");     // Catch: Exception -> L46
        final BleSDCardInfo r1775 = (BleSDCardInfo) ((BleReadable) r1773);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadSDCardInfo -> " + r1775);     // Catch: Exception -> L46
        if (r1775.getMTotalSize() <= 0) goto L2565;
        BaseBleCache r1776 = this.mBleCache;     // Catch: Exception -> L46
        if (r1776 != null) goto L2563;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3190 = null;
    L2564:
        BaseBleCache.putObject$default(r3190, r3138, r1775, null, 4, null);     // Catch: Exception -> L46
        goto L2565
    L2563:
        r3190 = r1776;
    L2565:
        notifyHandlers(new OI00X1OO(r1775));     // Catch: Exception -> L46
        Unit r1777 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2566
    L2577:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2580;
    L2586:
        Unit r1778 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2580:
        if (r1419 != BleKeyFlag.UPDATE) goto L2586;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1779 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1780 = r48.length;     // Catch: Exception -> L17
        Object r1781 = BleBWNaviInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1782 = (BleReadable) r1781;     // Catch: Exception -> L17
        r1782.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1780));     // Catch: Exception -> L17
        r1782.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1781, "also(...)");     // Catch: Exception -> L17
        final BleBWNaviInfo r1783 = (BleBWNaviInfo) ((BleReadable) r1781);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBWNaviInfoUpdate -> " + r1783);     // Catch: Exception -> L17
        BaseBleCache r1784 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1784 != null) goto L2584;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3191 = null;
    L2585:
        BaseBleCache.putObject$default(r3191, r3138, r1783, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iIi0XO1(r1783));     // Catch: Exception -> L17
        Unit r1785 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2586
    L2584:
        r3191 = r1784;
        goto L2585
    L2587:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2590;
    L2599:
        if (r11 == false) goto L2601;
    L2610:
        Unit r1786 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2601:
        if (r1419 != BleKeyFlag.UPDATE) goto L2610;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4012;
        final byte r1787 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onFallSetUpdate -> " + r1787);     // Catch: Exception -> L17
        BaseBleCache r1788 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1788 != null) goto L2608;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3192 = null;
    L2609:
        BaseBleCache.putInt$default(r3192, r3138, r1787, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiOXXXX(r1787));     // Catch: Exception -> L17
        goto L2610
    L2608:
        r3192 = r1788;
        goto L2609
    L4012:
        return;
    L2590:
        if (r1419 != BleKeyFlag.READ) goto L2599;
        if (r48.length < 10) goto L4011;
        final byte r1789 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadFallSet -> " + r1789);     // Catch: Exception -> L17
        BaseBleCache r1790 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1790 != null) goto L2597;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3193 = null;
    L2598:
        BaseBleCache.putInt$default(r3193, r3138, r1789, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiIOiXI(r1789));     // Catch: Exception -> L17
        goto L2610
    L2597:
        r3193 = r1790;
        goto L2598
    L4011:
        return;
    L2611:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2614;
    L2620:
        if (r11 == false) goto L2622;
    L2631:
        Unit r1791 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2622:
        if (r1419 != BleKeyFlag.UPDATE) goto L2631;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4013;
        BleReadable.Companion r1792 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1793 = r48.length;     // Catch: Exception -> L17
        Object r1794 = BleStandbyWatchFaceSet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1795 = (BleReadable) r1794;     // Catch: Exception -> L17
        r1795.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1793));     // Catch: Exception -> L17
        r1795.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1794, "also(...)");     // Catch: Exception -> L17
        final BleStandbyWatchFaceSet r3194 = (BleStandbyWatchFaceSet) ((BleReadable) r1794);     // Catch: Exception -> L17
        BaseBleCache r1796 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1796 != null) goto L2629;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3195 = null;
    L2630:
        BaseBleCache.putObject$default(r3195, r3138, r3194, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i00i(r3194));     // Catch: Exception -> L17
        Unit r1797 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2631
    L2629:
        r3195 = r1796;
        goto L2630
    L4013:
        return;
    L2614:
        if (r1419 != BleKeyFlag.READ) goto L2620;
        BleReadable.Companion r1798 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1799 = r48.length;     // Catch: Exception -> L17
        Object r1800 = BleStandbyWatchFaceSet.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1801 = (BleReadable) r1800;     // Catch: Exception -> L17
        r1801.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1799));     // Catch: Exception -> L17
        r1801.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1800, "also(...)");     // Catch: Exception -> L17
        final BleStandbyWatchFaceSet r3196 = (BleStandbyWatchFaceSet) ((BleReadable) r1800);     // Catch: Exception -> L17
        BaseBleCache r1802 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1802 != null) goto L2618;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3197 = null;
    L2619:
        BaseBleCache.putObject$default(r3197, r3138, r3196, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOOI(r3196));     // Catch: Exception -> L17
        Unit r1803 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2631
    L2618:
        r3197 = r1802;
        goto L2619
    L2632:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2635;
    L2641:
        if (r11 == false) goto L2643;
    L2652:
        Unit r1804 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2643:
        if (r1419 != BleKeyFlag.UPDATE) goto L2652;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4014;
        BleReadable.Companion r1805 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1806 = r48.length;     // Catch: Exception -> L17
        Object r1807 = BleBloodOxyGenSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1808 = (BleReadable) r1807;     // Catch: Exception -> L17
        r1808.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1806));     // Catch: Exception -> L17
        r1808.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1807, "also(...)");     // Catch: Exception -> L17
        final BleBloodOxyGenSettings r1809 = (BleBloodOxyGenSettings) ((BleReadable) r1807);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBloodOxyGenSettings -> " + r1809);     // Catch: Exception -> L17
        BaseBleCache r1810 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1810 != null) goto L2650;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3198 = null;
    L2651:
        BaseBleCache.putObject$default(r3198, r3138, r1809, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXOIO1O1(r1809));     // Catch: Exception -> L17
        Unit r1811 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2652
    L2650:
        r3198 = r1810;
        goto L2651
    L4014:
        return;
    L2635:
        if (r1419 != BleKeyFlag.READ) goto L2641;
        BleReadable.Companion r1812 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1813 = r48.length;     // Catch: Exception -> L17
        Object r1814 = BleBloodOxyGenSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1815 = (BleReadable) r1814;     // Catch: Exception -> L17
        r1815.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1813));     // Catch: Exception -> L17
        r1815.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1814, "also(...)");     // Catch: Exception -> L17
        final BleBloodOxyGenSettings r1816 = (BleBloodOxyGenSettings) ((BleReadable) r1814);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBloodOxyGenSettings -> " + r1816);     // Catch: Exception -> L17
        BaseBleCache r1817 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1817 != null) goto L2639;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3199 = null;
    L2640:
        BaseBleCache.putObject$default(r3199, r3138, r1816, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOO11O0(r1816));     // Catch: Exception -> L17
        Unit r1818 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2652
    L2639:
        r3199 = r1817;
        goto L2640
    L2653:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2656;
    L2662:
        if (r11 == false) goto L2664;
    L2670:
        Unit r1819 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2664:
        if (r1419 != BleKeyFlag.UPDATE) goto L2670;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1820 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1821 = r48.length;     // Catch: Exception -> L17
        Object r1822 = BlePressureTimingMeasurement.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1823 = (BleReadable) r1822;     // Catch: Exception -> L17
        r1823.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1821));     // Catch: Exception -> L17
        r1823.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1822, "also(...)");     // Catch: Exception -> L17
        final BlePressureTimingMeasurement r1824 = (BlePressureTimingMeasurement) ((BleReadable) r1822);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadPressureTimingMeasurement -> " + r1824);     // Catch: Exception -> L17
        BaseBleCache r1825 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1825 != null) goto L2668;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3200 = null;
    L2669:
        BaseBleCache.putObject$default(r3200, r3138, r1824, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiI0I(r1824));     // Catch: Exception -> L17
        Unit r1826 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2670
    L2668:
        r3200 = r1825;
        goto L2669
    L2656:
        if (r1419 != BleKeyFlag.READ) goto L2662;
        BleReadable.Companion r1827 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1828 = r48.length;     // Catch: Exception -> L17
        Object r1829 = BlePressureTimingMeasurement.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1830 = (BleReadable) r1829;     // Catch: Exception -> L17
        r1830.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1828));     // Catch: Exception -> L17
        r1830.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1829, "also(...)");     // Catch: Exception -> L17
        final BlePressureTimingMeasurement r1831 = (BlePressureTimingMeasurement) ((BleReadable) r1829);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadPressureTimingMeasurement -> " + r1831);     // Catch: Exception -> L17
        BaseBleCache r1832 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1832 != null) goto L2660;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3201 = null;
    L2661:
        BaseBleCache.putObject$default(r3201, r3138, r1831, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1Xi0(r1831));     // Catch: Exception -> L17
        Unit r1833 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2670
    L2660:
        r3201 = r1832;
        goto L2661
    L2671:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2674;
    L2676:
        Unit r1834 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2674:
        if (r1419 != BleKeyFlag.UPDATE) goto L2676;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1835 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1836 = r48.length;     // Catch: Exception -> L17
        Object r1837 = BleDeviceSportData.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1838 = (BleReadable) r1837;     // Catch: Exception -> L17
        r1838.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1836));     // Catch: Exception -> L17
        r1838.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1837, "also(...)");     // Catch: Exception -> L17
        final BleDeviceSportData r1839 = (BleDeviceSportData) ((BleReadable) r1837);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDeviceSportDataUpdate -> " + r1839);     // Catch: Exception -> L17
        r7.notifyHandlers(new OI0O0O(r1839));     // Catch: Exception -> L17
        Unit r1840 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2676
    L2677:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2680;
    L2686:
        Unit r1841 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2680:
        if (r1419 != BleKeyFlag.READ) goto L2686;
        BleReadable.Companion r1842 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1843 = r48.length;     // Catch: Exception -> L17
        Object r1844 = BleDeviceLanguages.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1845 = (BleReadable) r1844;     // Catch: Exception -> L17
        r1845.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1843));     // Catch: Exception -> L17
        r1845.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1844, "also(...)");     // Catch: Exception -> L17
        final BleDeviceLanguages r1846 = (BleDeviceLanguages) ((BleReadable) r1844);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceLanguages -> " + r1846);     // Catch: Exception -> L17
        BaseBleCache r1847 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1847 != null) goto L2684;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3202 = null;
    L2685:
        BaseBleCache.putObject$default(r3202, r3138, r1846, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IO0IiXX1(r1846));     // Catch: Exception -> L17
        Unit r1848 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2686
    L2684:
        r3202 = r1847;
        goto L2685
    L2687:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2690;
    L2696:
        Unit r1849 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2690:
        if (r1419 != BleKeyFlag.READ) goto L2696;
        BleReadable.Companion r1850 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1851 = r48.length;     // Catch: Exception -> L17
        Object r1852 = BleGirlCareSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1853 = (BleReadable) r1852;     // Catch: Exception -> L17
        r1853.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1851));     // Catch: Exception -> L17
        r1853.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1852, "also(...)");     // Catch: Exception -> L17
        final BleGirlCareSettings r1854 = (BleGirlCareSettings) ((BleReadable) r1852);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadGirlCareSettings -> " + r1854);     // Catch: Exception -> L17
        BaseBleCache r1855 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1855 != null) goto L2694;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3203 = null;
    L2695:
        BaseBleCache.putObject$default(r3203, r3138, r1854, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0X10(r1854));     // Catch: Exception -> L17
        Unit r1856 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2696
    L2694:
        r3203 = r1855;
        goto L2695
    L2697:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2707;
        if (r1419 != BleKeyFlag.READ) goto L2707;
        BleReadable.Companion r1857 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1858 = r48.length;     // Catch: Exception -> L17
        Object r1859 = BleSOSSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1860 = (BleReadable) r1859;     // Catch: Exception -> L17
        r1860.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1858));     // Catch: Exception -> L17
        r1860.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1859, "also(...)");     // Catch: Exception -> L17
        final BleSOSSettings r1861 = (BleSOSSettings) ((BleReadable) r1859);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSOSSettings -> " + r1861);     // Catch: Exception -> L17
        BaseBleCache r1862 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1862 != null) goto L2704;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3204 = null;
    L2705:
        BaseBleCache.putObject$default(r3204, r3138, r1861, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new i1iX1I(r1861));     // Catch: Exception -> L17
        Unit r1863 = Unit.OXO1;     // Catch: Exception -> L17
    L2714:
        Unit r1864 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2704:
        r3204 = r1862;
    L2707:
        if (r1419 != BleKeyFlag.UPDATE) goto L2714;
        if (r11 == true) goto L2714;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1865 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1866 = r48.length;     // Catch: Exception -> L17
        Object r1867 = BleSOSSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1868 = (BleReadable) r1867;     // Catch: Exception -> L17
        r1868.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1866));     // Catch: Exception -> L17
        r1868.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1867, "also(...)");     // Catch: Exception -> L17
        final BleSOSSettings r1869 = (BleSOSSettings) ((BleReadable) r1867);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onSOSSettingsUpdate -> " + r1869);     // Catch: Exception -> L17
        BaseBleCache r1870 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1870 != null) goto L2712;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3205 = null;
    L2713:
        BaseBleCache.putObject$default(r3205, r3138, r1869, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I0iX0I(r1869));     // Catch: Exception -> L17
        Unit r1871 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2714
    L2712:
        r3205 = r1870;
        goto L2713
    L2715:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2718;
    L2724:
        Unit r1872 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2718:
        if (r1419 != BleKeyFlag.UPDATE) goto L2724;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1873 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1874 = r48.length;     // Catch: Exception -> L17
        Object r1875 = BleNaviInfo.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1876 = (BleReadable) r1875;     // Catch: Exception -> L17
        r1876.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1874));     // Catch: Exception -> L17
        r1876.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1875, "also(...)");     // Catch: Exception -> L17
        final BleNaviInfo r1877 = (BleNaviInfo) ((BleReadable) r1875);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onNaviInfoUpdate -> " + r1877);     // Catch: Exception -> L17
        BaseBleCache r1878 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1878 != null) goto L2722;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3206 = null;
    L2723:
        BaseBleCache.putObject$default(r3206, r3138, r1877, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Oi01X(r1877));     // Catch: Exception -> L17
        Unit r1879 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2724
    L2722:
        r3206 = r1878;
        goto L2723
    L2725:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1419 != BleKeyFlag.UPDATE) goto L2733;
        if (r11 == true) goto L2730;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
    L2730:
        if (r48.length < 41) goto L4015;
        BleReadable.Companion r1880 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1881 = r48.length;     // Catch: Exception -> L17
        Object r1882 = BleRecordPacket.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1883 = (BleReadable) r1882;     // Catch: Exception -> L17
        r1883.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1881));     // Catch: Exception -> L17
        r1883.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1882, "also(...)");     // Catch: Exception -> L17
        final BleRecordPacket r1884 = (BleRecordPacket) ((BleReadable) r1882);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReceiveRecordPacket -> " + r1884);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXI0OI01X(r1884));     // Catch: Exception -> L17
        Unit r1885 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2733
    L4015:
        return;
    L2733:
        Unit r1886 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2734:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2737;
    L2743:
        Unit r1887 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2737:
        if (r1419 != BleKeyFlag.READ) goto L2743;
        BleReadable.Companion r1888 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1889 = r48.length;     // Catch: Exception -> L17
        Object r1890 = BleWechatPaySettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1891 = (BleReadable) r1890;     // Catch: Exception -> L17
        r1891.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1889));     // Catch: Exception -> L17
        r1891.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1890, "also(...)");     // Catch: Exception -> L17
        final BleWechatPaySettings r1892 = (BleWechatPaySettings) ((BleReadable) r1890);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWechatPaySettings -> " + r1892);     // Catch: Exception -> L17
        BaseBleCache r1893 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1893 != null) goto L2741;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3207 = null;
    L2742:
        BaseBleCache.putObject$default(r3207, r3138, r1892, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1O0O1O(r1892));     // Catch: Exception -> L17
        Unit r1894 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2743
    L2741:
        r3207 = r1893;
        goto L2742
    L2744:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2747;
    L2753:
        Unit r1895 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2747:
        if (r1419 != BleKeyFlag.READ) goto L2753;
        BleReadable.Companion r1896 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1897 = r48.length;     // Catch: Exception -> L17
        Object r1898 = BleAlipaySettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1899 = (BleReadable) r1898;     // Catch: Exception -> L17
        r1899.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1897));     // Catch: Exception -> L17
        r1899.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1898, "also(...)");     // Catch: Exception -> L17
        final BleAlipaySettings r1900 = (BleAlipaySettings) ((BleReadable) r1898);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadAlipaySettings -> " + r1900);     // Catch: Exception -> L17
        BaseBleCache r1901 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1901 != null) goto L2751;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3208 = null;
    L2752:
        BaseBleCache.putObject$default(r3208, r3138, r1900, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXX0X(r1900));     // Catch: Exception -> L17
        Unit r1902 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2753
    L2751:
        r3208 = r1901;
        goto L2752
    L2754:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2764;
        if (r1419 != BleKeyFlag.READ) goto L2764;
        BleReadable.Companion r1903 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1904 = r48.length;     // Catch: Exception -> L17
        Object r1905 = BleNotificationSettings2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1906 = (BleReadable) r1905;     // Catch: Exception -> L17
        r1906.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1904));     // Catch: Exception -> L17
        r1906.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1905, "also(...)");     // Catch: Exception -> L17
        final BleNotificationSettings2 r1907 = (BleNotificationSettings2) ((BleReadable) r1905);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadNotificationSettings2 -> " + r1907);     // Catch: Exception -> L17
        BaseBleCache r1908 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1908 != null) goto L2761;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3209 = null;
    L2762:
        BaseBleCache.putObject$default(r3209, r3138, r1907, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Xi0XiXIi(r1907));     // Catch: Exception -> L17
        Unit r1909 = Unit.OXO1;     // Catch: Exception -> L17
    L2771:
        Unit r1910 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2761:
        r3209 = r1908;
    L2764:
        if (r1419 != BleKeyFlag.UPDATE) goto L2771;
        if (r11 == true) goto L2771;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1911 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1912 = r48.length;     // Catch: Exception -> L17
        Object r1913 = BleNotificationSettings2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1914 = (BleReadable) r1913;     // Catch: Exception -> L17
        r1914.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1912));     // Catch: Exception -> L17
        r1914.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1913, "also(...)");     // Catch: Exception -> L17
        final BleNotificationSettings2 r1915 = (BleNotificationSettings2) ((BleReadable) r1913);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onNotificationSettings2Update -> " + r1915);     // Catch: Exception -> L17
        BaseBleCache r1916 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1916 != null) goto L2769;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3210 = null;
    L2770:
        BaseBleCache.putObject$default(r3210, r3138, r1915, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XI00I0i1(r1915));     // Catch: Exception -> L17
        Unit r1917 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2771
    L2769:
        r3210 = r1916;
        goto L2770
    L2772:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2775;
    L2781:
        Unit r1918 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2775:
        if (r1419 != BleKeyFlag.READ) goto L2781;
        BleReadable.Companion r1919 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1920 = r48.length;     // Catch: Exception -> L17
        Object r1921 = BlePackageStatus.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1922 = (BleReadable) r1921;     // Catch: Exception -> L17
        r1922.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1920));     // Catch: Exception -> L17
        r1922.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1921, "also(...)");     // Catch: Exception -> L17
        final BlePackageStatus r1923 = (BlePackageStatus) ((BleReadable) r1921);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadPackageStatus -> " + r1923);     // Catch: Exception -> L17
        BaseBleCache r1924 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1924 != null) goto L2779;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3211 = null;
    L2780:
        BaseBleCache.putObject$default(r3211, r3138, r1923, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IX0IOI0(r1923));     // Catch: Exception -> L17
        Unit r1925 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2781
    L2779:
        r3211 = r1924;
        goto L2780
    L2782:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2797;
        if (r1419 != BleKeyFlag.READ) goto L2860;
        BleReadable.Companion r1926 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1927 = r48.length;     // Catch: Exception -> L17
        final ArrayList r1928 = new ArrayList();     // Catch: Exception -> L17
        int r1929 = 9;
        int r1930 = 7;
        int r1931 = (r1927 - 9) / 7;     // Catch: Exception -> L17
        if (r1931 <= 0) goto L2791;
        int r1932 = 0;
    L2789:
        if (r1932 >= r1931) goto L2791;
        BleReadable.Companion r1933 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1934 = r1929 + (r1930 * r1932);     // Catch: Exception -> L17
        r1932 = r1932 + 1;     // Catch: Exception -> L17
        byte[] r1935 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r1934, r1929 + (r1930 * r1932));     // Catch: Exception -> L17
        int r1936 = r1935.length;     // Catch: Exception -> L17
        Object r1937 = BleMedicationAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1938 = (BleReadable) r1937;     // Catch: Exception -> L17
        r1938.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1935, 0, r1936));     // Catch: Exception -> L17
        r1938.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1937, "also(...)");     // Catch: Exception -> L17
        r1928.add((BleReadable) r1937);     // Catch: Exception -> L17
        r1930 = 7;
        r1929 = 9;
    L2791:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadMedicationAlarm -> " + r1928);     // Catch: Exception -> L17
        BaseBleCache r1939 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1939 != null) goto L2794;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3212 = null;
    L2795:
        BaseBleCache.putList$default(r3212, r3138, r1928, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOI111X(r1928));     // Catch: Exception -> L17
        Unit r1940 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2860
    L2794:
        r3212 = r1939;
    L2860:
        Unit r1941 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2797:
        if (r1419 != BleKeyFlag.UPDATE) goto L2818;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1942 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1943 = r48.length;     // Catch: Exception -> L17
        Object r1944 = BleMedicationAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1945 = (BleReadable) r1944;     // Catch: Exception -> L17
        r1945.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1943));     // Catch: Exception -> L17
        r1945.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1944, "also(...)");     // Catch: Exception -> L17
        final BleMedicationAlarm r1946 = (BleMedicationAlarm) ((BleReadable) r1944);     // Catch: Exception -> L17
        BaseBleCache r1947 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1947 != null) goto L2801;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3213 = null;
    L2802:
        List r1948 = BaseBleCache.getList$default(r3213, r3138, BleMedicationAlarm.class, null, 4, null);     // Catch: Exception -> L17
        Iterator r1949 = r1948.iterator();     // Catch: Exception -> L17
        int r1950 = 0;
    L2804:
        if (r1949.hasNext() == false) goto L2809;
        if (((BleMedicationAlarm) r1949.next()).getMId() == r1946.getMId()) goto L2810;
        r1950 = r1950 + 1;     // Catch: Exception -> L17
    L2810:
        if (r1950 <= (-1)) goto L2812;
        r1948.set(r1950, r1946);     // Catch: Exception -> L17
    L2812:
        BaseBleCache r1951 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1951 != null) goto L2815;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3214 = null;
    L2816:
        BaseBleCache.putList$default(r3214, r3138, r1948, null, 4, null);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onMedicationAlarmUpdate -> " + r1946);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiO1iOX(r1946));     // Catch: Exception -> L17
        goto L2860
    L2815:
        r3214 = r1951;
        goto L2816
    L2809:
        r1950 = -1;
        goto L2810
    L2801:
        r3213 = r1947;
        goto L2802
    L2818:
        if (r1419 == BleKeyFlag.DELETE) goto L2820;
        BaseBleConnector r1952 = r7;
        BleKeyFlag r1953 = r1419;
        if (r1953 == BleKeyFlag.CREATE) goto L2850;
    L2847:
        r7 = r1952;
        r1419 = r1953;
        goto L2860
    L2850:
        r1419 = r1953;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1954 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1955 = r48.length;     // Catch: Exception -> L17
        Object r1956 = BleMedicationAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1957 = (BleReadable) r1956;     // Catch: Exception -> L17
        r1957.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1955));     // Catch: Exception -> L17
        r1957.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1956, "also(...)");     // Catch: Exception -> L17
        final BleMedicationAlarm r1958 = (BleMedicationAlarm) ((BleReadable) r1956);     // Catch: Exception -> L17
        BaseBleCache r1959 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1959 != null) goto L2854;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3215 = null;
    L2855:
        List r1960 = BaseBleCache.getList$default(r3215, r3138, BleMedicationAlarm.class, null, 4, null);     // Catch: Exception -> L17
        r1960.add(r1958);     // Catch: Exception -> L17
        BaseBleCache r1961 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1961 != null) goto L2858;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3216 = null;
    L2859:
        BaseBleCache.putList$default(r3216, r3138, r1960, null, 4, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onMedicationAlarmAdd -> " + r1958);     // Catch: Exception -> L17
        r7.notifyHandlers(new XIIOXiX(r1958));     // Catch: Exception -> L17
        goto L2860
    L2858:
        r3216 = r1961;
        goto L2859
    L2854:
        r3215 = r1959;
        goto L2855
    L2820:
        if (r48.length < 10) goto L4016;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L50
        r1952 = r7;
        r1953 = r1419;
        final int r1962 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r1963 = r1952.mBleCache;     // Catch: Exception -> L46
        if (r1963 != null) goto L2827;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3217 = null;
    L2828:
        List r1964 = BaseBleCache.getList$default(r3217, r3138, BleMedicationAlarm.class, null, 4, null);     // Catch: Exception -> L46
        if (r1962 != 255) goto L2831;
        r1964.clear();     // Catch: Exception -> L46
    L2842:
        BaseBleCache r1965 = r1952.mBleCache;     // Catch: Exception -> L46
        if (r1965 != null) goto L2845;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3218 = null;
    L2846:
        BaseBleCache.putList$default(r3218, r3138, r1964, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r1952.getTAG() + " handleData onMedicationAlarmDelete -> " + r1962);     // Catch: Exception -> L46
        r1952.notifyHandlers(new XO0OII1O(r1962));     // Catch: Exception -> L46
        goto L2847
    L2845:
        r3218 = r1965;
        goto L2846
    L2831:
        Iterator r1966 = r1964.iterator();     // Catch: Exception -> L46
        int r1967 = 0;
    L2833:
        if (r1966.hasNext() == false) goto L2839;
        if (((BleMedicationAlarm) r1966.next()).getMId() == r1962) goto L2836;
        r1967 = r1967 + 1;     // Catch: Exception -> L46
        goto L2833
    L2836:
        int r1968 = r1967;
    L2840:
        if (r1968 <= (-1)) goto L2842;
        r1964.remove(r1968);     // Catch: Exception -> L46
        goto L2842
    L2839:
        r1968 = -1;
        goto L2840
    L2827:
        r3217 = r1963;
        goto L2828
    L4016:
        return;
    L2861:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1419 != BleKeyFlag.UPDATE) goto L2865;
        if (r11 == true) goto L2865;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1969 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1970 = r48.length;     // Catch: Exception -> L17
        Object r1971 = BleBAC.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1972 = (BleReadable) r1971;     // Catch: Exception -> L17
        r1972.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1970));     // Catch: Exception -> L17
        r1972.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1971, "also(...)");     // Catch: Exception -> L17
        final BleBAC r1973 = (BleBAC) ((BleReadable) r1971);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateBAC -> " + r1973);     // Catch: Exception -> L17
        r7.notifyHandlers(new XXIi0(r1973));     // Catch: Exception -> L17
        Unit r1974 = Unit.OXO1;     // Catch: Exception -> L17
    L2865:
        Unit r1975 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2866:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2869;
    L2875:
        Unit r1976 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2869:
        if (r1419 != BleKeyFlag.READ) goto L2875;
        BleReadable.Companion r1977 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1978 = r48.length;     // Catch: Exception -> L17
        Object r1979 = BleTuyaKey.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1980 = (BleReadable) r1979;     // Catch: Exception -> L17
        r1980.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1978));     // Catch: Exception -> L17
        r1980.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1979, "also(...)");     // Catch: Exception -> L17
        final BleTuyaKey r1981 = (BleTuyaKey) ((BleReadable) r1979);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadTuyaKey -> " + r1981);     // Catch: Exception -> L17
        BaseBleCache r1982 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1982 != null) goto L2873;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3219 = null;
    L2874:
        BaseBleCache.putObject$default(r3219, r3138, r1981, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O1OXX10I(r1981));     // Catch: Exception -> L17
        Unit r1983 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2875
    L2873:
        r3219 = r1982;
        goto L2874
    L2876:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L2879;
    L2885:
        Unit r1984 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2879:
        if (r1419 != BleKeyFlag.UPDATE) goto L2885;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r1985 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1986 = r48.length;     // Catch: Exception -> L17
        Object r1987 = BleHrWarningSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1988 = (BleReadable) r1987;     // Catch: Exception -> L17
        r1988.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1986));     // Catch: Exception -> L17
        r1988.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1987, "also(...)");     // Catch: Exception -> L17
        final BleHrWarningSettings r1989 = (BleHrWarningSettings) ((BleReadable) r1987);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onHRWarningSet -> " + r1989);     // Catch: Exception -> L17
        BaseBleCache r1990 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1990 != null) goto L2883;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3220 = null;
    L2884:
        BaseBleCache.putObject$default(r3220, r3138, r1989, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1IiI0O(r1989));     // Catch: Exception -> L17
        Unit r1991 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2885
    L2883:
        r3220 = r1990;
        goto L2884
    L2886:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L2889;
    L2895:
        Unit r1992 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L2889:
        if (r1419 != BleKeyFlag.READ) goto L2895;
        BleReadable.Companion r1993 = BleReadable.Companion;     // Catch: Exception -> L17
        int r1994 = r48.length;     // Catch: Exception -> L17
        Object r1995 = BleDeviceInfo2.class.newInstance();     // Catch: Exception -> L17
        BleReadable r1996 = (BleReadable) r1995;     // Catch: Exception -> L17
        r1996.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r1994));     // Catch: Exception -> L17
        r1996.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r1995, "also(...)");     // Catch: Exception -> L17
        final BleDeviceInfo2 r1997 = (BleDeviceInfo2) ((BleReadable) r1995);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDeviceInfo2 -> " + r1997);     // Catch: Exception -> L17
        BaseBleCache r1998 = r7.mBleCache;     // Catch: Exception -> L17
        if (r1998 != null) goto L2893;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3221 = null;
    L2894:
        BaseBleCache.putObject$default(r3221, r3138, r1997, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOiO1I11(r1997));     // Catch: Exception -> L17
        Unit r1999 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2895
    L2893:
        r3221 = r1998;
        goto L2894
    L2896:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        if (r11 == false) goto L2912;
        if (r1454 != BleKeyFlag.READ) goto L2910;
        BleReadable.Companion r2000 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2001 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2002 = new ArrayList();     // Catch: Exception -> L17
        int r11000 = 9;
        int r2003 = 72;
        int r2004 = (r2001 - 9) / 72;     // Catch: Exception -> L17
        if (r2004 <= 0) goto L2905;
        int r2005 = 0;
    L2903:
        if (r2005 >= r2004) goto L2905;
        BleReadable.Companion r2006 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2007 = r11000 + (r2003 * r2005);     // Catch: Exception -> L17
        r2005 = r2005 + 1;     // Catch: Exception -> L17
        byte[] r2008 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2007, r11000 + (r2003 * r2005));     // Catch: Exception -> L17
        int r2009 = r2008.length;     // Catch: Exception -> L17
        Object r2010 = BleMedicationReminder.class.newInstance();     // Catch: Exception -> L17
        BleReadable r11001 = (BleReadable) r2010;     // Catch: Exception -> L17
        r11001.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2008, 0, r2009));     // Catch: Exception -> L17
        r11001.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2010, "also(...)");     // Catch: Exception -> L17
        r2002.add((BleReadable) r2010);     // Catch: Exception -> L17
        r2003 = 72;
        r11000 = 9;
    L2905:
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " handleData onReadMedicationReminder -> " + r2002);     // Catch: Exception -> L17
        BaseBleCache r2011 = this.mBleCache;     // Catch: Exception -> L17
        if (r2011 != null) goto L2908;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3222 = null;
    L2909:
        BaseBleCache.putList$default(r3222, r3138, r2002, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new XI1O1OI1(r2002));     // Catch: Exception -> L17
        Unit r2012 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2910
    L2908:
        r3222 = r2011;
    L2910:
        r17 = this;
    L2964:
        Unit r2013 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2912:
        if (r1454 != BleKeyFlag.UPDATE) goto L2935;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2014 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2015 = r48.length;     // Catch: Exception -> L17
        Object r2016 = BleMedicationReminder.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2017 = (BleReadable) r2016;     // Catch: Exception -> L17
        r2017.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2015));     // Catch: Exception -> L17
        r2017.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2016, "also(...)");     // Catch: Exception -> L17
        final BleMedicationReminder r2018 = (BleMedicationReminder) ((BleReadable) r2016);     // Catch: Exception -> L17
        BaseBleCache r2019 = this.mBleCache;     // Catch: Exception -> L17
        if (r2019 != null) goto L2917;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3223 = null;
    L2918:
        List r2020 = BaseBleCache.getList$default(r3223, r3138, BleMedicationReminder.class, null, 4, null);     // Catch: Exception -> L17
        Iterator r2021 = r2020.iterator();     // Catch: Exception -> L17
        int r2022 = 0;
    L2920:
        if (r2021.hasNext() == false) goto L2925;
        if (((BleMedicationReminder) r2021.next()).getMId() == r2018.getMId()) goto L2926;
        r2022 = r2022 + 1;     // Catch: Exception -> L17
    L2926:
        if (r2022 <= (-1)) goto L2928;
        r2020.set(r2022, r2018);     // Catch: Exception -> L17
    L2928:
        BaseBleCache r2023 = this.mBleCache;     // Catch: Exception -> L17
        if (r2023 != null) goto L2931;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3224 = null;
    L2932:
        BaseBleCache.putList$default(r3224, r3138, r2020, null, 4, null);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " handleData onMedicationReminderUpdate -> " + r2018);     // Catch: Exception -> L17
        notifyHandlers(new IOX0O1iII(r2018));     // Catch: Exception -> L17
        goto L2910
    L2931:
        r3224 = r2023;
        goto L2932
    L2925:
        r2022 = -1;
        goto L2926
    L2917:
        r3223 = r2019;
        goto L2918
    L2935:
        if (r1454 != BleKeyFlag.DELETE) goto L2910;
        if (r48.length < 10) goto L4017;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        final int r2024 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2025 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2025 != null) goto L2944;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3225 = null;
    L2945:
        List r2026 = BaseBleCache.getList$default(r3225, r3138, BleMedicationReminder.class, null, 4, null);     // Catch: Exception -> L46
        if (r2024 != 255) goto L2948;
        r2026.clear();     // Catch: Exception -> L46
    L2959:
        BaseBleCache r2027 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2027 != null) goto L2962;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3226 = null;
    L2963:
        BaseBleCache.putList$default(r3226, r3138, r2026, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r17.getTAG() + " handleData onMedicationReminderDelete -> " + r2024);     // Catch: Exception -> L46
        r17.notifyHandlers(new I01OXOO1(r2024));     // Catch: Exception -> L46
        goto L2964
    L2962:
        r3226 = r2027;
        goto L2963
    L2948:
        Iterator r2028 = r2026.iterator();     // Catch: Exception -> L46
        int r2029 = 0;
    L2950:
        if (r2028.hasNext() == false) goto L2956;
        if (((BleMedicationReminder) r2028.next()).getMId() == r2024) goto L2953;
        r2029 = r2029 + 1;     // Catch: Exception -> L46
        goto L2950
    L2953:
        int r2030 = r2029;
    L2957:
        if (r2030 <= (-1)) goto L2959;
        r2026.remove(r2030);     // Catch: Exception -> L46
        goto L2959
    L2956:
        r2030 = -1;
        goto L2957
    L2944:
        r3225 = r2025;
        goto L2945
    L4017:
        return;
    L2965:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == false) goto L2980;
        if (r1454 != BleKeyFlag.READ) goto L3033;
        BleReadable.Companion r2031 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2032 = r48.length;     // Catch: Exception -> L46
        final ArrayList r2033 = new ArrayList();     // Catch: Exception -> L46
        int r11002 = 9;
        int r2034 = (r2032 - 9) / 28;     // Catch: Exception -> L46
        if (r2034 <= 0) goto L2974;
        int r2035 = 0;
    L2972:
        if (r2035 >= r2034) goto L2974;
        BleReadable.Companion r2036 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2037 = r11002 + (28 * r2035);     // Catch: Exception -> L46
        r2035 = r2035 + 1;     // Catch: Exception -> L46
        byte[] r2038 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2037, r11002 + (28 * r2035));     // Catch: Exception -> L46
        int r2039 = r2038.length;     // Catch: Exception -> L46
        Object r2040 = BleLoveTapUser.class.newInstance();     // Catch: Exception -> L46
        BleReadable r2041 = (BleReadable) r2040;     // Catch: Exception -> L46
        r2041.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2038, 0, r2039));     // Catch: Exception -> L46
        r2041.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r2040, "also(...)");     // Catch: Exception -> L46
        r2033.add((BleReadable) r2040);     // Catch: Exception -> L46
        r11002 = 9;
    L2974:
        i1O0OXO1O.OXO1.IiI10X(r17.getTAG() + " handleData onReadLoveTapUser -> " + r2033);     // Catch: Exception -> L46
        BaseBleCache r2042 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2042 != null) goto L2977;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3227 = null;
    L2978:
        BaseBleCache.putList$default(r3227, r3138, r2033, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new IOi01XIO(r2033));     // Catch: Exception -> L46
        Unit r2043 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3033
    L2977:
        r3227 = r2042;
    L3033:
        Unit r2044 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L2980:
        if (r1454 != BleKeyFlag.UPDATE) goto L3002;
        BleKeyFlag r2045 = r1454;
        BaseBleConnector r2046 = this;
        sendData$default(r2046, r3138, r2045, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2047 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2048 = r48.length;     // Catch: Exception -> L17
        Object r2049 = BleLoveTapUser.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2050 = (BleReadable) r2049;     // Catch: Exception -> L17
        r2050.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2048));     // Catch: Exception -> L17
        r2050.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2049, "also(...)");     // Catch: Exception -> L17
        final BleLoveTapUser r2051 = (BleLoveTapUser) ((BleReadable) r2049);     // Catch: Exception -> L17
        BaseBleCache r2052 = r2046.mBleCache;     // Catch: Exception -> L17
        if (r2052 != null) goto L2985;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3228 = null;
    L2986:
        List r2053 = BaseBleCache.getList$default(r3228, r3138, BleLoveTapUser.class, null, 4, null);     // Catch: Exception -> L17
        Iterator r2054 = r2053.iterator();     // Catch: Exception -> L17
        int r2055 = 0;
    L2988:
        if (r2054.hasNext() == false) goto L2993;
        if (((BleLoveTapUser) r2054.next()).getMId() == r2051.getMId()) goto L2994;
        r2055 = r2055 + 1;     // Catch: Exception -> L17
    L2994:
        if (r2055 <= (-1)) goto L2996;
        r2053.set(r2055, r2051);     // Catch: Exception -> L17
    L2996:
        BaseBleCache r2056 = r2046.mBleCache;     // Catch: Exception -> L17
        if (r2056 != null) goto L2999;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3229 = null;
    L3000:
        BaseBleCache.putList$default(r3229, r3138, r2053, null, 4, null);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r2046.getTAG() + " handleData onLoveTapUserUpdate -> " + r2051);     // Catch: Exception -> L17
        r2046.notifyHandlers(new OI0ii01(r2051));     // Catch: Exception -> L17
    L3001:
        r17 = r2046;
        r1454 = r2045;
        goto L3033
    L2999:
        r3229 = r2056;
        goto L3000
    L2993:
        r2055 = -1;
        goto L2994
    L2985:
        r3228 = r2052;
        goto L2986
    L3002:
        r2046 = r17;
        r2045 = r1454;
        if (r2045 != BleKeyFlag.DELETE) goto L3001;
        if (r48.length < 10) goto L4018;
        sendData$default(r2046, r3138, r2045, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = r2046;
        r1454 = r2045;
        final int r2057 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2058 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2058 != null) goto L3013;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3230 = null;
    L3014:
        List r2059 = BaseBleCache.getList$default(r3230, r3138, BleLoveTapUser.class, null, 4, null);     // Catch: Exception -> L46
        if (r2057 != 255) goto L3017;
        r2059.clear();     // Catch: Exception -> L46
    L3028:
        BaseBleCache r2060 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2060 != null) goto L3031;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3231 = null;
    L3032:
        BaseBleCache.putList$default(r3231, r3138, r2059, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r17.getTAG() + " handleData onLoveTapUserDelete -> " + r2057);     // Catch: Exception -> L46
        r17.notifyHandlers(new iiOOXXi(r2057));     // Catch: Exception -> L46
        goto L3033
    L3031:
        r3231 = r2060;
        goto L3032
    L3017:
        Iterator r2061 = r2059.iterator();     // Catch: Exception -> L46
        int r2062 = 0;
    L3019:
        if (r2061.hasNext() == false) goto L3025;
        if (((BleLoveTapUser) r2061.next()).getMId() == r2057) goto L3022;
        r2062 = r2062 + 1;     // Catch: Exception -> L46
        goto L3019
    L3022:
        int r2063 = r2062;
    L3026:
        if (r2063 <= (-1)) goto L3028;
        r2059.remove(r2063);     // Catch: Exception -> L46
        goto L3028
    L3025:
        r2063 = -1;
        goto L3026
    L3013:
        r3230 = r2058;
        goto L3014
    L4018:
        return;
    L3034:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L3037;
    L3046:
        Unit r2064 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3037:
        if (r1454 != BleKeyFlag.READ) goto L3046;
        if (r48.length < 11) goto L3955;
        final int r2065 = ByteArrayExtKt.getInt$default(r48, 9, 2, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadSleepGoal -> " + r2065);     // Catch: Exception -> L46
        BaseBleCache r2066 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2066 != null) goto L3044;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3232 = null;
    L3045:
        BaseBleCache.putInt$default(r3232, r3138, r2065, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXi1(r2065));     // Catch: Exception -> L46
        Unit r2067 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3046
    L3044:
        r3232 = r2066;
        goto L3045
    L3047:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == false) goto L3060;
        if (r1454 != BleKeyFlag.READ) goto L3060;
        if (r48.length < 13) goto L3955;
        final int r3233 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2068 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2068 != null) goto L3057;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3234 = null;
    L3058:
        BaseBleCache.putInt$default(r3234, r3138, r3233, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadDistanceGoal -> " + r3233);     // Catch: Exception -> L46
        r17.notifyHandlers(new iOiO0I1(r3233));     // Catch: Exception -> L46
        Unit r2069 = Unit.OXO1;     // Catch: Exception -> L46
    L3070:
        Unit r2070 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3057:
        r3234 = r2068;
    L3060:
        if (r1454 != BleKeyFlag.UPDATE) goto L3070;
        if (r11 == true) goto L3070;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r3235 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2071 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2071 != null) goto L3068;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3236 = null;
    L3069:
        BaseBleCache.putInt$default(r3236, r3138, r3235, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onDistanceGoalUpdate -> " + r3235);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXIOi(r3235));     // Catch: Exception -> L46
        Unit r2072 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3070
    L3068:
        r3236 = r2071;
        goto L3069
    L3071:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == false) goto L3084;
        if (r1454 != BleKeyFlag.READ) goto L3084;
        if (r48.length < 13) goto L3955;
        final int r3237 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2073 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2073 != null) goto L3081;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3238 = null;
    L3082:
        BaseBleCache.putInt$default(r3238, r3138, r3237, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadCaloriesGoal -> " + r3237);     // Catch: Exception -> L46
        r17.notifyHandlers(new XOi1IX11(r3237));     // Catch: Exception -> L46
        Unit r2074 = Unit.OXO1;     // Catch: Exception -> L46
    L3094:
        Unit r2075 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3081:
        r3238 = r2073;
    L3084:
        if (r1454 != BleKeyFlag.UPDATE) goto L3094;
        if (r11 == true) goto L3094;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r3239 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2076 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2076 != null) goto L3092;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3240 = null;
    L3093:
        BaseBleCache.putInt$default(r3240, r3138, r3239, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onCaloriesGoalUpdate -> " + r3239);     // Catch: Exception -> L46
        r17.notifyHandlers(new XO0I01XOi(r3239));     // Catch: Exception -> L46
        Unit r2077 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3094
    L3092:
        r3240 = r2076;
        goto L3093
    L3095:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r1 != BleKeyFlag.READ) goto L3109;
        if (r11 == true) goto L3100;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
    L3102:
        if (r48.length < 10) goto L4019;
        final byte r2078 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onPowerSaveModeState -> " + PowerSaveModeState.INSTANCE.getState(r2078));     // Catch: Exception -> L17
        BaseBleCache r2079 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2079 != null) goto L3107;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3241 = null;
    L3108:
        BaseBleCache.putInt$default(r3241, r3138, r2078, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXXOi1XX(r2078));     // Catch: Exception -> L17
        Unit r2080 = Unit.OXO1;     // Catch: Exception -> L17
    L3121:
        Unit r2081 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3107:
        r3241 = r2079;
        goto L3108
    L4019:
        return;
    L3100:
        r7 = this;
        r1419 = r1;
        goto L3102
    L3109:
        r7 = this;
        r1419 = r1;
        if (r11 == true) goto L3121;
        if (r1419 != BleKeyFlag.UPDATE) goto L3121;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4020;
        final byte r2082 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onPowerSaveModeStateChange -> " + PowerSaveModeState.INSTANCE.getState(r2082));     // Catch: Exception -> L17
        BaseBleCache r2083 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2083 != null) goto L3119;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3242 = null;
    L3120:
        BaseBleCache.putInt$default(r3242, r3138, r2082, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iIOOiIIII(r2082));     // Catch: Exception -> L17
        Unit r2084 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3121
    L3119:
        r3242 = r2083;
        goto L3120
    L4020:
        return;
    L3122:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1419 != BleKeyFlag.UPDATE) goto L3128;
        if (r11 == true) goto L3126;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
    L3126:
        BleReadable.Companion r2085 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2086 = r48.length;     // Catch: Exception -> L17
        Object r2087 = BleRealTimeMeasurement.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2088 = (BleReadable) r2087;     // Catch: Exception -> L17
        r2088.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2086));     // Catch: Exception -> L17
        r2088.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2087, "also(...)");     // Catch: Exception -> L17
        final BleRealTimeMeasurement r2089 = (BleRealTimeMeasurement) ((BleReadable) r2087);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onRealTimeMeasurement -> " + r2089);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiOOOOiX(r2089));     // Catch: Exception -> L17
        Unit r2090 = Unit.OXO1;     // Catch: Exception -> L17
        return;
    L3128:
        Unit r2091 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3129:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3132;
    L3138:
        if (r11 == false) goto L3140;
    L3146:
        Unit r2092 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3140:
        if (r1419 != BleKeyFlag.UPDATE) goto L3146;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2093 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2094 = r48.length;     // Catch: Exception -> L17
        Object r2095 = BleSettingWatchPassword.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2096 = (BleReadable) r2095;     // Catch: Exception -> L17
        r2096.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2094));     // Catch: Exception -> L17
        r2096.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2095, "also(...)");     // Catch: Exception -> L17
        final BleSettingWatchPassword r2097 = (BleSettingWatchPassword) ((BleReadable) r2095);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onWatchPasswordUpdate -> " + r2097);     // Catch: Exception -> L17
        BaseBleCache r2098 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2098 != null) goto L3144;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3243 = null;
    L3145:
        BaseBleCache.putObject$default(r3243, r3138, r2097, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XXIOO(r2097));     // Catch: Exception -> L17
        Unit r2099 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3146
    L3144:
        r3243 = r2098;
        goto L3145
    L3132:
        if (r1419 != BleKeyFlag.READ) goto L3138;
        BleReadable.Companion r2100 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2101 = r48.length;     // Catch: Exception -> L17
        Object r2102 = BleSettingWatchPassword.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2103 = (BleReadable) r2102;     // Catch: Exception -> L17
        r2103.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2101));     // Catch: Exception -> L17
        r2103.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2102, "also(...)");     // Catch: Exception -> L17
        final BleSettingWatchPassword r2104 = (BleSettingWatchPassword) ((BleReadable) r2102);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWatchPassword -> " + r2104);     // Catch: Exception -> L17
        BaseBleCache r2105 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2105 != null) goto L3136;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3244 = null;
    L3137:
        BaseBleCache.putObject$default(r3244, r3138, r2104, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O01iiI1(r2104));     // Catch: Exception -> L17
        Unit r2106 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3146
    L3136:
        r3244 = r2105;
        goto L3137
    L3147:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1419 != BleKeyFlag.UPDATE) goto L3151;
        if (r11 == true) goto L3151;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2107 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2108 = r48.length;     // Catch: Exception -> L17
        Object r2109 = BleBloodPressure.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2110 = (BleReadable) r2109;     // Catch: Exception -> L17
        r2110.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2108));     // Catch: Exception -> L17
        r2110.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2109, "also(...)");     // Catch: Exception -> L17
        final BleBloodPressure r2111 = (BleBloodPressure) ((BleReadable) r2109);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateBloodPressure -> " + r2111);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOXi1(r2111));     // Catch: Exception -> L17
        Unit r2112 = Unit.OXO1;     // Catch: Exception -> L17
    L3151:
        Unit r2113 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3152:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1419 != BleKeyFlag.UPDATE) goto L3156;
        if (r11 == true) goto L3156;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2114 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2115 = r48.length;     // Catch: Exception -> L17
        Object r2116 = BleTemperature.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2117 = (BleReadable) r2116;     // Catch: Exception -> L17
        r2117.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2115));     // Catch: Exception -> L17
        r2117.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2116, "also(...)");     // Catch: Exception -> L17
        final BleTemperature r2118 = (BleTemperature) ((BleReadable) r2116);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateTemperature -> " + r2118);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0IOX101X(r2118));     // Catch: Exception -> L17
        Unit r2119 = Unit.OXO1;     // Catch: Exception -> L17
    L3156:
        Unit r2120 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3157:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3160;
    L3170:
        Unit r2121 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3160:
        if (r1419 != BleKeyFlag.READ) goto L3167;
        BleReadable.Companion r2122 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2123 = r48.length;     // Catch: Exception -> L17
        Object r2124 = BleWatchFaceId.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2125 = (BleReadable) r2124;     // Catch: Exception -> L17
        r2125.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2123));     // Catch: Exception -> L17
        r2125.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2124, "also(...)");     // Catch: Exception -> L17
        final BleWatchFaceId r2126 = (BleWatchFaceId) ((BleReadable) r2124);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWatchFaceId -> " + r2126);     // Catch: Exception -> L17
        BaseBleCache r2127 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2127 != null) goto L3164;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3245 = null;
    L3165:
        BaseBleCache.putObject$default(r3245, r3138, r2126, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0O100(r2126));     // Catch: Exception -> L17
        Unit r2128 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3170
    L3164:
        r3245 = r2127;
        goto L3165
    L3167:
        if (r1419 != BleKeyFlag.UPDATE) goto L3170;
        r7.notifyHandlers(new IXXIXO01i());     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onWatchFaceIdUpdate -> true");     // Catch: Exception -> L17
        return;
    L3171:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r1454 != BleKeyFlag.UPDATE) goto L3176;
        if (r11 == true) goto L3176;
        sendData$default(r7, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2129 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2130 = r48.length;     // Catch: Exception -> L17
        Object r2131 = BleHeartRate.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2132 = (BleReadable) r2131;     // Catch: Exception -> L17
        r2132.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2130));     // Catch: Exception -> L17
        r2132.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2131, "also(...)");     // Catch: Exception -> L17
        final BleHeartRate r2133 = (BleHeartRate) ((BleReadable) r2131);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateHeartRate -> " + r2133);     // Catch: Exception -> L17
        r7.notifyHandlers(new i1XI00X1(r2133));     // Catch: Exception -> L17
        Unit r2134 = Unit.OXO1;     // Catch: Exception -> L17
    L3176:
        Unit r2135 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2095
    L3177:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3180;
    L3187:
        Unit r2136 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2095
    L3180:
        if (r48.length >= 11) goto L3183;
        return;
    L3183:
        if (r48[9] != 0) goto L3185;
        final boolean r2137 = true;
    L3186:
        r7.notifyHandlers(new I0Xi(r2137));     // Catch: Exception -> L17
        goto L3187
    L3185:
        r2137 = false;
        goto L3186
    L3189:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        if (r11 == false) goto L3192;
    L3196:
        r17 = this;
        if (r11 == true) goto L3203;
    L3209:
        if (r11 == false) goto L3211;
    L3220:
        Unit r2138 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3211:
        if (r1454 != BleKeyFlag.UPDATE) goto L3220;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r2139 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onHourSystemUpdate -> " + r2139);     // Catch: Exception -> L46
        BaseBleCache r2140 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2140 != null) goto L3218;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3246 = null;
    L3219:
        BaseBleCache.putInt$default(r3246, r3138, r2139, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i110(r2139));     // Catch: Exception -> L46
        goto L3220
    L3218:
        r3246 = r2140;
        goto L3219
    L3203:
        if (r1454 != BleKeyFlag.READ) goto L3209;
        final int r2141 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadHourSystem -> " + r2141);     // Catch: Exception -> L46
        BaseBleCache r2142 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2142 != null) goto L3207;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3247 = null;
    L3208:
        BaseBleCache.putInt$default(r3247, r3138, r2141, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new XiXi01IOO(r2141));     // Catch: Exception -> L46
        goto L3220
    L3207:
        r3247 = r2142;
        goto L3208
    L3192:
        if (r1454 == BleKeyFlag.READ) goto L3198;
        if (r1454 != BleKeyFlag.DELETE) goto L3196;
    L3198:
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        r10.IiI10X(r17.getTAG() + " handleData onFollowSystemHour -> true");     // Catch: Exception -> L46
        r17.notifyHandlers(new I01OOiii());     // Catch: Exception -> L46
        goto L3220
    L3221:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == true) goto L3224;
    L3230:
        if (r11 == false) goto L3232;
    L3241:
        Unit r2143 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3232:
        if (r1454 != BleKeyFlag.UPDATE) goto L3241;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        BleReadable.Companion r2144 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2145 = r48.length;     // Catch: Exception -> L46
        Object r2146 = BleGestureWake.class.newInstance();     // Catch: Exception -> L46
        BleReadable r2147 = (BleReadable) r2146;     // Catch: Exception -> L46
        r2147.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2145));     // Catch: Exception -> L46
        r2147.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r2146, "also(...)");     // Catch: Exception -> L46
        final BleGestureWake r2148 = (BleGestureWake) ((BleReadable) r2146);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onGestureWakeUpdate -> " + r2148);     // Catch: Exception -> L46
        BaseBleCache r2149 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2149 != null) goto L3239;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3248 = null;
    L3240:
        BaseBleCache.putObject$default(r3248, r3138, r2148, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new XX0OOI1iI(r2148));     // Catch: Exception -> L46
        Unit r2150 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3241
    L3239:
        r3248 = r2149;
        goto L3240
    L3224:
        if (r1454 != BleKeyFlag.READ) goto L3230;
        BleReadable.Companion r2151 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2152 = r48.length;     // Catch: Exception -> L46
        Object r2153 = BleGestureWake.class.newInstance();     // Catch: Exception -> L46
        BleReadable r2154 = (BleReadable) r2153;     // Catch: Exception -> L46
        r2154.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2152));     // Catch: Exception -> L46
        r2154.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r2153, "also(...)");     // Catch: Exception -> L46
        final BleGestureWake r2155 = (BleGestureWake) ((BleReadable) r2153);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadGestureWake -> " + r2155);     // Catch: Exception -> L46
        BaseBleCache r2156 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2156 != null) goto L3228;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3249 = null;
    L3229:
        BaseBleCache.putObject$default(r3249, r3138, r2155, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new i0X1O(r2155));     // Catch: Exception -> L46
        Unit r2157 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3241
    L3228:
        r3249 = r2156;
        goto L3229
    L3242:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r11 == true) goto L3245;
    L3252:
        if (r11 == false) goto L3254;
    L3251:
        r7 = this;
        r1419 = r1;
    L3264:
        Unit r2158 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3254:
        if (r1 != BleKeyFlag.UPDATE) goto L3251;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4022;
        final byte r2159 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onBacklightUpdate -> " + r2159);     // Catch: Exception -> L17
        BaseBleCache r2160 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2160 != null) goto L3262;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3250 = null;
    L3263:
        BaseBleCache.putInt$default(r3250, r3138, r2159, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1O0X1I(r2159));     // Catch: Exception -> L17
        goto L3264
    L3262:
        r3250 = r2160;
        goto L3263
    L4022:
        return;
    L3245:
        if (r1 != BleKeyFlag.READ) goto L3252;
        final int r2161 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadBacklight -> " + r2161);     // Catch: Exception -> L46
        BaseBleCache r2162 = this.mBleCache;     // Catch: Exception -> L46
        if (r2162 != null) goto L3249;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3251 = null;
    L3250:
        BaseBleCache.putInt$default(r3251, r3138, r2161, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new XXIIIX(r2161));     // Catch: Exception -> L46
        goto L3251
    L3249:
        r3251 = r2162;
        goto L3250
    L3265:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3278;
        if (r1419 != BleKeyFlag.UPDATE) goto L3278;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4023;
        final byte r2163 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onVibrationUpdate -> " + r2163);     // Catch: Exception -> L17
        BaseBleCache r2164 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2164 != null) goto L3275;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3252 = null;
    L3276:
        BaseBleCache.putInt$default(r3252, r3138, r2163, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0IX1(r2163));     // Catch: Exception -> L17
    L3289:
        Unit r2165 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3275:
        r3252 = r2164;
        goto L3276
    L4023:
        return;
    L3278:
        if (r11 == false) goto L3289;
        if (r1419 != BleKeyFlag.READ) goto L3289;
        if (r48.length < 10) goto L4024;
        final byte r2166 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onVibrationUpdate -> " + r2166);     // Catch: Exception -> L17
        BaseBleCache r2167 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2167 != null) goto L3287;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3253 = null;
    L3288:
        BaseBleCache.putInt$default(r3253, r3138, r2166, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new Ii1XO(r2166));     // Catch: Exception -> L17
        goto L3289
    L3287:
        r3253 = r2167;
        goto L3288
    L4024:
        return;
    L3290:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3293;
    L3302:
        Unit r2168 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3293:
        if (r1419 != BleKeyFlag.UPDATE) goto L3302;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        if (r48.length < 10) goto L4025;
        final byte r2169 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onVibrationUpdate -> " + r2169);     // Catch: Exception -> L17
        BaseBleCache r2170 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2170 != null) goto L3300;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3254 = null;
    L3301:
        BaseBleCache.putInt$default(r3254, r3138, r2169, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O1OX1OXii(r2169));     // Catch: Exception -> L17
        goto L3302
    L3300:
        r3254 = r2170;
        goto L3301
    L4025:
        return;
    L3303:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3306;
    L3312:
        if (r11 == false) goto L3314;
    L3320:
        Unit r2171 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3314:
        if (r1419 != BleKeyFlag.UPDATE) goto L3320;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2172 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2173 = r48.length;     // Catch: Exception -> L17
        Object r2174 = BleDrinkWaterSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2175 = (BleReadable) r2174;     // Catch: Exception -> L17
        r2175.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2173));     // Catch: Exception -> L17
        r2175.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2174, "also(...)");     // Catch: Exception -> L17
        final BleDrinkWaterSettings r2176 = (BleDrinkWaterSettings) ((BleReadable) r2174);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onDrinkWaterUpdate -> " + r2176);     // Catch: Exception -> L17
        BaseBleCache r2177 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2177 != null) goto L3318;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3255 = null;
    L3319:
        BaseBleCache.putObject$default(r3255, r3138, r2176, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0X111(r2176));     // Catch: Exception -> L17
        Unit r2178 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3320
    L3318:
        r3255 = r2177;
        goto L3319
    L3306:
        if (r1419 != BleKeyFlag.READ) goto L3312;
        BleReadable.Companion r2179 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2180 = r48.length;     // Catch: Exception -> L17
        Object r2181 = BleDrinkWaterSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2182 = (BleReadable) r2181;     // Catch: Exception -> L17
        r2182.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2180));     // Catch: Exception -> L17
        r2182.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2181, "also(...)");     // Catch: Exception -> L17
        final BleDrinkWaterSettings r2183 = (BleDrinkWaterSettings) ((BleReadable) r2181);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDrinkWater -> " + r2183);     // Catch: Exception -> L17
        BaseBleCache r2184 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2184 != null) goto L3310;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3256 = null;
    L3311:
        BaseBleCache.putObject$default(r3256, r3138, r2183, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IOI1I0iII(r2183));     // Catch: Exception -> L17
        Unit r2185 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3320
    L3310:
        r3256 = r2184;
        goto L3311
    L3321:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3324;
    L3337:
        Unit r2186 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3324:
        if (r1419 != BleKeyFlag.READ) goto L3334;
        if (r48.length < 10) goto L4026;
        final byte r2187 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadWatchFaceSwitch -> " + r2187);     // Catch: Exception -> L17
        BaseBleCache r2188 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2188 != null) goto L3331;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3257 = null;
    L3332:
        BaseBleCache.putInt$default(r3257, r3138, r2187, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0O10(r2187));     // Catch: Exception -> L17
        goto L3337
    L3331:
        r3257 = r2188;
        goto L3332
    L4026:
        return;
    L3334:
        if (r1419 != BleKeyFlag.UPDATE) goto L3337;
        r7.notifyHandlers(new XXOX0O());     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUpdateWatchFaceSwitch -> true");     // Catch: Exception -> L17
        return;
    L3338:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3341;
    L3345:
        if (r11 == true) goto L3347;
    L3356:
        Unit r2189 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3347:
        if (r1419 != BleKeyFlag.READ) goto L3356;
        if (r48.length < 10) goto L4027;
        final byte r2190 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadDateFormat -> " + r2190);     // Catch: Exception -> L17
        BaseBleCache r2191 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2191 != null) goto L3354;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3258 = null;
    L3355:
        BaseBleCache.putInt$default(r3258, r3138, r2190, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XiX011I(r2190));     // Catch: Exception -> L17
        goto L3356
    L3354:
        r3258 = r2191;
        goto L3355
    L4027:
        return;
    L3341:
        if (r1419 != BleKeyFlag.READ) goto L3343;
    L3344:
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onFollowSystemDateFormat -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new IiOIXO());     // Catch: Exception -> L17
        goto L3356
    L3343:
        if (r1419 != BleKeyFlag.DELETE) goto L3345;
    L3357:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3360;
    L3369:
        Unit r2192 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3360:
        if (r1419 != BleKeyFlag.READ) goto L3369;
        if (r48.length < 10) goto L4028;
        final byte r2193 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadTemperatureUnit -> " + r2193);     // Catch: Exception -> L17
        BaseBleCache r2194 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2194 != null) goto L3367;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3259 = null;
    L3368:
        BaseBleCache.putInt$default(r3259, r3138, r2193, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IO10I(r2193));     // Catch: Exception -> L17
        goto L3369
    L3367:
        r3259 = r2194;
        goto L3368
    L4028:
        return;
    L3370:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3373;
    L3377:
        if (r11 == true) goto L3379;
    L3388:
        Unit r2195 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3379:
        if (r1419 != BleKeyFlag.READ) goto L3388;
        if (r48.length < 10) goto L4029;
        final byte r2196 = r48[9];     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadLanguage -> " + r2196);     // Catch: Exception -> L17
        BaseBleCache r2197 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2197 != null) goto L3386;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3260 = null;
    L3387:
        BaseBleCache.putInt$default(r3260, r3138, r2196, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXOOi(r2196));     // Catch: Exception -> L17
        goto L3388
    L3386:
        r3260 = r2197;
        goto L3387
    L4029:
        return;
    L3373:
        if (r1419 != BleKeyFlag.READ) goto L3375;
    L3376:
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onFollowSystemLanguage -> true");     // Catch: Exception -> L17
        r7.notifyHandlers(new XXI11OO());     // Catch: Exception -> L17
        goto L3388
    L3375:
        if (r1419 != BleKeyFlag.DELETE) goto L3377;
    L3389:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3392;
    L3394:
        if (r11 == true) goto L3396;
    L3398:
        Unit r2198 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3396:
        if (r1419 != BleKeyFlag.READ) goto L3398;
        BleReadable.Companion r2199 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2200 = r48.length;     // Catch: Exception -> L17
        Object r2201 = BleCyWeeAlgorithm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2202 = (BleReadable) r2201;     // Catch: Exception -> L17
        r2202.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2200));     // Catch: Exception -> L17
        r2202.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2201, "also(...)");     // Catch: Exception -> L17
        final BleCyWeeAlgorithm r2203 = (BleCyWeeAlgorithm) ((BleReadable) r2201);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadCyWeeAlgorithm -> " + r2203);     // Catch: Exception -> L17
        r7.notifyHandlers(new XIO0iO(r2203));     // Catch: Exception -> L17
        Unit r2204 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3398
    L3392:
        if (r1419 != BleKeyFlag.READ) goto L3394;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2205 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2206 = r48.length;     // Catch: Exception -> L17
        Object r2207 = BleCyWeeAlgorithm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2208 = (BleReadable) r2207;     // Catch: Exception -> L17
        r2208.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2206));     // Catch: Exception -> L17
        r2208.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2207, "also(...)");     // Catch: Exception -> L17
        final BleCyWeeAlgorithm r2209 = (BleCyWeeAlgorithm) ((BleReadable) r2207);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadCyWeeAlgorithm -> " + r2209);     // Catch: Exception -> L17
        r7.notifyHandlers(new I010iI1ii(r2209));     // Catch: Exception -> L17
        Unit r2210 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3398
    L3399:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3402;
    L3409:
        Unit r2211 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3402:
        if (r1419 != BleKeyFlag.UPDATE) goto L3409;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2212 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2213 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2214 = new ArrayList();     // Catch: Exception -> L17
        int r11003 = 9;
        int r2215 = (r2213 - 9) / 16;     // Catch: Exception -> L17
        if (r2215 <= 0) goto L3408;
        int r2216 = 0;
    L3406:
        if (r2216 >= r2215) goto L3408;
        BleReadable.Companion r2217 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2218 = r11003 + (16 * r2216);     // Catch: Exception -> L17
        r2216 = r2216 + 1;     // Catch: Exception -> L17
        byte[] r2219 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2218, r11003 + (16 * r2216));     // Catch: Exception -> L17
        int r2220 = r2219.length;     // Catch: Exception -> L17
        Object r2221 = BleLocationGsv.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2222 = (BleReadable) r2221;     // Catch: Exception -> L17
        r2222.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2219, 0, r2220));     // Catch: Exception -> L17
        r2222.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2221, "also(...)");     // Catch: Exception -> L17
        r2214.add((BleReadable) r2221);     // Catch: Exception -> L17
        r11003 = 9;
    L3408:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveLocationGsv -> " + r2214);     // Catch: Exception -> L17
        r7.notifyHandlers(new iI00O(r2214));     // Catch: Exception -> L17
        Unit r2223 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3409
    L3410:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3413;
    L3415:
        Unit r2224 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3413:
        if (r1419 != BleKeyFlag.UPDATE) goto L3415;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2225 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2226 = r48.length;     // Catch: Exception -> L17
        Object r2227 = BleLocationGga.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2228 = (BleReadable) r2227;     // Catch: Exception -> L17
        r2228.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2226));     // Catch: Exception -> L17
        r2228.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2227, "also(...)");     // Catch: Exception -> L17
        final BleLocationGga r2229 = (BleLocationGga) ((BleReadable) r2227);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReceiveLocationGga -> " + r2229);     // Catch: Exception -> L17
        r7.notifyHandlers(new I00OX(r2229));     // Catch: Exception -> L17
        Unit r2230 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3415
    L3416:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3419;
    L3426:
        Unit r2231 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3419:
        if (r1419 != BleKeyFlag.UPDATE) goto L3426;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2232 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2233 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2234 = new ArrayList();     // Catch: Exception -> L17
        int r11004 = 9;
        int r2235 = 2;
        int r2236 = (r2233 - 9) / 2;     // Catch: Exception -> L17
        if (r2236 <= 0) goto L3425;
        int r2237 = 0;
    L3423:
        if (r2237 >= r2236) goto L3425;
        BleReadable.Companion r2238 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2239 = r11004 + (r2235 * r2237);     // Catch: Exception -> L17
        r2237 = r2237 + 1;     // Catch: Exception -> L17
        byte[] r2240 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2239, r11004 + (r2235 * r2237));     // Catch: Exception -> L17
        int r2241 = r2240.length;     // Catch: Exception -> L17
        Object r2242 = BleGSensorMotion.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2243 = (BleReadable) r2242;     // Catch: Exception -> L17
        r2243.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2240, 0, r2241));     // Catch: Exception -> L17
        r2243.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2242, "also(...)");     // Catch: Exception -> L17
        r2234.add((BleReadable) r2242);     // Catch: Exception -> L17
        r11004 = 9;
        r2235 = 2;
    L3425:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveGSensorMotion -> " + r2234);     // Catch: Exception -> L17
        r7.notifyHandlers(new XIOO(r2234));     // Catch: Exception -> L17
        Unit r2244 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3426
    L3427:
        BleKeyFlag r2245 = r1;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L3430;
    L3437:
        BleKey r11005 = r2;
    L3438:
        Unit r2246 = Unit.OXO1;     // Catch: Exception -> L17
    L3439:
        r12 = r2245;
        r2 = r11005;
        goto L3829
    L3430:
        if (r2245 != BleKeyFlag.UPDATE) goto L3437;
        BleKey r2247 = r2;
        sendData$default(r7, r2247, r2245, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2248 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2249 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2250 = new ArrayList();     // Catch: Exception -> L17
        int r11006 = 9;
        int r2251 = 4;
        int r2252 = (r2249 - 9) / 4;     // Catch: Exception -> L17
        if (r2252 <= 0) goto L3436;
        int r2253 = 0;
    L3434:
        if (r2253 >= r2252) goto L3436;
        BleReadable.Companion r2254 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2255 = r11006 + (r2251 * r2253);     // Catch: Exception -> L17
        r2253 = r2253 + 1;     // Catch: Exception -> L17
        byte[] r2256 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2255, r11006 + (r2251 * r2253));     // Catch: Exception -> L17
        int r2257 = r2256.length;     // Catch: Exception -> L17
        Object r11007 = BleHRRaw.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2258 = (BleReadable) r11007;     // Catch: Exception -> L17
        r2258.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2256, 0, r2257));     // Catch: Exception -> L17
        r2258.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r11007, "also(...)");     // Catch: Exception -> L17
        r2250.add((BleReadable) r11007);     // Catch: Exception -> L17
        r2247 = r2247;
        r2251 = 4;
        r11006 = 9;
    L3436:
        r11005 = r2247;
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveHRRaw -> " + r2250);     // Catch: Exception -> L17
        r7.notifyHandlers(new Oi0ii10i1(r2250));     // Catch: Exception -> L17
        Unit r2259 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3438
    L3440:
        r2245 = r1;
        r11005 = r2;
        r11 = r6;
        r7 = this;
        if (r11 == false) goto L3443;
    L3450:
        Unit r2260 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3439
    L3443:
        if (r2245 != BleKeyFlag.UPDATE) goto L3450;
        BleKey r2261 = r11005;
        sendData$default(r7, r2261, r2245, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2262 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2263 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2264 = new ArrayList();     // Catch: Exception -> L17
        int r11008 = 9;
        int r2265 = (r2263 - 9) / 12;     // Catch: Exception -> L17
        if (r2265 <= 0) goto L3449;
        int r2266 = 0;
    L3447:
        if (r2266 >= r2265) goto L3449;
        BleReadable.Companion r2267 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2268 = r11008 + (12 * r2266);     // Catch: Exception -> L17
        r2266 = r2266 + 1;     // Catch: Exception -> L17
        byte[] r2269 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2268, r11008 + (12 * r2266));     // Catch: Exception -> L17
        int r2270 = r2269.length;     // Catch: Exception -> L17
        Object r2271 = BlePpgSHSY.class.newInstance();     // Catch: Exception -> L17
        BleReadable r11009 = (BleReadable) r2271;     // Catch: Exception -> L17
        r11009.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2269, 0, r2270));     // Catch: Exception -> L17
        r11009.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2271, "also(...)");     // Catch: Exception -> L17
        r2264.add((BleReadable) r2271);     // Catch: Exception -> L17
        r2261 = r2261;
        r11008 = 9;
    L3449:
        r11005 = r2261;
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceivePggSHSY -> " + r2264);     // Catch: Exception -> L17
        r7.notifyHandlers(new iOIOIIX(r2264));     // Catch: Exception -> L17
        Unit r2272 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3450
    L3451:
        r1419 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3454;
    L3467:
        r3138 = r2;
    L3468:
        Unit r2273 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3454:
        if (r1419 != BleKeyFlag.UPDATE) goto L3467;
        sendData$default(r7, r2, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r3138 = r2;
        final byte[] r2274 = ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r48.length);     // Catch: Exception -> L17
        final boolean r2275 = r7.isCmTraceStart(r2274);     // Catch: Exception -> L17
        if (r2275 == false) goto L3459;
        r7.mReceivingCmTrace = true;     // Catch: Exception -> L17
    L3459:
        if (r7.mReceivingCmTrace == false) goto L3461;
        r10.IiI10X(r7.getTAG() + " handleData onReceiveCmTrace -> size=" + r2274.length + ", startsNewTrace=" + r2275);     // Catch: Exception -> L17
        r7.notifyHandlers(new XO101(r2274, r2275));     // Catch: Exception -> L17
        goto L3468
    L3461:
        BleReadable.Companion r2276 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2277 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2278 = new ArrayList();     // Catch: Exception -> L17
        int r11010 = 9;
        int r2279 = 20;
        int r2280 = (r2277 - 9) / 20;     // Catch: Exception -> L17
        if (r2280 <= 0) goto L3466;
        int r2281 = 0;
    L3464:
        if (r2281 >= r2280) goto L3466;
        BleReadable.Companion r2282 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2283 = r11010 + (r2279 * r2281);     // Catch: Exception -> L17
        r2281 = r2281 + 1;     // Catch: Exception -> L17
        byte[] r2284 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2283, r11010 + (r2279 * r2281));     // Catch: Exception -> L17
        int r2285 = r2284.length;     // Catch: Exception -> L17
        Object r2286 = BleGSensorSHSY.class.newInstance();     // Catch: Exception -> L17
        BleReadable r11011 = (BleReadable) r2286;     // Catch: Exception -> L17
        r11011.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2284, 0, r2285));     // Catch: Exception -> L17
        r11011.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2286, "also(...)");     // Catch: Exception -> L17
        r2278.add((BleReadable) r2286);     // Catch: Exception -> L17
        r2279 = 20;
        r11010 = 9;
    L3466:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveGSensorSHSY -> " + r2278);     // Catch: Exception -> L17
        r7.notifyHandlers(new OXIX0i(r2278));     // Catch: Exception -> L17
        Unit r2287 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3468
    L3469:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3472;
    L3479:
        Unit r2288 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3472:
        if (r1419 != BleKeyFlag.UPDATE) goto L3479;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2289 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2290 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2291 = new ArrayList();     // Catch: Exception -> L17
        int r11012 = 9;
        int r2292 = (r2290 - 9) / 6;     // Catch: Exception -> L17
        if (r2292 <= 0) goto L3478;
        int r2293 = 0;
    L3476:
        if (r2293 >= r2292) goto L3478;
        BleReadable.Companion r2294 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2295 = r11012 + (6 * r2293);     // Catch: Exception -> L17
        r2293 = r2293 + 1;     // Catch: Exception -> L17
        byte[] r2296 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2295, r11012 + (6 * r2293));     // Catch: Exception -> L17
        int r2297 = r2296.length;     // Catch: Exception -> L17
        Object r2298 = BleGSensorRaw.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2299 = (BleReadable) r2298;     // Catch: Exception -> L17
        r2299.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2296, 0, r2297));     // Catch: Exception -> L17
        r2299.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2298, "also(...)");     // Catch: Exception -> L17
        r2291.add((BleReadable) r2298);     // Catch: Exception -> L17
        r11012 = 9;
    L3478:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReceiveGSensorRaw -> " + r2291);     // Catch: Exception -> L17
        r7.notifyHandlers(new O0OOOO(r2291));     // Catch: Exception -> L17
        Unit r2300 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3479
    L3480:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3483;
    L3487:
        Unit r2301 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3483:
        if (r1419 != BleKeyFlag.READ) goto L3485;
    L3486:
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onRequestAgpsPrerequisite");     // Catch: Exception -> L17
        r7.notifyHandlers(new IiI0IXX());     // Catch: Exception -> L17
        goto L3487
    L3485:
        if (r1419 != BleKeyFlag.UPDATE) goto L3487;
    L3488:
        r5 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3491;
    L3493:
        r2 = r2;
    L3494:
        Unit r2302 = Unit.OXO1;     // Catch: Exception -> L17
        goto L24
    L3491:
        if (r5 != BleKeyFlag.UPDATE) goto L3493;
        r2 = r2;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2303 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2304 = r48.length;     // Catch: Exception -> L17
        Object r2305 = BleRealtimeLog.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2306 = (BleReadable) r2305;     // Catch: Exception -> L17
        r2306.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2304));     // Catch: Exception -> L17
        r2306.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2305, "also(...)");     // Catch: Exception -> L17
        final BleRealtimeLog r2307 = (BleRealtimeLog) ((BleReadable) r2305);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReceiveRealtimeLog -> " + r2307);     // Catch: Exception -> L17
        r7.notifyHandlers(new XOOOiIXI(r2307));     // Catch: Exception -> L17
        Unit r2308 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3494
    L3495:
        r5 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3498;
    L3506:
        Unit r2309 = Unit.OXO1;     // Catch: Exception -> L17
        goto L24
    L3498:
        if (r5 != BleKeyFlag.READ) goto L3506;
        if (r48.length < 15) goto L4030;
        BleReadable.Companion r2310 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2311 = r48.length;     // Catch: Exception -> L17
        Object r2312 = BleSleepQuality.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2313 = (BleReadable) r2312;     // Catch: Exception -> L17
        r2313.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2311));     // Catch: Exception -> L17
        r2313.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2312, "also(...)");     // Catch: Exception -> L17
        final BleSleepQuality r2314 = (BleSleepQuality) ((BleReadable) r2312);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadSleepQuality -> " + r2314);     // Catch: Exception -> L17
        BaseBleCache r2315 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2315 != null) goto L3505;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r2315 = null;
    L3505:
        r2315.putObject(r2, r2314, r5);     // Catch: Exception -> L17
        r7.notifyHandlers(new XIO0XX(r2314));     // Catch: Exception -> L17
        goto L3506
    L4030:
        return;
    L3507:
        r1419 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3510;
    L3516:
        r3138 = r2;
    L3517:
        Unit r2316 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3510:
        if (r1419 != BleKeyFlag.READ) goto L3516;
        BleReadable.Companion r2317 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2318 = r48.length;     // Catch: Exception -> L17
        Object r2319 = BleHrMonitoringSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2320 = (BleReadable) r2319;     // Catch: Exception -> L17
        r2320.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2318));     // Catch: Exception -> L17
        r2320.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2319, "also(...)");     // Catch: Exception -> L17
        final BleHrMonitoringSettings r2321 = (BleHrMonitoringSettings) ((BleReadable) r2319);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadHrMonitoringSettings -> " + r2321);     // Catch: Exception -> L17
        BaseBleCache r2322 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2322 != null) goto L3514;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3261 = null;
    L3515:
        r3138 = r2;
        BaseBleCache.putObject$default(r3261, r3138, r2321, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XXIIX(r2321));     // Catch: Exception -> L17
        Unit r2323 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3517
    L3514:
        r3261 = r2322;
        goto L3515
    L3518:
        r5 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3521;
    L3534:
        r2 = r2;
    L3535:
        Unit r2324 = Unit.OXO1;     // Catch: Exception -> L17
        goto L24
    L3521:
        if (r5 != BleKeyFlag.UPDATE) goto L3534;
        if (r48.length >= 10) goto L3526;
        return;
    L3526:
        if (r48[9] != 0) goto L3528;
        final boolean r2325 = true;
    L3529:
        r2 = r2;
        sendData$default(r7, r2, r5, null, true, false, 16, null);     // Catch: Exception -> L17
        StringBuilder r2326 = new StringBuilder();     // Catch: Exception -> L17
        r2326.append(r7.getTAG());     // Catch: Exception -> L17
        r2326.append(" handleData onFindPhone -> ");     // Catch: Exception -> L17
        if (r2325 == false) goto L3532;
        String r2327 = C2985d4.i.d0;
    L3533:
        r2326.append(r2327);     // Catch: Exception -> L17
        r10.IiI10X(r2326.toString());     // Catch: Exception -> L17
        r7.notifyHandlers(new X0I0OO(r2325));     // Catch: Exception -> L17
        goto L3535
    L3532:
        r2327 = C2985d4.i.h0;
        goto L3533
    L3528:
        r2325 = false;
        goto L3529
    L3536:
        r5 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3539;
    L3544:
        Unit r2328 = Unit.OXO1;     // Catch: Exception -> L17
        goto L24
    L3539:
        if (r5 != BleKeyFlag.READ) goto L3544;
        BleReadable.Companion r2329 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2330 = r48.length;     // Catch: Exception -> L17
        Object r2331 = BleCoachingIds.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2332 = (BleReadable) r2331;     // Catch: Exception -> L17
        r2332.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2330));     // Catch: Exception -> L17
        r2332.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2331, "also(...)");     // Catch: Exception -> L17
        final BleCoachingIds r2333 = (BleCoachingIds) ((BleReadable) r2331);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadCoachingIds -> " + r2333);     // Catch: Exception -> L17
        BaseBleCache r2334 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2334 != null) goto L3543;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r2334 = null;
    L3543:
        r2334.putObject(r2, r2333, r5);     // Catch: Exception -> L17
        r7.notifyHandlers(new O1I01iOI(r2333));     // Catch: Exception -> L17
        goto L3544
    L3545:
        r1419 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3548;
    L3557:
        r3138 = r2;
    L3558:
        Unit r2335 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3548:
        if (r1419 != BleKeyFlag.READ) goto L3557;
        if (r48.length < 10) goto L4032;
        final int r2336 = r48[9] + 1;     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadUnit -> " + r2336);     // Catch: Exception -> L17
        BaseBleCache r2337 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2337 != null) goto L3555;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3262 = null;
    L3556:
        r3138 = r2;
        BaseBleCache.putInt$default(r3262, r3138, r2336, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XX1X10OX(r2336));     // Catch: Exception -> L17
        goto L3558
    L3555:
        r3262 = r2337;
        goto L3556
    L4032:
        return;
    L3559:
        r1419 = r1;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3576;
        if (r1419 != BleKeyFlag.READ) goto L3573;
        BleReadable.Companion r2338 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2339 = r48.length;     // Catch: Exception -> L17
        final ArrayList r2340 = new ArrayList();     // Catch: Exception -> L17
        int r11013 = 9;
        int r2341 = (r2339 - 9) / 28;     // Catch: Exception -> L17
        if (r2341 <= 0) goto L3568;
        int r2342 = 0;
    L3566:
        if (r2342 >= r2341) goto L3568;
        BleReadable.Companion r2343 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2344 = r11013 + (28 * r2342);     // Catch: Exception -> L17
        r2342 = r2342 + 1;     // Catch: Exception -> L17
        byte[] r2345 = ArraysKt___ArraysJvmKt.I0IIOI(r48, r2344, r11013 + (28 * r2342));     // Catch: Exception -> L17
        int r2346 = r2345.length;     // Catch: Exception -> L17
        Object r2347 = BleAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2348 = (BleReadable) r2347;     // Catch: Exception -> L17
        r2348.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2345, 0, r2346));     // Catch: Exception -> L17
        r2348.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2347, "also(...)");     // Catch: Exception -> L17
        r2340.add((BleReadable) r2347);     // Catch: Exception -> L17
        r11013 = 9;
    L3568:
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onReadAlarm -> " + r2340);     // Catch: Exception -> L17
        BaseBleCache r2349 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2349 != null) goto L3571;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3263 = null;
    L3572:
        BaseBleCache.putList$default(r3263, r2, r2340, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X1Ii1I(r2340));     // Catch: Exception -> L17
        Unit r2350 = Unit.OXO1;     // Catch: Exception -> L17
        r3138 = r2;
    L3639:
        Unit r2351 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3571:
        r3263 = r2349;
        goto L3572
    L3573:
        r7.notifyHandlers(new IOi11iX01(r2, r1419));     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + r38 + r2 + r39 + r1419 + r37);     // Catch: Exception -> L17
        return;
    L3576:
        if (r1419 != BleKeyFlag.UPDATE) goto L3596;
        sendData$default(r7, r2, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        r3138 = r2;
        BleReadable.Companion r2352 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2353 = r48.length;     // Catch: Exception -> L17
        Object r2354 = BleAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2355 = (BleReadable) r2354;     // Catch: Exception -> L17
        r2355.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2353));     // Catch: Exception -> L17
        r2355.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2354, "also(...)");     // Catch: Exception -> L17
        final BleAlarm r2356 = (BleAlarm) ((BleReadable) r2354);     // Catch: Exception -> L17
        BaseBleCache r2357 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2357 != null) goto L3580;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3264 = null;
    L3581:
        List r2358 = BaseBleCache.getList$default(r3264, r3138, BleAlarm.class, null, 4, null);     // Catch: Exception -> L17
        Iterator r2359 = r2358.iterator();     // Catch: Exception -> L17
        int r2360 = 0;
    L3583:
        if (r2359.hasNext() == false) goto L3588;
        if (((BleAlarm) r2359.next()).getMId() == r2356.getMId()) goto L3589;
        r2360 = r2360 + 1;     // Catch: Exception -> L17
    L3589:
        if (r2360 <= (-1)) goto L3591;
        r2358.set(r2360, r2356);     // Catch: Exception -> L17
    L3591:
        BaseBleCache r2361 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2361 != null) goto L3594;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3265 = null;
    L3595:
        BaseBleCache.putList$default(r3265, r3138, r2358, null, 4, null);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(r7.getTAG() + " handleData onAlarmUpdate -> " + r2356);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiXI(r2356));     // Catch: Exception -> L17
        goto L3639
    L3594:
        r3265 = r2361;
        goto L3595
    L3588:
        r2360 = -1;
        goto L3589
    L3580:
        r3264 = r2357;
        goto L3581
    L3596:
        r3138 = r2;
        if (r1419 == BleKeyFlag.DELETE) goto L3599;
        BaseBleConnector r2362 = r7;
        BleKeyFlag r2363 = r1419;
        if (r2363 == BleKeyFlag.CREATE) goto L3629;
    L3626:
        r7 = r2362;
        r1419 = r2363;
        goto L3639
    L3629:
        r1419 = r2363;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2364 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2365 = r48.length;     // Catch: Exception -> L17
        Object r2366 = BleAlarm.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2367 = (BleReadable) r2366;     // Catch: Exception -> L17
        r2367.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2365));     // Catch: Exception -> L17
        r2367.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2366, "also(...)");     // Catch: Exception -> L17
        final BleAlarm r2368 = (BleAlarm) ((BleReadable) r2366);     // Catch: Exception -> L17
        BaseBleCache r2369 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2369 != null) goto L3633;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3266 = null;
    L3634:
        List r2370 = BaseBleCache.getList$default(r3266, r3138, BleAlarm.class, null, 4, null);     // Catch: Exception -> L17
        r2370.add(r2368);     // Catch: Exception -> L17
        BaseBleCache r2371 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2371 != null) goto L3637;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3267 = null;
    L3638:
        BaseBleCache.putList$default(r3267, r3138, r2370, null, 4, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onAlarmAdd -> " + r2368);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiXI1X1I0(r2368));     // Catch: Exception -> L17
        goto L3639
    L3637:
        r3267 = r2371;
        goto L3638
    L3633:
        r3266 = r2369;
        goto L3634
    L3599:
        if (r48.length < 10) goto L4033;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L50
        r2362 = r7;
        r2363 = r1419;
        final int r2372 = ByteArrayExtKt.getInt$default(r48, 9, 1, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2373 = r2362.mBleCache;     // Catch: Exception -> L46
        if (r2373 != null) goto L3606;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3268 = null;
    L3607:
        List r2374 = BaseBleCache.getList$default(r3268, r3138, BleAlarm.class, null, 4, null);     // Catch: Exception -> L46
        if (r2372 != 255) goto L3610;
        r2374.clear();     // Catch: Exception -> L46
    L3621:
        BaseBleCache r2375 = r2362.mBleCache;     // Catch: Exception -> L46
        if (r2375 != null) goto L3624;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3269 = null;
    L3625:
        BaseBleCache.putList$default(r3269, r3138, r2374, null, 4, null);     // Catch: Exception -> L46
        i1O0OXO1O.OXO1.IiI10X(r2362.getTAG() + " handleData onAlarmDelete -> " + r2372);     // Catch: Exception -> L46
        r2362.notifyHandlers(new X0X1XO1II(r2372));     // Catch: Exception -> L46
        goto L3626
    L3624:
        r3269 = r2375;
        goto L3625
    L3610:
        Iterator r2376 = r2374.iterator();     // Catch: Exception -> L46
        int r2377 = 0;
    L3612:
        if (r2376.hasNext() == false) goto L3618;
        if (((BleAlarm) r2376.next()).getMId() == r2372) goto L3615;
        r2377 = r2377 + 1;     // Catch: Exception -> L46
        goto L3612
    L3615:
        int r2378 = r2377;
    L3619:
        if (r2378 <= (-1)) goto L3621;
        r2374.remove(r2378);     // Catch: Exception -> L46
        goto L3621
    L3618:
        r2378 = -1;
        goto L3619
    L3606:
        r3268 = r2373;
        goto L3607
    L4033:
        return;
    L3640:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3643;
    L3652:
        if (r11 == false) goto L3654;
    L3660:
        Unit r2379 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3654:
        if (r1419 != BleKeyFlag.UPDATE) goto L3660;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2380 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2381 = r48.length;     // Catch: Exception -> L17
        Object r2382 = BleNoDisturbSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2383 = (BleReadable) r2382;     // Catch: Exception -> L17
        r2383.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2381));     // Catch: Exception -> L17
        r2383.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2382, "also(...)");     // Catch: Exception -> L17
        final BleNoDisturbSettings r2384 = (BleNoDisturbSettings) ((BleReadable) r2382);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onNoDisturbUpdate -> " + r2384);     // Catch: Exception -> L17
        BaseBleCache r2385 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2385 != null) goto L3658;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3270 = null;
    L3659:
        BaseBleCache.putObject$default(r3270, r3138, r2384, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1i1XO1(r2384));     // Catch: Exception -> L17
        Unit r2386 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3660
    L3658:
        r3270 = r2385;
        goto L3659
    L3643:
        if (r1419 != BleKeyFlag.READ) goto L3652;
        BleReadable.Companion r2387 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2388 = r48.length;     // Catch: Exception -> L17
        Object r2389 = BleNoDisturbSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2390 = (BleReadable) r2389;     // Catch: Exception -> L17
        r2390.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2388));     // Catch: Exception -> L17
        r2390.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2389, "also(...)");     // Catch: Exception -> L17
        final BleNoDisturbSettings r2391 = (BleNoDisturbSettings) ((BleReadable) r2389);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadNoDisturb -> " + r2391);     // Catch: Exception -> L17
        if (r2391.getMEnabled() == 31) goto L3651;
        BaseBleCache r2392 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2392 != null) goto L3649;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3271 = null;
    L3650:
        BaseBleCache.putObject$default(r3271, r3138, r2391, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new XX1XIiI(r2391));     // Catch: Exception -> L17
        goto L3651
    L3649:
        r3271 = r2392;
    L3651:
        Unit r2393 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3660
    L3661:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        if (r11 == true) goto L3664;
    L3671:
        if (r11 == false) goto L3673;
    L3670:
        r17 = this;
    L3681:
        Unit r2394 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3673:
        if (r1454 != BleKeyFlag.UPDATE) goto L3670;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        BleReadable.Companion r2395 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2396 = r48.length;     // Catch: Exception -> L46
        Object r2397 = BleSedentarinessSettings.class.newInstance();     // Catch: Exception -> L46
        BleReadable r2398 = (BleReadable) r2397;     // Catch: Exception -> L46
        r2398.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2396));     // Catch: Exception -> L46
        r2398.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r2397, "also(...)");     // Catch: Exception -> L46
        final BleSedentarinessSettings r2399 = (BleSedentarinessSettings) ((BleReadable) r2397);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onUpdateSedentariness -> " + r2399);     // Catch: Exception -> L46
        BaseBleCache r2400 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2400 != null) goto L3679;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3272 = null;
    L3680:
        BaseBleCache.putObject$default(r3272, r3138, r2399, null, 4, null);     // Catch: Exception -> L46
        r17.notifyHandlers(new OXii1IO(r2399));     // Catch: Exception -> L46
        Unit r2401 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3681
    L3679:
        r3272 = r2400;
        goto L3680
    L3664:
        if (r1454 != BleKeyFlag.READ) goto L3671;
        BleReadable.Companion r2402 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2403 = r48.length;     // Catch: Exception -> L17
        Object r2404 = BleSedentarinessSettings.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2405 = (BleReadable) r2404;     // Catch: Exception -> L17
        r2405.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2403));     // Catch: Exception -> L17
        r2405.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2404, "also(...)");     // Catch: Exception -> L17
        final BleSedentarinessSettings r2406 = (BleSedentarinessSettings) ((BleReadable) r2404);     // Catch: Exception -> L17
        r10.IiI10X(getTAG() + " handleData onReadSedentariness -> " + r2406);     // Catch: Exception -> L17
        BaseBleCache r2407 = this.mBleCache;     // Catch: Exception -> L17
        if (r2407 != null) goto L3668;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3273 = null;
    L3669:
        BaseBleCache.putObject$default(r3273, r3138, r2406, null, 4, null);     // Catch: Exception -> L17
        notifyHandlers(new XXiX1O(r2406));     // Catch: Exception -> L17
        Unit r2408 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3670
    L3668:
        r3273 = r2407;
        goto L3669
    L3682:
        r1454 = r1;
        r3138 = r2;
        r11 = r6;
        r17 = this;
        if (r11 == false) goto L3695;
        if (r1454 != BleKeyFlag.READ) goto L3695;
        if (r48.length < 13) goto L3955;
        final int r3274 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2409 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2409 != null) goto L3692;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3275 = null;
    L3693:
        BaseBleCache.putInt$default(r3275, r3138, r3274, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onReadStepGoal -> " + r3274);     // Catch: Exception -> L46
        r17.notifyHandlers(new X01i11(r3274));     // Catch: Exception -> L46
        Unit r2410 = Unit.OXO1;     // Catch: Exception -> L46
    L3705:
        Unit r2411 = Unit.OXO1;     // Catch: Exception -> L46
        goto L2094
    L3692:
        r3275 = r2409;
    L3695:
        if (r1454 != BleKeyFlag.UPDATE) goto L3705;
        if (r11 == true) goto L3705;
        sendData$default(this, r3138, r1454, null, true, false, 16, null);     // Catch: Exception -> L50
        r17 = this;
        r1454 = r1454;
        final int r3276 = ByteArrayExtKt.getInt$default(r48, 9, 4, null, 4, null);     // Catch: Exception -> L46
        BaseBleCache r2412 = r17.mBleCache;     // Catch: Exception -> L46
        if (r2412 != null) goto L3703;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3277 = null;
    L3704:
        BaseBleCache.putInt$default(r3277, r3138, r3276, null, 4, null);     // Catch: Exception -> L46
        r10.IiI10X(r17.getTAG() + " handleData onStepGoalUpdate -> " + r3276);     // Catch: Exception -> L46
        r17.notifyHandlers(new i01XO(r3276));     // Catch: Exception -> L46
        Unit r2413 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3705
    L3703:
        r3277 = r2412;
        goto L3704
    L3706:
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        if (r11 == true) goto L3709;
    L3716:
        if (r11 == false) goto L3718;
    L3715:
        r7 = this;
        r1419 = r1;
    L3725:
        Unit r2414 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3718:
        if (r1 != BleKeyFlag.UPDATE) goto L3715;
        r1419 = r1;
        r7 = this;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
        BleReadable.Companion r2415 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2416 = r48.length;     // Catch: Exception -> L17
        Object r2417 = BleUserProfile.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2418 = (BleReadable) r2417;     // Catch: Exception -> L17
        r2418.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2416));     // Catch: Exception -> L17
        r2418.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2417, "also(...)");     // Catch: Exception -> L17
        final BleUserProfile r2419 = (BleUserProfile) ((BleReadable) r2417);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onUserProfileUpdate -> " + r2419);     // Catch: Exception -> L17
        BaseBleCache r2420 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2420 != null) goto L3723;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3278 = null;
    L3724:
        BaseBleCache.putObject$default(r3278, r3138, r2419, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iX01XXXO(r2419));     // Catch: Exception -> L17
        Unit r2421 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3725
    L3723:
        r3278 = r2420;
        goto L3724
    L3709:
        if (r1 != BleKeyFlag.READ) goto L3716;
        BleReadable.Companion r2422 = BleReadable.Companion;     // Catch: Exception -> L46
        int r2423 = r48.length;     // Catch: Exception -> L46
        Object r2424 = BleUserProfile.class.newInstance();     // Catch: Exception -> L46
        BleReadable r2425 = (BleReadable) r2424;     // Catch: Exception -> L46
        r2425.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2423));     // Catch: Exception -> L46
        r2425.decode();     // Catch: Exception -> L46
        Intrinsics.O10IXXX0X(r2424, "also(...)");     // Catch: Exception -> L46
        final BleUserProfile r2426 = (BleUserProfile) ((BleReadable) r2424);     // Catch: Exception -> L46
        r10.IiI10X(getTAG() + " handleData onReadUserProfile -> " + r2426);     // Catch: Exception -> L46
        BaseBleCache r2427 = this.mBleCache;     // Catch: Exception -> L46
        if (r2427 != null) goto L3713;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L46
        BaseBleCache r3279 = null;
    L3714:
        BaseBleCache.putObject$default(r3279, r3138, r2426, null, 4, null);     // Catch: Exception -> L46
        notifyHandlers(new XOiI(r2426));     // Catch: Exception -> L46
        Unit r2428 = Unit.OXO1;     // Catch: Exception -> L46
        goto L3715
    L3713:
        r3279 = r2427;
        goto L3714
    L3726:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        BleReadable.Companion r2429 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2430 = r48.length;     // Catch: Exception -> L17
        Object r2431 = BleBleAddress.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2432 = (BleReadable) r2431;     // Catch: Exception -> L17
        r2432.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2430));     // Catch: Exception -> L17
        r2432.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2431, "also(...)");     // Catch: Exception -> L17
        final String r2433 = ((BleBleAddress) ((BleReadable) r2431)).getMAddress();     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadBleAddress -> " + r2433);     // Catch: Exception -> L17
        BaseBleCache r2434 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2434 != null) goto L3729;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3280 = null;
    L3730:
        BaseBleCache.putObject$default(r3280, r3138, r2433, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new IiX1XOIiX(r2433));     // Catch: Exception -> L17
        Unit r2435 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3729:
        r3280 = r2434;
        goto L3730
    L3731:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3734;
    L3740:
        Unit r2436 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3734:
        if (r1419 != BleKeyFlag.READ) goto L3740;
        BleReadable.Companion r2437 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2438 = r48.length;     // Catch: Exception -> L17
        Object r2439 = BleLanguagePackVersion.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2440 = (BleReadable) r2439;     // Catch: Exception -> L17
        r2440.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2438));     // Catch: Exception -> L17
        r2440.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2439, "also(...)");     // Catch: Exception -> L17
        final BleLanguagePackVersion r3281 = (BleLanguagePackVersion) ((BleReadable) r2439);     // Catch: Exception -> L17
        BaseBleCache r2441 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2441 != null) goto L3738;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3282 = null;
    L3739:
        BaseBleCache.putObject$default(r3282, r3138, r3281, null, 4, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadLanguagePackVersion -> " + r3281);     // Catch: Exception -> L17
        r7.notifyHandlers(new I1iXO1(r3281));     // Catch: Exception -> L17
        Unit r2442 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3740
    L3738:
        r3282 = r2441;
        goto L3739
    L3741:
        r1419 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3745;
        sendData$default(r7, r3138, r1419, null, true, false, 16, null);     // Catch: Exception -> L17
    L3745:
        if (r48.length < 10) goto L4034;
        final Ref.IntRef r2443 = new Ref.IntRef();     // Catch: Exception -> L17
        byte r2444 = r48[9];     // Catch: Exception -> L17
        r2443.element = r2444;     // Catch: Exception -> L17
        if (r2444 >= 0) goto L3750;
        r2443.element = 0;     // Catch: Exception -> L17
    L3750:
        BaseBleCache r2445 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2445 != null) goto L3753;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3283 = null;
    L3754:
        BaseBleCache.putInt$default(r3283, r3138, r2443.element, null, 4, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onReadPower -> " + r2443.element);     // Catch: Exception -> L17
        r7.notifyHandlers(new XO0I10(r2443));     // Catch: Exception -> L17
        Unit r2446 = Unit.OXO1;     // Catch: Exception -> L17
        goto L2061
    L3753:
        r3283 = r2445;
        goto L3754
    L4034:
        return;
    L3755:
        r12 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == true) goto L3761;
        if (r12 != BleKeyFlag.UPDATE) goto L3761;
        sendData$default(r7, r3138, r12, null, true, false, 16, null);     // Catch: Exception -> L17
        r10.IiI10X(r7.getTAG() + " handleData onTimeUpdate");     // Catch: Exception -> L17
        r7.notifyHandlers(new OXXXI1I());     // Catch: Exception -> L17
    L3761:
        Unit r2447 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1997
    L3762:
        r12 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        Unit r2448 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1997
    L3763:
        r12 = r1;
        r3138 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r48.length >= 10) goto L3767;
        return;
    L3767:
        if (r48[9] != 0) goto L3769;
        final boolean r2449 = true;
    L3770:
        r10.IiI10X(r7.getTAG() + " handleData onOTA -> " + r2449);     // Catch: Exception -> L17
        r7.notifyHandlers(new II100(r2449));     // Catch: Exception -> L17
        Unit r2450 = Unit.OXO1;     // Catch: Exception -> L17
        goto L1997
    L3769:
        r2449 = false;
        goto L3770
    L3771:
        r12 = r1;
        r2 = r2;
        r11 = r6;
        r37 = r37;
        r38 = r38;
        r39 = r39;
        r7 = this;
        if (r11 == false) goto L3827;
        BleKeyFlag r2451 = BleKeyFlag.READ;     // Catch: Exception -> L17
        if (r12 != r2451) goto L3827;
        BleReadable.Companion r2452 = BleReadable.Companion;     // Catch: Exception -> L17
        int r2453 = r48.length;     // Catch: Exception -> L17
        Object r2454 = BleVersion.class.newInstance();     // Catch: Exception -> L17
        BleReadable r2455 = (BleReadable) r2454;     // Catch: Exception -> L17
        r2455.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r48, 9, r2453));     // Catch: Exception -> L17
        r2455.decode();     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2454, "also(...)");     // Catch: Exception -> L17
        final String r2456 = ((BleVersion) ((BleReadable) r2454)).getMVersion();     // Catch: Exception -> L17
        int r2457 = r4[r2.ordinal()];     // Catch: Exception -> L17
        if (r2457 != 1) goto L3778;
        r10.IiI10X(r7.getTAG() + " handleData onReadFirmwareVersion -> " + r2456);     // Catch: Exception -> L17
        BaseBleCache r2458 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2458 != null) goto L3810;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3284 = null;
    L3811:
        String r2459 = BaseBleCache.getString$default(r3284, r2, null, null, 6, null);     // Catch: Exception -> L17
        if (r2459.length() > 0) goto L3814;
    L3821:
        BaseBleCache r2460 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2460 != null) goto L3824;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3285 = null;
    L3825:
        BaseBleCache.putString$default(r3285, r2, r2456, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new OiiI11XOI(r2456));     // Catch: Exception -> L17
        Unit r2461 = Unit.OXO1;     // Catch: Exception -> L17
    L3826:
        Unit r2462 = Unit.OXO1;     // Catch: Exception -> L17
    L3828:
        Unit r2463 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3829
    L3824:
        r3285 = r2460;
        goto L3825
    L3814:
        if (Intrinsics.XOO0ii0(r2459, r2456) == true) goto L3821;
        BaseBleCache r2464 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2464 != null) goto L3819;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        r2464 = null;
    L3819:
        if (r2464.getMSupportReadDeviceInfo() != 1) goto L3821;
        sendData$default(r7, BleKey.IDENTITY, r2451, null, false, false, 28, null);     // Catch: Exception -> L17
        goto L3821
    L3810:
        r3284 = r2458;
        goto L3811
    L3778:
        if (r2457 != 2) goto L3780;
        r10.IiI10X(r7.getTAG() + " handleData onReadUiPackVersion -> " + r2456);     // Catch: Exception -> L17
        BaseBleCache r2465 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2465 != null) goto L3805;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3286 = null;
    L3806:
        BaseBleCache.putString$default(r3286, r2, r2456, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0III0X1(r2456));     // Catch: Exception -> L17
        Unit r2466 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3826
    L3805:
        r3286 = r2465;
        goto L3806
    L3780:
        if (r2457 != 3) goto L3782;
        r10.IiI10X(r7.getTAG() + " handleData onReadGpsFirmwareVersion -> " + r2456);     // Catch: Exception -> L17
        BaseBleCache r2467 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2467 != null) goto L3800;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3287 = null;
    L3801:
        BaseBleCache.putString$default(r3287, r2, r2456, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iiXiOOO(r2456));     // Catch: Exception -> L17
        Unit r2468 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3826
    L3800:
        r3287 = r2467;
        goto L3801
    L3782:
        if (r2457 != 4) goto L3784;
        r10.IiI10X(r7.getTAG() + " handleData onReadNetworkFirmwareVersion -> " + r2456);     // Catch: Exception -> L17
        BaseBleCache r2469 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2469 != null) goto L3795;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3288 = null;
    L3796:
        BaseBleCache.putString$default(r3288, r2, r2456, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new iO1i0O(r2456));     // Catch: Exception -> L17
        Unit r2470 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3826
    L3795:
        r3288 = r2469;
        goto L3796
    L3784:
        if (r2457 == 5) goto L3787;
    L3785:
        Unit r2471 = Unit.OXO1;     // Catch: Exception -> L17
        goto L3826
    L3787:
        r10.IiI10X(r7.getTAG() + " handleData onReadIPCVersion -> " + r2456);     // Catch: Exception -> L17
        BaseBleCache r2472 = r7.mBleCache;     // Catch: Exception -> L17
        if (r2472 != null) goto L3790;
        Intrinsics.XXO("mBleCache");     // Catch: Exception -> L17
        BaseBleCache r3289 = null;
    L3791:
        BaseBleCache.putString$default(r3289, r2, r2456, null, 4, null);     // Catch: Exception -> L17
        r7.notifyHandlers(new X0X0IO000(r2456));     // Catch: Exception -> L17
        goto L3785
    L3790:
        r3289 = r2472;
    L3827:
        r2 = r2;
    L46:
        e = e;
    L3874:
        e.printStackTrace();
        return;
    L50:
        e = e;
    L17:
        e = e;
        goto L3874
    L3953:
        return;
    L6:
        e = e;
        goto L3874
    }

    private static final Unit handleData$lambda$0(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onOTA(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$1(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onTimeUpdate();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$10$0(BleSedentarinessSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSedentariness(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$100$0(BleSOSSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSOSSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$101$0(BleSOSSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSOSSettingsUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$102$0(BleGirlCareSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGirlCareSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$103$0(BleDeviceLanguages r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceLanguages(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$104$0(BleDeviceSportData r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeviceSportDataUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$105$0(BlePressureTimingMeasurement r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPressureTimingMeasurement(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$106$0(BlePressureTimingMeasurement r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPressureTimingMeasurement(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$107$0(BleBloodOxyGenSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodOxyGenSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$108$0(BleBloodOxyGenSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodOxyGenSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$109$0(BleStandbyWatchFaceSet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadStandbyWatchFaceSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$11$0(BleSedentarinessSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSedentariness(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$110$0(BleStandbyWatchFaceSet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onStandbyWatchFaceSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$111(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadFallSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$112(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onFallSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$113$0(BleBWNaviInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBWNaviInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$114$0(BleSDCardInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSDCardInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$115$0(BleSDCardInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSDCardInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$116$0(BleActivityDetail r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadActivityDetail(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$117(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadNotificationLightScreenSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$118(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onNotificationLightScreenSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$119$0(BleBloodPressureCalibration r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodPressureCalibration(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$12$0(BleNoDisturbSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadNoDisturb(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$120$0(BleGoogleNaviInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onGoogleNaviInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$121$0(BleEarphonePower r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphonePower(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$122$0(BleEarphoneAncSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneAncSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$123$0(BleEarphoneAncSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onEarphoneAncSettingsUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$124$0(BleEarphoneSoundEffectsSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneSoundEffectsSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$125$0(BleEarphoneSoundEffectsSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onEarphoneSoundEffectsSettingsUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$126(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadScreenBrightnessSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$127(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onScreenBrightnessSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$128$0(BleEarphoneInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$129$0(BleEarphoneState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$13$0(BleNoDisturbSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onNoDisturbUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$130$0(BleEarphoneState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onEarphoneStateUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$131(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneCall(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$132(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onEarphoneCallUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$133$0(BleGoMoreSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGoMoreSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$134$0(BleRingVibrationSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRingVibrationSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$135$0(BleRingVibrationSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRingVibrationSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$136$0(BleEcgSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEcgSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$137$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSportDurationGoal(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$138(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onFindWatchUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$139(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onWatchFaceIndexCreate(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$14$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAlarm(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$140$0(BleWatchFaceIndex r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWatchFaceIndex(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$141$0(BleWatchFaceIndex r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onWatchFaceIndexUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$142$0(BleSosContact r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSosContact(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$143$0(BleSosContact r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSosContactUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$144$0(BleGirlCareMonthly r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGirlCareMonthly(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$145$0(BleCheckInEveryDay r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCheckInEveryDay(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$146$0(BleCheckInEveryDay r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCheckInEveryDayUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$147$0(BleGestureWake2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGestureWake2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$148$0(BleGestureWake2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onGestureWake2Update(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$149$0(BleEarphoneKey r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEarphoneKey(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$15(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandReply(r1, r2, true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$150$0(BleEarphoneKey r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onEarphoneKeyUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$151$0(BleHanBaoSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHanBaoSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$152$0(BleQiblaSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadQiblaSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$153(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onQiblaSettingsUpdate();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$154$0(BleFindEarphone r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onFindEarphoneUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$155$0(BleCalibrationData r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCalibrationData(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$156$0(BleBatteryUsage r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBatteryUsage(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$157$0(BleDeviceUniqueDataSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceUniqueDataSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$158$0(BleIPCStoresInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadIPCStoresInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$159$0(BleIPCStoresInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIPCStoresInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$160(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepQualityScore(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$161$0(BleRelaxReminder r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRelaxReminder(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$162$0(BleCPUserInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCPUserInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$163$0(BlePower2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPower2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$164$0(BleDeviceLanguages2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceLanguages2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$165$0(BleIPCInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadIPCInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$166(BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        BleHandleCallback.onIdentityCreate$default(r3, false, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$167(BaseBleConnector r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        BaseBleCache r3 = r1.mBleCache;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r3 = null;
    L5:
        r2.onIdentityCreate(true, r3.getMDeviceInfo());
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$168(BaseBleConnector r1) {
        BaseBleCache r0 = r1.mBleCache;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L5:
        BleDeviceInfo r2 = r0.getMDeviceInfo();
        Intrinsics.XXI(r2);
        r1.login(r2.getMId());
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$169(BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        BleHandleCallback.onIdentityCreate$default(r3, false, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$17(BleAlarm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAlarmUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$170(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIdentityDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$171(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIdentityDeleteByDevice(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$172(BleDeviceInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$173(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onSessionStateChange(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$175(MusicCommand r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveMusicCommand(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$176(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandReply(r1, r2, true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$177(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onReadWeatherRealTime(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$178$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHIDState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$179$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHIDValueChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$180$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorldClock(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$182(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onWorldClockDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$183$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadStock(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$185(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onStockDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$186(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onReadStock(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$187$0(BleChatMessage r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onChatMessageUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$188$0(BleChatVoice r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onChatVoiceUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$189$0(BleCPGiftsInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCPGiftsInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$19(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAlarmDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$190$0(BleSleepNotify r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSleepNotifyUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$191$0(BleXMLYBandSet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onXMLYBandSetUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$192$0(BleBandKey r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBandKeyUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$193$0(BleOfflineAsrSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadOfflineAsrSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$194$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadActivity(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$195$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHeartRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$196$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodPressure(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$197$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleep(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$198$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorkout(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$199$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadLocation(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$2(Ref.IntRef r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPower(r1.element);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$20(BleAlarm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAlarmAdd(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$200$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadTemperature(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$201$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodOxygen(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$202$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleHrv(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$203$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleLogText(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$204(byte[] r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepRaw(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$205$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPressure(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$206$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorkout2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$207$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMatchRecord(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$208$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBloodGlucose(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$209$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBodyStatus(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$21(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadUnit(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$210$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMindStatus(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$211$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCalorieIntake(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$212$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadFoodBalance(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$213$0(BleGolfWatchScore r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGolfWatchScore(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$214$0(BleGolfWatchScore r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGolfWatchScore(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$215$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBAC(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$216$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMatchRecord2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$217$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAvgHeartRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$218$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAlipayBindInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$219$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRri(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$22(BleCoachingIds r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCoachingIds(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$220$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEcg(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$221$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHanBaoVibration(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$222$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSosCallLog(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$223$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorkout3(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$224$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorkout4(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$225$0(BleWorkout4Segmentation r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWorkout4Segmentation(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$226$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadEnergyRating(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$227$0(BleECGRealtime r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadECGRealtime(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$228$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDailyPower(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$229$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadTrainingStatus(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$23(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onFindPhone(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$230$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadVitalityValue(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$231$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadVitalityValue(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$232$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRespiratoryRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$233$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMatchRecord3(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$234(boolean r1, int r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCameraResponse(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$235$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCameraStateChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$236$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onContactUsStateChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$237$0(BleSGSet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSGSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$238$0(BleSGTts r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSGTtsUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$239$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRequestLocation(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$24$0(BleHrMonitoringSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrMonitoringSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$240$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIncomingCallStatus(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$241$0(BleAppSportState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateAppSportState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$242$0(BleAppSportState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAppSportState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$243$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadClassicBluetoothState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$244$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onClassicBluetoothStateChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$245$0(BleFactoryTest r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onFactoryTestUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$246$0(BleSMSQuickReply r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeviceSMSQuickReply(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$247$0(BleLoveTap r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onLoveTapUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$248$0(BleBacCalibration r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onReadBacCalibration(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$249$0(BleBacCalibration r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onReadBacCalibration(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$25(BleSleepQuality r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepQuality(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$250(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadIncomingCallRing(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$251(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIncomingCallRingUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$252(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSportEndNotifyUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$253$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadOngoingDialogue(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$254$0(BleSGKeySet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSGKeySet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$255$0(BleDoubleScreenSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDoubleScreenSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$256$0(BleDoubleScreenSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDoubleScreenSettingsUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$257$0(BleAppAudioBookList r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadFilePath(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$258(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandReply(r1, r2, true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$259$0(BleAppInfoList r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAppInfoList(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$26$0(BleRealtimeLog r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveRealtimeLog(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$260$0(BleAppOp r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAppOpUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$261(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHanBaoVibrationStateChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$262$0(BleMeasurement r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMeasurementUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$263$0(BleGameControl r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onGameControlUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$264$0(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAppApiVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$265$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeviceOpUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$266$0(BleReceiveFilePacket r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveFilePacket(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$267$0(BleAICommand r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAICommandUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$268$0(BleSGCameraSet r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSGCameraSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$269$0(BleIPCState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadIPCState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$27(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onRequestAgpsPrerequisite();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$270$0(BleIPCState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIPCStateUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$271$0(BleIPCWifiInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIPCWifiInfoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$272$0$0(BleAICoachBeforePlan r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAICoachGenerateBeforeInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$272$1$0(BleAICoachGeneratePlan r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAICoachPlan(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$273$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAICoachGeneratePlanUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$274$0$0(BleAICoachBeforePlanV2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAICoachGenerateBeforeInfoV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$274$1$0(BleAICoachGeneratePlanV2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAICoachPlanV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$275$0$0(BleAICoachBeforePlanV2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateAICoachGenerateBeforeInfoV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$275$1$0(BleAICoachGeneratePlanV2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAICoachPlanV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$275$2$0(BleLeaveDay r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateAICoachLeaveDay(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$275$3(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onDeleteAICoachPlan();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$275$4(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAICoachGeneratePlanUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$276$0(BleRecordControl r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRecordControl(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$277$0(BleRecordControl r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRecordControlUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$278$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMultiFileTransferReadFile(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$279$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMultiFileTransferResponse(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$28$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveGSensorRaw(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$280$0(BleMapFileList r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMultiFileTransfer(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$281$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMultiFileTransferResponse(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$282$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeleteFileResponse(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$283$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWearWayState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$284$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onWearWayUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$285$0(BleSGTest r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onSGTestUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$286$0(BleSGKeywordAwake r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSGKeywordAwake(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$287$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSGSleepSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$288$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadLactateThreshold(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$289$0(BleChatApp r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadChatApp(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$29(byte[] r1, boolean r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onReceiveCmTrace(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$290$0(BleChatApp r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onChatAppUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$291$0(BleCPListener r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCPListenerUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$292$0(BleIPCException r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIPCExceptionUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$293$0(BleIPCOTAState r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onIPCOTAStateUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$294$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHighAntiAssistChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$295(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHighAntiAssistChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$296$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrMonitoringSettingsV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$297(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrMonitoringSettingsV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$298$0(BleHrvBaseLine r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrvBaseLine(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$299$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepMonitoringMode(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$3$0(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadFirmwareVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$3$1(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadUiPackVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$3$2(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGpsFirmwareVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$3$3(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadNetworkFirmwareVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$3$4(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadIPCVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$30$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveGSensorSHSY(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$300(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepMonitoringMode(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$301$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepRespiratoryRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$302(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepRespiratoryRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$303$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRestingHeartRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$304$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadRestingHeartRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$305$0(BleHeartRateZones r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHeartRateZones(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$306$0(BleVideoCallInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBleVideoCallInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$307$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepRiskLevel(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$308$0(BleOptionalMapAuthInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadOptionalMapAuthInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$309$0(BleWatchFaceMaxSize r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWatchFaceMaxSize(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$31$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceivePpgSHSY(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$310(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onActivityRecognitionUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$311$0(BleGolfSportSwitch r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfSportSwitch(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$312$0(BleGolfSportSwitch r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfSportSwitch(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$313$0(BleGolfWatchVersionInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfWatchVersionInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$314$0(BleGolfWatchVersionInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfWatchVersionInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$315$0(BleGolfWatchMapInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfWatchMapInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$316$0(BleGolfWatchMapInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfWatchMapInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$317$0(BleGolfScore r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBleGolfScore(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$318$0(BleGolfScore r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBleGolfScore(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$319$0(BleDeviceFile2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceFileV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$32$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveHRRaw(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$320$0(BleAddressBook r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAddressBook(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$321$1(BleStreamProgress r7, BleKey r8, BleHandleCallback r9) {
        Intrinsics.X0O(r9, "it");
        if (r7.getMStatus() != 0) goto L6;
        boolean r0 = true;
    L5:
        boolean r2 = r0;
        r9.onStreamProgress(r2, r7.getMErrorCode(), r7.getMTotal(), r7.getMCompleted(), r8);
        return Unit.OXO1;
    L6:
        r0 = false;
        goto L5
    }

    private static final Unit handleData$lambda$322(BleKey r1, BleKeyFlag r2, boolean r3, BleHandleCallback r4) {
        Intrinsics.X0O(r4, "it");
        r4.onCommandReply(r1, r2, r3);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$323(BaseBleConnector r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        BaseBleCache r3 = r1.mBleCache;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r3 = null;
    L5:
        r2.onDeviceRequestAGpsFile(r3.getMAGpsFileUrl());
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$324$0(BleThirdPartyData r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBleThirdPartyDataUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$325$0(BleCPChat r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCPChatUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$326$0(BleCPMissYou r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCPMissYouUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$327$0(BleCPTodo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCPTodoUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$328$0(BleDeviceFile r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceFile(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$329$0(BleDeviceFile r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDeviceFileUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$33$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveGSensorMotion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$330$0(BleHydrationSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHydrationSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$331$0(BleHydrationSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHydrationUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$332$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMeetingReminder(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$333(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandReply(r1, r2, true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$335(BleMeetingReminder r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMeetingReminderUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$337(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMeetingReminderDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$338(BleMeetingReminder r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMeetingReminderAdd(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$339$0(BleGolfMapCacheInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfMapCacheInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$34$0(BleLocationGga r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveLocationGga(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$340$0(BleGolfMapCacheInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleGolfMapCacheInfo(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$341$0(BleHrvMonitoringSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrvMonitoringSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$342$0(BleHrvMonitoringSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHrvMonitoringSettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$343$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$344(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$345$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadVoiceControl(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$346(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadVoiceControl(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$347(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandReply(r1, r2, true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$35$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveLocationGsv(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$36$0(BleCyWeeAlgorithm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCyWeeAlgorithm(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$37$0(BleCyWeeAlgorithm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCyWeeAlgorithm(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$38(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onFollowSystemLanguage(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$39(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadLanguage(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$4$0(BleLanguagePackVersion r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadLanguagePackVersion(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$40(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadTemperatureUnit(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$41(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onFollowSystemDateFormat();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$42(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDateFormat(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$43(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWatchFaceSwitch(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$44(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onUpdateWatchFaceSwitch(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$45$0(BleDrinkWaterSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDrinkWater(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$46$0(BleDrinkWaterSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDrinkWaterUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$47(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onVibrationUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$48(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onVibrationUpdateV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$49(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onVibrationUpdateV2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$5$0(String r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBleAddress(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$50(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadBacklight(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$51(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onBacklightUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$52$0(BleGestureWake r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadGestureWake(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$53$0(BleGestureWake r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onGestureWakeUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$54(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onFollowSystemHour();
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$55(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadHourSystem(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$56(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHourSystemUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$57(boolean r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onAppSportDataResponse(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$58$0(BleHeartRate r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateHeartRate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$59$0(BleWatchFaceId r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWatchFaceId(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$6$0(BleUserProfile r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadUserProfile(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$60(BleHandleCallback r1) {
        Intrinsics.X0O(r1, "it");
        r1.onWatchFaceIdUpdate(true);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$61$0(BleTemperature r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateTemperature(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$62$0(BleBloodPressure r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateBloodPressure(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$63$0(BleSettingWatchPassword r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWatchPassword(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$64$0(BleSettingWatchPassword r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onWatchPasswordUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$65$0(BleRealTimeMeasurement r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onRealTimeMeasurement(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$66$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onPowerSaveModeState(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$67$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onPowerSaveModeStateChange(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$68$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadCaloriesGoal(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$69$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onCaloriesGoalUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$7$0(BleUserProfile r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUserProfileUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$70$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDistanceGoal(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$71$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onDistanceGoalUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$72$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadSleepGoal(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$73$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadLoveTapUser(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$75(BleLoveTapUser r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onLoveTapUserUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$77(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onLoveTapUserDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$78$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMedicationReminder(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$8$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadStepGoal(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$80(BleMedicationReminder r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMedicationReminderUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$82(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMedicationReminderDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$83$0(BleDeviceInfo2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadDeviceInfo2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$84$0(BleHrWarningSettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onHRWarningSet(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$85$0(BleTuyaKey r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadTuyaKey(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$86$0(BleBAC r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onUpdateBAC(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$87$0(List r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadMedicationAlarm(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$89(BleMedicationAlarm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMedicationAlarmUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$9$0(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onStepGoalUpdate(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$91(int r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMedicationAlarmDelete(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$92(BleMedicationAlarm r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onMedicationAlarmAdd(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$93$0(BlePackageStatus r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadPackageStatus(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$94$0(BleNotificationSettings2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadNotificationSettings2(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$95$0(BleNotificationSettings2 r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onNotificationSettings2Update(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$96$0(BleAlipaySettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadAlipaySettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$97$0(BleWechatPaySettings r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReadWechatPaySettings(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$98$0(BleRecordPacket r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onReceiveRecordPacket(r1);
        return Unit.OXO1;
    }

    private static final Unit handleData$lambda$99$0(BleNaviInfo r1, BleHandleCallback r2) {
        Intrinsics.X0O(r2, "it");
        r2.onNaviInfoUpdate(r1);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit i0(BleIPCState r0, BleHandleCallback r1) {
        return handleData$lambda$269$0(r0, r1);
    }

    public static /* synthetic */ Unit i000X(BleBacCalibration r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$249$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit i010(BleGolfWatchMapInfo r0, BleHandleCallback r1) {
        return handleData$lambda$316$0(r0, r1);
    }

    public static /* synthetic */ Unit i0101i(BleGameControl r0, BleHandleCallback r1) {
        return handleData$lambda$263$0(r0, r1);
    }

    public static /* synthetic */ Unit i010I(BleEarphoneSoundEffectsSettings r0, BleHandleCallback r1) {
        return handleData$lambda$124$0(r0, r1);
    }

    public static /* synthetic */ Unit i01OOiI(BleHeartRate r0, BleHandleCallback r1) {
        return handleData$lambda$58$0(r0, r1);
    }

    public static /* synthetic */ Unit i01XIiIiI(BleLocationGga r0, BleHandleCallback r1) {
        return handleData$lambda$34$0(r0, r1);
    }

    public static /* synthetic */ Unit i0I0O111I(BleNaviInfo r0, BleHandleCallback r1) {
        return handleData$lambda$99$0(r0, r1);
    }

    public static /* synthetic */ Unit i0I1i0Xi(BleGolfWatchVersionInfo r0, BleHandleCallback r1) {
        return handleData$lambda$313$0(r0, r1);
    }

    public static /* synthetic */ Unit i0Ii001(BlePressureTimingMeasurement r0, BleHandleCallback r1) {
        return handleData$lambda$106$0(r0, r1);
    }

    public static /* synthetic */ Unit i0O(BleUserProfile r0, BleHandleCallback r1) {
        return handleData$lambda$6$0(r0, r1);
    }

    public static /* synthetic */ Unit i0OXO(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$333(r0, r1, r2);
    }

    public static /* synthetic */ Unit i0X000X0O(BleAICoachGeneratePlanV2 r0, BleHandleCallback r1) {
        return handleData$lambda$275$1$0(r0, r1);
    }

    public static /* synthetic */ Unit i0X1iIO(BleHandleCallback r0) {
        return handleData$lambda$54(r0);
    }

    public static /* synthetic */ Unit i0XI0(BleDeviceInfo r0, BleHandleCallback r1) {
        return handleData$lambda$172(r0, r1);
    }

    public static /* synthetic */ Unit i0XO1(BleNoDisturbSettings r0, BleHandleCallback r1) {
        return handleData$lambda$13$0(r0, r1);
    }

    public static /* synthetic */ Unit i0i(int r0, BleHandleCallback r1) {
        return handleData$lambda$301$0(r0, r1);
    }

    public static /* synthetic */ Unit i0iIXiI(List r0, BleHandleCallback r1) {
        return handleData$lambda$217$0(r0, r1);
    }

    public static /* synthetic */ Unit i0iOi(int r0, BleHandleCallback r1) {
        return handleData$lambda$252(r0, r1);
    }

    public static /* synthetic */ Unit i1(List r0, BleHandleCallback r1) {
        return handleData$lambda$198$0(r0, r1);
    }

    public static /* synthetic */ Unit i100IXOX(int r0, BleHandleCallback r1) {
        return handleData$lambda$56(r0, r1);
    }

    public static /* synthetic */ Unit i101iO(BleSDCardInfo r0, BleHandleCallback r1) {
        return handleData$lambda$114$0(r0, r1);
    }

    public static /* synthetic */ Unit i10X0X0i(BleHandleCallback r0) {
        return handleData$lambda$173(r0);
    }

    public static /* synthetic */ Unit i11I(BleHanBaoSettings r0, BleHandleCallback r1) {
        return handleData$lambda$151$0(r0, r1);
    }

    public static /* synthetic */ Unit i11XO(BleHandleCallback r0) {
        return handleData$lambda$169(r0);
    }

    public static /* synthetic */ Unit i1I(BleBacCalibration r0, BleKeyFlag r1, BleHandleCallback r2) {
        return handleData$lambda$248$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit i1I1X0OX1(int r0, BleHandleCallback r1) {
        return handleData$lambda$303$0(r0, r1);
    }

    public static /* synthetic */ Unit i1IIX0iX(BleIPCStoresInfo r0, BleHandleCallback r1) {
        return handleData$lambda$158$0(r0, r1);
    }

    public static /* synthetic */ Unit i1O11001(int r0, BleHandleCallback r1) {
        return handleData$lambda$253$0(r0, r1);
    }

    public static /* synthetic */ Unit i1i(boolean r0, int r1, BleHandleCallback r2) {
        return handleData$lambda$234(r0, r1, r2);
    }

    public static /* synthetic */ Unit i1iII1i1(byte[] r0, boolean r1, BleHandleCallback r2) {
        return handleData$lambda$29(r0, r1, r2);
    }

    public static /* synthetic */ Unit i1iOO1XIi(int r0, BleHandleCallback r1) {
        return handleData$lambda$112(r0, r1);
    }

    public static /* synthetic */ Unit iI(int r0, BleHandleCallback r1) {
        return handleData$lambda$182(r0, r1);
    }

    public static /* synthetic */ Unit iI0I(BleBloodOxyGenSettings r0, BleHandleCallback r1) {
        return handleData$lambda$108$0(r0, r1);
    }

    public static /* synthetic */ Unit iI0OIOO(BleEarphoneState r0, BleHandleCallback r1) {
        return handleData$lambda$129$0(r0, r1);
    }

    public static /* synthetic */ Unit iI1i01(List r0, BleHandleCallback r1) {
        return handleData$lambda$288$0(r0, r1);
    }

    public static /* synthetic */ Unit iIIIi(BleRingVibrationSettings r0, BleHandleCallback r1) {
        return handleData$lambda$135$0(r0, r1);
    }

    public static /* synthetic */ void iIIIiIO0(BaseBleConnector r0, Function0 r1, Function1 r2) {
        notifyHandlersThen$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iIIX0XI(BleNotificationSettings2 r0, BleHandleCallback r1) {
        return handleData$lambda$95$0(r0, r1);
    }

    public static /* synthetic */ Unit iIX0i(int r0, BleHandleCallback r1) {
        return handleData$lambda$69$0(r0, r1);
    }

    public static /* synthetic */ Unit iIXX0i(String r0, BleHandleCallback r1) {
        return handleData$lambda$3$3(r0, r1);
    }

    public static /* synthetic */ Unit iIXi1iiXI(BleSedentarinessSettings r0, BleHandleCallback r1) {
        return handleData$lambda$10$0(r0, r1);
    }

    public static /* synthetic */ Unit iIi0(int r0, BleHandleCallback r1) {
        return handleData$lambda$284$0(r0, r1);
    }

    public static /* synthetic */ Unit iIi011O(BleHrvMonitoringSettings r0, BleHandleCallback r1) {
        return handleData$lambda$342$0(r0, r1);
    }

    public static /* synthetic */ Unit iIi1(BleHandleCallback r0) {
        return handleData$lambda$60(r0);
    }

    public static /* synthetic */ Unit iIiiO(BleSosContact r0, BleHandleCallback r1) {
        return handleData$lambda$142$0(r0, r1);
    }

    public static /* synthetic */ Unit iO00(List r0, BleHandleCallback r1) {
        return handleData$lambda$87$0(r0, r1);
    }

    public static /* synthetic */ Unit iO0IiO0X(BleHandleCallback r0) {
        return handleData$lambda$44(r0);
    }

    public static /* synthetic */ Unit iO0iiOi(BleGolfScore r0, BleHandleCallback r1) {
        return handleData$lambda$318$0(r0, r1);
    }

    public static /* synthetic */ Unit iO1(BleFactoryTest r0, BleHandleCallback r1) {
        return handleData$lambda$245$0(r0, r1);
    }

    public static /* synthetic */ Unit iO11i(BleCPUserInfo r0, BleHandleCallback r1) {
        return handleData$lambda$162$0(r0, r1);
    }

    public static /* synthetic */ Unit iOI(BleRealTimeMeasurement r0, BleHandleCallback r1) {
        return handleData$lambda$65$0(r0, r1);
    }

    public static /* synthetic */ Unit iOIIiI1(List r0, BleHandleCallback r1) {
        return handleData$lambda$224$0(r0, r1);
    }

    public static /* synthetic */ Unit iOIi00Ii(List r0, BleHandleCallback r1) {
        return handleData$lambda$73$0(r0, r1);
    }

    public static /* synthetic */ Unit iOO1ii1(int r0, BleHandleCallback r1) {
        return handleData$lambda$273$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(BleIPCState r0, BleHandleCallback r1) {
        return handleData$lambda$270$0(r0, r1);
    }

    public static /* synthetic */ Unit iOX(BleXMLYBandSet r0, BleHandleCallback r1) {
        return handleData$lambda$191$0(r0, r1);
    }

    public static /* synthetic */ Unit iOXiO1O1I(int r0, BleHandleCallback r1) {
        return handleData$lambda$240$0(r0, r1);
    }

    public static /* synthetic */ Unit iOi1010(int r0, BleHandleCallback r1) {
        return handleData$lambda$111(r0, r1);
    }

    public static /* synthetic */ Unit iOiXX(boolean r0, BleHandleCallback r1) {
        return handleData$lambda$57(r0, r1);
    }

    public static /* synthetic */ Unit iOiXi11II(BleAddressBook r0, BleHandleCallback r1) {
        return handleData$lambda$320$0(r0, r1);
    }

    public static /* synthetic */ Unit iX(int r0, BleHandleCallback r1) {
        return handleData$lambda$179$0(r0, r1);
    }

    public static /* synthetic */ Unit iX00X1X(BleHeartRateZones r0, BleHandleCallback r1) {
        return handleData$lambda$305$0(r0, r1);
    }

    public static /* synthetic */ Unit iX01(BaseBleConnector r0) {
        return handleData$lambda$168(r0);
    }

    public static /* synthetic */ Unit iX0iii0(BleSMSQuickReply r0, BleHandleCallback r1) {
        return handleData$lambda$246$0(r0, r1);
    }

    public static /* synthetic */ Unit iX1O1(int r0, BleHandleCallback r1) {
        return handleData$lambda$39(r0, r1);
    }

    public static /* synthetic */ Unit iX1X1(BleWatchFaceIndex r0, BleHandleCallback r1) {
        return handleData$lambda$140$0(r0, r1);
    }

    public static /* synthetic */ Unit iXI(BleHandleCallback r0) {
        return handleData$lambda$139(r0);
    }

    public static /* synthetic */ Unit iXOII(int r0, BleHandleCallback r1) {
        return handleData$lambda$70$0(r0, r1);
    }

    public static /* synthetic */ Unit iXOOOO0X0(BleDeviceSportData r0, BleHandleCallback r1) {
        return handleData$lambda$104$0(r0, r1);
    }

    public static /* synthetic */ Unit iXOXii(BleOfflineAsrSettings r0, BleHandleCallback r1) {
        return handleData$lambda$193$0(r0, r1);
    }

    public static /* synthetic */ Unit iXOiXII(BleEarphoneState r0, BleHandleCallback r1) {
        return handleData$lambda$130$0(r0, r1);
    }

    public static /* synthetic */ Unit iXX(int r0, BleHandleCallback r1) {
        return handleData$lambda$299$0(r0, r1);
    }

    public static /* synthetic */ Unit iXX0OOiXX(BleAlarm r0, BleHandleCallback r1) {
        return handleData$lambda$17(r0, r1);
    }

    public static /* synthetic */ Unit iXi(BleStandbyWatchFaceSet r0, BleHandleCallback r1) {
        return handleData$lambda$110$0(r0, r1);
    }

    public static /* synthetic */ Unit iXi1(int r0, BleHandleCallback r1) {
        return handleData$lambda$310(r0, r1);
    }

    public static /* synthetic */ Unit iXi1iI0(String r0, BleHandleCallback r1) {
        return handleData$lambda$5$0(r0, r1);
    }

    public static /* synthetic */ Unit iXiX011(MusicCommand r0, BleHandleCallback r1) {
        return handleData$lambda$175(r0, r1);
    }

    public static /* synthetic */ Unit iXiii(BleGolfScore r0, BleHandleCallback r1) {
        return handleData$lambda$317$0(r0, r1);
    }

    public static /* synthetic */ String iXiiiO() {
        return mNotify_delegate$lambda$0();
    }

    public static /* synthetic */ Unit ii(int r0, BleHandleCallback r1) {
        return handleData$lambda$8$0(r0, r1);
    }

    public static /* synthetic */ Unit ii00OXXO(BleDeviceUniqueDataSettings r0, BleHandleCallback r1) {
        return handleData$lambda$157$0(r0, r1);
    }

    public static /* synthetic */ Unit ii0111XI(BlePackageStatus r0, BleHandleCallback r1) {
        return handleData$lambda$93$0(r0, r1);
    }

    public static /* synthetic */ Unit ii0I0(BlePressureTimingMeasurement r0, BleHandleCallback r1) {
        return handleData$lambda$105$0(r0, r1);
    }

    public static /* synthetic */ Unit ii110(int r0, BleHandleCallback r1) {
        return handleData$lambda$275$4(r0, r1);
    }

    public static /* synthetic */ Unit ii1I(BleDoubleScreenSettings r0, BleHandleCallback r1) {
        return handleData$lambda$255$0(r0, r1);
    }

    public static /* synthetic */ Unit iiII(List r0, BleHandleCallback r1) {
        return handleData$lambda$231$0(r0, r1);
    }

    public static /* synthetic */ Unit iiIOi(BleCheckInEveryDay r0, BleHandleCallback r1) {
        return handleData$lambda$146$0(r0, r1);
    }

    public static /* synthetic */ Unit iiIOiX(int r0, BleHandleCallback r1) {
        return handleData$lambda$261(r0, r1);
    }

    public static /* synthetic */ Unit iiIi0(BleRecordControl r0, BleHandleCallback r1) {
        return handleData$lambda$277$0(r0, r1);
    }

    public static /* synthetic */ Unit iiO(List r0, BleHandleCallback r1) {
        return handleData$lambda$200$0(r0, r1);
    }

    public static /* synthetic */ Unit iiOOI(boolean r0, BleHandleCallback r1) {
        return handleData$lambda$170(r0, r1);
    }

    public static /* synthetic */ BleMessenger iiX0i1IX(BaseBleConnector r0) {
        return mBleMessenger_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iii0(List r0, BleHandleCallback r1) {
        return handleData$lambda$216$0(r0, r1);
    }

    public static /* synthetic */ Unit iiiO(BleMapFileList r0, BleHandleCallback r1) {
        return handleData$lambda$280$0(r0, r1);
    }

    public static /* synthetic */ Unit iiiX1OX1i(int r0, BleKey r1, BleHandleCallback r2) {
        return notifySyncState$lambda$0(r0, r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseBleConnector init$default(BaseBleConnector r1, Context r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, BaseBleCache r9, int r10, Object r11) {
        if (r11 != null) goto L27;
        if ((r10 & 2) == 0) goto L7;
        r3 = false;
    L7:
        if ((r10 & 4) == 0) goto L10;
        r4 = false;
    L10:
        if ((r10 & 8) == 0) goto L12;
        r5 = false;
    L12:
        int r0 = 1;
        if ((r10 & 16) == 0) goto L16;
        r6 = true;
    L16:
        if ((r10 & 32) == 0) goto L19;
        r7 = true;
    L19:
        if ((r10 & 64) == 0) goto L22;
        r8 = X1i1IX1X.OXO1();
    L22:
        if ((r10 & 128) == 0) goto L25;
        r9 = new BaseBleCache(null, r0, 0 == true ? 1 : 0);
    L25:
        return r1.init(r2, r3, r4, r5, r6, r7, r8, r9);
    L27:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
    }

    private final boolean isCmTraceStart(byte[] r5) {
        if (r5.length >= 4) goto L5;
    L13:
        return false;
    L5:
        if (r5[0] != 67) goto L13;
        if (r5[1] != 77) goto L13;
        if (r5[2] != 84) goto L13;
        if (r5[3] != 82) goto L13;
        return true;
    }

    private final void login(int r10) {
        sendInt32$default(this, BleKey.SESSION, BleKeyFlag.CREATE, r10, null, false, false, 56, null);
    }

    private static final CopyOnWriteArrayList mBleHandleCallbacks_delegate$lambda$0() {
        return new CopyOnWriteArrayList();
    }

    private static final BleMessenger mBleMessenger_delegate$lambda$0(BaseBleConnector r2) {
        BleMessenger r0 = new BleMessenger();
        r0.setMMessengerCallback(new BaseBleConnector$mBleMessenger$2$1$1(r2));
        return r0;
    }

    private static final BleParser mBleParser_delegate$lambda$0() {
        return BleParser.INSTANCE;
    }

    private static final String mNotify_delegate$lambda$0() {
        return BLE_CH_NOTIFY;
    }

    private static final String mService_delegate$lambda$0() {
        return BLE_SERVICE;
    }

    private static final void mSyncTimeout$lambda$0(BaseBleConnector r3) {
        if (r3.mDataKeys.isEmpty() == true) goto L6;
        r3.notifySyncState(-1, r3.mDataKeys.get(0));
        r3.mDataKeys.clear();
        return;
    L6:
        r3.notifySyncState(-1, BleKey.NONE);
    }

    private static final Unit mtkOta$lambda$0(BleHandleCallback r9) {
        Intrinsics.X0O(r9, "it");
        BleHandleCallback.onStreamProgress$default(r9, false, -1, 0, 0, null, 16, null);
        return Unit.OXO1;
    }

    private final void notifyHandlers(final Function1<? super BleHandleCallback, Unit> r3) {
        getMHandler().post(new IiO10X(this, r3));
    }

    private static final void notifyHandlers$lambda$0(BaseBleConnector r1, Function1 r2) {
        Iterator<T> r3 = r1.getMBleHandleCallbacks().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        BleHandleCallback r0 = (BleHandleCallback) r3.next();
        Intrinsics.XXI(r0);
        r2.invoke(r0);
        goto L4
    }

    private final void notifyHandlersThen(final Function1<? super BleHandleCallback, Unit> r3, final Function0<Unit> r4) {
        getMHandler().post(new O0O1I(this, r4, r3));
    }

    private static final void notifyHandlersThen$lambda$0(BaseBleConnector r1, Function0 r2, Function1 r3) {
        Iterator<T> r4 = r1.getMBleHandleCallbacks().iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        BleHandleCallback r0 = (BleHandleCallback) r4.next();
        Intrinsics.XXI(r0);
        r3.invoke(r0);
        goto L4
    L6:
        r2.invoke();
    }

    private final void notifySyncState(final int r4, final BleKey r5) {
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " onSyncData -> " + SyncState.INSTANCE.getState(r4) + ", " + r5);
        notifyHandlers(new i1XXIO(r4, r5));
    }

    private static final Unit notifySyncState$lambda$0(int r1, BleKey r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onSyncData(r1, r2);
        return Unit.OXO1;
    }

    private final void onActivateMultiDeviceActiveBleCache() {
        if (ConnectorManage.INSTANCE.isMultiDevice() == true) goto L9;
        BleCache r0 = BleCache.INSTANCE;
        BaseBleCache r1 = this.mBleCache;
        if (r1 != null) goto L7;
        Intrinsics.XXO("mBleCache");
        r1 = null;
    L7:
        r0.activateMultiDeviceActiveBleCache(r1);
        return;
    }

    private final void postDelaySyncTimeout() {
        removeSyncTimeout();
        getMHandler().postDelayed(this.mSyncTimeout, 8000);
    }

    private final void removeBond(String r6) {
        if (Build.VERSION.SDK_INT < 31) goto L8;
        if (ContextCompat.checkSelfPermission(getMContext(), "android.permission.BLUETOOTH_CONNECT") == 0) goto L8;
        return;
    L8:
        if (BluetoothAdapter.checkBluetoothAddress(r6) == false) goto L25;
        Iterator<BluetoothDevice> r1 = BluetoothAdapter.getDefaultAdapter().getBondedDevices().iterator();
    L12:
        if (r1.hasNext() == false) goto L27;
        BluetoothDevice r2 = r1.next();
        if (oe5.OX0X1O10X(r2.getAddress(), r6, true) == false) goto L12;
        Object r7 = r2.getClass().getMethod("removeBond", new Class[0]).invoke(r2, new Object[0]);     // Catch: Exception -> L17
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " removeBond -> " + r7);     // Catch: Exception -> L17
        return;
    L17:
        e = move-exception;
        i1O0OXO1O.OXO1.XOO0ii0(getTAG() + " removeBond -> " + e);
        return;
    L27:
        return;
    }

    private final void removeSyncTimeout() {
        getMHandler().removeCallbacks(this.mSyncTimeout);
    }

    public static /* synthetic */ boolean sendBoolean$default(BaseBleConnector r1, BleKey r2, BleKeyFlag r3, boolean r4, boolean r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L12;
        if ((r7 & 8) == 0) goto L7;
        r5 = false;
    L7:
        if ((r7 & 16) == 0) goto L10;
        r6 = false;
    L10:
        return r1.sendBoolean(r2, r3, r4, r5, r6);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendBoolean");
    }

    public static /* synthetic */ boolean sendData$default(BaseBleConnector r6, BleKey r7, BleKeyFlag r8, byte[] r9, boolean r10, boolean r11, int r12, Object r13) {
        if (r13 != null) goto L18;
        if ((r12 & 4) == 0) goto L6;
        r9 = null;
    L6:
        byte[] r3 = r9;
        if ((r12 & 8) == 0) goto L9;
        boolean r4 = false;
    L11:
        if ((r12 & 16) == 0) goto L14;
        boolean r5 = false;
    L16:
        return r6.sendData(r7, r8, r3, r4, r5);
    L14:
        r5 = r11;
        goto L16
    L9:
        r4 = r10;
        goto L11
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendData");
    }

    public static /* synthetic */ boolean sendInt16$default(BaseBleConnector r7, BleKey r8, BleKeyFlag r9, int r10, ByteOrder r11, boolean r12, boolean r13, int r14, Object r15) {
        if (r15 != null) goto L18;
        if ((r14 & 8) == 0) goto L6;
        r11 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r11, "BIG_ENDIAN");
    L6:
        ByteOrder r4 = r11;
        if ((r14 & 16) == 0) goto L9;
        boolean r5 = false;
    L11:
        if ((r14 & 32) == 0) goto L14;
        boolean r6 = false;
    L16:
        return r7.sendInt16(r8, r9, r10, r4, r5, r6);
    L14:
        r6 = r13;
        goto L16
    L9:
        r5 = r12;
        goto L11
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInt16");
    }

    public static /* synthetic */ boolean sendInt24$default(BaseBleConnector r7, BleKey r8, BleKeyFlag r9, int r10, ByteOrder r11, boolean r12, boolean r13, int r14, Object r15) {
        if (r15 != null) goto L18;
        if ((r14 & 8) == 0) goto L6;
        r11 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r11, "BIG_ENDIAN");
    L6:
        ByteOrder r4 = r11;
        if ((r14 & 16) == 0) goto L9;
        boolean r5 = false;
    L11:
        if ((r14 & 32) == 0) goto L14;
        boolean r6 = false;
    L16:
        return r7.sendInt24(r8, r9, r10, r4, r5, r6);
    L14:
        r6 = r13;
        goto L16
    L9:
        r5 = r12;
        goto L11
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInt24");
    }

    public static /* synthetic */ boolean sendInt32$default(BaseBleConnector r7, BleKey r8, BleKeyFlag r9, int r10, ByteOrder r11, boolean r12, boolean r13, int r14, Object r15) {
        if (r15 != null) goto L18;
        if ((r14 & 8) == 0) goto L6;
        r11 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r11, "BIG_ENDIAN");
    L6:
        ByteOrder r4 = r11;
        if ((r14 & 16) == 0) goto L9;
        boolean r5 = false;
    L11:
        if ((r14 & 32) == 0) goto L14;
        boolean r6 = false;
    L16:
        return r7.sendInt32(r8, r9, r10, r4, r5, r6);
    L14:
        r6 = r13;
        goto L16
    L9:
        r5 = r12;
        goto L11
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInt32");
    }

    public static /* synthetic */ boolean sendInt8$default(BaseBleConnector r1, BleKey r2, BleKeyFlag r3, int r4, boolean r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L12;
        if ((r7 & 8) == 0) goto L7;
        r5 = false;
    L7:
        if ((r7 & 16) == 0) goto L10;
        r6 = false;
    L10:
        return r1.sendInt8(r2, r3, r4, r5, r6);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInt8");
    }

    public static /* synthetic */ boolean sendList$default(BaseBleConnector r1, BleKey r2, BleKeyFlag r3, List r4, boolean r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L12;
        if ((r7 & 8) == 0) goto L7;
        r5 = false;
    L7:
        if ((r7 & 16) == 0) goto L10;
        r6 = false;
    L10:
        return r1.sendList(r2, r3, r4, r5, r6);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendList");
    }

    public static /* synthetic */ boolean sendObject$default(BaseBleConnector r1, BleKey r2, BleKeyFlag r3, BleBuffer r4, boolean r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L12;
        if ((r7 & 8) == 0) goto L7;
        r5 = false;
    L7:
        if ((r7 & 16) == 0) goto L10;
        r6 = false;
    L10:
        return r1.sendObject(r2, r3, r4, r5, r6);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendObject");
    }

    private final void sendOta() {
        sendData$default(this, BleKey.OTA, BleKeyFlag.UPDATE, null, false, false, 28, null);
    }

    public static /* synthetic */ boolean sendStream$default(BaseBleConnector r0, BleKey r1, byte[] r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.sendStream(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStream");
    }

    private final void setMBleStream(BleStream r1) {
        this.mBleStream = r1;
        if (r1 == null) goto L5;
        boolean r2 = true;
    L6:
        setDisableStreamLog(r2);
        return;
    L5:
        r2 = false;
        goto L6
    }

    private final boolean syncData() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L5:
        List<Integer> r1 = r0.getMDataKeys();
        ArrayList r2 = new ArrayList();
        Iterator<T> r3 = r1.iterator();
    L7:
        if (r3.hasNext() == false) goto L11;
        Object r4 = r3.next();
        if (((Number) r4).intValue() == BleKey.DATA_ALL.getMKey()) goto L7;
        r2.add(r4);
        goto L7
    L11:
        ArrayList r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator r6 = r2.iterator();
    L13:
        if (r6.hasNext() == false) goto L15;
        int r7 = ((Number) r6.next()).intValue();
        r5.add(BleKey.Companion.OXO1(r7));
        goto L13
    L15:
        List<BleKey> r8 = CollectionsKt___CollectionsKt.OO0Oi10(r5);
        this.mDataKeys = r8;
        if (r8.isEmpty() == false) goto L19;
        notifySyncState(0, BleKey.NONE);
        return true;
    L19:
        postDelaySyncTimeout();
        return sendData$default(this, this.mDataKeys.get(0), BleKeyFlag.READ, null, false, false, 28, null);
    }

    public void addHandleCallback(@aa1 BleHandleCallback r4) {
        Intrinsics.X0O(r4, "bleHandleCallback");
        i1O0OXO1O.OXO1.OXO1(getTAG() + " addHandleCallback -> " + r4);
        if (isHandlerCallbackExist(r4) == true) goto L6;
        getMBleHandleCallbacks().add(r4);
        return;
    }

    public void connectClassic() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L5:
        connectClassic(r0.getMClassicAddress());
    }

    public void connectHID() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L5:
        Boolean r1 = createBond(r0.getMBleAddress());
        i1O0OXO1O.OXO1.IiI10X("connectHID -> " + r1);
    }

    @tb1
    public final Boolean createBond(@aa1 String r4) {
        Intrinsics.X0O(r4, "address");
        if (BluetoothAdapter.checkBluetoothAddress(r4) == false) goto L5;
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 == null) goto L9;
        BluetoothDevice r5 = r0.getRemoteDevice(r4);
    L10:
        if (r5 != null) goto L17;
        return null;
    L17:
        return Boolean.valueOf(r5.createBond());
    L13:
        e = move-exception;
        i1O0OXO1O.OXO1.XOO0ii0(getTAG() + " createBond error -> " + e.getLocalizedMessage());
        return Boolean.FALSE;
    L9:
        r5 = null;
        goto L10
    L5:
        return Boolean.FALSE;
    }

    @aa1
    public BaseBleCache getBleCache() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mBleCache");
        return null;
    L6:
        return r0;
    }

    @aa1
    public final CopyOnWriteArrayList<BleHandleCallback> getBleHandleCallbacks() {
        return getMBleHandleCallbacks();
    }

    @aa1
    public BaseBleConnector getCurBleConnector() {
        return this;
    }

    public final int getDeviceId() {
        if (this.mDeviceId != (-1)) goto L6;
        this.mDeviceId = Random.Default.nextInt(0, Integer.MAX_VALUE);
    L6:
        return this.mDeviceId;
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    public /* bridge */ /* synthetic */ iO00 getMBleMessenger() {
        return getMBleMessenger();
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    public /* bridge */ /* synthetic */ OIXOI getMBleParser() {
        return getMBleParser();
    }

    public final int getMHidState() {
        return this.mHidState;
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    @aa1
    public String getMNotify() {
        return (String) getValue();
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    @aa1
    public String getMService() {
        return (String) getValue();
    }

    @aa1
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    public int getWriteType() {
        BleStream r0 = this.mBleStream;
        if (r0 != null) goto L5;
        return -1;
    L5:
        if (r0.getMBleKey() != BleKey.THIRD_PARTY_DATA) goto L10;
        return 2;
    L10:
        return -1;
    }

    @aa1
    public BaseBleConnector init(@aa1 Context r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, int r13, @aa1 BaseBleCache r14) {
        Intrinsics.X0O(r7, "context");
        Intrinsics.X0O(r14, "mMultiDeviceBleCache");
        i1O0OXO1O.OXO1.XO0O10("inti mBleCache");
        LogUtils.i(new Object[]{"inti mBleCache " + r13});
        this.mBleCache = r14;
        this.mSupportFilterEmpty = r12;
        setMMtu(r13);
        super.init(r7, new AnonymousClass1(this));
        BaseBleCache r15 = this.mBleCache;
        if (r15 != null) goto L5;
        Intrinsics.XXO("mBleCache");
        r15 = null;
    L5:
        BaseBleCache r16 = this.mBleCache;
        if (r16 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        BaseBleCache r0 = null;
    L9:
        r15.setMDeviceInfo((BleDeviceInfo) BaseBleCache.getObject$default(r0, BleKey.IDENTITY, BleDeviceInfo.class, null, 4, null));
        if (r11 == false) goto L12;
        launch();
    L12:
        onActivateMultiDeviceActiveBleCache();
        if (r8 == true) goto L15;
    L17:
        if (r9 == false) goto L19;
        RtkCore.initialize(r7, new RtkConfigure.Builder().debugEnabled(false).printLog(false).logTag("RealtekDfu").build());
        RtkDfu.initialize(r7, false);
    L19:
        return this;
    L15:
        if (OOXX1OOO1.OXO1("no.nordicsemi.android.dfu.DfuServiceInitiator") == null) goto L17;
        DfuServiceInitiator.createDfuNotificationChannel(getMContext());
        goto L17
    L8:
        r0 = r16;
        goto L9
    }

    public boolean isAvailable() {
        if (this.mBleState < 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isBound() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L6:
        if (r0.getMDeviceInfo() == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean isBoundClassic() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L6:
        return isBoundClassic(r0.getMClassicAddress());
    }

    public final boolean isBoundHID() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L6:
        return isBoundHID(r0.getMBleAddress());
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    public boolean isConnecting() {
        return this.isConnecting;
    }

    public final boolean isHandlerCallbackExist(@aa1 BleHandleCallback r2) {
        Intrinsics.X0O(r2, "bleHandleCallback");
        return getMBleHandleCallbacks().contains(r2);
    }

    public final boolean isNeedBind() {
        return this.isNeedBind;
    }

    public final boolean isSendStream() {
        if (this.mBleStream == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void launch() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L6;
        i1O0OXO1O.OXO1.XIi00iiXO(getTAG() + " launch -> mBleCache not initialized, skip launch");
        return;
    L6:
        BaseBleCache r2 = null;
        if (r0 != null) goto L10;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L10:
        if (r0.getMDeviceInfo() != null) goto L12;
        i1O0OXO1O.OXO1.OXO1(getTAG() + " launch -> deviceInfo=null");
        return;
    L12:
        if (Build.VERSION.SDK_INT >= 31) goto L14;
    L18:
        BaseBleCache r1 = this.mBleCache;
        if (r1 != null) goto L21;
        Intrinsics.XXO("mBleCache");
        r1 = null;
    L21:
        BleDeviceInfo r3 = r1.getMDeviceInfo();
        if (r3 == null) goto L24;
        String r4 = r3.getMPlatform();
    L26:
        if (Intrinsics.XOO0ii0(r4, BleDeviceInfo.PLATFORM_SIFLI) == true) goto L36;
        BaseBleCache r5 = this.mBleCache;
        if (r5 != null) goto L30;
        Intrinsics.XXO("mBleCache");
        r5 = null;
    L30:
        BleDeviceInfo r6 = r5.getMDeviceInfo();
        if (r6 == null) goto L33;
        String r7 = r6.getMPlatform();
    L35:
        if (Intrinsics.XOO0ii0(r7, BleDeviceInfo.PLATFORM_JL707) == true) goto L36;
    L37:
        i1O0OXO1O r8 = i1O0OXO1O.OXO1;
        StringBuilder r9 = new StringBuilder();
        r9.append(getTAG());
        r9.append(" launch -> deviceInfo=");
        BaseBleCache r10 = this.mBleCache;
        if (r10 != null) goto L40;
        Intrinsics.XXO("mBleCache");
        r10 = null;
    L40:
        r9.append(r10.getMDeviceInfo());
        r8.OXO1(r9.toString());
        BaseBleCache r11 = this.mBleCache;
        if (r11 != null) goto L43;
        Intrinsics.XXO("mBleCache");
    L44:
        BleDeviceInfo r12 = r2.getMDeviceInfo();
        Intrinsics.XXI(r12);
        setAddress(r12.getMBleAddress());
        connect(true);
        return;
    L43:
        r2 = r11;
        goto L44
    L33:
        r7 = null;
    L36:
        setRefreshDeviceCache(true);
        goto L37
    L24:
        r4 = null;
        goto L26
    L14:
        if (getMContext().checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0) goto L16;
        return;
    L16:
        if (getMContext().checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) goto L18;
    }

    public final void mtkOta(@aa1 byte[] r11) {
        Intrinsics.X0O(r11, "bytes");
        if (isAvailable() == true) goto L5;
    L16:
        notifyHandlers(new X01II0());
        return;
    L5:
        if (r11.length == 0) goto L16;
        if ((r11.length % 180) != 0) goto L10;
        int r2 = r11.length / 180;
    L11:
        this.mStreamProgressTotal = r2;
        this.mStreamProgressCompleted = 0;
        BleMessenger r3 = getMBleMessenger();
        int r4 = r11.length;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        r3.enqueueWritePackets(new h77(SERVICE_MTK_OTA, CH_MTK_OTA_SIZE, ByteArrayExtKt.byteArrayOfInt32(r4, r5)));
        getMBleMessenger().enqueueWritePackets(new h77(SERVICE_MTK_OTA, CH_MTK_OTA_FLAG, new byte[]{1}));
        int r6 = this.mStreamProgressTotal;
        int r7 = 0;
    L12:
        if (r7 >= r6) goto L14;
        int r8 = r7 + 1;
        getMBleMessenger().enqueueWritePackets(new h77(SERVICE_MTK_OTA, CH_MTK_OTA_DATA, ArraysKt___ArraysKt.O11IIOOX(r11, iO.Oi1(r7 * 180, Math.min(r8 * 180, r11.length)))));
        r7 = r8;
        goto L12
    L14:
        getMBleMessenger().enqueueWritePackets(new h77(SERVICE_MTK_OTA, CH_MTK_OTA_FLAG, new byte[]{2}));
        BleMessenger r12 = getMBleMessenger();
        byte[] r1 = "b3b27696771768c6648f237a43c37a39".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        r12.enqueueWritePackets(new h77(SERVICE_MTK_OTA, CH_MTK_OTA_MD5, r1));
        return;
    L10:
        r2 = (r11.length / 180) + 1;
        goto L11
    }

    public final boolean read(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, NotificationCompat.CATEGORY_SERVICE);
        Intrinsics.X0O(r4, "characteristic");
        if (isAvailable() == true) goto L6;
        return false;
    L6:
        getMBleMessenger().enqueueMessage(new dg2(r3, r4));
        return true;
    }

    public void removeHandleCallback(@aa1 BleHandleCallback r4) {
        Intrinsics.X0O(r4, "bleHandleCallback");
        i1O0OXO1O.OXO1.OXO1(getTAG() + " removeHandleCallback -> " + r4);
        if (isHandlerCallbackExist(r4) == false) goto L6;
        getMBleHandleCallbacks().remove(r4);
        return;
    }

    public final void removeHandleCallbackAll() {
        getMBleHandleCallbacks().clear();
    }

    public final boolean sendBoolean(@aa1 BleKey r9, @aa1 BleKeyFlag r10, boolean r11, boolean r12, boolean r13) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        boolean r14 = sendData(r9, r10, ByteArrayExtKt.byteArrayOfBoolean(r11), r12, r13);
        if (r14 == false) goto L14;
        BaseBleCache r15 = this.mBleCache;
        BaseBleCache r16 = null;
        if (r15 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        r15 = null;
    L8:
        if (r15.requireCache(r9, r10) == false) goto L14;
        BaseBleCache r17 = this.mBleCache;
        if (r17 != null) goto L12;
        Intrinsics.XXO("mBleCache");
    L13:
        BaseBleCache.putBoolean$default(r16, r9, r11, null, 4, null);
        goto L14
    L12:
        r16 = r17;
    L14:
        return r14;
    }

    public boolean sendData(@aa1 BleKey r4, @aa1 BleKeyFlag r5, @tb1 byte[] r6, boolean r7, boolean r8) {
        Intrinsics.X0O(r4, "bleKey");
        Intrinsics.X0O(r5, "bleKeyFlag");
        i1O0OXO1O.OXO1.OXO1(getTAG() + " sendData -> " + r4 + ", " + r5);
        int r1 = 0;
        if (isAvailable() == true) goto L6;
        return false;
    L6:
        if (r4 == BleKey.DATA_ALL) goto L8;
    L11:
        if (r7 == false) goto L13;
        r1 = 16;
    L13:
        if (r8 == false) goto L15;
        r1 = r1 | 32;
    L15:
        h77 r9 = new h77(BLE_SERVICE, BLE_CH_WRITE, MessageFactory.INSTANCE.create(r1, r4, r5, r6));
        if (r7 == false) goto L18;
        getMBleMessenger().replyMessage(r9);
        return true;
    L18:
        getMBleMessenger().enqueueMessage(r9);
        return true;
    L8:
        if (r5 != BleKeyFlag.READ) goto L11;
        return syncData();
    }

    public final boolean sendInt16(@aa1 BleKey r9, @aa1 BleKeyFlag r10, int r11, @aa1 ByteOrder r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        Intrinsics.X0O(r12, C3164n2.u);
        boolean r15 = sendData(r9, r10, ByteArrayExtKt.byteArrayOfInt16(r11, r12), r13, r14);
        if (r15 == false) goto L14;
        BaseBleCache r16 = this.mBleCache;
        BaseBleCache r17 = null;
        if (r16 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        r16 = null;
    L8:
        if (r16.requireCache(r9, r10) == false) goto L14;
        BaseBleCache r18 = this.mBleCache;
        if (r18 != null) goto L12;
        Intrinsics.XXO("mBleCache");
    L13:
        BaseBleCache.putInt$default(r17, r9, r11, null, 4, null);
        goto L14
    L12:
        r17 = r18;
    L14:
        return r15;
    }

    public final boolean sendInt24(@aa1 BleKey r9, @aa1 BleKeyFlag r10, int r11, @aa1 ByteOrder r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        Intrinsics.X0O(r12, C3164n2.u);
        boolean r15 = sendData(r9, r10, ByteArrayExtKt.byteArrayOfInt24(r11, r12), r13, r14);
        if (r15 == false) goto L14;
        BaseBleCache r16 = this.mBleCache;
        BaseBleCache r17 = null;
        if (r16 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        r16 = null;
    L8:
        if (r16.requireCache(r9, r10) == false) goto L14;
        BaseBleCache r18 = this.mBleCache;
        if (r18 != null) goto L12;
        Intrinsics.XXO("mBleCache");
    L13:
        BaseBleCache.putInt$default(r17, r9, r11, null, 4, null);
        goto L14
    L12:
        r17 = r18;
    L14:
        return r15;
    }

    public boolean sendInt32(@aa1 BleKey r9, @aa1 BleKeyFlag r10, int r11, @aa1 ByteOrder r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        Intrinsics.X0O(r12, C3164n2.u);
        boolean r15 = sendData(r9, r10, ByteArrayExtKt.byteArrayOfInt32(r11, r12), r13, r14);
        if (r15 == false) goto L14;
        BaseBleCache r16 = this.mBleCache;
        BaseBleCache r17 = null;
        if (r16 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        r16 = null;
    L8:
        if (r16.requireCache(r9, r10) == false) goto L14;
        BaseBleCache r18 = this.mBleCache;
        if (r18 != null) goto L12;
        Intrinsics.XXO("mBleCache");
    L13:
        BaseBleCache.putInt$default(r17, r9, r11, null, 4, null);
        goto L14
    L12:
        r17 = r18;
    L14:
        return r15;
    }

    public boolean sendInt8(@aa1 BleKey r9, @aa1 BleKeyFlag r10, int r11, boolean r12, boolean r13) {
        Intrinsics.X0O(r9, "bleKey");
        Intrinsics.X0O(r10, "bleKeyFlag");
        boolean r14 = sendData(r9, r10, ByteArrayExtKt.byteArrayOfInt8(r11), r12, r13);
        if (r14 == false) goto L40;
        BaseBleCache r15 = this.mBleCache;
        if (r15 != null) goto L8;
        Intrinsics.XXO("mBleCache");
        r15 = null;
    L8:
        if (r15.requireCache(r9, r10) == false) goto L40;
        if (r9.isIdObjectKey() == false) goto L35;
        BaseBleCache r16 = this.mBleCache;
        if (r16 != null) goto L14;
        Intrinsics.XXO("mBleCache");
        r16 = null;
    L14:
        List<BleIdObject> r4 = r16.getIdObjects(r9);
        if (r10 == BleKeyFlag.DELETE) goto L17;
    L29:
        BaseBleCache r17 = this.mBleCache;
        if (r17 != null) goto L32;
        Intrinsics.XXO("mBleCache");
        BaseBleCache r2 = null;
    L33:
        BaseBleCache.putList$default(r2, r9, r4, null, 4, null);
        return r14;
    L32:
        r2 = r17;
        goto L33
    L17:
        if (r11 != 255) goto L19;
        r4.clear();
        goto L29
    L19:
        Iterator<BleIdObject> r18 = r4.iterator();
        int r19 = 0;
    L21:
        if (r18.hasNext() == false) goto L26;
        if (r18.next().getMId() == r11) goto L27;
        r19 = r19 + 1;
    L27:
        if (r19 <= (-1)) goto L29;
        r4.remove(r19);
        goto L29
    L26:
        r19 = -1;
        goto L27
    L35:
        BaseBleCache r110 = this.mBleCache;
        if (r110 != null) goto L38;
        Intrinsics.XXO("mBleCache");
        BaseBleCache r3 = null;
    L39:
        BaseBleCache.putInt$default(r3, r9, r11, null, 4, null);
        goto L40
    L38:
        r3 = r110;
    L40:
        return r14;
    }

    public boolean sendList(@aa1 BleKey r13, @aa1 BleKeyFlag r14, @tb1 List<? extends BleBuffer> r15, boolean r16, boolean r17) {
        Intrinsics.X0O(r13, "bleKey");
        Intrinsics.X0O(r14, "bleKeyFlag");
        int r3 = 0;
        if (isAvailable() == true) goto L5;
        return false;
    L5:
        ArrayList r2 = new ArrayList();
        if (r13.isIdObjectKey() == false) goto L50;
        BaseBleCache r4 = this.mBleCache;
        if (r4 != null) goto L10;
        Intrinsics.XXO("mBleCache");
        r4 = null;
    L10:
        List r10 = r4.getIdObjects(r13);
        if (r14 != BleKeyFlag.CREATE) goto L32;
        List r5 = r10;
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator r7 = r5.iterator();
    L14:
        if (r7.hasNext() == false) goto L16;
        r6.add(Integer.valueOf(((BleIdObject) r7.next()).getMId()));
        goto L14
    L16:
        List r8 = CollectionsKt___CollectionsKt.OO0Oi10(r6);
        if (r15 == null) goto L48;
        Iterator<T> r9 = r15.iterator();
        byte[] r11 = null;
    L20:
        if (r9.hasNext() == false) goto L30;
        BleBuffer r12 = (BleBuffer) r9.next();
        if ((r12 instanceof BleIdObject) == false) goto L20;
        int r18 = 0;
    L25:
        if (r18 >= 255) goto L20;
        if (r8.contains(Integer.valueOf(r18)) == false) goto L28;
        r18 = r18 + 1;
        goto L25
    L28:
        BleIdObject r19 = (BleIdObject) r12;
        r19.setMId(r18);
        r11 = ByteArrayExtKt.append(r11, r19.toByteArray());
        r10.add(r12);
        r8.add(Integer.valueOf(r18));
    L30:
        byte[] r20 = r11;
    L58:
        BleKeyFlag r21 = BleKeyFlag.RESET;
        if (r14 != r21) goto L61;
        BleKeyFlag r22 = BleKeyFlag.CREATE;
    L62:
        boolean r23 = sendData(r13, r22, r20, r16, r17);
        if (r23 == false) goto L83;
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L68;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L68:
        if (r0.requireCache(r13, r14) == false) goto L83;
        if (r13.isIdObjectKey() == true) goto L72;
        BaseBleCache r1 = this.mBleCache;
        if (r1 != null) goto L82;
        Intrinsics.XXO("mBleCache");
        r1 = null;
    L82:
        BaseBleCache.putList$default(r1, r13, r15, null, 4, null);
        goto L83
    L72:
        if (r14 == BleKeyFlag.CREATE) goto L74;
        if (r14 != r21) goto L83;
    L74:
        BaseBleCache r24 = this.mBleCache;
        if (r24 != null) goto L77;
        Intrinsics.XXO("mBleCache");
        r24 = null;
    L77:
        BaseBleCache.putList$default(r24, r13, r10, null, 4, null);
        return r23;
    L83:
        return r23;
    L61:
        r22 = r14;
    L48:
        r20 = null;
        goto L58
    L32:
        if (r14 != BleKeyFlag.RESET) goto L48;
        r10.clear();
        if (r15 == null) goto L46;
        Iterator<T> r25 = r15.iterator();
        byte[] r26 = null;
    L37:
        if (r25.hasNext() == false) goto L45;
        Object r27 = r25.next();
        int r28 = r3 + 1;
        if (r3 >= 0) goto L41;
        CollectionsKt__CollectionsKt.XOX0O0();
    L41:
        BleBuffer r29 = (BleBuffer) r27;
        if ((r29 instanceof BleIdObject) == false) goto L44;
        BleIdObject r30 = (BleIdObject) r29;
        r30.setMId(r3);
        r26 = ByteArrayExtKt.append(r26, r30.toByteArray());
        r10.add(r29);
    L44:
        r3 = r28;
        goto L37
    L45:
        byte[] r110 = r26;
    L47:
        sendInt8$default(this, r13, BleKeyFlag.DELETE, 255, false, false, 24, null);
        r20 = r110;
        goto L58
    L46:
        r110 = null;
        goto L47
    L50:
        if (r14 != BleKeyFlag.CREATE) goto L57;
        if (r15 == null) goto L57;
        Iterator<T> r31 = r15.iterator();
        r11 = null;
    L54:
        if (r31.hasNext() == false) goto L56;
        r11 = ByteArrayExtKt.append(r11, ((BleBuffer) r31.next()).toByteArray());
        goto L54
    L56:
        r10 = r2;
    L57:
        r10 = r2;
        goto L48
    }

    public boolean sendObject(@aa1 BleKey r15, @aa1 BleKeyFlag r16, @tb1 BleBuffer r17, boolean r18, boolean r19) {
        Intrinsics.X0O(r15, "bleKey");
        Intrinsics.X0O(r16, "bleKeyFlag");
        int r3 = 0;
        if (isAvailable() == true) goto L5;
        return false;
    L5:
        List<BleIdObject> r0 = new ArrayList();
        boolean r7 = r17 instanceof BleIdObject;
        if (r7 == false) goto L56;
        BaseBleCache r1 = this.mBleCache;
        if (r1 != null) goto L10;
        Intrinsics.XXO("mBleCache");
        r1 = null;
    L10:
        r0 = r1.getIdObjects(r15);
        if (r16 != BleKeyFlag.CREATE) goto L45;
        List<BleIdObject> r4 = r0;
        ArrayList r10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r4, 10));
        Iterator<T> r5 = r4.iterator();
    L14:
        if (r5.hasNext() == false) goto L16;
        r10.add(Integer.valueOf(((BleIdObject) r5.next()).getMId()));
        goto L14
    L16:
        List r6 = CollectionsKt___CollectionsKt.OO0Oi10(r10);
        if ((r17 instanceof BleCoaching) == false) goto L25;
        BaseBleCache r11 = this.mBleCache;
        if (r11 != null) goto L21;
        Intrinsics.XXO("mBleCache");
        r11 = null;
    L21:
        BleCoachingIds r12 = (BleCoachingIds) r11.getObject(BleKey.COACHING, BleCoachingIds.class, BleKeyFlag.READ);
        if (r12 == null) goto L25;
        r6.addAll(r12.getMIds());
    L25:
        if ((r17 instanceof BleLoveTapUser) == false) goto L38;
        Iterator<BleIdObject> r8 = r0.iterator();
    L28:
        if (r8.hasNext() == false) goto L33;
        if (r8.next().getMId() == ((BleLoveTapUser) r17).getMId()) goto L34;
        r3 = r3 + 1;
    L34:
        if (r3 <= (-1)) goto L36;
        r0.set(r3, r17);
        goto L56
    L36:
        r0.add(r17);
        goto L56
    L33:
        r3 = -1;
    L38:
        if (r3 >= 255) goto L43;
        if (r6.contains(Integer.valueOf(r3)) == false) goto L41;
        r3 = r3 + 1;
        goto L38
    L41:
        ((BleIdObject) r17).setMId(r3);
    L43:
        r0.add(r17);
        goto L56
    L45:
        if (r16 != BleKeyFlag.UPDATE) goto L56;
        Iterator<BleIdObject> r9 = r0.iterator();
    L48:
        if (r9.hasNext() == false) goto L53;
        if (r9.next().getMId() == ((BleIdObject) r17).getMId()) goto L54;
        r3 = r3 + 1;
    L54:
        if (r3 <= (-1)) goto L56;
        r0.set(r3, r17);
        goto L56
    L53:
        r3 = -1;
    L56:
        List<BleIdObject> r13 = r0;
        if (r17 == null) goto L59;
        byte[] r14 = r17.toByteArray();
    L60:
        boolean r110 = sendData(r15, r16, r14, r18, r19);
        if (r110 == false) goto L77;
        BaseBleCache r2 = this.mBleCache;
        if (r2 != null) goto L66;
        Intrinsics.XXO("mBleCache");
        r2 = null;
    L66:
        if (r2.requireCache(r15, r16) == false) goto L77;
        if (r7 == false) goto L73;
        BaseBleCache r20 = this.mBleCache;
        if (r20 != null) goto L71;
        Intrinsics.XXO("mBleCache");
        r20 = null;
    L71:
        BaseBleCache.putList$default(r20, r15, r13, null, 4, null);
        return r110;
    L73:
        BaseBleCache r21 = this.mBleCache;
        if (r21 != null) goto L76;
        Intrinsics.XXO("mBleCache");
        r21 = null;
    L76:
        BaseBleCache.putObject$default(r21, r15, r17, null, 4, null);
    L77:
        return r110;
    L59:
        r14 = null;
        goto L60
    }

    public boolean sendStream(@aa1 BleKey r11, @aa1 byte[] r12, int r13) {
        Intrinsics.X0O(r11, "bleKey");
        Intrinsics.X0O(r12, "bytes");
        if (r12.length != 0) goto L5;
        return false;
    L5:
        setMBleStream(new BleStream(r11, r13, r12));
        BleStream r14 = this.mBleStream;
        BleStreamPacket r15 = null;
        BaseBleCache r16 = null;
        if (r14 == null) goto L12;
        BaseBleCache r17 = this.mBleCache;
        if (r17 != null) goto L10;
        Intrinsics.XXO("mBleCache");
    L11:
        r15 = r14.getPacket(0, r16.getMIOBufferSize());
        goto L12
    L10:
        r16 = r17;
    L12:
        BleStreamPacket r5 = r15;
        if (r5 == null) goto L16;
        BleStream r18 = this.mBleStream;
        Intrinsics.XXI(r18);
        return sendObject$default(this, r18.getMBleKey(), BleKeyFlag.UPDATE, r5, false, false, 24, null);
    L16:
        return false;
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    public void setConnecting(final boolean r4) {
        this.isConnecting = r4;
        i1O0OXO1O.OXO1.OXO1(getTAG() + " onDeviceConnecting -> " + r4);
        notifyHandlers(new iO1111(r4));
    }

    public final void setDataKeyAutoDelete(boolean r1) {
        this.isDataKeyAutoDelete = r1;
    }

    public final void setMHidState(int r1) {
        this.mHidState = r1;
    }

    public final void setNeedBind(boolean r1) {
        this.isNeedBind = r1;
    }

    public final void setOtaMode(boolean r1) {
        this.isNordicOtaMode = r1;
    }

    public final void setRefreshDeviceInfo(boolean r1) {
        this.isRefreshDeviceInfo = r1;
    }

    public final void stopStream() {
        setMBleStream(null);
    }

    public void unbind() {
        BaseBleCache r0 = this.mBleCache;
        if (r0 != null) goto L5;
    L20:
        closeConnection(true);
        return;
    L5:
        if (r0 != null) goto L7;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L7:
        unbindClassic(r0.getMClassicAddress());
        BaseBleCache r1 = this.mBleCache;
        if (r1 != null) goto L11;
        Intrinsics.XXO("mBleCache");
        r1 = null;
    L11:
        if (r1.getMSupportHID() != 1) goto L16;
        BaseBleCache r2 = this.mBleCache;
        if (r2 != null) goto L15;
        Intrinsics.XXO("mBleCache");
        r2 = null;
    L15:
        unbindHID(r2.getMBleAddress());
    L16:
        BaseBleCache r3 = this.mBleCache;
        if (r3 != null) goto L19;
        Intrinsics.XXO("mBleCache");
        r3 = null;
    L19:
        r3.setMDeviceInfo(null);
        BaseBleCache.remove$default(r3, BleKey.IDENTITY, null, 2, null);
        goto L20
    }

    public void unbindClassic(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        removeBond(r2);
    }

    public void unbindHID(@aa1 String r2) {
        Intrinsics.X0O(r2, "address");
        removeBond(r2);
    }

    public final boolean updateMusic(@aa1 BleMusicControl r10) {
        Intrinsics.X0O(r10, "bleMusicControl");
        if (this.mMusicSubscriptions.get(r10.getMMusicEntity()) == null) goto L8;
        List<MusicAttr> r0 = this.mMusicSubscriptions.get(r10.getMMusicEntity());
        Intrinsics.XXI(r0);
        if (r0.contains(r10.getMMusicAttr()) == true) goto L7;
        return true;
    L7:
        return sendObject$default(this, BleKey.MUSIC_CONTROL, BleKeyFlag.UPDATE, r10, false, false, 24, null);
    L8:
        return true;
    }

    public static /* synthetic */ boolean sendStream$default(BaseBleConnector r0, BleKey r1, InputStream r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.sendStream(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStream");
    }

    public final void connectClassic(@aa1 String r5) {
        Intrinsics.X0O(r5, "address");
        BaseBleCache r0 = this.mBleCache;
        BaseBleCache r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mBleCache");
        r0 = null;
    L6:
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == true) goto L25;
        BaseBleCache r2 = this.mBleCache;
        if (r2 != null) goto L11;
        Intrinsics.XXO("mBleCache");
        r2 = null;
    L11:
        if (Intrinsics.XOO0ii0(r2.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L25;
        BaseBleCache r3 = this.mBleCache;
        if (r3 != null) goto L16;
        Intrinsics.XXO("mBleCache");
        r3 = null;
    L16:
        if (Intrinsics.XOO0ii0(r3.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L25;
        BaseBleCache r4 = this.mBleCache;
        if (r4 != null) goto L20;
        Intrinsics.XXO("mBleCache");
    L22:
        if (Intrinsics.XOO0ii0(r1.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == true) goto L25;
        Boolean r6 = createBond(r5);
    L26:
        i1O0OXO1O.OXO1.IiI10X("connectClassic -> " + r5 + ", " + r6);
        return;
    L20:
        r1 = r4;
    L25:
        r6 = createBond(r5, 1);
        goto L26
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    @aa1
    public BleMessenger getMBleMessenger() {
        return (BleMessenger) getValue();
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    @aa1
    public BleParser getMBleParser() {
        return (BleParser) getValue();
    }

    public final boolean isBoundClassic(@aa1 String r5) {
        Intrinsics.X0O(r5, "address");
        Set<BluetoothDevice> r1 = BluetoothAdapter.getDefaultAdapter().getBondedDevices();     // Catch: Exception -> L9
        Intrinsics.O10IXXX0X(r1, "getBondedDevices(...)");     // Catch: Exception -> L9
        Iterator<T> r2 = r1.iterator();     // Catch: Exception -> L9
    L5:
        if (r2.hasNext() == false) goto L11;
        Object r3 = r2.next();     // Catch: Exception -> L9
        if (Intrinsics.XOO0ii0(((BluetoothDevice) r3).getAddress(), r5) == false) goto L5;
    L12:
        if (r3 == null) goto L15;
        return true;
    L15:
        return false;
    L11:
        r3 = null;
    L9:
        e = move-exception;
        e.printStackTrace();
        return false;
    }

    public final boolean isBoundHID(@aa1 String r5) {
        Intrinsics.X0O(r5, "address");
        Set<BluetoothDevice> r1 = BluetoothAdapter.getDefaultAdapter().getBondedDevices();     // Catch: Exception -> L9
        Intrinsics.O10IXXX0X(r1, "getBondedDevices(...)");     // Catch: Exception -> L9
        Iterator<T> r2 = r1.iterator();     // Catch: Exception -> L9
    L5:
        if (r2.hasNext() == false) goto L11;
        Object r3 = r2.next();     // Catch: Exception -> L9
        if (Intrinsics.XOO0ii0(((BluetoothDevice) r3).getAddress(), r5) == false) goto L5;
    L12:
        if (r3 == null) goto L15;
        return true;
    L15:
        return false;
    L11:
        r3 = null;
    L9:
        e = move-exception;
        e.printStackTrace();
        return false;
    }

    public static /* synthetic */ boolean sendStream$default(BaseBleConnector r0, BleKey r1, File r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.sendStream(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStream");
    }

    public static /* synthetic */ boolean sendStream$default(BaseBleConnector r0, BleKey r1, String r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.sendStream(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStream");
    }

    public static /* synthetic */ boolean sendStream$default(BaseBleConnector r0, BleKey r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = 0;
    L7:
        return r0.sendStream(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStream");
    }

    public boolean sendStream(@aa1 BleKey r3, @aa1 InputStream r4, int r5) {
        Intrinsics.X0O(r3, "bleKey");
        Intrinsics.X0O(r4, "inputStream");
        byte[] r0 = ByteStreamsKt.X0O(r4);     // Catch: Throwable -> L9
    L5:
        CloseableKt.OXO1(r4, null);     // Catch: Exception -> L7
        return sendStream(r3, r0, r5);
    L7:
        e = move-exception;
        e.printStackTrace();
        return false;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        CloseableKt.OXO1(r4, th);     // Catch: Exception -> L7
        throw th;     // Catch: Exception -> L7
    }

    @tb1
    public final Boolean createBond(@aa1 String r5, int r6) {
        Intrinsics.X0O(r5, "address");
        if (BluetoothAdapter.checkBluetoothAddress(r5) == false) goto L5;
        BluetoothAdapter r0 = BluetoothAdapter.getDefaultAdapter();
        if (r0 == null) goto L9;
        BluetoothDevice r7 = r0.getRemoteDevice(r5);
    L10:
        if (r7 != null) goto L28;
    L26:
        if (r7 == null) goto L21;
        boolean r8 = r7.createBond();     // Catch: Exception -> L19
    L22:
        return Boolean.valueOf(r8);
    L21:
        i1O0OXO1O.OXO1.XOO0ii0(getTAG() + " createBond error -> device = null");     // Catch: Exception -> L19
        r8 = false;
    L19:
        e = move-exception;
        i1O0OXO1O.OXO1.XOO0ii0(getTAG() + " createBond error -> " + e.getLocalizedMessage());
        return Boolean.FALSE;
    L28:
        Method r1 = r7.getClass().getMethod("createBond", new Class[]{Integer.TYPE});     // Catch: Exception -> L15
        r1.setAccessible(true);     // Catch: Exception -> L15
        Object r2 = r1.invoke(r7, new Object[]{Integer.valueOf(r6)});     // Catch: Exception -> L15
        i1O0OXO1O.OXO1.IiI10X(getTAG() + " invoke createBond " + r6 + i1iXIO.XO0O10 + r2);     // Catch: Exception -> L15
        if ((r2 instanceof Boolean) == false) goto L26;
        return (Boolean) r2;
    L15:
        e = move-exception;
        i1O0OXO1O.OXO1.XOO0ii0(getTAG() + " invoke createBond getMethod error -> " + e);
        goto L26
    L9:
        r7 = null;
        goto L10
    L5:
        return Boolean.FALSE;
    }

    public boolean sendStream(@aa1 BleKey r2, @aa1 File r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "file");
        if (r3.exists() == true) goto L5;
        return false;
    L5:
        return sendStream(r2, new FileInputStream(r3), r4);
    }

    public boolean sendStream(@aa1 BleKey r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        Intrinsics.X0O(r3, "path");
        return sendStream(r2, new FileInputStream(r3), r4);
    }

    public boolean sendStream(@aa1 BleKey r2, int r3, int r4) {
        Intrinsics.X0O(r2, "bleKey");
        InputStream r5 = getMContext().getResources().openRawResource(r3);
        Intrinsics.O10IXXX0X(r5, "openRawResource(...)");
        return sendStream(r2, r5, r4);
    }

    public final void mtkOta(@aa1 InputStream r3) {
        Intrinsics.X0O(r3, "inputStream");
        byte[] r0 = ByteStreamsKt.X0O(r3);     // Catch: Throwable -> L6
        CloseableKt.OXO1(r3, null);
        mtkOta(r0);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.OXO1(r3, th);
        throw th;
    }

    public final void mtkOta(@aa1 File r2) {
        Intrinsics.X0O(r2, "file");
        mtkOta(new FileInputStream(r2));
    }

    public final void mtkOta(@aa1 String r2) {
        Intrinsics.X0O(r2, "path");
        mtkOta(new FileInputStream(r2));
    }

    public final void mtkOta(int r2) {
        InputStream r3 = getMContext().getResources().openRawResource(r2);
        Intrinsics.O10IXXX0X(r3, "openRawResource(...)");
        mtkOta(r3);
    }
}
