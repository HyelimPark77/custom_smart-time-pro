package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I00IOX0;
import com.android.mltcode.paycertificationapi.I00X0X1;
import com.android.mltcode.paycertificationapi.I010OOO;
import com.android.mltcode.paycertificationapi.I01X1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0IX0;
import com.android.mltcode.paycertificationapi.I0XOiII;
import com.android.mltcode.paycertificationapi.I0XX1O;
import com.android.mltcode.paycertificationapi.I0Xi0XIOX;
import com.android.mltcode.paycertificationapi.I0iX1II;
import com.android.mltcode.paycertificationapi.I0iX1IIiI;
import com.android.mltcode.paycertificationapi.I0iX1OXi0;
import com.android.mltcode.paycertificationapi.I10000X1;
import com.android.mltcode.paycertificationapi.I100XO;
import com.android.mltcode.paycertificationapi.I10XXX;
import com.android.mltcode.paycertificationapi.I11100;
import com.android.mltcode.paycertificationapi.I1OXXI;
import com.android.mltcode.paycertificationapi.I1X0OI;
import com.android.mltcode.paycertificationapi.I1X0OO;
import com.android.mltcode.paycertificationapi.I1XIXOX;
import com.android.mltcode.paycertificationapi.I1XXIIiO0;
import com.android.mltcode.paycertificationapi.II0iiIX;
import com.android.mltcode.paycertificationapi.II1I1Oi0X;
import com.android.mltcode.paycertificationapi.II1XiXI01;
import com.android.mltcode.paycertificationapi.IIIO1;
import com.android.mltcode.paycertificationapi.IIIXIOi0;
import com.android.mltcode.paycertificationapi.IIO11III;
import com.android.mltcode.paycertificationapi.IIXIO0X0i;
import com.android.mltcode.paycertificationapi.IIXX0O11;
import com.android.mltcode.paycertificationapi.IO00XXII;
import com.android.mltcode.paycertificationapi.IO0iI0X;
import com.android.mltcode.paycertificationapi.IO0iXi10;
import com.android.mltcode.paycertificationapi.IO11X0;
import com.android.mltcode.paycertificationapi.IO1OO00OI;
import com.android.mltcode.paycertificationapi.IOI0OiXOI;
import com.android.mltcode.paycertificationapi.IOIXiI0Oi;
import com.android.mltcode.paycertificationapi.IOO0Oi0X;
import com.android.mltcode.paycertificationapi.IOO0i0X1X;
import com.android.mltcode.paycertificationapi.IOOI0ii;
import com.android.mltcode.paycertificationapi.IOX1iXX;
import com.android.mltcode.paycertificationapi.IOXOO;
import com.android.mltcode.paycertificationapi.IOXiOXi;
import com.android.mltcode.paycertificationapi.IOi0XOX;
import com.android.mltcode.paycertificationapi.IOiOii0;
import com.android.mltcode.paycertificationapi.IX00I;
import com.android.mltcode.paycertificationapi.IX0O0;
import com.android.mltcode.paycertificationapi.IX0i01;
import com.android.mltcode.paycertificationapi.IXI0IIiX;
import com.android.mltcode.paycertificationapi.IXIX0iI0i;
import com.android.mltcode.paycertificationapi.IXOIO0Oi1;
import com.android.mltcode.paycertificationapi.IXOOOiI0;
import com.android.mltcode.paycertificationapi.IXiOIOX;
import com.android.mltcode.paycertificationapi.Ii00I10O0;
import com.android.mltcode.paycertificationapi.Ii00XXOO1;
import com.android.mltcode.paycertificationapi.Ii0OI;
import com.android.mltcode.paycertificationapi.Ii111;
import com.android.mltcode.paycertificationapi.Ii1XIi0I1;
import com.android.mltcode.paycertificationapi.IiIii0;
import com.android.mltcode.paycertificationapi.IiO1X0X1;
import com.android.mltcode.paycertificationapi.IiOXXOX;
import com.android.mltcode.paycertificationapi.IiX100;
import com.android.mltcode.paycertificationapi.IiX1100;
import com.android.mltcode.paycertificationapi.IiXXii1I1;
import com.android.mltcode.paycertificationapi.IiXi1OO0i;
import com.android.mltcode.paycertificationapi.IiiO0;
import com.android.mltcode.paycertificationapi.O010Xi1I0;
import com.android.mltcode.paycertificationapi.O01IiO10;
import com.android.mltcode.paycertificationapi.O0I1XOIX1;
import com.android.mltcode.paycertificationapi.O0IO1;
import com.android.mltcode.paycertificationapi.O0IOiXX1;
import com.android.mltcode.paycertificationapi.O0Ii0IX0;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.O0X0iI11O;
import com.android.mltcode.paycertificationapi.O0X1iiiI;
import com.android.mltcode.paycertificationapi.O0XIIXXOO;
import com.android.mltcode.paycertificationapi.O0XXOiIII;
import com.android.mltcode.paycertificationapi.O0i0I001;
import com.android.mltcode.paycertificationapi.O0iIIXO00;
import com.android.mltcode.paycertificationapi.O0iOXiiIO;
import com.android.mltcode.paycertificationapi.O0iOiXOX;
import com.android.mltcode.paycertificationapi.O10O1II;
import com.android.mltcode.paycertificationapi.O10ii0I1X;
import com.android.mltcode.paycertificationapi.O1I0I0iO;
import com.android.mltcode.paycertificationapi.O1IOXIXX;
import com.android.mltcode.paycertificationapi.O1IX00;
import com.android.mltcode.paycertificationapi.O1O1O;
import com.android.mltcode.paycertificationapi.O1O1O101;
import com.android.mltcode.paycertificationapi.O1OO;
import com.android.mltcode.paycertificationapi.O1Oi0;
import com.android.mltcode.paycertificationapi.O1Oi111X;
import com.android.mltcode.paycertificationapi.O1OiO0I;
import com.android.mltcode.paycertificationapi.O1X1XX0X;
import com.android.mltcode.paycertificationapi.O1XOI;
import com.android.mltcode.paycertificationapi.O1XOXiOX;
import com.android.mltcode.paycertificationapi.O1i01I0Oi;
import com.android.mltcode.paycertificationapi.O1i1X0111;
import com.android.mltcode.paycertificationapi.O1iO1;
import com.android.mltcode.paycertificationapi.O1iOO10X;
import com.android.mltcode.paycertificationapi.OI1iXX1;
import com.android.mltcode.paycertificationapi.OIIOi1;
import com.android.mltcode.paycertificationapi.OIIiXO0I;
import com.android.mltcode.paycertificationapi.OIOOX1I;
import com.android.mltcode.paycertificationapi.OIi10;
import com.android.mltcode.paycertificationapi.OIi1iXI;
import com.android.mltcode.paycertificationapi.OIiO0I1;
import com.android.mltcode.paycertificationapi.OIiiII;
import com.android.mltcode.paycertificationapi.OO00I;
import com.android.mltcode.paycertificationapi.OO011;
import com.android.mltcode.paycertificationapi.OO0XIIOO;
import com.android.mltcode.paycertificationapi.OO0i1O0;
import com.android.mltcode.paycertificationapi.OO1O100IO;
import com.android.mltcode.paycertificationapi.OO1X0II;
import com.android.mltcode.paycertificationapi.OO1XIIOO;
import com.android.mltcode.paycertificationapi.OO1XiI0i;
import com.android.mltcode.paycertificationapi.OOI0O1OI;
import com.android.mltcode.paycertificationapi.OOI1OXO;
import com.android.mltcode.paycertificationapi.OOIX1i11I;
import com.android.mltcode.paycertificationapi.OOOIXXiO;
import com.android.mltcode.paycertificationapi.OOOiiOO;
import com.android.mltcode.paycertificationapi.OOX1XIOi;
import com.android.mltcode.paycertificationapi.OOXXiii01;
import com.android.mltcode.paycertificationapi.OOXiO;
import com.android.mltcode.paycertificationapi.OOXiii;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.OX0XOXOi;
import com.android.mltcode.paycertificationapi.OX1O0OX1X;
import com.android.mltcode.paycertificationapi.OX1ii1;
import com.android.mltcode.paycertificationapi.OXIXIO0I1;
import com.android.mltcode.paycertificationapi.OXIiOOO0;
import com.android.mltcode.paycertificationapi.OXO0;
import com.android.mltcode.paycertificationapi.OXO00iI;
import com.android.mltcode.paycertificationapi.OXX111;
import com.android.mltcode.paycertificationapi.OXiOIiIO1;
import com.android.mltcode.paycertificationapi.OXiiIi1;
import com.android.mltcode.paycertificationapi.Oi11iiIX;
import com.android.mltcode.paycertificationapi.Oi1iIXiO0;
import com.android.mltcode.paycertificationapi.OiI011;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.OiX1;
import com.android.mltcode.paycertificationapi.OiXII;
import com.android.mltcode.paycertificationapi.OiXi0Oi;
import com.android.mltcode.paycertificationapi.OiXiiX0i;
import com.android.mltcode.paycertificationapi.Oii1IiO00;
import com.android.mltcode.paycertificationapi.OiiXIOX;
import com.android.mltcode.paycertificationapi.X000X;
import com.android.mltcode.paycertificationapi.X000XIX;
import com.android.mltcode.paycertificationapi.X00IX1;
import com.android.mltcode.paycertificationapi.X0100iOOO;
import com.android.mltcode.paycertificationapi.X010X;
import com.android.mltcode.paycertificationapi.X01IX0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0OXO0i00;
import com.android.mltcode.paycertificationapi.X0X1OiO;
import com.android.mltcode.paycertificationapi.X0iO0;
import com.android.mltcode.paycertificationapi.X10I00;
import com.android.mltcode.paycertificationapi.X10I000I;
import com.android.mltcode.paycertificationapi.X10iIX10;
import com.android.mltcode.paycertificationapi.X111;
import com.android.mltcode.paycertificationapi.X111XiIO;
import com.android.mltcode.paycertificationapi.X1Iii1;
import com.android.mltcode.paycertificationapi.X1O11;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.X1XIO;
import com.android.mltcode.paycertificationapi.X1XX;
import com.android.mltcode.paycertificationapi.X1i0XXI;
import com.android.mltcode.paycertificationapi.X1i10;
import com.android.mltcode.paycertificationapi.X1i1O1;
import com.android.mltcode.paycertificationapi.X1iO;
import com.android.mltcode.paycertificationapi.X1iX1Ii;
import com.android.mltcode.paycertificationapi.X1iXIiXII;
import com.android.mltcode.paycertificationapi.X1iiiOOX;
import com.android.mltcode.paycertificationapi.XI1OIXiI;
import com.android.mltcode.paycertificationapi.XI1iI1;
import com.android.mltcode.paycertificationapi.XI1iXiOO1;
import com.android.mltcode.paycertificationapi.XII1XX1O;
import com.android.mltcode.paycertificationapi.XIIIiO0;
import com.android.mltcode.paycertificationapi.XIO00O;
import com.android.mltcode.paycertificationapi.XIOi00Ii;
import com.android.mltcode.paycertificationapi.XIOi11;
import com.android.mltcode.paycertificationapi.XIX0OO;
import com.android.mltcode.paycertificationapi.XIX1i1O;
import com.android.mltcode.paycertificationapi.XIXi11O;
import com.android.mltcode.paycertificationapi.XIi0O100;
import com.android.mltcode.paycertificationapi.XIiII1iX1;
import com.android.mltcode.paycertificationapi.XIiIOO;
import com.android.mltcode.paycertificationapi.XIiOOOXXi;
import com.android.mltcode.paycertificationapi.XO000OXI;
import com.android.mltcode.paycertificationapi.XO0OiX;
import com.android.mltcode.paycertificationapi.XO1XXO1X;
import com.android.mltcode.paycertificationapi.XO1i0OIIO;
import com.android.mltcode.paycertificationapi.XOIO1;
import com.android.mltcode.paycertificationapi.XOIOi;
import com.android.mltcode.paycertificationapi.XOIiI;
import com.android.mltcode.paycertificationapi.XOIiXXIO;
import com.android.mltcode.paycertificationapi.XOO0Iii;
import com.android.mltcode.paycertificationapi.XOOIiIOiX;
import com.android.mltcode.paycertificationapi.XOOO;
import com.android.mltcode.paycertificationapi.XOOO1Ii;
import com.android.mltcode.paycertificationapi.XOOX0i0i;
import com.android.mltcode.paycertificationapi.XOOXO00Ii;
import com.android.mltcode.paycertificationapi.XOOi0i11;
import com.android.mltcode.paycertificationapi.XOOiOI;
import com.android.mltcode.paycertificationapi.XOX0IOX;
import com.android.mltcode.paycertificationapi.XOXOO0X;
import com.android.mltcode.paycertificationapi.XOiIX;
import com.android.mltcode.paycertificationapi.XX000O00;
import com.android.mltcode.paycertificationapi.XX00I0O;
import com.android.mltcode.paycertificationapi.XX0OiX0;
import com.android.mltcode.paycertificationapi.XX1O0Iii;
import com.android.mltcode.paycertificationapi.XX1X1X0;
import com.android.mltcode.paycertificationapi.XXI100101;
import com.android.mltcode.paycertificationapi.XXOI1OI;
import com.android.mltcode.paycertificationapi.XXOX1X1OX;
import com.android.mltcode.paycertificationapi.XXX0X1;
import com.android.mltcode.paycertificationapi.XXXIII1;
import com.android.mltcode.paycertificationapi.XXXOi0;
import com.android.mltcode.paycertificationapi.XXXX1OiI;
import com.android.mltcode.paycertificationapi.XXXiO11iX;
import com.android.mltcode.paycertificationapi.Xi00OX;
import com.android.mltcode.paycertificationapi.Xi0IOIii;
import com.android.mltcode.paycertificationapi.Xi110;
import com.android.mltcode.paycertificationapi.Xi111i1;
import com.android.mltcode.paycertificationapi.Xi1I1OO;
import com.android.mltcode.paycertificationapi.XiIO0O;
import com.android.mltcode.paycertificationapi.XiOI01iXi;
import com.android.mltcode.paycertificationapi.XiOIOO;
import com.android.mltcode.paycertificationapi.XiOOiI;
import com.android.mltcode.paycertificationapi.XiOi1;
import com.android.mltcode.paycertificationapi.XiiXO1;
import com.android.mltcode.paycertificationapi.XiiXi0XI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i001XX;
import com.android.mltcode.paycertificationapi.i01I1;
import com.android.mltcode.paycertificationapi.i01X111i;
import com.android.mltcode.paycertificationapi.i01ii1OI;
import com.android.mltcode.paycertificationapi.i0I1i1;
import com.android.mltcode.paycertificationapi.i0IXiOXOX;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i0X001O1;
import com.android.mltcode.paycertificationapi.i0XI0O01O;
import com.android.mltcode.paycertificationapi.i0iIiOX1;
import com.android.mltcode.paycertificationapi.i10010OO;
import com.android.mltcode.paycertificationapi.i11O1II;
import com.android.mltcode.paycertificationapi.i11X00O;
import com.android.mltcode.paycertificationapi.i11iOOI;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1OX1XI;
import com.android.mltcode.paycertificationapi.i1OiX0;
import com.android.mltcode.paycertificationapi.i1OiXI00;
import com.android.mltcode.paycertificationapi.i1X00;
import com.android.mltcode.paycertificationapi.i1X1ii;
import com.android.mltcode.paycertificationapi.i1i00I0;
import com.android.mltcode.paycertificationapi.i1i1X1;
import com.android.mltcode.paycertificationapi.i1iI1I1;
import com.android.mltcode.paycertificationapi.i1iXOiO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI00OX1II;
import com.android.mltcode.paycertificationapi.iI1IiiOIO;
import com.android.mltcode.paycertificationapi.iI1iXOX0i;
import com.android.mltcode.paycertificationapi.iII000OI;
import com.android.mltcode.paycertificationapi.iIII1OIO;
import com.android.mltcode.paycertificationapi.iIX0iX;
import com.android.mltcode.paycertificationapi.iIX1IiOii;
import com.android.mltcode.paycertificationapi.iIX1O0X0;
import com.android.mltcode.paycertificationapi.iIX1X1X01;
import com.android.mltcode.paycertificationapi.iIXiIXiI0;
import com.android.mltcode.paycertificationapi.iIi1O00;
import com.android.mltcode.paycertificationapi.iO0O0IiX;
import com.android.mltcode.paycertificationapi.iO0O1ii;
import com.android.mltcode.paycertificationapi.iO11XIOOX;
import com.android.mltcode.paycertificationapi.iO1X1iiX;
import com.android.mltcode.paycertificationapi.iO1XIXI;
import com.android.mltcode.paycertificationapi.iO1iX;
import com.android.mltcode.paycertificationapi.iOI1X;
import com.android.mltcode.paycertificationapi.iOIXXi;
import com.android.mltcode.paycertificationapi.iOOI1I0OX;
import com.android.mltcode.paycertificationapi.iOOIIX1;
import com.android.mltcode.paycertificationapi.iOOi1Oi;
import com.android.mltcode.paycertificationapi.iOXO00011;
import com.android.mltcode.paycertificationapi.iOXO0OOi;
import com.android.mltcode.paycertificationapi.iOXXI0i;
import com.android.mltcode.paycertificationapi.iOXi0IOI;
import com.android.mltcode.paycertificationapi.iOiOXX;
import com.android.mltcode.paycertificationapi.iOiXOXXO;
import com.android.mltcode.paycertificationapi.iX0100;
import com.android.mltcode.paycertificationapi.iX1IiI0;
import com.android.mltcode.paycertificationapi.iX1iOIIO;
import com.android.mltcode.paycertificationapi.iXI0iXX;
import com.android.mltcode.paycertificationapi.iXIiI10;
import com.android.mltcode.paycertificationapi.iXO0X10i;
import com.android.mltcode.paycertificationapi.iXO1O0Xi;
import com.android.mltcode.paycertificationapi.iXXI0i;
import com.android.mltcode.paycertificationapi.iXXXi;
import com.android.mltcode.paycertificationapi.iXiX1;
import com.android.mltcode.paycertificationapi.ii0OOO;
import com.android.mltcode.paycertificationapi.ii0i0O0iI;
import com.android.mltcode.paycertificationapi.ii100X00X;
import com.android.mltcode.paycertificationapi.ii11Oi0;
import com.android.mltcode.paycertificationapi.ii1X00;
import com.android.mltcode.paycertificationapi.iiOOiIO;
import com.android.mltcode.paycertificationapi.iiX1iX;
import com.android.mltcode.paycertificationapi.iiXXIO0i;
import com.android.mltcode.paycertificationapi.iiiii10;
import com.android.mltcode.paycertificationapi.jv0;
import com.android.mltcode.paycertificationapi.m04;
import com.android.mltcode.paycertificationapi.ml1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.ta2;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.y7;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.AGPSInitializer;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.QrcodeTypeInfo;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.otherdevice.charge.SoundEffectsSampleActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai_note.AiNoteActivity;
import com.sma.smartv3.ui.device.guide.AppGuideActivity;
import com.sma.smartv3.ui.device.item.AGPSUpgradeItem;
import com.sma.smartv3.ui.device.item.AINoteItem;
import com.sma.smartv3.ui.device.item.ActivityRecognitionItem;
import com.sma.smartv3.ui.device.item.AlarmClockItem;
import com.sma.smartv3.ui.device.item.AlipaySetItem;
import com.sma.smartv3.ui.device.item.AntiLostItem;
import com.sma.smartv3.ui.device.item.AppStoreItem;
import com.sma.smartv3.ui.device.item.AudioBookLearnItem;
import com.sma.smartv3.ui.device.item.AuraVideoUseHelpItem;
import com.sma.smartv3.ui.device.item.BacklightItem;
import com.sma.smartv3.ui.device.item.BaseDeviceItem;
import com.sma.smartv3.ui.device.item.BloodOxyGenItem;
import com.sma.smartv3.ui.device.item.ClassicPairItem;
import com.sma.smartv3.ui.device.item.CustomLogoItem;
import com.sma.smartv3.ui.device.item.DateFormatItem;
import com.sma.smartv3.ui.device.item.DialItem;
import com.sma.smartv3.ui.device.item.DoubleClickScreenItem;
import com.sma.smartv3.ui.device.item.DrinkWaterItem;
import com.sma.smartv3.ui.device.item.EBookManagerItem;
import com.sma.smartv3.ui.device.item.EarphoneItem;
import com.sma.smartv3.ui.device.item.EcgMonitoringItem;
import com.sma.smartv3.ui.device.item.FallManagerItem;
import com.sma.smartv3.ui.device.item.FindWatchItem;
import com.sma.smartv3.ui.device.item.FirmwareItem;
import com.sma.smartv3.ui.device.item.GameSettingsItem;
import com.sma.smartv3.ui.device.item.GameStoreItem;
import com.sma.smartv3.ui.device.item.GameTimeSetItem;
import com.sma.smartv3.ui.device.item.GestureWake2Item;
import com.sma.smartv3.ui.device.item.GestureWakeItem;
import com.sma.smartv3.ui.device.item.HardWareAlipayItem;
import com.sma.smartv3.ui.device.item.HealthCareItem;
import com.sma.smartv3.ui.device.item.HrMonitoringItem;
import com.sma.smartv3.ui.device.item.HrvSetItem;
import com.sma.smartv3.ui.device.item.HydrationReminderItem;
import com.sma.smartv3.ui.device.item.IncomingCallItem;
import com.sma.smartv3.ui.device.item.IncomingCallRingItem;
import com.sma.smartv3.ui.device.item.IncomingCallRingVibrationItem;
import com.sma.smartv3.ui.device.item.InfoItem;
import com.sma.smartv3.ui.device.item.LanguageItem;
import com.sma.smartv3.ui.device.item.LanguageUpdateItem;
import com.sma.smartv3.ui.device.item.LearnCardItem;
import com.sma.smartv3.ui.device.item.MacQrcodeItem;
import com.sma.smartv3.ui.device.item.MeasureUnitItem;
import com.sma.smartv3.ui.device.item.MedicationAlarmItem;
import com.sma.smartv3.ui.device.item.MeetingReminderItem;
import com.sma.smartv3.ui.device.item.MemoryManagerItem;
import com.sma.smartv3.ui.device.item.MessagePushItem;
import com.sma.smartv3.ui.device.item.MusicControlItem;
import com.sma.smartv3.ui.device.item.MusicManagerItem;
import com.sma.smartv3.ui.device.item.MyCardCode2Item;
import com.sma.smartv3.ui.device.item.MyCardCodeItem;
import com.sma.smartv3.ui.device.item.NFCGuideItem;
import com.sma.smartv3.ui.device.item.NavigationItem;
import com.sma.smartv3.ui.device.item.NoDisturb2Item;
import com.sma.smartv3.ui.device.item.NoDisturbItem;
import com.sma.smartv3.ui.device.item.NotificationLightScreenItem;
import com.sma.smartv3.ui.device.item.NucleicAcidCodeItem;
import com.sma.smartv3.ui.device.item.OfflineMapsItem;
import com.sma.smartv3.ui.device.item.PowerSaveModeItem;
import com.sma.smartv3.ui.device.item.PressureItem;
import com.sma.smartv3.ui.device.item.QiblaItem;
import com.sma.smartv3.ui.device.item.ReceiptCode2Item;
import com.sma.smartv3.ui.device.item.ReceiptCodeItem;
import com.sma.smartv3.ui.device.item.RecordingItem;
import com.sma.smartv3.ui.device.item.RelaxReminderItem;
import com.sma.smartv3.ui.device.item.RemoteCameraItem;
import com.sma.smartv3.ui.device.item.ResetItem;
import com.sma.smartv3.ui.device.item.SMSQuickReplyItem;
import com.sma.smartv3.ui.device.item.SOSManagerItem;
import com.sma.smartv3.ui.device.item.ScheduleItem;
import com.sma.smartv3.ui.device.item.SedentarinessItem;
import com.sma.smartv3.ui.device.item.ShockItem;
import com.sma.smartv3.ui.device.item.ShockLevelItem;
import com.sma.smartv3.ui.device.item.ShockSettingsItem;
import com.sma.smartv3.ui.device.item.ShutdownItem;
import com.sma.smartv3.ui.device.item.SleepSetItem;
import com.sma.smartv3.ui.device.item.SplitLine4DPItem;
import com.sma.smartv3.ui.device.item.StandbySetItem;
import com.sma.smartv3.ui.device.item.StandbyWatchFaceItem;
import com.sma.smartv3.ui.device.item.StockMarketItem;
import com.sma.smartv3.ui.device.item.SyncContactItem;
import com.sma.smartv3.ui.device.item.TempMonitoringItem;
import com.sma.smartv3.ui.device.item.TimeFormatItem;
import com.sma.smartv3.ui.device.item.TouchSetItem;
import com.sma.smartv3.ui.device.item.TranslationDialogueItem;
import com.sma.smartv3.ui.device.item.TranslationSimultaneousItem;
import com.sma.smartv3.ui.device.item.UnpairItem;
import com.sma.smartv3.ui.device.item.VoiceControlItem;
import com.sma.smartv3.ui.device.item.VoiceItem;
import com.sma.smartv3.ui.device.item.WashItem;
import com.sma.smartv3.ui.device.item.WatchPasswordItem;
import com.sma.smartv3.ui.device.item.WearWayItem;
import com.sma.smartv3.ui.device.item.WechatPaySetItem;
import com.sma.smartv3.ui.device.item.WechatVerificationItem;
import com.sma.smartv3.ui.device.item.WorldClockItem;
import com.sma.smartv3.ui.device.item.XmlyAudioItem;
import com.sma.smartv3.ui.login.LoginReminderActivity;
import com.sma.smartv3.ui.me.LanguageListActivity;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity;
import com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.util.UtilsKt;
import com.smart.xmlyaudiolibrary.XmlyAudioWebViewActivity;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.component.BleHandleCallback;
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
import com.szabh.smable3.entity.BleAvgHeartRate;
import com.szabh.smable3.entity.BleBAC;
import com.szabh.smable3.entity.BleBWNaviInfo;
import com.szabh.smable3.entity.BleBacCalibration;
import com.szabh.smable3.entity.BleBandKey;
import com.szabh.smable3.entity.BleBatteryUsage;
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
import com.szabh.smable3.entity.BleCoachingIds;
import com.szabh.smable3.entity.BleCyWeeAlgorithm;
import com.szabh.smable3.entity.BleDeviceFile;
import com.szabh.smable3.entity.BleDeviceFile2;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleDeviceInfo2;
import com.szabh.smable3.entity.BleDeviceLanguages;
import com.szabh.smable3.entity.BleDeviceLanguages2;
import com.szabh.smable3.entity.BleDeviceOp;
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
import com.szabh.smable3.entity.BleGameTimeReminder;
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
import com.szabh.smable3.entity.BleTemperature;
import com.szabh.smable3.entity.BleThirdPartyData;
import com.szabh.smable3.entity.BleTrainingStatus;
import com.szabh.smable3.entity.BleTuyaKey;
import com.szabh.smable3.entity.BleUserProfile;
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
import com.szabh.smable3.entity.MusicCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n78#2,3:3237\n81#2,5:3241\n78#2,3:3246\n81#2,5:3250\n78#2,3:3255\n81#2,5:3259\n78#2,3:3264\n81#2,5:3268\n78#2,3:3273\n81#2,5:3277\n78#2,3:3282\n81#2,5:3286\n151#2,5:3291\n156#2,5:3297\n99#2,7:3302\n106#2,3:3310\n79#2,7:3313\n109#2:3320\n78#2,3:3321\n81#2,5:3325\n78#2,3:3330\n81#2,5:3334\n78#2,3:3339\n81#2,5:3343\n78#2,3:3348\n81#2,5:3352\n78#2,3:3357\n81#2,5:3361\n78#2,3:3366\n81#2,5:3370\n78#2,3:3375\n81#2,5:3379\n78#2,3:3384\n81#2,5:3388\n78#2,3:3393\n81#2,5:3397\n78#2,3:3402\n81#2,5:3406\n78#2,3:3411\n81#2,5:3415\n78#2,3:3420\n81#2,5:3424\n78#2,3:3429\n81#2,5:3433\n78#2,3:3438\n81#2,5:3442\n78#2,3:3447\n81#2,5:3451\n78#2,3:3456\n81#2,5:3460\n78#2,3:3465\n81#2,5:3469\n78#2,3:3474\n81#2,5:3478\n78#2,3:3483\n81#2,5:3487\n78#2,3:3492\n81#2,5:3496\n78#2,3:3501\n81#2,5:3505\n78#2,3:3510\n81#2,5:3514\n78#2,3:3519\n81#2,5:3523\n78#2,3:3528\n81#2,5:3532\n78#2,3:3537\n81#2,5:3541\n78#2,3:3546\n81#2,5:3550\n99#2,7:3555\n106#2,3:3563\n79#2,7:3566\n109#2:3573\n99#2,7:3574\n106#2,3:3582\n79#2,7:3585\n109#2:3592\n78#2,3:3593\n81#2,5:3597\n99#2,7:3602\n106#2,3:3610\n79#2,7:3613\n109#2:3620\n78#2,3:3621\n81#2,5:3625\n78#2,3:3630\n81#2,5:3634\n78#2,3:3639\n81#2,5:3643\n78#2,3:3648\n81#2,5:3652\n99#2,7:3657\n106#2,3:3665\n79#2,7:3668\n109#2:3675\n99#2,7:3676\n106#2,3:3684\n79#2,7:3687\n109#2:3694\n78#2,3:3695\n81#2,5:3699\n99#2,7:3704\n106#2,3:3712\n79#2,7:3715\n109#2:3722\n78#2,3:3723\n81#2,5:3727\n78#2,3:3732\n81#2,5:3736\n78#2,3:3741\n81#2,5:3745\n78#2,3:3750\n81#2,5:3754\n78#2,3:3759\n81#2,5:3763\n78#2,3:3770\n81#2,5:3774\n78#2,3:3779\n81#2,5:3783\n78#2,3:3788\n81#2,5:3792\n78#2,3:3797\n81#2,5:3801\n78#2,3:3806\n81#2,5:3810\n78#2,3:3815\n81#2,5:3819\n78#2,3:3824\n81#2,5:3828\n78#2,3:3833\n81#2,5:3837\n78#2,3:3842\n81#2,5:3846\n78#2,3:3851\n81#2,5:3855\n78#2,3:3860\n81#2,5:3864\n78#2,3:3869\n81#2,5:3873\n78#2,3:3878\n81#2,5:3882\n78#2,3:3887\n81#2,5:3891\n78#2,3:3896\n81#2,5:3900\n78#2,3:3905\n81#2,5:3909\n78#2,3:3914\n81#2,5:3918\n78#2,3:3923\n81#2,5:3927\n78#2,3:3932\n81#2,5:3936\n99#2,7:3941\n106#2,3:3949\n79#2,7:3952\n109#2:3959\n99#2,7:3960\n106#2,3:3968\n79#2,7:3971\n109#2:3978\n78#2,3:3979\n81#2,5:3983\n78#2,3:3988\n81#2,5:3992\n78#2,3:3997\n81#2,5:4001\n78#2,3:4006\n81#2,5:4010\n78#2,3:4015\n81#2,5:4019\n99#2,7:4024\n106#2,3:4032\n79#2,7:4035\n109#2:4042\n1#3:3229\n1#3:3240\n1#3:3249\n1#3:3258\n1#3:3267\n1#3:3276\n1#3:3285\n1#3:3296\n1#3:3309\n1#3:3324\n1#3:3333\n1#3:3342\n1#3:3351\n1#3:3360\n1#3:3369\n1#3:3378\n1#3:3387\n1#3:3396\n1#3:3405\n1#3:3414\n1#3:3423\n1#3:3432\n1#3:3441\n1#3:3450\n1#3:3459\n1#3:3468\n1#3:3477\n1#3:3486\n1#3:3495\n1#3:3504\n1#3:3513\n1#3:3522\n1#3:3531\n1#3:3540\n1#3:3549\n1#3:3562\n1#3:3581\n1#3:3596\n1#3:3609\n1#3:3624\n1#3:3633\n1#3:3642\n1#3:3651\n1#3:3664\n1#3:3683\n1#3:3698\n1#3:3711\n1#3:3726\n1#3:3735\n1#3:3744\n1#3:3753\n1#3:3762\n1#3:3773\n1#3:3782\n1#3:3791\n1#3:3800\n1#3:3809\n1#3:3818\n1#3:3827\n1#3:3836\n1#3:3845\n1#3:3854\n1#3:3863\n1#3:3872\n1#3:3881\n1#3:3890\n1#3:3899\n1#3:3908\n1#3:3917\n1#3:3926\n1#3:3935\n1#3:3948\n1#3:3967\n1#3:3982\n1#3:3991\n1#3:4000\n1#3:4009\n1#3:4018\n1#3:4031\n12970#4,2:3235\n19#5:3768\n15#5:3769\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n2614#1:3224,5\n2614#1:3230,5\n2914#1:3237,3\n2914#1:3241,5\n2918#1:3246,3\n2918#1:3250,5\n2920#1:3255,3\n2920#1:3259,5\n2922#1:3264,3\n2922#1:3268,5\n2923#1:3273,3\n2923#1:3277,5\n2930#1:3282,3\n2930#1:3286,5\n3137#1:3291,5\n3137#1:3297,5\n3148#1:3302,7\n3148#1:3310,3\n3148#1:3313,7\n3148#1:3320\n286#1:3321,3\n286#1:3325,5\n311#1:3330,3\n311#1:3334,5\n601#1:3339,3\n601#1:3343,5\n758#1:3348,3\n758#1:3352,5\n802#1:3357,3\n802#1:3361,5\n813#1:3366,3\n813#1:3370,5\n852#1:3375,3\n852#1:3379,5\n863#1:3384,3\n863#1:3388,5\n953#1:3393,3\n953#1:3397,5\n964#1:3402,3\n964#1:3406,5\n978#1:3411,3\n978#1:3415,5\n994#1:3420,3\n994#1:3424,5\n1005#1:3429,3\n1005#1:3433,5\n1016#1:3438,3\n1016#1:3442,5\n1086#1:3447,3\n1086#1:3451,5\n1097#1:3456,3\n1097#1:3460,5\n1108#1:3465,3\n1108#1:3469,5\n1119#1:3474,3\n1119#1:3478,5\n1130#1:3483,3\n1130#1:3487,5\n1179#1:3492,3\n1179#1:3496,5\n1407#1:3501,3\n1407#1:3505,5\n1418#1:3510,3\n1418#1:3514,5\n1429#1:3519,3\n1429#1:3523,5\n1440#1:3528,3\n1440#1:3532,5\n1451#1:3537,3\n1451#1:3541,5\n1462#1:3546,3\n1462#1:3550,5\n1474#1:3555,7\n1474#1:3563,3\n1474#1:3566,7\n1474#1:3573\n1487#1:3574,7\n1487#1:3582,3\n1487#1:3585,7\n1487#1:3592\n1501#1:3593,3\n1501#1:3597,5\n1522#1:3602,7\n1522#1:3610,3\n1522#1:3613,7\n1522#1:3620\n1537#1:3621,3\n1537#1:3625,5\n1616#1:3630,3\n1616#1:3634,5\n1618#1:3639,3\n1618#1:3643,5\n1691#1:3648,3\n1691#1:3652,5\n1702#1:3657,7\n1702#1:3665,3\n1702#1:3668,7\n1702#1:3675\n1721#1:3676,7\n1721#1:3684,3\n1721#1:3687,7\n1721#1:3694\n1732#1:3695,3\n1732#1:3699,5\n1743#1:3704,7\n1743#1:3712,3\n1743#1:3715,7\n1743#1:3722\n1754#1:3723,3\n1754#1:3727,5\n1766#1:3732,3\n1766#1:3736,5\n1779#1:3741,3\n1779#1:3745,5\n1792#1:3750,3\n1792#1:3754,5\n1805#1:3759,3\n1805#1:3763,5\n1873#1:3770,3\n1873#1:3774,5\n1875#1:3779,3\n1875#1:3783,5\n1887#1:3788,3\n1887#1:3792,5\n1927#1:3797,3\n1927#1:3801,5\n1930#1:3806,3\n1930#1:3810,5\n1921#1:3815,3\n1921#1:3819,5\n1923#1:3824,3\n1923#1:3828,5\n1943#1:3833,3\n1943#1:3837,5\n1956#1:3842,3\n1956#1:3846,5\n1969#1:3851,3\n1969#1:3855,5\n1982#1:3860,3\n1982#1:3864,5\n1995#1:3869,3\n1995#1:3873,5\n2007#1:3878,3\n2007#1:3882,5\n2046#1:3887,3\n2046#1:3891,5\n2062#1:3896,3\n2062#1:3900,5\n2103#1:3905,3\n2103#1:3909,5\n2111#1:3914,3\n2111#1:3918,5\n2122#1:3923,3\n2122#1:3927,5\n2133#1:3932,3\n2133#1:3936,5\n2144#1:3941,7\n2144#1:3949,3\n2144#1:3952,7\n2144#1:3959\n2155#1:3960,7\n2155#1:3968,3\n2155#1:3971,7\n2155#1:3978\n2167#1:3979,3\n2167#1:3983,5\n2179#1:3988,3\n2179#1:3992,5\n2192#1:3997,3\n2192#1:4001,5\n2205#1:4006,3\n2205#1:4010,5\n2217#1:4015,3\n2217#1:4019,5\n2894#1:4024,7\n2894#1:4032,3\n2894#1:4035,7\n2894#1:4042\n2614#1:3229\n2914#1:3240\n2918#1:3249\n2920#1:3258\n2922#1:3267\n2923#1:3276\n2930#1:3285\n3137#1:3296\n3148#1:3309\n286#1:3324\n311#1:3333\n601#1:3342\n758#1:3351\n802#1:3360\n813#1:3369\n852#1:3378\n863#1:3387\n953#1:3396\n964#1:3405\n978#1:3414\n994#1:3423\n1005#1:3432\n1016#1:3441\n1086#1:3450\n1097#1:3459\n1108#1:3468\n1119#1:3477\n1130#1:3486\n1179#1:3495\n1407#1:3504\n1418#1:3513\n1429#1:3522\n1440#1:3531\n1451#1:3540\n1462#1:3549\n1474#1:3562\n1487#1:3581\n1501#1:3596\n1522#1:3609\n1537#1:3624\n1616#1:3633\n1618#1:3642\n1691#1:3651\n1702#1:3664\n1721#1:3683\n1732#1:3698\n1743#1:3711\n1754#1:3726\n1766#1:3735\n1779#1:3744\n1792#1:3753\n1805#1:3762\n1873#1:3773\n1875#1:3782\n1887#1:3791\n1927#1:3800\n1930#1:3809\n1921#1:3818\n1923#1:3827\n1943#1:3836\n1956#1:3845\n1969#1:3854\n1982#1:3863\n1995#1:3872\n2007#1:3881\n2046#1:3890\n2062#1:3899\n2103#1:3908\n2111#1:3917\n2122#1:3926\n2133#1:3935\n2144#1:3948\n2155#1:3967\n2167#1:3982\n2179#1:3991\n2192#1:4000\n2205#1:4009\n2217#1:4018\n2894#1:4031\n2878#1:3235,2\n1867#1:3768\n1867#1:3769\n*E\n"})
public class DeviceFragment extends BaseDSLRecyclerFragment {
    public static final int CODE_ENABLE_BLUETOOTH = 5;
    public static final int CODE_GUIDE = 2;
    public static final int CODE_LOCATION_SERVER = 6;
    public static final int CODE_MULTI_DEVICE = 7;
    public static final int CODE_PAIR = 1;
    public static final int CODE_SELECT_IMAGE = 4;
    public static final int CODE_USE_GUIDE = 3;

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private final Lazy aGPSUpgradeItem$delegate;

    @aa1
    private final Lazy activityRecognitionItem$delegate;

    @aa1
    private final Lazy aiNote$delegate;

    @aa1
    private final Lazy alarmClockItem$delegate;

    @aa1
    private final Lazy alipaySetItem$delegate;

    @aa1
    private final Lazy antiLostItem$delegate;

    @aa1
    private final Lazy appStoreItem$delegate;

    @aa1
    private final Lazy audioBookLearnItem$delegate;

    @aa1
    private final Lazy backLightItem$delegate;

    @aa1
    private final XO0O10 bleHandleCallback;

    @aa1
    private final Lazy bloodOxyGenItem$delegate;

    @aa1
    private final Lazy classicPairItem$delegate;

    @aa1
    private final Lazy dateFormatItem$delegate;

    @aa1
    private final Lazy dialItem$delegate;

    @aa1
    private final Lazy dialogueTranslation$delegate;

    @aa1
    private final Lazy doubleClickScreenItem$delegate;

    @aa1
    private final Lazy drinkWaterItem$delegate;

    @aa1
    private final Lazy earphoneItem$delegate;

    @aa1
    private final Lazy ebookManagerItem$delegate;

    @aa1
    private final Lazy ecgMonitoringItem$delegate;

    @aa1
    private final Lazy fallManagerItem$delegate;

    @aa1
    private final Lazy findWatchItem$delegate;

    @aa1
    private final Lazy firmwareItem$delegate;

    @aa1
    private final Lazy gameSettingsItem$delegate;

    @aa1
    private final Lazy gameStoreItem$delegate;

    @aa1
    private final Lazy gameTimeSetItem$delegate;

    @aa1
    private final Lazy gestureWake2Item$delegate;

    @aa1
    private final Lazy gestureWakeItem$delegate;

    @aa1
    private final Lazy girlCareItem$delegate;

    @aa1
    private final Lazy hardWareAlipay$delegate;

    @aa1
    private final Lazy hrMonitoringItem$delegate;

    @aa1
    private final Lazy hrvSetItem$delegate;

    @aa1
    private final Lazy hydrationReminderItem$delegate;

    @aa1
    private final Lazy incomingCallItem$delegate;

    @aa1
    private final Lazy incomingCallRingItem$delegate;

    @aa1
    private final Lazy incomingCallRingVibrationItem$delegate;

    @aa1
    private final Lazy infoItem$delegate;
    private boolean isBindDevice;
    private boolean isScanQrcode;
    private boolean isTipAppGuideActivity;

    @aa1
    private final Lazy languageItem$delegate;

    @aa1
    private final Lazy languageUpdateItem$delegate;
    private long lastClickTime;

    @aa1
    private final Lazy learnCardItem$delegate;

    @aa1
    private final Lazy logoFileItem$delegate;

    @tb1
    private c72 mAGpsPopup;

    @tb1
    private dj4 mAntiLostSetPopup;

    @tb1
    private dj4 mBacklightPopup;

    @tb1
    private y7 mBacklightPopup2;

    @tb1
    private go0 mBindDeviceRemindPopup;

    @aa1
    private final I0IIOi mBleHandleCallback;

    @tb1
    private ml1 mConfirmPopup;

    @tb1
    private dj4 mDateFormatPopup;

    @tb1
    private dj4 mGameTimeSetPopup;

    @tb1
    private go0 mHIDPopup;

    @tb1
    private dj4 mIncomingCallPopup;

    @tb1
    private dj4 mIncomingCallRingtPopup;

    @tb1
    private dj4 mMacQrcodePopup;

    @tb1
    private jv0 mMultiRingVibrationPopup;

    @tb1
    private dj4 mNoDisturbPopup;

    @tb1
    private dj4 mNotificationLightScreenItem;

    @tb1
    private go0 mNotificationPopup;

    @tb1
    private go0 mOTAMessagePopup;

    @tb1
    private go0 mPermissionPopup;

    @tb1
    private dj4 mPowerSaveModeSetPopup;

    @tb1
    private dj4 mRingVibrationPopup;

    @tb1
    private m04 mSelectPairPopup;

    @tb1
    private ExtraPackageData[] mServerLanguageList;

    @tb1
    private dj4 mShockPopup;

    @tb1
    private dj4 mStandbySetPopup;

    @tb1
    private dj4 mTimeFormatPopup;

    @tb1
    private go0 mUnbindPopup;

    @tb1
    private dj4 mWearWayPopup;

    @aa1
    private final Lazy macQrcodeItem$delegate;

    @aa1
    private final Lazy measureUnitItem$delegate;

    @aa1
    private final Lazy medicationAlarmItem$delegate;

    @aa1
    private final Lazy meetingReminderItem$delegate;

    @aa1
    private final Lazy memoryManagerItem$delegate;

    @aa1
    private final Lazy messagePushItem$delegate;

    @aa1
    private final Lazy musicControlItem$delegate;

    @aa1
    private final Lazy musicManagerItem$delegate;

    @aa1
    private final Lazy myCardCode2Item$delegate;

    @aa1
    private final Lazy myCardCodeItem$delegate;

    @aa1
    private final Lazy navigationItem$delegate;

    @aa1
    private final Lazy nfcGuideItem$delegate;

    @aa1
    private final Lazy noDisturb2Item$delegate;

    @aa1
    private final Lazy noDisturbItem$delegate;

    @aa1
    private final Lazy notificationLightScreenItem$delegate;

    @aa1
    private final Lazy nucleicAcidCodeItem$delegate;

    @aa1
    private final Lazy offlineMapsItem$delegate;

    @aa1
    private final Lazy powerSaveModeItem$delegate;

    @aa1
    private final Lazy pressureItem$delegate;

    @aa1
    private final Lazy qiblaItem$delegate;

    @aa1
    private final Lazy receiptCode2Item$delegate;

    @aa1
    private final Lazy receiptCodeItem$delegate;

    @aa1
    private final Lazy recordingItem$delegate;

    @aa1
    private final Lazy relaxReminderItem$delegate;

    @aa1
    private final Lazy remoteCameraItem$delegate;

    @aa1
    private final Lazy resetItem$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy scheduleItem$delegate;

    @aa1
    private final Lazy sedentarinessItem$delegate;

    @aa1
    private final Lazy shockItem$delegate;

    @aa1
    private final Lazy shockLevelItem$delegate;

    @aa1
    private final Lazy shockSettingsItem$delegate;
    private List<DslAdapterItem> showList;

    @aa1
    private final Lazy shutdownItem$delegate;

    @aa1
    private final Lazy simultaneousTranslation$delegate;

    @aa1
    private final Lazy sleepSet$delegate;

    @aa1
    private final Lazy smsQuickReplyItem$delegate;

    @aa1
    private final Lazy sosManagerItem$delegate;

    @aa1
    private final Lazy standbySetItem$delegate;

    @aa1
    private final Lazy standbyWatchFaceItem$delegate;

    @aa1
    private final Lazy stockMarketItem$delegate;

    @aa1
    private final Lazy syncContactItem$delegate;

    @aa1
    private final Lazy tempMonitoringItem$delegate;

    @aa1
    private final Lazy timeFormatItem$delegate;

    @aa1
    private final Lazy touchSetItem$delegate;

    @aa1
    private final Lazy unpairItem$delegate;

    @aa1
    private final Lazy videoUseHelpItem$delegate;

    @aa1
    private final Lazy voiceControl$delegate;

    @aa1
    private final Lazy voiceItem$delegate;

    @aa1
    private final Lazy washItem$delegate;

    @aa1
    private final Lazy watchPasswordItem$delegate;

    @aa1
    private final Lazy wearWayItem$delegate;

    @aa1
    private final Lazy wechatPaySetItem$delegate;

    @aa1
    private final Lazy wechatVerificationItem$delegate;

    @aa1
    private final Lazy worldClockItem$delegate;

    @aa1
    private final Lazy xmlyAudioItem$delegate;

    public static final class I0IIOi implements BleHandleCallback {
        public final /* synthetic */ DeviceFragment IO;

        public I0IIOi(DeviceFragment r1) {
            this.IO = r1;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
            super.onAICoachGeneratePlanUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand r1) {
            super.onAICommandUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int r1) {
            super.onActivityRecognitionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm r1) {
            super.onAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int r1) {
            super.onAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm r1) {
            super.onAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp r1) {
            super.onAppOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean r1) {
            super.onAppSportDataResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo r1) {
            super.onBWNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int r1) {
            super.onBacklightUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey r1) {
            super.onBandKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore r1) {
            super.onBleGolfScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData r1) {
            super.onBleThirdPartyDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo r1) {
            super.onBleVideoCallInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat r1) {
            super.onCPChatUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo r1) {
            super.onCPGiftsInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener r1) {
            super.onCPListenerUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou r1) {
            super.onCPMissYouUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo r1) {
            super.onCPTodoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int r1) {
            super.onCaloriesGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean r1, int r2) {
            super.onCameraResponse(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int r1) {
            super.onCameraStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp r1) {
            super.onChatAppUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage r1) {
            super.onChatMessageUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice r1) {
            super.onChatVoiceUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay r1) {
            super.onCheckInEveryDayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int r1) {
            super.onClassicBluetoothStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandReply(BleKey r1, BleKeyFlag r2, boolean r3) {
            super.onCommandReply(r1, r2, r3);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandSendTimeout(BleKey r1, BleKeyFlag r2) {
            super.onCommandSendTimeout(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int r1) {
            super.onContactUsStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int r1) {
            super.onDeleteFileResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnected(BluetoothDevice r1) {
            super.onDeviceConnected(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean r1) {
            super.onDeviceConnecting(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile r1) {
            super.onDeviceFileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int r1) {
            super.onDeviceOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String r1) {
            super.onDeviceRequestAGpsFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply r1) {
            super.onDeviceSMSQuickReply(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData r1) {
            super.onDeviceSportDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int r1) {
            super.onDistanceGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings r1) {
            super.onDoubleScreenSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings r1) {
            super.onDrinkWaterUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings r1) {
            super.onEarphoneAncSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int r1) {
            super.onEarphoneCallUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey r1) {
            super.onEarphoneKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings r1) {
            super.onEarphoneSoundEffectsSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState r1) {
            super.onEarphoneStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest r1) {
            super.onFactoryTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int r1) {
            super.onFallSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone r1) {
            super.onFindEarphoneUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean r1) {
            super.onFindPhone(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int r1) {
            super.onFindWatchUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemDateFormat() {
            super.onFollowSystemDateFormat();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemHour() {
            super.onFollowSystemHour();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemLanguage(boolean r1) {
            super.onFollowSystemLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl r1) {
            super.onGameControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 r1) {
            super.onGestureWake2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake r1) {
            super.onGestureWakeUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo r1) {
            super.onGoogleNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int r1) {
            super.onHIDState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int r1) {
            super.onHIDValueChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings r1) {
            super.onHRWarningSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int r1) {
            super.onHanBaoVibrationStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int r1) {
            super.onHighAntiAssistChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int r1) {
            super.onHourSystemUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings r1) {
            super.onHydrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException r1) {
            super.onIPCExceptionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState r1) {
            super.onIPCOTAStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState r1) {
            super.onIPCStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo r1) {
            super.onIPCStoresInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo r1) {
            super.onIPCWifiInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onIdentityCreate(boolean r1, BleDeviceInfo r2) {
            if (this.IO.isScanQrcode() == false) goto L12;
            if (r1 == false) goto L7;
            OOiOOO1OI.OXO1.O1O();
            return;
        L7:
            this.IO.setScanQrcode(false);
            ml1 r3 = this.IO.getMConfirmPopup();
            if (r3 == null) goto L10;
            r3.dismiss();
        L10:
            BleConnector.INSTANCE.closeConnection(true);
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean r1) {
            super.onIdentityDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean r1) {
            super.onIdentityDeleteByDevice(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int r1) {
            super.onIncomingCallRingUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int r1) {
            super.onIncomingCallStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap r1) {
            super.onLoveTapUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int r1) {
            super.onLoveTapUserDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser r1) {
            super.onLoveTapUserUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement r1) {
            super.onMeasurementUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm r1) {
            super.onMedicationAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int r1) {
            super.onMedicationAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm r1) {
            super.onMedicationAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int r1) {
            super.onMedicationReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder r1) {
            super.onMedicationReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder r1) {
            super.onMeetingReminderAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int r1) {
            super.onMeetingReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder r1) {
            super.onMeetingReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int r1) {
            super.onMultiFileTransferReadFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int r1) {
            super.onMultiFileTransferResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo r1) {
            super.onNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings r1) {
            super.onNoDisturbUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
            super.onNotificationLightScreenSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 r1) {
            super.onNotificationSettings2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean r1) {
            super.onOTA(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int r1) {
            super.onPowerSaveModeState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int r1) {
            super.onPowerSaveModeStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan r1) {
            super.onReadAICoachGenerateBeforeInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onReadAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan r1) {
            super.onReadAICoachPlan(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 r1) {
            super.onReadAICoachPlanV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> r1) {
            super.onReadActivity(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail r1) {
            super.onReadActivityDetail(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook r1) {
            super.onReadAddressBook(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> r1) {
            super.onReadAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> r1) {
            super.onReadAlipayBindInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings r1) {
            super.onReadAlipaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String r1) {
            super.onReadAppApiVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList r1) {
            super.onReadAppInfoList(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState r1) {
            super.onReadAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> r1) {
            super.onReadAvgHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> r1) {
            super.onReadBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration r1, BleKeyFlag r2) {
            super.onReadBacCalibration(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int r1) {
            super.onReadBacklight(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage r1) {
            super.onReadBatteryUsage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String r1) {
            super.onReadBleAddress(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo r1) {
            super.onReadBleGolfMapCacheInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch r1) {
            super.onReadBleGolfSportSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo r1) {
            super.onReadBleGolfWatchMapInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo r1) {
            super.onReadBleGolfWatchVersionInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> r1) {
            super.onReadBleHrv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> r1) {
            super.onReadBleLogText(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> r1) {
            super.onReadBloodGlucose(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings r1) {
            super.onReadBloodOxyGenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> r1) {
            super.onReadBloodOxygen(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> r1) {
            super.onReadBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration r1) {
            super.onReadBloodPressureCalibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> r1) {
            super.onReadBodyStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo r1) {
            super.onReadCPUserInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData r1) {
            super.onReadCalibrationData(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> r1) {
            super.onReadCalorieIntake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int r1) {
            super.onReadCaloriesGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp r1) {
            super.onReadChatApp(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay r1) {
            super.onReadCheckInEveryDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int r1) {
            super.onReadClassicBluetoothState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds r1) {
            super.onReadCoachingIds(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm r1) {
            super.onReadCyWeeAlgorithm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> r1) {
            super.onReadDailyPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int r1) {
            super.onReadDateFormat(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile r1) {
            super.onReadDeviceFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 r1) {
            super.onReadDeviceFileV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo r1) {
            super.onReadDeviceInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 r1) {
            super.onReadDeviceInfo2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages r1) {
            super.onReadDeviceLanguages(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadDeviceLanguages2(BleDeviceLanguages2 r3) {
            Intrinsics.X0O(r3, "deviceLanguages");
            DeviceFragment r0 = this.IO;
            DeviceFragment.access$checkLanguageUpdate(r0, r3, r0.getMServerLanguageList());
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings r1) {
            super.onReadDeviceUniqueDataSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int r1) {
            super.onReadDistanceGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings r1) {
            super.onReadDoubleScreenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings r1) {
            super.onReadDrinkWater(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime r1) {
            super.onReadECGRealtime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings r1) {
            super.onReadEarphoneAncSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int r1) {
            super.onReadEarphoneCall(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo r1) {
            super.onReadEarphoneInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey r1) {
            super.onReadEarphoneKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower r1) {
            super.onReadEarphonePower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings r1) {
            super.onReadEarphoneSoundEffectsSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState r1) {
            super.onReadEarphoneState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> r1) {
            super.onReadEcg(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings r1) {
            super.onReadEcgSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> r1) {
            super.onReadEnergyRating(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int r1) {
            super.onReadFallSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList r1) {
            super.onReadFilePath(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onReadFirmwareVersion(String r3) {
            Intrinsics.X0O(r3, "version");
            if (this.IO.isScanQrcode() == false) goto L17;
            ml1 r4 = this.IO.getMConfirmPopup();
            if (r4 == null) goto L7;
            r4.dismiss();
        L7:
            a01.OXO1.IiI10X().put(b01.I1, false);
            q62 r5 = q62.OXO1;
            if (r5.I1Ii() == false) goto L13;
            if (i72.OXO1.I0iOXO() == true) goto L15;
            BleConnector.INSTANCE.connectClassic();
        L15:
            DeviceFragment.access$bindDone(this.IO);
            return;
        L13:
            if (r5.III() == false) goto L15;
            BleConnector.INSTANCE.connectHID();
            goto L15
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> r1) {
            super.onReadFoodBalance(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake r1) {
            super.onReadGestureWake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 r1) {
            super.onReadGestureWake2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly r1) {
            super.onReadGirlCareMonthly(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings r1) {
            super.onReadGirlCareSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings r1) {
            super.onReadGoMoreSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore r1) {
            super.onReadGolfWatchScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String r1) {
            super.onReadGpsFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings r1) {
            super.onReadHanBaoSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> r1) {
            super.onReadHanBaoVibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> r1) {
            super.onReadHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones r1) {
            super.onReadHeartRateZones(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int r1) {
            super.onReadHourSystem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings r1) {
            super.onReadHrMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
            super.onReadHrMonitoringSettingsV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine r1) {
            super.onReadHrvBaseLine(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings r1) {
            super.onReadHrvMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings r1) {
            super.onReadHydrationSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo r1) {
            super.onReadIPCInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState r1) {
            super.onReadIPCState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo r1) {
            super.onReadIPCStoresInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String r1) {
            super.onReadIPCVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int r1) {
            super.onReadIncomingCallRing(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> r1) {
            super.onReadLactateThreshold(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int r1) {
            super.onReadLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion r1) {
            super.onReadLanguagePackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> r1) {
            super.onReadLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> r1) {
            super.onReadLoveTapUser(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> r1) {
            super.onReadMatchRecord(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> r1) {
            super.onReadMatchRecord2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> r1) {
            super.onReadMatchRecord3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> r1) {
            super.onReadMedicationAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> r1) {
            super.onReadMedicationReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> r1) {
            super.onReadMeetingReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> r1) {
            super.onReadMindStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList r1) {
            super.onReadMultiFileTransfer(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String r1) {
            super.onReadNetworkFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings r1) {
            super.onReadNoDisturb(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
            super.onReadNotificationLightScreenSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 r1) {
            super.onReadNotificationSettings2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings r1) {
            super.onReadOfflineAsrSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int r1) {
            super.onReadOngoingDialogue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo r1) {
            super.onReadOptionalMapAuthInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus r1) {
            super.onReadPackageStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int r1) {
            super.onReadPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 r1) {
            super.onReadPower2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> r1) {
            super.onReadPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement r1) {
            super.onReadPressureTimingMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings r1) {
            super.onReadQiblaSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl r1) {
            super.onReadRecordControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder r1) {
            super.onReadRelaxReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> r1) {
            super.onReadRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int r1) {
            super.onReadRestingHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings r1) {
            super.onReadRingVibrationSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> r1) {
            super.onReadRri(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo r1) {
            super.onReadSDCardInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet r1) {
            super.onReadSGCameraSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet r1) {
            super.onReadSGKeySet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake r1) {
            super.onReadSGKeywordAwake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet r1) {
            super.onReadSGSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int r1) {
            super.onReadSGSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings r1) {
            super.onReadSOSSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int r1) {
            super.onReadScreenBrightnessSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings r1) {
            super.onReadSedentariness(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> r1) {
            super.onReadSleep(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int r1) {
            super.onReadSleepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int r1) {
            super.onReadSleepMonitoringMode(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality r1) {
            super.onReadSleepQuality(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int r1) {
            super.onReadSleepQualityScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] r1) {
            super.onReadSleepRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int r1) {
            super.onReadSleepRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int r1) {
            super.onReadSleepRiskLevel(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int r1) {
            super.onReadSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> r1) {
            super.onReadSosCallLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact r1) {
            super.onReadSosContact(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int r1) {
            super.onReadSportDurationGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet r1) {
            super.onReadStandbyWatchFaceSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int r1) {
            super.onReadStepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> r1) {
            super.onReadStock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> r1) {
            super.onReadTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int r1) {
            super.onReadTemperatureUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> r1) {
            super.onReadTrainingStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey r1) {
            super.onReadTuyaKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String r1) {
            super.onReadUiPackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int r1) {
            super.onReadUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile r1) {
            super.onReadUserProfile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> r1) {
            super.onReadVitalityValue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int r1) {
            super.onReadVoiceControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId r1) {
            super.onReadWatchFaceId(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex r1) {
            super.onReadWatchFaceIndex(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize r1) {
            super.onReadWatchFaceMaxSize(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int r1) {
            super.onReadWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword r1) {
            super.onReadWatchPassword(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int r1) {
            super.onReadWearWayState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean r1) {
            super.onReadWeatherRealTime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings r1) {
            super.onReadWechatPaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> r1) {
            super.onReadWorkout(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> r1) {
            super.onReadWorkout2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> r1) {
            super.onReadWorkout3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> r1) {
            super.onReadWorkout4(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation r1) {
            super.onReadWorkout4Segmentation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> r1) {
            super.onReadWorldClock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement r1) {
            super.onRealTimeMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] r1, boolean r2) {
            super.onReceiveCmTrace(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket r1) {
            super.onReceiveFilePacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> r1) {
            super.onReceiveGSensorMotion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> r1) {
            super.onReceiveGSensorRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> r1) {
            super.onReceiveGSensorSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> r1) {
            super.onReceiveHRRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga r1) {
            super.onReceiveLocationGga(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> r1) {
            super.onReceiveLocationGsv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand r1) {
            super.onReceiveMusicCommand(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> r1) {
            super.onReceivePpgSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog r1) {
            super.onReceiveRealtimeLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket r1) {
            super.onReceiveRecordPacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl r1) {
            super.onRecordControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int r1) {
            super.onRequestLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings r1) {
            super.onRingVibrationSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo r1) {
            super.onSDCardInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest r1) {
            super.onSGTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts r1) {
            super.onSGTtsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings r1) {
            super.onSOSSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
            super.onScreenBrightnessSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onSessionStateChange(boolean r2) {
            if (this.IO.isScanQrcode() == false) goto L9;
            if (r2 == true) goto L10;
            this.IO.setScanQrcode(false);
            ml1 r3 = this.IO.getMConfirmPopup();
            if (r3 == null) goto L11;
            r3.dismiss();
            return;
        L11:
            return;
        L10:
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify r1) {
            super.onSleepNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact r1) {
            super.onSosContactUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int r1) {
            super.onSportEndNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet r1) {
            super.onStandbyWatchFaceSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int r1) {
            super.onStepGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int r1) {
            super.onStockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            super.onStreamProgress(r1, r2, r3, r4, r5);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int r1, BleKey r2) {
            super.onSyncData(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onUpdateAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay r1) {
            super.onUpdateAICoachLeaveDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState r1) {
            super.onUpdateAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC r1) {
            super.onUpdateBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure r1) {
            super.onUpdateBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate r1) {
            super.onUpdateHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature r1) {
            super.onUpdateTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
            super.onUpdateWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile r1) {
            super.onUserProfileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int r1) {
            super.onVibrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int r1) {
            super.onVibrationUpdateV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean r1) {
            super.onWatchFaceIdUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean r1) {
            super.onWatchFaceIndexCreate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex r1) {
            super.onWatchFaceIndexUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword r1) {
            super.onWatchPasswordUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int r1) {
            super.onWearWayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int r1) {
            super.onWorldClockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet r1) {
            super.onXMLYBandSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte r1) {
            super.onXModem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean r1) {
            super.onReadStock(r1);
        }
    }

    public static final class I0iXXO implements O0Oiii<FirmwareVersion> {
        public final /* synthetic */ boolean OXO1;
        public final /* synthetic */ DeviceFragment XIi00iiXO;

        public I0iXXO(boolean r1, DeviceFragment r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public static final boolean IiI10X(final FirmwareVersion r1, final DeviceFragment r2, final boolean r3) {
            X0IOiX1O.XIi00iiXO(false, new I10XXX(r1, r2, r3), 1, null);
            return true;
        }

        public static final boolean O00(boolean r0, DeviceFragment r1) {
            if (r0 == false) goto L6;
            DeviceFragment.access$threePopup(r1, false);
            return true;
        L6:
            return true;
        }

        public static /* synthetic */ boolean OXO1(boolean r0, DeviceFragment r1) {
            return O00(r0, r1);
        }

        public static /* synthetic */ Unit XIi00iiXO(FirmwareVersion r0, DeviceFragment r1, boolean r2, BleConnector r3) {
            return XOO0ii0(r0, r1, r2, r3);
        }

        public static final Unit XOO0ii0(FirmwareVersion r2, DeviceFragment r3, boolean r4, BleConnector r5) {
            Intrinsics.X0O(r5, "it");
            int r6 = a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0);
            if (r2.getFlag() != 1) goto L5;
            int r7 = 20;
        L6:
            if (r6 < r7) goto L8;
            DeviceFragment.access$toFirmwareUpgrade(r3);
        L12:
            return Unit.OXO1;
        L8:
            ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
            if (r4 == false) goto L12;
            DeviceFragment.access$threePopup(r3, false);
            goto L12
        L5:
            r7 = 50;
            goto L6
        }

        public static /* synthetic */ boolean iO(FirmwareVersion r0, DeviceFragment r1, boolean r2) {
            return IiI10X(r0, r1, r2);
        }

        public void XO0O10(final FirmwareVersion r9) {
            DefaultConstructorMarker r1 = null;
            int r2 = 2;
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            int r0 = 0;
            if (r9 != null) goto L5;
            DeviceInfoChecker.O00(DeviceInfoChecker.OXO1, DeviceFragment.access$getMActivity(this.XIi00iiXO), false, 2, null);
            if (this.OXO1 == false) goto L24;
            DeviceFragment.access$threePopup(this.XIi00iiXO, false);
            return;
        L24:
            return;
        L5:
            if (r9.getFlag() == 3) goto L7;
            DeviceFragment r3 = this.XIi00iiXO;
            go0 r4 = new go0(DeviceFragment.access$getMActivity(this.XIi00iiXO), r0, r2, r1);
            final boolean r5 = this.OXO1;
            final DeviceFragment r6 = this.XIi00iiXO;
            r4.O1O(R.string.new_version_remind);
            r4.I0iXXO(false);
            if (r9.getFlag() != 1) goto L13;
            go0.X11iII1O1(r4, null, null, 2, null);
        L14:
            r4.X1IX(R.string.confirm, new XIX1i1O(r9, r6, r5));
            r3.setMOTAMessagePopup(r4);
            go0 r10 = this.XIi00iiXO.getMOTAMessagePopup();
            if (r10 == null) goto L23;
            r10.IIX1OXO();
            return;
        L23:
            return;
        L13:
            r4.iX1O1(Integer.valueOf(R.string.upgrade_later), new X1XX(r5, r6));
            goto L14
        L7:
            if (this.OXO1 == false) goto L22;
            DeviceFragment.access$threePopup(this.XIi00iiXO, false);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r5) {
            Intrinsics.X0O(r5, "error");
            I01XX0.XIi00iiXO(I01XX0.iXiiiO, null, 2, null);
            DeviceInfoChecker.O00(DeviceInfoChecker.OXO1, DeviceFragment.access$getMActivity(this.XIi00iiXO), false, 2, null);
            if (this.OXO1 == false) goto L6;
            DeviceFragment.access$threePopup(this.XIi00iiXO, false);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(FirmwareVersion r1) {
            XO0O10(r1);
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3159#2,2:149\n*E\n"})
    public static final class IiI10X extends TimerTask {
        public IiI10X() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BleConnector.INSTANCE.closeConnection(true);
        }
    }

    public static final class O00 implements O0Oiii<FirmwareVersion> {
        public final /* synthetic */ DeviceFragment OXO1;

        public O00(DeviceFragment r1) {
            this.OXO1 = r1;
        }

        public void OXO1(FirmwareVersion r3) {
            if (r3 == null) goto L5;
            DeviceFragment.access$toFirmwareUpgrade(this.OXO1);
            return;
        L5:
            DeviceInfoChecker.OXO1.XO0O10(DeviceFragment.access$getMActivity(this.OXO1), true);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r3) {
            Intrinsics.X0O(r3, "error");
            DeviceInfoChecker.OXO1.XO0O10(DeviceFragment.access$getMActivity(this.OXO1), true);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(FirmwareVersion r1) {
            OXO1(r1);
        }
    }

    public static final class OIX0iXi implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ DeviceFragment OXO1;

        public OIX0iXi(DeviceFragment r1) {
            this.OXO1 = r1;
        }

        public void OXO1(ExtraPackageData[] r10) {
            this.OXO1.setMServerLanguageList(r10);
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.DEVICE_LANGUAGES2, BleKeyFlag.READ, null, false, false, 28, null);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
            DeviceFragment.access$fourPopup(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData[] r1) {
            OXO1(r1);
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n99#2,7:3224\n106#2,3:3232\n79#2,7:3235\n109#2:3242\n1#3:3231\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n*L\n2832#1:3224,7\n2832#1:3232,3\n2832#1:3235,7\n2832#1:3242\n2832#1:3231\n*E\n"})
    public static final class OIi0 implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ DeviceFragment OXO1;

        public OIi0(DeviceFragment r1) {
            this.OXO1 = r1;
        }

        public static final boolean O00(DeviceFragment r4) {
            Bundle r0 = new Bundle();
            r0.putString("mArg0", null);
            r0.putInt("mArg1", R.string.watch_language_set);
            r0.putParcelable("mArg2", null);
            r0.putSerializable("mArg3", null);
            Intent r1 = new Intent(r4.getActivity(), LanguageListActivity.class);
            r1.putExtras(r0);
            r4.startActivity(r1);
            DeviceFragment.access$fourPopup(r4);
            return true;
        }

        public static /* synthetic */ boolean OXO1(DeviceFragment r0) {
            return O00(r0);
        }

        public static /* synthetic */ boolean XIi00iiXO(DeviceFragment r0) {
            return XO0O10(r0);
        }

        public static final boolean XO0O10(DeviceFragment r0) {
            DeviceFragment.access$fourPopup(r0);
            return true;
        }

        public void iO(ExtraPackageData[] r5) {
            if (r5 == null) goto L10;
            int r0 = 0;
            if (r5.length != 0) goto L6;
            boolean r6 = true;
        L7:
            if (r6 == true) goto L10;
            go0 r7 = new go0(DeviceFragment.access$getMActivity(this.OXO1), r0, 2, null);
            final DeviceFragment r1 = this.OXO1;
            r7.O1O(R.string.watch_language_set);
            r7.iX(Integer.valueOf(R.string.language_set_remind));
            r7.iX1O1(Integer.valueOf(R.string.cancel), new iOXXI0i(r1));
            r7.X1IX(R.string.settings, new iXIiI10(r1));
            View r2 = this.OXO1.getRootView();
            Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
            r7.I1XOi1(r2);
            return;
        L6:
            r6 = false;
        L10:
            DeviceFragment.access$fourPopup(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
            DeviceFragment.access$fourPopup(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData[] r1) {
            iO(r1);
        }
    }

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n78#2,3:3224\n81#2,5:3228\n1#3:3227\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n*L\n1579#1:3224,3\n1579#1:3228,5\n1579#1:3227\n*E\n"})
    public static final class XIi00iiXO implements O0Oiii<ExtraPackageData> {
        public final /* synthetic */ DeviceFragment OXO1;

        public XIi00iiXO(DeviceFragment r1) {
            this.OXO1 = r1;
        }

        public void OXO1(ExtraPackageData r4) {
            DeviceFragment r5 = this.OXO1;
            r5.startActivity(new Intent(r5.getActivity(), FirmwareUpgradeGPSActivity.class));
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
            DeviceFragment.access$toSyncAGPS(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData r1) {
            OXO1(r1);
        }
    }

    public static final class XO0O10 implements BleHandleCallback {
        public final /* synthetic */ DeviceFragment IO;

        public XO0O10(DeviceFragment r1) {
            this.IO = r1;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICoachGeneratePlanUpdate(int r1) {
            super.onAICoachGeneratePlanUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAICommandUpdate(BleAICommand r1) {
            super.onAICommandUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onActivityRecognitionUpdate(int r1) {
            super.onActivityRecognitionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmAdd(BleAlarm r1) {
            super.onAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmDelete(int r1) {
            super.onAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAlarmUpdate(BleAlarm r1) {
            super.onAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppOpUpdate(BleAppOp r1) {
            super.onAppOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onAppSportDataResponse(boolean r1) {
            super.onAppSportDataResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBWNaviInfoUpdate(BleBWNaviInfo r1) {
            super.onBWNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBacklightUpdate(int r1) {
            super.onBacklightUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBandKeyUpdate(BleBandKey r1) {
            super.onBandKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleGolfScore(BleGolfScore r1) {
            super.onBleGolfScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleThirdPartyDataUpdate(BleThirdPartyData r1) {
            super.onBleThirdPartyDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onBleVideoCallInfo(BleVideoCallInfo r1) {
            super.onBleVideoCallInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPChatUpdate(BleCPChat r1) {
            super.onCPChatUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPGiftsInfoUpdate(BleCPGiftsInfo r1) {
            super.onCPGiftsInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPListenerUpdate(BleCPListener r1) {
            super.onCPListenerUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPMissYouUpdate(BleCPMissYou r1) {
            super.onCPMissYouUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCPTodoUpdate(BleCPTodo r1) {
            super.onCPTodoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCaloriesGoalUpdate(int r1) {
            super.onCaloriesGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraResponse(boolean r1, int r2) {
            super.onCameraResponse(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCameraStateChange(int r1) {
            super.onCameraStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatAppUpdate(BleChatApp r1) {
            super.onChatAppUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatMessageUpdate(BleChatMessage r1) {
            super.onChatMessageUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onChatVoiceUpdate(BleChatVoice r1) {
            super.onChatVoiceUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCheckInEveryDayUpdate(BleCheckInEveryDay r1) {
            super.onCheckInEveryDayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onClassicBluetoothStateChange(int r1) {
            super.onClassicBluetoothStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandReply(BleKey r1, BleKeyFlag r2, boolean r3) {
            super.onCommandReply(r1, r2, r3);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onCommandSendTimeout(BleKey r1, BleKeyFlag r2) {
            super.onCommandSendTimeout(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onContactUsStateChange(int r1) {
            super.onContactUsStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteAICoachPlan() {
            super.onDeleteAICoachPlan();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeleteFileResponse(int r1) {
            super.onDeleteFileResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnected(BluetoothDevice r1) {
            super.onDeviceConnected(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceConnecting(boolean r1) {
            super.onDeviceConnecting(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceFileUpdate(BleDeviceFile r1) {
            super.onDeviceFileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceOpUpdate(int r1) {
            super.onDeviceOpUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceRequestAGpsFile(String r1) {
            super.onDeviceRequestAGpsFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSMSQuickReply(BleSMSQuickReply r1) {
            super.onDeviceSMSQuickReply(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDeviceSportDataUpdate(BleDeviceSportData r1) {
            super.onDeviceSportDataUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDistanceGoalUpdate(int r1) {
            super.onDistanceGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDoubleScreenSettingsUpdate(BleDoubleScreenSettings r1) {
            super.onDoubleScreenSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onDrinkWaterUpdate(BleDrinkWaterSettings r1) {
            super.onDrinkWaterUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneAncSettingsUpdate(BleEarphoneAncSettings r1) {
            super.onEarphoneAncSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneCallUpdate(int r1) {
            super.onEarphoneCallUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneKeyUpdate(BleEarphoneKey r1) {
            super.onEarphoneKeyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneSoundEffectsSettingsUpdate(BleEarphoneSoundEffectsSettings r1) {
            super.onEarphoneSoundEffectsSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onEarphoneStateUpdate(BleEarphoneState r1) {
            super.onEarphoneStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFactoryTestUpdate(BleFactoryTest r1) {
            super.onFactoryTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFallSetUpdate(int r1) {
            super.onFallSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindEarphoneUpdate(BleFindEarphone r1) {
            super.onFindEarphoneUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindPhone(boolean r1) {
            super.onFindPhone(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFindWatchUpdate(int r1) {
            super.onFindWatchUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemDateFormat() {
            super.onFollowSystemDateFormat();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemHour() {
            super.onFollowSystemHour();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onFollowSystemLanguage(boolean r1) {
            super.onFollowSystemLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGameControlUpdate(BleGameControl r1) {
            super.onGameControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWake2Update(BleGestureWake2 r1) {
            super.onGestureWake2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGestureWakeUpdate(BleGestureWake r1) {
            super.onGestureWakeUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onGoogleNaviInfoUpdate(BleGoogleNaviInfo r1) {
            super.onGoogleNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDState(int r1) {
            super.onHIDState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHIDValueChange(int r1) {
            super.onHIDValueChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHRWarningSet(BleHrWarningSettings r1) {
            super.onHRWarningSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHanBaoVibrationStateChange(int r1) {
            super.onHanBaoVibrationStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHighAntiAssistChange(int r1) {
            super.onHighAntiAssistChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHourSystemUpdate(int r1) {
            super.onHourSystemUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onHydrationUpdate(BleHydrationSettings r1) {
            super.onHydrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCExceptionUpdate(BleIPCException r1) {
            super.onIPCExceptionUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCOTAStateUpdate(BleIPCOTAState r1) {
            super.onIPCOTAStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStateUpdate(BleIPCState r1) {
            super.onIPCStateUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCStoresInfoUpdate(BleIPCStoresInfo r1) {
            super.onIPCStoresInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIPCWifiInfoUpdate(BleIPCWifiInfo r1) {
            super.onIPCWifiInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityCreate(boolean r1, BleDeviceInfo r2) {
            super.onIdentityCreate(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDelete(boolean r1) {
            super.onIdentityDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIdentityDeleteByDevice(boolean r1) {
            super.onIdentityDeleteByDevice(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallRingUpdate(int r1) {
            super.onIncomingCallRingUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onIncomingCallStatus(int r1) {
            super.onIncomingCallStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUpdate(BleLoveTap r1) {
            super.onLoveTapUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserDelete(int r1) {
            super.onLoveTapUserDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onLoveTapUserUpdate(BleLoveTapUser r1) {
            super.onLoveTapUserUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeasurementUpdate(BleMeasurement r1) {
            super.onMeasurementUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmAdd(BleMedicationAlarm r1) {
            super.onMedicationAlarmAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmDelete(int r1) {
            super.onMedicationAlarmDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationAlarmUpdate(BleMedicationAlarm r1) {
            super.onMedicationAlarmUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderDelete(int r1) {
            super.onMedicationReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMedicationReminderUpdate(BleMedicationReminder r1) {
            super.onMedicationReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderAdd(BleMeetingReminder r1) {
            super.onMeetingReminderAdd(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderDelete(int r1) {
            super.onMeetingReminderDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMeetingReminderUpdate(BleMeetingReminder r1) {
            super.onMeetingReminderUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferReadFile(int r1) {
            super.onMultiFileTransferReadFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onMultiFileTransferResponse(int r1) {
            super.onMultiFileTransferResponse(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNaviInfoUpdate(BleNaviInfo r1) {
            super.onNaviInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNoDisturbUpdate(BleNoDisturbSettings r1) {
            super.onNoDisturbUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationLightScreenSetUpdate(int r1) {
            super.onNotificationLightScreenSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onNotificationSettings2Update(BleNotificationSettings2 r1) {
            super.onNotificationSettings2Update(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onOTA(boolean r1) {
            super.onOTA(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeState(int r1) {
            super.onPowerSaveModeState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onPowerSaveModeStateChange(int r1) {
            super.onPowerSaveModeStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onQiblaSettingsUpdate() {
            super.onQiblaSettingsUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfo(BleAICoachBeforePlan r1) {
            super.onReadAICoachGenerateBeforeInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onReadAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlan(BleAICoachGeneratePlan r1) {
            super.onReadAICoachPlan(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAICoachPlanV2(BleAICoachGeneratePlanV2 r1) {
            super.onReadAICoachPlanV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivity(List<BleActivity> r1) {
            super.onReadActivity(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadActivityDetail(BleActivityDetail r1) {
            super.onReadActivityDetail(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAddressBook(BleAddressBook r1) {
            super.onReadAddressBook(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlarm(List<BleAlarm> r1) {
            super.onReadAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipayBindInfo(List<BleAlipayBindInfo> r1) {
            super.onReadAlipayBindInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAlipaySettings(BleAlipaySettings r1) {
            super.onReadAlipaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppApiVersion(String r1) {
            super.onReadAppApiVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppInfoList(BleAppInfoList r1) {
            super.onReadAppInfoList(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAppSportState(BleAppSportState r1) {
            super.onReadAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadAvgHeartRate(List<BleAvgHeartRate> r1) {
            super.onReadAvgHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBAC(List<BleBAC> r1) {
            super.onReadBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacCalibration(BleBacCalibration r1, BleKeyFlag r2) {
            super.onReadBacCalibration(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBacklight(int r1) {
            super.onReadBacklight(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBatteryUsage(BleBatteryUsage r1) {
            super.onReadBatteryUsage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleAddress(String r1) {
            super.onReadBleAddress(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfMapCacheInfo(BleGolfMapCacheInfo r1) {
            super.onReadBleGolfMapCacheInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfSportSwitch(BleGolfSportSwitch r1) {
            super.onReadBleGolfSportSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchMapInfo(BleGolfWatchMapInfo r1) {
            super.onReadBleGolfWatchMapInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleGolfWatchVersionInfo(BleGolfWatchVersionInfo r1) {
            super.onReadBleGolfWatchVersionInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleHrv(List<BleHrv> r1) {
            super.onReadBleHrv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBleLogText(List<BleLogText> r1) {
            super.onReadBleLogText(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodGlucose(List<BleBloodGlucose> r1) {
            super.onReadBloodGlucose(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxyGenSettings(BleBloodOxyGenSettings r1) {
            super.onReadBloodOxyGenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodOxygen(List<BleBloodOxygen> r1) {
            super.onReadBloodOxygen(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressure(List<BleBloodPressure> r1) {
            super.onReadBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBloodPressureCalibration(BleBloodPressureCalibration r1) {
            super.onReadBloodPressureCalibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadBodyStatus(List<BleBodyStatus> r1) {
            super.onReadBodyStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCPUserInfo(BleCPUserInfo r1) {
            super.onReadCPUserInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalibrationData(BleCalibrationData r1) {
            super.onReadCalibrationData(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCalorieIntake(List<BleCalorieIntake> r1) {
            super.onReadCalorieIntake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCaloriesGoal(int r1) {
            super.onReadCaloriesGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadChatApp(BleChatApp r1) {
            super.onReadChatApp(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCheckInEveryDay(BleCheckInEveryDay r1) {
            super.onReadCheckInEveryDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadClassicBluetoothState(int r1) {
            super.onReadClassicBluetoothState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCoachingIds(BleCoachingIds r1) {
            super.onReadCoachingIds(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadCyWeeAlgorithm(BleCyWeeAlgorithm r1) {
            super.onReadCyWeeAlgorithm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDailyPower(List<BlePhysicalPower> r1) {
            super.onReadDailyPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDateFormat(int r1) {
            super.onReadDateFormat(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFile(BleDeviceFile r1) {
            super.onReadDeviceFile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceFileV2(BleDeviceFile2 r1) {
            super.onReadDeviceFileV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo(BleDeviceInfo r1) {
            super.onReadDeviceInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceInfo2(BleDeviceInfo2 r1) {
            super.onReadDeviceInfo2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages(BleDeviceLanguages r1) {
            super.onReadDeviceLanguages(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceLanguages2(BleDeviceLanguages2 r1) {
            super.onReadDeviceLanguages2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDeviceUniqueDataSettings(BleDeviceUniqueDataSettings r1) {
            super.onReadDeviceUniqueDataSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDistanceGoal(int r1) {
            super.onReadDistanceGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDoubleScreenSettings(BleDoubleScreenSettings r1) {
            super.onReadDoubleScreenSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadDrinkWater(BleDrinkWaterSettings r1) {
            super.onReadDrinkWater(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadECGRealtime(BleECGRealtime r1) {
            super.onReadECGRealtime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneAncSettings(BleEarphoneAncSettings r1) {
            super.onReadEarphoneAncSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneCall(int r1) {
            super.onReadEarphoneCall(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneInfo(BleEarphoneInfo r1) {
            super.onReadEarphoneInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneKey(BleEarphoneKey r1) {
            super.onReadEarphoneKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphonePower(BleEarphonePower r1) {
            super.onReadEarphonePower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneSoundEffectsSettings(BleEarphoneSoundEffectsSettings r1) {
            super.onReadEarphoneSoundEffectsSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEarphoneState(BleEarphoneState r1) {
            super.onReadEarphoneState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcg(List<BleEcg> r1) {
            super.onReadEcg(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEcgSettings(BleEcgSettings r1) {
            super.onReadEcgSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadEnergyRating(List<BleEnergyRating> r1) {
            super.onReadEnergyRating(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFallSet(int r1) {
            super.onReadFallSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFilePath(BleAppAudioBookList r1) {
            super.onReadFilePath(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFirmwareVersion(String r1) {
            super.onReadFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadFoodBalance(List<BleFoodBalance> r1) {
            super.onReadFoodBalance(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake(BleGestureWake r1) {
            super.onReadGestureWake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGestureWake2(BleGestureWake2 r1) {
            super.onReadGestureWake2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareMonthly(BleGirlCareMonthly r1) {
            super.onReadGirlCareMonthly(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGirlCareSettings(BleGirlCareSettings r1) {
            super.onReadGirlCareSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGoMoreSettings(BleGoMoreSettings r1) {
            super.onReadGoMoreSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGolfWatchScore(BleGolfWatchScore r1) {
            super.onReadGolfWatchScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadGpsFirmwareVersion(String r1) {
            super.onReadGpsFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoSettings(BleHanBaoSettings r1) {
            super.onReadHanBaoSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHanBaoVibration(List<BleHanBaoVibration> r1) {
            super.onReadHanBaoVibration(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRate(List<BleHeartRate> r1) {
            super.onReadHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHeartRateZones(BleHeartRateZones r1) {
            super.onReadHeartRateZones(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHourSystem(int r1) {
            super.onReadHourSystem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettings(BleHrMonitoringSettings r1) {
            super.onReadHrMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrMonitoringSettingsV2(int r1) {
            super.onReadHrMonitoringSettingsV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvBaseLine(BleHrvBaseLine r1) {
            super.onReadHrvBaseLine(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHrvMonitoringSettings(BleHrvMonitoringSettings r1) {
            super.onReadHrvMonitoringSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadHydrationSettings(BleHydrationSettings r1) {
            super.onReadHydrationSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCInfo(BleIPCInfo r1) {
            super.onReadIPCInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCState(BleIPCState r1) {
            super.onReadIPCState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCStoresInfo(BleIPCStoresInfo r1) {
            super.onReadIPCStoresInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIPCVersion(String r1) {
            super.onReadIPCVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadIncomingCallRing(int r1) {
            super.onReadIncomingCallRing(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLactateThreshold(List<BleLactateThreshold> r1) {
            super.onReadLactateThreshold(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguage(int r1) {
            super.onReadLanguage(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLanguagePackVersion(BleLanguagePackVersion r1) {
            super.onReadLanguagePackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLocation(List<BleLocation> r1) {
            super.onReadLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadLoveTapUser(List<BleLoveTapUser> r1) {
            super.onReadLoveTapUser(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord(List<BleMatchRecord> r1) {
            super.onReadMatchRecord(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord2(List<BleMatchRecord2> r1) {
            super.onReadMatchRecord2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMatchRecord3(List<BleMatchRecord3> r1) {
            super.onReadMatchRecord3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationAlarm(List<BleMedicationAlarm> r1) {
            super.onReadMedicationAlarm(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMedicationReminder(List<BleMedicationReminder> r1) {
            super.onReadMedicationReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMeetingReminder(List<BleMeetingReminder> r1) {
            super.onReadMeetingReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMindStatus(List<BleMindStatus> r1) {
            super.onReadMindStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMtkOtaMeta() {
            super.onReadMtkOtaMeta();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadMultiFileTransfer(BleMapFileList r1) {
            super.onReadMultiFileTransfer(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNetworkFirmwareVersion(String r1) {
            super.onReadNetworkFirmwareVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNoDisturb(BleNoDisturbSettings r1) {
            super.onReadNoDisturb(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationLightScreenSet(int r1) {
            super.onReadNotificationLightScreenSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadNotificationSettings2(BleNotificationSettings2 r1) {
            super.onReadNotificationSettings2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOfflineAsrSettings(BleOfflineAsrSettings r1) {
            super.onReadOfflineAsrSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOngoingDialogue(int r1) {
            super.onReadOngoingDialogue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadOptionalMapAuthInfo(BleOptionalMapAuthInfo r1) {
            super.onReadOptionalMapAuthInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPackageStatus(BlePackageStatus r1) {
            super.onReadPackageStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower(int r1) {
            super.onReadPower(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPower2(BlePower2 r1) {
            super.onReadPower2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressure(List<BlePressure> r1) {
            super.onReadPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadPressureTimingMeasurement(BlePressureTimingMeasurement r1) {
            super.onReadPressureTimingMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadQiblaSettings(BleQiblaSettings r1) {
            super.onReadQiblaSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRecordControl(BleRecordControl r1) {
            super.onReadRecordControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRelaxReminder(BleRelaxReminder r1) {
            super.onReadRelaxReminder(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRespiratoryRate(List<BleRespiratoryRate> r1) {
            super.onReadRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRestingHeartRate(int r1) {
            super.onReadRestingHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRingVibrationSet(BleRingVibrationSettings r1) {
            super.onReadRingVibrationSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadRri(List<BleRri> r1) {
            super.onReadRri(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSDCardInfo(BleSDCardInfo r1) {
            super.onReadSDCardInfo(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGCameraSet(BleSGCameraSet r1) {
            super.onReadSGCameraSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeySet(BleSGKeySet r1) {
            super.onReadSGKeySet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGKeywordAwake(BleSGKeywordAwake r1) {
            super.onReadSGKeywordAwake(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSet(BleSGSet r1) {
            super.onReadSGSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSGSleepSet(int r1) {
            super.onReadSGSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSOSSettings(BleSOSSettings r1) {
            super.onReadSOSSettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadScreenBrightnessSet(int r1) {
            super.onReadScreenBrightnessSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSedentariness(BleSedentarinessSettings r1) {
            super.onReadSedentariness(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleep(List<BleSleep> r1) {
            super.onReadSleep(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepGoal(int r1) {
            super.onReadSleepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepMonitoringMode(int r1) {
            super.onReadSleepMonitoringMode(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQuality(BleSleepQuality r1) {
            super.onReadSleepQuality(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepQualityScore(int r1) {
            super.onReadSleepQualityScore(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRaw(byte[] r1) {
            super.onReadSleepRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRespiratoryRate(int r1) {
            super.onReadSleepRespiratoryRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepRiskLevel(int r1) {
            super.onReadSleepRiskLevel(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSleepSet(int r1) {
            super.onReadSleepSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosCallLog(List<BleSosCallLog> r1) {
            super.onReadSosCallLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSosContact(BleSosContact r1) {
            super.onReadSosContact(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadSportDurationGoal(int r1) {
            super.onReadSportDurationGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStandbyWatchFaceSet(BleStandbyWatchFaceSet r1) {
            super.onReadStandbyWatchFaceSet(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStepGoal(int r1) {
            super.onReadStepGoal(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(List<BleStock> r1) {
            super.onReadStock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperature(List<BleTemperature> r1) {
            super.onReadTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTemperatureUnit(int r1) {
            super.onReadTemperatureUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTrainingStatus(List<BleTrainingStatus> r1) {
            super.onReadTrainingStatus(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadTuyaKey(BleTuyaKey r1) {
            super.onReadTuyaKey(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUiPackVersion(String r1) {
            super.onReadUiPackVersion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUnit(int r1) {
            super.onReadUnit(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadUserProfile(BleUserProfile r1) {
            super.onReadUserProfile(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVitalityValue(List<BleVitality> r1) {
            super.onReadVitalityValue(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadVoiceControl(int r1) {
            super.onReadVoiceControl(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceId(BleWatchFaceId r1) {
            super.onReadWatchFaceId(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceIndex(BleWatchFaceIndex r1) {
            super.onReadWatchFaceIndex(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceMaxSize(BleWatchFaceMaxSize r1) {
            super.onReadWatchFaceMaxSize(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchFaceSwitch(int r1) {
            super.onReadWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWatchPassword(BleSettingWatchPassword r1) {
            super.onReadWatchPassword(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWearWayState(int r1) {
            super.onReadWearWayState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWeatherRealTime(boolean r1) {
            super.onReadWeatherRealTime(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWechatPaySettings(BleWechatPaySettings r1) {
            super.onReadWechatPaySettings(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout(List<BleWorkout> r1) {
            super.onReadWorkout(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout2(List<BleWorkout2> r1) {
            super.onReadWorkout2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout3(List<BleWorkout3> r1) {
            super.onReadWorkout3(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4(List<BleWorkout4> r1) {
            super.onReadWorkout4(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorkout4Segmentation(BleWorkout4Segmentation r1) {
            super.onReadWorkout4Segmentation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadWorldClock(List<BleWorldClock> r1) {
            super.onReadWorldClock(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRealTimeMeasurement(BleRealTimeMeasurement r1) {
            super.onRealTimeMeasurement(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveCmTrace(byte[] r1, boolean r2) {
            super.onReceiveCmTrace(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveFilePacket(BleReceiveFilePacket r1) {
            super.onReceiveFilePacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorMotion(List<BleGSensorMotion> r1) {
            super.onReceiveGSensorMotion(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorRaw(List<BleGSensorRaw> r1) {
            super.onReceiveGSensorRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveGSensorSHSY(List<BleGSensorSHSY> r1) {
            super.onReceiveGSensorSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveHRRaw(List<BleHRRaw> r1) {
            super.onReceiveHRRaw(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGga(BleLocationGga r1) {
            super.onReceiveLocationGga(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveLocationGsv(List<BleLocationGsv> r1) {
            super.onReceiveLocationGsv(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveMusicCommand(MusicCommand r1) {
            super.onReceiveMusicCommand(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceivePpgSHSY(List<BlePpgSHSY> r1) {
            super.onReceivePpgSHSY(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRealtimeLog(BleRealtimeLog r1) {
            super.onReceiveRealtimeLog(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReceiveRecordPacket(BleRecordPacket r1) {
            super.onReceiveRecordPacket(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRecordControlUpdate(BleRecordControl r1) {
            super.onRecordControlUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestAgpsPrerequisite() {
            super.onRequestAgpsPrerequisite();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRequestLocation(int r1) {
            super.onRequestLocation(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onRingVibrationSetUpdate(BleRingVibrationSettings r1) {
            super.onRingVibrationSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSDCardInfoUpdate(BleSDCardInfo r1) {
            super.onSDCardInfoUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTestUpdate(BleSGTest r1) {
            super.onSGTestUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSGTtsUpdate(BleSGTts r1) {
            super.onSGTtsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSOSSettingsUpdate(BleSOSSettings r1) {
            super.onSOSSettingsUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onScreenBrightnessSetUpdate(int r1) {
            super.onScreenBrightnessSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSessionStateChange(boolean r1) {
            super.onSessionStateChange(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSleepNotifyUpdate(BleSleepNotify r1) {
            super.onSleepNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSosContactUpdate(BleSosContact r1) {
            super.onSosContactUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSportEndNotifyUpdate(int r1) {
            super.onSportEndNotifyUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStandbyWatchFaceSetUpdate(BleStandbyWatchFaceSet r1) {
            super.onStandbyWatchFaceSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStepGoalUpdate(int r1) {
            super.onStepGoalUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onStockDelete(int r1) {
            super.onStockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public void onStreamProgress(boolean r1, int r2, int r3, int r4, BleKey r5) {
            Intrinsics.X0O(r5, "bleKey");
            if (r1 == false) goto L8;
            if (r3 <= 0) goto L8;
            c72 r6 = this.IO.getMAGpsPopup();
            if (r6 == null) goto L8;
            r6.OX((r4 * 100) / r3);
        L8:
            if (r1 == false) goto L10;
            if (r3 == r4) goto L10;
            return;
        L10:
            c72 r7 = this.IO.getMAGpsPopup();
            if (r7 != null) goto L13;
            return;
        L13:
            if (r7.isShowing() == false) goto L18;
            r7.dismiss();
            return;
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onSyncData(int r1, BleKey r2) {
            super.onSyncData(r1, r2);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onTimeUpdate() {
            super.onTimeUpdate();
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachGenerateBeforeInfoV2(BleAICoachBeforePlanV2 r1) {
            super.onUpdateAICoachGenerateBeforeInfoV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAICoachLeaveDay(BleLeaveDay r1) {
            super.onUpdateAICoachLeaveDay(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateAppSportState(BleAppSportState r1) {
            super.onUpdateAppSportState(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBAC(BleBAC r1) {
            super.onUpdateBAC(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateBloodPressure(BleBloodPressure r1) {
            super.onUpdateBloodPressure(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateHeartRate(BleHeartRate r1) {
            super.onUpdateHeartRate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateTemperature(BleTemperature r1) {
            super.onUpdateTemperature(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUpdateWatchFaceSwitch(boolean r1) {
            super.onUpdateWatchFaceSwitch(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onUserProfileUpdate(BleUserProfile r1) {
            super.onUserProfileUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdate(int r1) {
            super.onVibrationUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onVibrationUpdateV2(int r1) {
            super.onVibrationUpdateV2(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIdUpdate(boolean r1) {
            super.onWatchFaceIdUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexCreate(boolean r1) {
            super.onWatchFaceIndexCreate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchFaceIndexUpdate(BleWatchFaceIndex r1) {
            super.onWatchFaceIndexUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWatchPasswordUpdate(BleSettingWatchPassword r1) {
            super.onWatchPasswordUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWearWayUpdate(int r1) {
            super.onWearWayUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onWorldClockDelete(int r1) {
            super.onWorldClockDelete(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXMLYBandSetUpdate(BleXMLYBandSet r1) {
            super.onXMLYBandSetUpdate(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onXModem(byte r1) {
            super.onXModem(r1);
        }

        @Override // com.szabh.smable3.component.BleHandleCallback
        public /* bridge */ void onReadStock(boolean r1) {
            super.onReadStock(r1);
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n1#3:3229\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n*L\n260#1:3224,5\n260#1:3230,5\n260#1:3229\n*E\n"})
    public static final class XOO0ii0 implements InfoItem.OXO1 {
        public final /* synthetic */ DeviceFragment OXO1;

        public XOO0ii0(DeviceFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.device.item.InfoItem.OXO1
        public void onClick(View r4) {
            Intrinsics.X0O(r4, "v");
            if (r4.getId() != R.id.btn_multi_device) goto L6;
            DeviceFragment r5 = this.OXO1;
            FragmentActivity r1 = r5.getActivity();
            Intrinsics.XXI(r1);
            r5.startActivityForResult(new Intent(r1, MultiDeviceManagerActivity.class), 7);
            return;
        }
    }

    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment\n*L\n1#1,148:1\n3128#2,2:149\n*E\n"})
    public static final class iO extends TimerTask {
        public iO() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            I01XX0.XIi00iiXO(I01XX0.XXO, null, 2, null);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public DeviceFragment() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new XXXiO11iX(this));
        this.isTipAppGuideActivity = true;
        this.infoItem$delegate = LazyKt__LazyJVMKt.iO(new X1i0XXI(this));
        this.gameStoreItem$delegate = LazyKt__LazyJVMKt.iO(new XIiIOO(this));
        this.classicPairItem$delegate = LazyKt__LazyJVMKt.iO(new IiIii0(this));
        this.dialItem$delegate = LazyKt__LazyJVMKt.iO(new O0Ii0IX0(this));
        this.messagePushItem$delegate = LazyKt__LazyJVMKt.iO(new i0XI0O01O(this));
        this.antiLostItem$delegate = LazyKt__LazyJVMKt.iO(new O1OO(this));
        this.hydrationReminderItem$delegate = LazyKt__LazyJVMKt.iO(new OiX1());
        this.meetingReminderItem$delegate = LazyKt__LazyJVMKt.iO(new XiiXO1());
        this.incomingCallItem$delegate = LazyKt__LazyJVMKt.iO(new O1XOXiOX(this));
        this.notificationLightScreenItem$delegate = LazyKt__LazyJVMKt.iO(new IXIX0iI0i(this));
        this.timeFormatItem$delegate = LazyKt__LazyJVMKt.iO(new IOi0XOX(this));
        this.dateFormatItem$delegate = LazyKt__LazyJVMKt.iO(new O0X1iiiI(this));
        this.wearWayItem$delegate = LazyKt__LazyJVMKt.iO(new OO0XIIOO(this));
        this.incomingCallRingVibrationItem$delegate = LazyKt__LazyJVMKt.iO(new IIXX0O11(this));
        this.languageUpdateItem$delegate = LazyKt__LazyJVMKt.iO(new X10iIX10(this));
        this.sleepSet$delegate = LazyKt__LazyJVMKt.iO(new X0100iOOO(this));
        this.voiceControl$delegate = LazyKt__LazyJVMKt.iO(new O1XOI(this));
        this.noDisturbItem$delegate = LazyKt__LazyJVMKt.iO(new O0XIIXXOO(this));
        this.noDisturb2Item$delegate = LazyKt__LazyJVMKt.iO(new OIiiII(this));
        this.doubleClickScreenItem$delegate = LazyKt__LazyJVMKt.iO(new IiXi1OO0i(this));
        this.incomingCallRingItem$delegate = LazyKt__LazyJVMKt.iO(new i001XX(this));
        this.alarmClockItem$delegate = LazyKt__LazyJVMKt.iO(new IiX1100(this));
        this.nfcGuideItem$delegate = LazyKt__LazyJVMKt.iO(new IXOIO0Oi1(this));
        this.gameTimeSetItem$delegate = LazyKt__LazyJVMKt.iO(new IO1OO00OI(this));
        this.medicationAlarmItem$delegate = LazyKt__LazyJVMKt.iO(new iXO0X10i(this));
        this.sedentarinessItem$delegate = LazyKt__LazyJVMKt.iO(new ii11Oi0(this));
        this.findWatchItem$delegate = LazyKt__LazyJVMKt.iO(new X0X1OiO(this));
        this.drinkWaterItem$delegate = LazyKt__LazyJVMKt.iO(new Ii00XXOO1(this));
        this.bloodOxyGenItem$delegate = LazyKt__LazyJVMKt.iO(new OiXi0Oi(this));
        this.relaxReminderItem$delegate = LazyKt__LazyJVMKt.iO(new iIII1OIO(this));
        this.resetItem$delegate = LazyKt__LazyJVMKt.iO(new X0OXO0i00(this));
        this.shutdownItem$delegate = LazyKt__LazyJVMKt.iO(new IIO11III(this));
        this.pressureItem$delegate = LazyKt__LazyJVMKt.iO(new I1X0OI(this));
        this.standbyWatchFaceItem$delegate = LazyKt__LazyJVMKt.iO(new XOIO1(this));
        this.washItem$delegate = LazyKt__LazyJVMKt.iO(new i01I1(this));
        this.gameSettingsItem$delegate = LazyKt__LazyJVMKt.iO(new i1X00(this));
        this.measureUnitItem$delegate = LazyKt__LazyJVMKt.iO(new OIiO0I1(this));
        this.shockItem$delegate = LazyKt__LazyJVMKt.iO(new OXiOIiIO1(this));
        this.shockSettingsItem$delegate = LazyKt__LazyJVMKt.iO(new XOOIiIOiX(this));
        this.shockLevelItem$delegate = LazyKt__LazyJVMKt.iO(new XiOi1(this));
        this.backLightItem$delegate = LazyKt__LazyJVMKt.iO(new IO00XXII(this));
        this.gestureWakeItem$delegate = LazyKt__LazyJVMKt.iO(new XXXX1OiI(this));
        this.gestureWake2Item$delegate = LazyKt__LazyJVMKt.iO(new O1i1X0111(this));
        this.hrMonitoringItem$delegate = LazyKt__LazyJVMKt.iO(new X10I000I(this));
        this.ecgMonitoringItem$delegate = LazyKt__LazyJVMKt.iO(new iOXO0OOi(this));
        this.tempMonitoringItem$delegate = LazyKt__LazyJVMKt.iO(new iO0O0IiX(this));
        this.girlCareItem$delegate = LazyKt__LazyJVMKt.iO(new iI1IiiOIO(this));
        this.remoteCameraItem$delegate = LazyKt__LazyJVMKt.iO(new IOiOii0(this));
        this.languageItem$delegate = LazyKt__LazyJVMKt.iO(new IOXOO(this));
        this.offlineMapsItem$delegate = LazyKt__LazyJVMKt.iO(new XXOI1OI(this));
        this.videoUseHelpItem$delegate = LazyKt__LazyJVMKt.iO(new iiX1iX(this));
        this.touchSetItem$delegate = LazyKt__LazyJVMKt.iO(new OX0XOXOi(this));
        this.firmwareItem$delegate = LazyKt__LazyJVMKt.iO(new iOOi1Oi(this));
        this.aGPSUpgradeItem$delegate = LazyKt__LazyJVMKt.iO(new OOXiO(this));
        this.syncContactItem$delegate = LazyKt__LazyJVMKt.iO(new XO1XXO1X(this));
        this.macQrcodeItem$delegate = LazyKt__LazyJVMKt.iO(new XiIO0O(this));
        this.standbySetItem$delegate = LazyKt__LazyJVMKt.iO(new OOIX1i11I(this));
        this.watchPasswordItem$delegate = LazyKt__LazyJVMKt.iO(new OOX1XIOi(this));
        this.nucleicAcidCodeItem$delegate = LazyKt__LazyJVMKt.iO(new XI1iXiOO1(this));
        this.myCardCodeItem$delegate = LazyKt__LazyJVMKt.iO(new OO1XIIOO(this));
        this.myCardCode2Item$delegate = LazyKt__LazyJVMKt.iO(new iO1XIXI(this));
        this.receiptCodeItem$delegate = LazyKt__LazyJVMKt.iO(new iIX1O0X0(this));
        this.receiptCode2Item$delegate = LazyKt__LazyJVMKt.iO(new IIIO1(this));
        this.alipaySetItem$delegate = LazyKt__LazyJVMKt.iO(new XIiOOOXXi(this));
        this.wechatVerificationItem$delegate = LazyKt__LazyJVMKt.iO(new I00IOX0(this));
        this.wechatPaySetItem$delegate = LazyKt__LazyJVMKt.iO(new i1OiX0(this));
        this.logoFileItem$delegate = LazyKt__LazyJVMKt.iO(new OIi10(this));
        this.unpairItem$delegate = LazyKt__LazyJVMKt.iO(new O0XXOiIII(this));
        this.musicControlItem$delegate = LazyKt__LazyJVMKt.iO(new XX1X1X0(this));
        this.stockMarketItem$delegate = LazyKt__LazyJVMKt.iO(new iOXO00011(this));
        this.worldClockItem$delegate = LazyKt__LazyJVMKt.iO(new X1XIO(this));
        this.navigationItem$delegate = LazyKt__LazyJVMKt.iO(new iOOIIX1());
        this.voiceItem$delegate = LazyKt__LazyJVMKt.iO(new XOIOi(this));
        this.dialogueTranslation$delegate = LazyKt__LazyJVMKt.iO(new Ii111(this));
        this.simultaneousTranslation$delegate = LazyKt__LazyJVMKt.iO(new O1i01I0Oi(this));
        this.aiNote$delegate = LazyKt__LazyJVMKt.iO(new O01IiO10(this));
        this.musicManagerItem$delegate = LazyKt__LazyJVMKt.iO(new XOIiI(this));
        this.ebookManagerItem$delegate = LazyKt__LazyJVMKt.iO(new IiO1X0X1(this));
        this.sosManagerItem$delegate = LazyKt__LazyJVMKt.iO(new iXXI0i(this));
        this.fallManagerItem$delegate = LazyKt__LazyJVMKt.iO(new O10O1II(this));
        this.memoryManagerItem$delegate = LazyKt__LazyJVMKt.iO(new O0i0I001(this));
        this.smsQuickReplyItem$delegate = LazyKt__LazyJVMKt.iO(new iOOI1I0OX(this));
        this.powerSaveModeItem$delegate = LazyKt__LazyJVMKt.iO(new I1X0OO(this));
        this.scheduleItem$delegate = LazyKt__LazyJVMKt.iO(new OO00I(this));
        this.recordingItem$delegate = LazyKt__LazyJVMKt.iO(new OO1XiI0i(this));
        this.hardWareAlipay$delegate = LazyKt__LazyJVMKt.iO(new O0I1XOIX1(this));
        this.appStoreItem$delegate = LazyKt__LazyJVMKt.iO(new i1OiXI00(this));
        this.audioBookLearnItem$delegate = LazyKt__LazyJVMKt.iO(new OIOOX1I(this));
        this.learnCardItem$delegate = LazyKt__LazyJVMKt.iO(new IX0O0(this));
        this.qiblaItem$delegate = LazyKt__LazyJVMKt.iO(new XOOO1Ii(this));
        this.earphoneItem$delegate = LazyKt__LazyJVMKt.iO(new iX0100(this));
        this.activityRecognitionItem$delegate = LazyKt__LazyJVMKt.iO(new OO011(this));
        this.hrvSetItem$delegate = LazyKt__LazyJVMKt.iO(new X000X(this));
        this.xmlyAudioItem$delegate = LazyKt__LazyJVMKt.iO(new i0iIiOX1(this));
        this.mBleHandleCallback = new I0IIOi(this);
        this.bleHandleCallback = new XO0O10(this);
    }

    public static /* synthetic */ Unit I0(DeviceFragment r0, View r1) {
        return gestureWake2Item_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I00(DeviceFragment r0, BleConnector r1) {
        return shutdownItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I00I01I(DeviceFragment r0, BleConnector r1) {
        return languageItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ TouchSetItem I011X(DeviceFragment r0) {
        return touchSetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I0IIOI(DeviceFragment r0, View r1) {
        return gameTimeSetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I0IIOi(DeviceFragment r0, View r1) {
        return shockItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I0O(DeviceFragment r0, View r1) {
        return macQrcodeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I0O1O(DeviceFragment r0, int r1) {
        return backLightItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I0OX(DeviceFragment r0, View r1) {
        return videoUseHelpItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I0XXi0X(DeviceFragment r0, int r1) {
        return macQrcodeItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I0XXiIO(DeviceFragment r0, View r1) {
        return incomingCallRingItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I0i() {
        return resetItem_delegate$lambda$0$0$0$0$0$0();
    }

    public static /* synthetic */ Unit I0i0(DeviceFragment r0, BleConnector r1) {
        return aiNote_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ StandbySetItem I0i1OXiI(DeviceFragment r0) {
        return standbySetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MemoryManagerItem I0iOXO(DeviceFragment r0) {
        return memoryManagerItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I0iXXO(DeviceFragment r0, View r1) {
        return ebookManagerItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I1(DeviceFragment r0, int r1) {
        return voiceControl_delegate$lambda$0$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I10Oi0(DeviceFragment r0, View r1) {
        return musicManagerItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I11X11OX(DeviceFragment r0, View r1) {
        return aGPSUpgradeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean I11iXOO(DeviceFragment r0, int r1) {
        return backLightItem_delegate$lambda$0$0$0$2$0(r0, r1);
    }

    public static /* synthetic */ LearnCardItem I1IXIOX1(DeviceFragment r0) {
        return learnCardItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1Ii(DeviceFragment r0, int r1) {
        return wearWayItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ GameTimeSetItem I1OI(DeviceFragment r0) {
        return gameTimeSetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XII0X(DeviceFragment r0, int r1) {
        return singleChoiceIncomingCallRing$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(DeviceFragment r0, View r1) {
        return languageItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XXi1Oi(DeviceFragment r0, BleConnector r1) {
        return smsQuickReplyItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ MyCardCodeItem II(DeviceFragment r0) {
        return myCardCodeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit II01I(DeviceFragment r0, View r1) {
        return washItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit II1(DeviceFragment r0, View r1) {
        return gameStoreItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ HealthCareItem II1Xi0(DeviceFragment r0) {
        return girlCareItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void III() {
        fourPopup$lambda$0();
    }

    public static /* synthetic */ Unit IIII0iI(DeviceFragment r0, BleConnector r1) {
        return simultaneousTranslation_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIO11(DeviceFragment r0, View r1) {
        return aiNote_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX(int r0, DeviceFragment r1, BleConnector r2) {
        return powerSaveModeItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IIX1OXO(DeviceFragment r0, View r1) {
        return sleepSet_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIi(DeviceFragment r0, View r1) {
        return noDisturbItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIi10(DeviceFragment r0, View r1) {
        return dialItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIiiIiXiI(DeviceFragment r0, View r1) {
        return worldClockItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ LanguageItem IO(DeviceFragment r0) {
        return languageItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IO0II0i(DeviceFragment r0, BleConnector r1) {
        return remoteCameraItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IO0IXI(View r0) {
        return hydrationReminderItem_delegate$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit IO0iXO0O(DeviceFragment r0, BleConnector r1) {
        return sleepSet_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IOI(DeviceFragment r0, View r1) {
        return alarmClockItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IOI0i0I(DeviceFragment r0, View r1) {
        return recordingItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IOIX1OI0(DeviceFragment r0, BleConnector r1) {
        return earphoneItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IOIi00(int r0, DeviceFragment r1, BleConnector r2) {
        return shockItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IOX1(DeviceFragment r0) {
        return setProgressBackCallBack$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit IOi1O0(View r0) {
        return navigationItem_delegate$lambda$0$0$0(r0);
    }

    public static /* synthetic */ WashItem IX(DeviceFragment r0) {
        return washItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IX0(int r0, DeviceFragment r1, BleConnector r2) {
        return backLightItem_delegate$lambda$0$0$0$2$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IX0IXOi(DeviceFragment r0, View r1) {
        return scheduleItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ IncomingCallItem IX0iIX(DeviceFragment r0) {
        return incomingCallItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ HydrationReminderItem IX1XiI() {
        return hydrationReminderItem_delegate$lambda$0();
    }

    public static /* synthetic */ AINoteItem IXI(DeviceFragment r0) {
        return aiNote_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IXO0OOi(DeviceFragment r0, View r1) {
        return antiLostItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ SleepSetItem IXOIIIO(DeviceFragment r0) {
        return sleepSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TempMonitoringItem IXOiIi1O1(DeviceFragment r0) {
        return tempMonitoringItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IXXOO(DeviceFragment r0, View r1) {
        return firmwareItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean IXi01O(DeviceFragment r0) {
        return onCodePairChange$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit IXiOXO(DeviceFragment r0, boolean r1) {
        return showPairTypePop$lambda$0(r0, r1);
    }

    public static /* synthetic */ ActivityRecognitionItem Ii(DeviceFragment r0) {
        return activityRecognitionItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit Ii0X0X(DeviceFragment r0, View r1) {
        return stockMarketItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii0i(DeviceFragment r0, View r1) {
        return nfcGuideItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Ii1iii0(DeviceFragment r0, View r1) {
        return memoryManagerItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IiI10X(dj4 r0, DeviceFragment r1, PermissionStatus r2) {
        return incomingCallItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ VoiceControlItem IiIiIiX(DeviceFragment r0) {
        return voiceControl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiO1X1OI(int r0, DeviceFragment r1, BleConnector r2) {
        return singleChoiceIncomingCallRing$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ NoDisturb2Item IiX1ii(DeviceFragment r0) {
        return noDisturb2Item_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiXIIX1O1(int r0, DeviceFragment r1, BleConnector r2) {
        return fallManagerItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IiiXiI0I(DeviceFragment r0, View r1) {
        return touchSetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean IiiiOIIi0(DeviceFragment r0) {
        return checkLanguageUpdate$lambda$1$0(r0);
    }

    public static /* synthetic */ Unit O0(int r0, DeviceFragment r1, BleConnector r2) {
        return noDisturbItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit O00(DeviceFragment r0, View r1) {
        return wechatPaySetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ReceiptCodeItem O001I(DeviceFragment r0) {
        return receiptCodeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MeetingReminderItem O0Ii() {
        return meetingReminderItem_delegate$lambda$0();
    }

    public static /* synthetic */ Unit O0O(DeviceFragment r0, View r1) {
        return qiblaItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean O0O0X0iOi(DeviceFragment r0, int r1) {
        return antiLostItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O0X(DeviceFragment r0, View r1) {
        return timeFormatItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean O0i(DeviceFragment r0, int r1) {
        return notificationLightScreenItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ FindWatchItem O0i0(DeviceFragment r0) {
        return findWatchItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O0i011(DeviceFragment r0, View r1) {
        return standbySetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O1(int r0, DeviceFragment r1, BleConnector r2) {
        return wearWayItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ ShutdownItem O101(DeviceFragment r0) {
        return shutdownItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ClassicPairItem O10IXXX0X(DeviceFragment r0) {
        return classicPairItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ GestureWake2Item O1I(DeviceFragment r0) {
        return gestureWake2Item_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O1O(DeviceFragment r0) {
        return showPairTypePop$lambda$2$1(r0);
    }

    public static /* synthetic */ Unit O1i0(DeviceFragment r0, BleConnector r1) {
        return wechatVerificationItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O1iXiI(DeviceFragment r0, View r1) {
        return watchPasswordItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O1iii(DeviceFragment r0, View r1) {
        return receiptCode2Item_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OI(DeviceFragment r0, View r1) {
        return hrvSetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ WechatPaySetItem OI10X(DeviceFragment r0) {
        return wechatPaySetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OI1IiOO1i(DeviceFragment r0, View r1) {
        return infoItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OI1O(DeviceFragment r0, boolean r1) {
        return showPairTypePop$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit OI1i1i(DeviceFragment r0, View r1) {
        return pressureItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ LanguageUpdateItem OII(DeviceFragment r0) {
        return languageUpdateItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIIOI(int r0, DeviceFragment r1, BleConnector r2) {
        return standbySetItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OIIi110I(DeviceFragment r0, View r1) {
        return ecgMonitoringItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ void OIOIi1XO() {
        resetItem_delegate$lambda$0$0$0$0$0$0$0();
    }

    public static /* synthetic */ boolean OIX0iXi() {
        return showDeviceUnbindPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit OIXII1(DeviceFragment r0, BleConnector r1) {
        return findWatchItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean OIXOXXi(DeviceFragment r0, int r1) {
        return shockItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OIi0(DeviceFragment r0, View r1) {
        return tempMonitoringItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OO(DeviceFragment r0, View r1) {
        return syncContactItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OO1101010(DeviceFragment r0, String r1) {
        return checkAppAvailable$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OO1O00iI(DeviceFragment r0, View r1) {
        return shutdownItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OOIIOX(DeviceFragment r0, View r1) {
        return gameSettingsItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ WearWayItem OOIX(DeviceFragment r0) {
        return wearWayItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OOX1I(DeviceFragment r0, int r1) {
        return standbySetItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ GameStoreItem OX(DeviceFragment r0) {
        return gameStoreItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelaxReminderItem OX0(DeviceFragment r0) {
        return relaxReminderItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX0X1O10X(DeviceFragment r0, BleConnector r1) {
        return resetItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OX110i(DeviceFragment r0, View r1) {
        return simultaneousTranslation_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ AGPSUpgradeItem OXI0Xi(DeviceFragment r0) {
        return aGPSUpgradeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OXIX0(int r0, DeviceFragment r1, BleConnector r2) {
        return notificationLightScreenItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OXOI0XII(int r0, DeviceFragment r1, BleConnector r2) {
        return voiceControl_delegate$lambda$0$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ MusicControlItem OXOO0X0i(DeviceFragment r0) {
        return musicControlItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OXXO0O1X(DeviceFragment r0, BleConnector r1) {
        return logoFileItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ SOSManagerItem OXXiX0(DeviceFragment r0) {
        return sosManagerItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NucleicAcidCodeItem OXi001(DeviceFragment r0) {
        return nucleicAcidCodeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OXi1iX(DeviceFragment r0, int r1) {
        return noDisturbItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OXii10I(DeviceFragment r0, View r1) {
        return musicControlItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi(DeviceFragment r0, View r1) {
        return measureUnitItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi0(DeviceFragment r0, View r1) {
        return girlCareItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Oi000O010(DeviceFragment r0, BleConnector r1) {
        return musicManagerItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ NavigationItem Oi1() {
        return navigationItem_delegate$lambda$0();
    }

    public static /* synthetic */ AppStoreItem Oi1I(DeviceFragment r0) {
        return appStoreItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ FallManagerItem OiIIX101O(DeviceFragment r0) {
        return fallManagerItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiO(DeviceFragment r0, View r1) {
        return voiceControl_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ NoDisturbItem OiO0IOX(DeviceFragment r0) {
        return noDisturbItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiO1iiO1O(DeviceFragment r0, View r1) {
        return myCardCodeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ TranslationDialogueItem OiXI1OiX0(DeviceFragment r0) {
        return dialogueTranslation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiXX0(DeviceFragment r0, View r1) {
        return resetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OiXXXi10(DeviceFragment r0, View r1) {
        return earphoneItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ StandbyWatchFaceItem Oii1I1I10(DeviceFragment r0) {
        return standbyWatchFaceItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit Oii1X1iO(DeviceFragment r0, View r1) {
        return notificationLightScreenItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ NFCGuideItem Oiii(DeviceFragment r0) {
        return nfcGuideItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X00110X(DeviceFragment r0, View r1) {
        return incomingCallItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean X00O0(DeviceFragment r0) {
        return unpairItem_delegate$lambda$0$0$0$0$1(r0);
    }

    public static /* synthetic */ Unit X00XIX1(DeviceFragment r0, ml1 r1) {
        return conntectDevice$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ InfoItem X00Xi1X(DeviceFragment r0) {
        return infoItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0100I(DeviceFragment r0, View r1) {
        return hrMonitoringItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(DeviceFragment r0, View r1) {
        return alipaySetItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean X0I1(DeviceFragment r0, int r1) {
        return timeFormatItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ AlarmClockItem X0O(DeviceFragment r0) {
        return alarmClockItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0XI11I(DeviceFragment r0, View r1) {
        return standbyWatchFaceItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ HrvSetItem X0i1101I(DeviceFragment r0) {
        return hrvSetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0i1O(DeviceFragment r0, int r1) {
        return shockLevelItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0iO(DeviceFragment r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    public static /* synthetic */ RecordingItem X1(DeviceFragment r0) {
        return recordingItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X100O() {
        return showHIDPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit X10i(DeviceFragment r0, View r1) {
        return incomingCallRingVibrationItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ EcgMonitoringItem X11(DeviceFragment r0) {
        return ecgMonitoringItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MusicManagerItem X111IO(DeviceFragment r0) {
        return musicManagerItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X11I(DeviceFragment r0, View r1) {
        return logoFileItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X11iII1O1(DeviceFragment r0, View r1) {
        return audioBookLearnItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X1IX(DeviceFragment r0, View r1) {
        return remoteCameraItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X1OI(DeviceFragment r0, BleConnector r1) {
        return offlineMapsItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ QiblaItem X1i(DeviceFragment r0) {
        return qiblaItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ BloodOxyGenItem X1ii(DeviceFragment r0) {
        return bloodOxyGenItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ IncomingCallRingItem XI(DeviceFragment r0) {
        return incomingCallRingItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XI1OX0IO(DeviceFragment r0) {
        return setProgressBackCallBack$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit XII01OO1I(DeviceFragment r0, View r1) {
        return dateFormatItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XIIIO(DeviceFragment r0, BleConnector r1) {
        return aGPSUpgradeItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XIIO11I(DeviceFragment r0, View r1) {
        return wearWayItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XIO11I(DeviceFragment r0, View r1) {
        return sosManagerItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ VoiceItem XIOX1(DeviceFragment r0) {
        return voiceItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XIXO0iiO(DeviceFragment r0, View r1) {
        return relaxReminderItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ShockSettingsItem XIi10(DeviceFragment r0) {
        return shockSettingsItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TimeFormatItem XIiIOXOOI(DeviceFragment r0) {
        return timeFormatItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XO00O0(int r0, DeviceFragment r1, BleConnector r2) {
        return dateFormatItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XO0O10(DeviceFragment r0, View r1) {
        return xmlyAudioItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ AudioBookLearnItem XO0X10iO(DeviceFragment r0) {
        return audioBookLearnItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XO1(DeviceFragment r0, m04 r1) {
        return showPairTypePop$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ Unit XO11O(DeviceFragment r0, BleConnector r1) {
        return activityRecognitionItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ WorldClockItem XO11XXOi(DeviceFragment r0) {
        return worldClockItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XOI(DeviceFragment r0, View r1) {
        return powerSaveModeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ SyncContactItem XOIO11O(DeviceFragment r0) {
        return syncContactItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XOIX(DeviceFragment r0, View r1) {
        return backLightItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0XOOii(DeviceFragment r0, BleConnector r1) {
        return wechatPaySetItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0Xi(DeviceFragment r0, View r1) {
        return messagePushItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0ii0(DeviceFragment r0, View r1) {
        return noDisturb2Item_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOOI0O(DeviceFragment r0, DslAdapter r1) {
        return showList$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOOXII(DeviceFragment r0, View r1) {
        return offlineMapsItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XOX0O0() {
        return shutdownItem_delegate$lambda$0$0$0$0$0$0();
    }

    public static /* synthetic */ Unit XOXOIX0Oi(DeviceFragment r0, BleConnector r1) {
        return firmwareItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOXiX0(DeviceFragment r0, View r1) {
        return drinkWaterItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ void XOiXXOO(DeviceFragment r0) {
        onCodePairChange$lambda$1(r0);
    }

    public static /* synthetic */ Unit XX(DeviceFragment r0, BleConnector r1) {
        return alipaySetItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XX0(DslAdapter r0) {
        return showList$lambda$0$0$0(r0);
    }

    public static /* synthetic */ IncomingCallRingVibrationItem XX00XX(DeviceFragment r0) {
        return incomingCallRingVibrationItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX00i10X(DeviceFragment r0, View r1) {
        return myCardCode2Item_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ WatchPasswordItem XX1Oi(DeviceFragment r0) {
        return watchPasswordItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(View r0) {
        return meetingReminderItem_delegate$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit XXI0XOIX(DeviceFragment r0, View r1) {
        return classicPairItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXIIO1i11(DeviceFragment r0, BleConnector r1) {
        return languageUpdateItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ HardWareAlipayItem XXO(DeviceFragment r0) {
        return hardWareAlipay_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXOXI0(DeviceFragment r0, BleConnector r1) {
        return hrvSetItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXOXi(int r0, DeviceFragment r1, BleConnector r2) {
        return antiLostItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXX11i(int r0, DeviceFragment r1, BleConnector r2) {
        return shockLevelItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXXiXXOI(DeviceFragment r0, View r1) {
        return sedentarinessItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ GameSettingsItem XXiIiX10(DeviceFragment r0) {
        return gameSettingsItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXiO0i(DeviceFragment r0, BleConnector r1) {
        return dialItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi(DeviceFragment r0, BleConnector r1) {
        return voiceControl_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean Xi0I(DeviceFragment r0, int r1) {
        return sleepSet_delegate$lambda$0$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi1XO00(DeviceFragment r0, View r1) {
        return fallManagerItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit Xi1i0XOX0(DeviceFragment r0, View r1) {
        return doubleClickScreenItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ NotificationLightScreenItem XiO1I(DeviceFragment r0) {
        return notificationLightScreenItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ReceiptCode2Item XiO1OXXO(DeviceFragment r0) {
        return receiptCode2Item_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(DeviceFragment r0) {
        return checkLanguageUpdate$lambda$1$1(r0);
    }

    public static /* synthetic */ Unit XiOIii1(DeviceFragment r0, PermissionStatus r1) {
        return syncContactItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ StockMarketItem XiOOO1I1I(DeviceFragment r0) {
        return stockMarketItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOiiXOO(DeviceFragment r0, View r1) {
        return activityRecognitionItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XiXIX(DeviceFragment r0, String r1) {
        return scanQrcode$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit Xii(DeviceFragment r0, boolean r1) {
        return voiceItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ EarphoneItem Xii11I(DeviceFragment r0) {
        return earphoneItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit Xii1O1Iii(DeviceFragment r0, View r1) {
        return learnCardItem_delegate$lambda$0$0$0(r0, r1);
    }

    private static final AGPSUpgradeItem aGPSUpgradeItem_delegate$lambda$0(final DeviceFragment r2) {
        AGPSUpgradeItem r0 = new AGPSUpgradeItem();
        r0.setItemClick(new iOXi0IOI(r2));
        return r0;
    }

    private static final Unit aGPSUpgradeItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new Xi00OX(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit aGPSUpgradeItem_delegate$lambda$0$0$0$0(DeviceFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        if (q62.OXO1.i1() == false) goto L5;
        DeviceInfoChecker.OXO1.OIi0(new XIi00iiXO(r3), r3.getMActivity(), r3.getRootView(), "A");
    L7:
        return Unit.OXO1;
    L5:
        r3.toSyncAGPS();
        goto L7
    }

    public static final /* synthetic */ void access$bindDone(DeviceFragment r0) {
        r0.bindDone();
    }

    public static final /* synthetic */ void access$checkLanguageUpdate(DeviceFragment r0, BleDeviceLanguages2 r1, ExtraPackageData[] r2) {
        r0.checkLanguageUpdate(r1, r2);
    }

    public static final /* synthetic */ void access$fourPopup(DeviceFragment r0) {
        r0.fourPopup();
    }

    public static final /* synthetic */ Activity access$getMActivity(DeviceFragment r0) {
        return r0.getMActivity();
    }

    public static final /* synthetic */ void access$threePopup(DeviceFragment r0, boolean r1) {
        r0.threePopup(r1);
    }

    public static final /* synthetic */ void access$toFirmwareUpgrade(DeviceFragment r0) {
        r0.toFirmwareUpgrade();
    }

    public static final /* synthetic */ void access$toSyncAGPS(DeviceFragment r0) {
        r0.toSyncAGPS();
    }

    private static final ActivityRecognitionItem activityRecognitionItem_delegate$lambda$0(final DeviceFragment r2) {
        ActivityRecognitionItem r0 = new ActivityRecognitionItem();
        r0.setItemClick(new i1i00I0(r2));
        return r0;
    }

    private static final Unit activityRecognitionItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XOX0IOX(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit activityRecognitionItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), ActivityRecognitionSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final AINoteItem aiNote_delegate$lambda$0(final DeviceFragment r2) {
        AINoteItem r0 = new AINoteItem();
        r0.setItemClick(new iXXXi(r2));
        return r0;
    }

    private static final Unit aiNote_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new X01IX0(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit aiNote_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), AiNoteActivity.class));
        return Unit.OXO1;
    }

    private static final AlarmClockItem alarmClockItem_delegate$lambda$0(final DeviceFragment r2) {
        AlarmClockItem r0 = new AlarmClockItem();
        r0.setItemClick(new iXO1O0Xi(r2));
        return r0;
    }

    private static final Unit alarmClockItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), AlarmsActivity.class));
        return Unit.OXO1;
    }

    private static final AlipaySetItem alipaySetItem_delegate$lambda$0(final DeviceFragment r2) {
        AlipaySetItem r0 = new AlipaySetItem();
        r0.setItemClick(new iI1iXOX0i(r2));
        return r0;
    }

    private static final Unit alipaySetItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new i0I1i1(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit alipaySetItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), AlipaySetActivity.class));
        return Unit.OXO1;
    }

    private static final AntiLostItem antiLostItem_delegate$lambda$0(final DeviceFragment r2) {
        AntiLostItem r0 = new AntiLostItem();
        r0.setItemClick(new XIO00O(r2));
        return r0;
    }

    private static final Unit antiLostItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mAntiLostSetPopup != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.anti_lost);
        r0.i010I(new IOXiOXi(r6));
        r6.mAntiLostSetPopup = r0;
    L5:
        dj4 r8 = r6.mAntiLostSetPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.ANTI_LOST, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean antiLostItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IOO0Oi0X(r3, r2), 1, null);
    }

    private static final Unit antiLostItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.ANTI_LOST, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getAntiLostItem().initView();
        return Unit.OXO1;
    }

    private static final AppStoreItem appStoreItem_delegate$lambda$0(final DeviceFragment r2) {
        AppStoreItem r0 = new AppStoreItem();
        r0.setItemClick(new XXOX1X1OX(r2));
        return r0;
    }

    private static final Unit appStoreItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), AppStoreActivity.class));
        return Unit.OXO1;
    }

    private static final AudioBookLearnItem audioBookLearnItem_delegate$lambda$0(final DeviceFragment r2) {
        AudioBookLearnItem r0 = new AudioBookLearnItem();
        r0.setItemClick(new OOXiii(r2));
        return r0;
    }

    private static final Unit audioBookLearnItem_delegate$lambda$0$0$0(DeviceFragment r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 0);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), AudioBookLearnActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final BacklightItem backLightItem_delegate$lambda$0(final DeviceFragment r2) {
        BacklightItem r0 = new BacklightItem();
        r0.setItemClick(new i11O1II(r2));
        return r0;
    }

    private static final Unit backLightItem_delegate$lambda$0$0$0(final DeviceFragment r13, View r14) {
        Intrinsics.X0O(r14, "it");
        q62 r15 = q62.OXO1;
        int r3 = 3;
        int r4 = 5;
        if (r15.IOIIIiO0I() == false) goto L15;
        int r16 = r15.XX0();
        if (r13.mBacklightPopup2 != null) goto L7;
        y7 r0 = new y7(r13.getMActivity());
        r0.i010I(R.string.backlight_remind);
        r0.iOO1ii1(false);
        r0.iX(3, r16);
        r0.IXXOO(R.string.second_abrv);
        r0.II1Xi0(new X1iXIiXII(r13));
        r13.mBacklightPopup2 = r0;
    L7:
        y7 r17 = r13.mBacklightPopup2;
        if (r17 == null) goto L72;
        int r1 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, 0, null, 6, null);
        if (r1 == 0) goto L13;
        r4 = r1;
    L13:
        r17.O1O(r4);
        View r18 = r13.getRootView();
        Intrinsics.O10IXXX0X(r18, "<get-rootView>(...)");
        r17.I1XOi1(r18);
    L72:
        return Unit.OXO1;
    L15:
        if (r13.mBacklightPopup != null) goto L17;
        dj4 r6 = new dj4(r13.getMActivity(), r15.iIi0(), 0, 4, null);
        r6.iX(R.string.backlight_remind);
        r6.i010I(new X1i1O1(r13));
        r13.mBacklightPopup = r6;
    L17:
        dj4 r2 = r13.mBacklightPopup;
        if (r2 == null) goto L72;
        int r5 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.BACK_LIGHT, 0, null, 6, null) + r15.X0i1O();
        int r19 = r15.X1IX();
        if (r19 != 0) goto L22;
        if (r5 == 0) goto L35;
        r3 = r5 - 4;
    L70:
        r2.II1Xi0(r3);
        View r110 = r13.getRootView();
        Intrinsics.O10IXXX0X(r110, "<get-rootView>(...)");
        r2.I1XOi1(r110);
    L35:
        r3 = 0;
        goto L70
    L22:
        if (r19 == 3) goto L63;
        if (r19 != 8) goto L25;
        if (r5 <= 8) goto L35;
        r3 = r5 - 8;
        goto L70
    L25:
        if (r19 != 51015) goto L27;
        if (r5 == 0) goto L35;
        if (r5 != 5) goto L58;
    L44:
        r3 = 1;
        goto L70
    L58:
        if (r5 != 10) goto L70;
    L43:
        r3 = 2;
        goto L70
    L27:
        if (r19 != 101520) goto L29;
        if (r5 == 10) goto L35;
        if (r5 == 15) goto L44;
    L29:
        if (r19 != 581015) goto L31;
        if (r5 == 5) goto L35;
        if (r5 == 8) goto L44;
        if (r5 == 10) goto L43;
    L31:
        if (r19 != 5101520) goto L33;
        if (r5 == 5) goto L35;
        if (r5 == 10) goto L44;
        if (r5 == 15) goto L43;
    L33:
        if (r19 == 510152030) goto L37;
        if (r5 <= 5) goto L35;
        r3 = r5 - 5;
        goto L70
    L37:
        if (r5 == 5) goto L35;
        if (r5 == 10) goto L44;
        if (r5 == 15) goto L43;
        if (r5 == 20) goto L70;
        r3 = 4;
        goto L70
    L63:
        if (r5 == 5) goto L44;
        if (r5 == 8) goto L43;
        if (r5 == 10) goto L70;
        goto L70
    }

    private static final boolean backLightItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new XXI100101(r3, r2), 1, null);
    }

    private static final Unit backLightItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getBackLightItem().initView();
        return Unit.OXO1;
    }

    private static final boolean backLightItem_delegate$lambda$0$0$0$2$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new iIXiIXiI0(r3, r2), 1, null);
    }

    private static final Unit backLightItem_delegate$lambda$0$0$0$2$0$0(int r11, DeviceFragment r12, BleConnector r13) {
        Intrinsics.X0O(r13, "it");
        q62 r0 = q62.OXO1;
        int r1 = r0.X1IX();
        int r2 = 0;
        if (r1 != 0) goto L5;
        if (r11 == 0) goto L52;
        r2 = r11 + 4;
    L52:
        BaseBleConnector.sendInt8$default(r13, BleKey.BACK_LIGHT, BleKeyFlag.UPDATE, r2 - r0.X0i1O(), false, false, 24, null);
        r12.getBackLightItem().initView();
        return Unit.OXO1;
    L5:
        if (r1 == 3) goto L44;
        if (r1 != 8) goto L8;
        r2 = r11 + 8;
        goto L52
    L8:
        if (r1 != 51015) goto L10;
        if (r11 == 0) goto L52;
        if (r11 != 1) goto L41;
    L26:
        r2 = 5;
        goto L52
    L41:
        if (r11 != 2) goto L24;
    L25:
        r2 = 10;
    L24:
        r2 = 15;
        goto L52
    L10:
        if (r1 != 101520) goto L12;
        if (r11 == 0) goto L25;
        if (r11 == 1) goto L24;
    L23:
        r2 = 20;
        goto L52
    L12:
        if (r1 != 581015) goto L14;
        if (r11 == 0) goto L26;
        if (r11 == 1) goto L35;
        if (r11 == 2) goto L25;
    L35:
        r2 = 8;
        goto L52
    L14:
        if (r1 != 5101520) goto L16;
        if (r11 == 0) goto L26;
        if (r11 == 1) goto L25;
        if (r11 == 2) goto L24;
    L16:
        if (r1 == 510152030) goto L18;
        r2 = r11 + 5;
        goto L52
    L18:
        if (r11 == 0) goto L26;
        if (r11 == 1) goto L25;
        if (r11 == 2) goto L24;
        if (r11 == 3) goto L23;
        r2 = 30;
        goto L52
    L44:
        if (r11 == 0) goto L48;
        if (r11 == 1) goto L26;
        if (r11 == 2) goto L35;
    L48:
        r2 = 3;
        goto L52
    }

    private final void bindDone() {
        i1O0OXO1O.OXO1.OXO1("DeviceFragment bindDone");
        q62 r0 = q62.OXO1;
        if (r0.O0i0() == false) goto L5;
    L6:
        I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
    L7:
        new Timer().schedule(new iO(), 500);
        return;
    L5:
        if (r0.IiO0() == false) goto L7;
        goto L6
    }

    private static final BloodOxyGenItem bloodOxyGenItem_delegate$lambda$0(final DeviceFragment r2) {
        BloodOxyGenItem r0 = new BloodOxyGenItem();
        r0.setItemClick(new OO1X0II(r2));
        return r0;
    }

    private static final Unit bloodOxyGenItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), BloodOxyGenSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final Unit checkAppAvailable$lambda$0(final DeviceFragment r2, final String r3) {
        Intrinsics.X0O(r3, "str");
        new Handler().postDelayed(new X111XiIO(r2, r3), 2000);
        return Unit.OXO1;
    }

    private static final void checkAppAvailable$lambda$0$0(DeviceFragment r5, final String r6) {
        go0 r0 = new go0(r5.getMActivity(), 0, 2, null);
        r0.O1O(R.string.tip);
        r0.iOO1ii1(r6);
        r0.I0iXXO(false);
        go0.X11iII1O1(r0, null, null, 2, null);
        r0.X1IX(R.string.copy_content, new X1iX1Ii(r6));
        View r7 = r5.getRootView();
        Intrinsics.O10IXXX0X(r7, "<get-rootView>(...)");
        r0.I1XOi1(r7);
    }

    private static final boolean checkAppAvailable$lambda$0$0$0$0(String r0) {
        ClipboardUtils.copyText(r0);
        ToastUtils.showLong(R.string.copied);
        return false;
    }

    private final void checkLanguageUpdate(BleDeviceLanguages2 r7, ExtraPackageData[] r8) {
        if (r7.getMList().isEmpty() == true) goto L22;
        if (r8 == null) goto L23;
        int r0 = r8.length;
        int r1 = 0;
        int r2 = 0;
    L7:
        int r3 = 2;
        DefaultConstructorMarker r4 = null;
        if (r2 >= r0) goto L13;
        if (BleDeviceLanguages2.isUpgrade$default(r7, r8[r2].getVersion(), 0, 2, null) == true) goto L11;
        r2 = r2 + 1;
        goto L7
    L11:
        boolean r9 = true;
    L14:
        this.mServerLanguageList = null;
        i1O0OXO1O.OXO1.OXO1("checkLanguageUpdate isShow = " + r9);
        if (r9 == false) goto L18;
        go0 r10 = new go0(getMActivity(), r1, r3, r4);
        r10.O1O(R.string.language_update2__language_update);
        r10.iX(Integer.valueOf(R.string.language_update2__tip_update));
        r10.iX1O1(Integer.valueOf(R.string.cancel), new XIIIiO0(this));
        r10.X1IX(R.string.settings, new iOI1X(this));
        View r11 = getRootView();
        Intrinsics.O10IXXX0X(r11, "<get-rootView>(...)");
        r10.I1XOi1(r11);
        return;
    L18:
        fourPopup();
        return;
    L13:
        r9 = false;
        goto L14
    L23:
        return;
    }

    private static final boolean checkLanguageUpdate$lambda$1$0(DeviceFragment r0) {
        r0.fourPopup();
        return true;
    }

    private static final boolean checkLanguageUpdate$lambda$1$1(DeviceFragment r5) {
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", 1);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r1 = new Intent(r5.getActivity(), LanguageUpdateActivity2.class);
        r1.putExtras(r0);
        r5.startActivity(r1);
        r5.fourPopup();
        return true;
    }

    private static final boolean checkNotificationPermission$lambda$0$0$0(go0 r1) {
        MyNotificationListenerService.O001I.I0IIOi(r1.XO0O10());
        return true;
    }

    private final void checkVersionByClickFirmware() {
        DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, new O00(this), null, 2, null);
    }

    private static final ClassicPairItem classicPairItem_delegate$lambda$0(final DeviceFragment r2) {
        ClassicPairItem r0 = new ClassicPairItem();
        r0.setItemClick(new OXIiOOO0(r2));
        return r0;
    }

    private static final Unit classicPairItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), ClassicPairActivity.class));
        return Unit.OXO1;
    }

    private final void conntectDevice(String r8, String r9) {
        i1O0OXO1O.OXO1.OXO1("conntectDevice -> " + r8 + " , " + r9);
        q62 r0 = q62.OXO1;
        if (r0.XXOXI0(r8) == false) goto L6;
        Bundle r10 = new Bundle();
        r10.putString("mArg0", r9);
        r10.putParcelable("mArg2", null);
        r10.putSerializable("mArg3", null);
        Intent r11 = new Intent(getActivity(), AutoBindActivity.class);
        r11.putExtras(r10);
        startActivity(r11);
        return;
    L6:
        ml1 r1 = this.mConfirmPopup;
        if (r1 != null) goto L9;
    L11:
        BleConnector.INSTANCE.setAddress(r9).connect(true);
        final ml1 r12 = new ml1(getMActivity());
        r12.X01IiOiIi(new iOIXXi(this, r12));
        if (CollectionsKt___CollectionsKt.i01OOiI(r0.i0iIXiI(), r8) == true) goto L14;
    L20:
        r12.OX().setImageResource(R.drawable.pair_loading);
        r12.OX().setImageTintList(gk4.O00(r12.XO0O10(), R.color.text_color));
        ImageView r13 = r12.OX();
        RotateAnimation r2 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r2.setRepeatCount(-1);
        r2.setDuration(1800);
        r2.setInterpolator(new LinearInterpolator());
        r13.startAnimation(r2);
    L21:
        this.mConfirmPopup = r12;
        View r14 = getRootView();
        Intrinsics.O10IXXX0X(r14, "<get-rootView>(...)");
        r12.I1XOi1(r14);
        return;
    L14:
        if (q62.OiO0IOX(r0, null, 1, null) == true) goto L20;
        if (r0.X0100I() == true) goto L20;
        if (r0.I0i1OXiI() == true) goto L20;
        r12.OX().setImageResource(r0.XiOIii1(r8));
        goto L21
    L9:
        if (r1.isShowing() != true) goto L11;
    }

    private static final Unit conntectDevice$lambda$0$0(DeviceFragment r9, ml1 r10) {
        r9.isScanQrcode = false;
        r10.dismiss();
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.IDENTITY, BleKeyFlag.UPDATE, 16, false, false, 24, null);
        new Timer().schedule(new IiI10X(), 200);
        return Unit.OXO1;
    }

    private static final DateFormatItem dateFormatItem_delegate$lambda$0(final DeviceFragment r2) {
        DateFormatItem r0 = new DateFormatItem();
        r0.setItemClick(new I0iX1OXi0(r2));
        return r0;
    }

    private static final Unit dateFormatItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mDateFormatPopup != null) goto L5;
        int r2 = R.array.date_format;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.date_format);
        r0.i010I(new XIXi11O(r6));
        r6.mDateFormatPopup = r0;
    L5:
        dj4 r8 = r6.mDateFormatPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.DATE_FORMAT, i72.OXO1.XiOIO().getType(), null, 4, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean dateFormatItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new Oii1IiO00(r3, r2), 1, null);
    }

    private static final Unit dateFormatItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.DATE_FORMAT, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        i72.OXO1.IXi01O(DateTimeFormat.Companion.OXO1(r9));
        I01XX0.XIi00iiXO(I01XX0.IX0IXOi, null, 2, null);
        r10.getDateFormatItem().initView();
        return Unit.OXO1;
    }

    private static final DialItem dialItem_delegate$lambda$0(final DeviceFragment r2) {
        DialItem r0 = new DialItem();
        r0.setItemClick(new OiiXIOX(r2));
        return r0;
    }

    private static final Unit dialItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new I00X0X1(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit dialItem_delegate$lambda$0$0$0$0(DeviceFragment r1, BleConnector r2) {
        Intrinsics.X0O(r2, "it");
        i72.OXO1.OOIX(r1.getMActivity());
        return Unit.OXO1;
    }

    private static final TranslationDialogueItem dialogueTranslation_delegate$lambda$0(final DeviceFragment r2) {
        TranslationDialogueItem r0 = new TranslationDialogueItem();
        r0.setItemClick(new I0IX0(r2));
        return r0;
    }

    private static final Unit dialogueTranslation_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SparkChainMultiDeviceActivity.class));
        return Unit.OXO1;
    }

    private static final DoubleClickScreenItem doubleClickScreenItem_delegate$lambda$0(final DeviceFragment r2) {
        DoubleClickScreenItem r0 = new DoubleClickScreenItem();
        r0.setItemClick(new iX1IiI0(r2));
        return r0;
    }

    private static final Unit doubleClickScreenItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), DoubleClickSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final DrinkWaterItem drinkWaterItem_delegate$lambda$0(final DeviceFragment r2) {
        DrinkWaterItem r0 = new DrinkWaterItem();
        r0.setItemClick(new i0X001O1(r2));
        return r0;
    }

    private static final Unit drinkWaterItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), DrinkWaterSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final EarphoneItem earphoneItem_delegate$lambda$0(final DeviceFragment r2) {
        EarphoneItem r0 = new EarphoneItem();
        r0.setItemClick(new X1iO(r2));
        return r0;
    }

    private static final Unit earphoneItem_delegate$lambda$0$0$0(final DeviceFragment r1, View r2) {
        Intrinsics.X0O(r2, "it");
        X0IOiX1O.iO(new O0iIIXO00(r1));
        return Unit.OXO1;
    }

    private static final Unit earphoneItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SoundEffectsSampleActivity.class));
        return Unit.OXO1;
    }

    private static final EBookManagerItem ebookManagerItem_delegate$lambda$0(final DeviceFragment r2) {
        EBookManagerItem r0 = new EBookManagerItem();
        r0.setItemClick(new iiiii10(r2));
        return r0;
    }

    private static final Unit ebookManagerItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XII1XX1O(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit ebookManagerItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), EBookManagerActivity.class));
        return Unit.OXO1;
    }

    private static final EcgMonitoringItem ecgMonitoringItem_delegate$lambda$0(final DeviceFragment r2) {
        EcgMonitoringItem r0 = new EcgMonitoringItem();
        r0.setItemClick(new OX1O0OX1X(r2));
        return r0;
    }

    private static final Unit ecgMonitoringItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), EcgMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final FallManagerItem fallManagerItem_delegate$lambda$0(final DeviceFragment r2) {
        FallManagerItem r0 = new FallManagerItem();
        r0.setItemClick(new i01ii1OI(r2));
        return r0;
    }

    private static final Unit fallManagerItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mAntiLostSetPopup != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.fall_tips);
        r0.i010I(new I0XX1O(r6));
        r6.mAntiLostSetPopup = r0;
    L5:
        dj4 r8 = r6.mAntiLostSetPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.FALL_SET, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean fallManagerItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new I0iX1IIiI(r3, r2), 1, null);
    }

    private static final Unit fallManagerItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.FALL_SET, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getFallManagerItem().initView();
        return Unit.OXO1;
    }

    private static final FindWatchItem findWatchItem_delegate$lambda$0(final DeviceFragment r2) {
        FindWatchItem r0 = new FindWatchItem();
        r0.setItemClick(new XIX0OO(r2));
        return r0;
    }

    private static final Unit findWatchItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XiOIOO(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit findWatchItem_delegate$lambda$0$0$0$0(DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        if (q62.OXO1.XI1OX0IO() == false) goto L5;
        r10.startActivity(new Intent(r10.getActivity(), FindWatchActivity.class));
    L7:
        return Unit.OXO1;
    L5:
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FIND_WATCH, BleKeyFlag.UPDATE, 1, false, false, 24, null);
        ToastUtils.showLong(r10.getString(R.string.find_watch_on), new Object[0]);
        goto L7
    }

    private static final FirmwareItem firmwareItem_delegate$lambda$0(final DeviceFragment r2) {
        FirmwareItem r0 = new FirmwareItem();
        r0.setItemClick(new Xi0IOIii(r2));
        return r0;
    }

    private static final Unit firmwareItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new IOIXiI0Oi(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit firmwareItem_delegate$lambda$0$0$0$0(DeviceFragment r4, BleConnector r5) {
        Intrinsics.X0O(r5, "it");
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) >= 50) goto L5;
        ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
    L9:
        return Unit.OXO1;
    L5:
        if ((System.currentTimeMillis() - r4.lastClickTime) < 3000) goto L9;
        r4.checkVersionByClickFirmware();
        r4.lastClickTime = System.currentTimeMillis();
        goto L9
    }

    private final void fourPopup() {
        new Handler().postDelayed(new ii100X00X(), 3000);
    }

    private static final void fourPopup$lambda$0() {
        I01XX0.XIi00iiXO(I01XX0.IXI, null, 2, null);
    }

    private static final GameSettingsItem gameSettingsItem_delegate$lambda$0(final DeviceFragment r2) {
        GameSettingsItem r0 = new GameSettingsItem();
        r0.setItemClick(new i11X00O(r2));
        return r0;
    }

    private static final Unit gameSettingsItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), GameSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final GameStoreItem gameStoreItem_delegate$lambda$0(final DeviceFragment r2) {
        GameStoreItem r0 = new GameStoreItem();
        r0.setItemClick(new O1OiO0I(r2));
        return r0;
    }

    private static final Unit gameStoreItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        i0O111 r4 = i0O111.OXO1;
        Application r0 = r2.getMActivity().getApplication();
        Intrinsics.O10IXXX0X(r0, "getApplication(...)");
        r4.XX0(r0);
        r4.II1Xi0(r2.getMActivity());
        return Unit.OXO1;
    }

    private static final GameTimeSetItem gameTimeSetItem_delegate$lambda$0(final DeviceFragment r2) {
        GameTimeSetItem r0 = new GameTimeSetItem();
        r0.setItemClick(new iiXXIO0i(r2));
        return r0;
    }

    private static final Unit gameTimeSetItem_delegate$lambda$0$0$0(final DeviceFragment r10, View r11) {
        Intrinsics.X0O(r11, "it");
        int r1 = 7;
        if (r10.mGameTimeSetPopup != null) goto L14;
        Activity r4 = r10.getMActivity();
        ArrayList r5 = new ArrayList(8);
        int r3 = 0;
    L5:
        if (r3 >= 8) goto L13;
        if (r3 != 0) goto L8;
        String r6 = r10.getMActivity().getString(R.string.off_text);
    L12:
        Intrinsics.XXI(r6);
        r5.add(r6);
        r3 = r3 + 1;
        goto L5
    L8:
        if (r3 == 7) goto L10;
        r6 = r10.getMActivity().getString(R.string.d_minutes, new Object[]{Integer.valueOf(r3 * 10)});
        goto L12
    L10:
        r6 = r10.getMActivity().getString(R.string.d_minutes, new Object[]{120});
        goto L12
    L13:
        dj4 r7 = new dj4(r4, r5, 0, 4, null);
        r7.iX(R.string.game_time_set);
        r7.i010I(new O0IOiXX1(r10));
        r10.mGameTimeSetPopup = r7;
    L14:
        dj4 r12 = r10.mGameTimeSetPopup;
        if (r12 == null) goto L25;
        BleGameTimeReminder r8 = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_TIME_REMINDER, BleGameTimeReminder.class, null, null, 12, null);
        if (r8.getMEnabled() != 0) goto L20;
        r1 = 0;
    L23:
        r12.II1Xi0(r1);
        View r13 = r10.getRootView();
        Intrinsics.O10IXXX0X(r13, "<get-rootView>(...)");
        r12.I1XOi1(r13);
        goto L25
    L20:
        if (r8.getMMinute() == 120) goto L23;
        r1 = r8.getMMinute() / 10;
    L25:
        return Unit.OXO1;
    }

    private static final boolean gameTimeSetItem_delegate$lambda$0$0$0$1$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new X0iO0(r3, r2), 1, null);
    }

    private static final Unit gameTimeSetItem_delegate$lambda$0$0$0$1$0$0(int r10, DeviceFragment r11, BleConnector r12) {
        Intrinsics.X0O(r12, "it");
        BleCache r1 = BleCache.INSTANCE;
        BleKey r2 = BleKey.GAME_TIME_REMINDER;
        BleGameTimeReminder r5 = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(r1, r2, BleGameTimeReminder.class, null, null, 12, null);
        if (r10 != 0) goto L5;
        r5.setMEnabled(0);
    L9:
        BaseBleConnector.sendObject$default(r12, r2, BleKeyFlag.UPDATE, r5, false, false, 24, null);
        r11.getGameTimeSetItem().initView();
        return Unit.OXO1;
    L5:
        if (r10 == 7) goto L7;
        r5.setMEnabled(1);
        r5.setMMinute(r10 * 10);
        goto L9
    L7:
        r5.setMEnabled(1);
        r5.setMMinute(120);
        goto L9
    }

    private static final GestureWake2Item gestureWake2Item_delegate$lambda$0(final DeviceFragment r2) {
        GestureWake2Item r0 = new GestureWake2Item();
        r0.setItemClick(new OOOIXXiO(r2));
        return r0;
    }

    private static final Unit gestureWake2Item_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), GestureWake2SettingsActivity.class));
        return Unit.OXO1;
    }

    private static final GestureWakeItem gestureWakeItem_delegate$lambda$0(final DeviceFragment r2) {
        GestureWakeItem r0 = new GestureWakeItem();
        r0.setItemClick(new X010X(r2));
        return r0;
    }

    private static final Unit gestureWakeItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), GestureWakeSettingsActivity.class));
        return Unit.OXO1;
    }

    @Deprecated(message = "已废弃")
    public static /* synthetic */ void getShockSettingsItem$annotations() {
    }

    private static final HealthCareItem girlCareItem_delegate$lambda$0(final DeviceFragment r2) {
        HealthCareItem r0 = new HealthCareItem();
        r0.setItemClick(new OOI0O1OI(r2));
        return r0;
    }

    private static final Unit girlCareItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), HealthCareSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final HardWareAlipayItem hardWareAlipay_delegate$lambda$0(final DeviceFragment r2) {
        HardWareAlipayItem r0 = new HardWareAlipayItem();
        r0.setItemClick(new IOOI0ii(r2));
        return r0;
    }

    private static final Unit hardWareAlipay_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), HardWareAlipayActivity.class));
        return Unit.OXO1;
    }

    private static final HrMonitoringItem hrMonitoringItem_delegate$lambda$0(final DeviceFragment r2) {
        HrMonitoringItem r0 = new HrMonitoringItem();
        r0.setItemClick(new X1O11(r2));
        return r0;
    }

    private static final Unit hrMonitoringItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), HrMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final HrvSetItem hrvSetItem_delegate$lambda$0(final DeviceFragment r2) {
        HrvSetItem r0 = new HrvSetItem();
        r0.setItemClick(new XOOO(r2));
        return r0;
    }

    private static final Unit hrvSetItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new i1X1ii(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit hrvSetItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), HrvMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final HydrationReminderItem hydrationReminderItem_delegate$lambda$0() {
        HydrationReminderItem r0 = new HydrationReminderItem();
        r0.setItemClick(new IXiOIOX());
        return r0;
    }

    private static final Unit hydrationReminderItem_delegate$lambda$0$0$0(View r1) {
        Intrinsics.X0O(r1, "it");
        return Unit.OXO1;
    }

    public static /* synthetic */ DoubleClickScreenItem i0(DeviceFragment r0) {
        return doubleClickScreenItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean i000X(DeviceFragment r0, Set r1) {
        return multiChoiceIncomingCallRing$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit i010(DeviceFragment r0, View r1) {
        return hardWareAlipay_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ OfflineMapsItem i0101i(DeviceFragment r0) {
        return offlineMapsItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ XmlyAudioItem i010I(DeviceFragment r0) {
        return xmlyAudioItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit i01OOiI(DeviceFragment r0, View r1) {
        return shockSettingsItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ ResetItem i01XIiIiI(DeviceFragment r0) {
        return resetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ UnpairItem i0I1i0Xi(DeviceFragment r0) {
        return unpairItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AlipaySetItem i0O(DeviceFragment r0) {
        return alipaySetItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean i0X000X0O() {
        return noPermissionRemind$lambda$0$0();
    }

    public static /* synthetic */ boolean i0X1iIO() {
        return showPairTypePop$lambda$2$0$0$0$0();
    }

    public static /* synthetic */ TranslationSimultaneousItem i0XI0(DeviceFragment r0) {
        return simultaneousTranslation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MeasureUnitItem i0XO1(DeviceFragment r0) {
        return measureUnitItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit i0iIXiI(Set r0, DeviceFragment r1, BleConnector r2) {
        return multiChoiceIncomingCallRing$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean i100IXOX() {
        return unpairItem_delegate$lambda$0$0$0$0$0();
    }

    public static /* synthetic */ PowerSaveModeItem i101iO(DeviceFragment r0) {
        return powerSaveModeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PressureItem i10X0X0i(DeviceFragment r0) {
        return pressureItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RemoteCameraItem i11I(DeviceFragment r0) {
        return remoteCameraItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit i1O11001(DeviceFragment r0, View r1) {
        return voiceItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit i1i(DeviceFragment r0, PermissionStatus r1) {
        return smsQuickReplyItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit i1iII1i1(int r0, DeviceFragment r1, BleConnector r2) {
        return timeFormatItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit i1iOO1XIi(DeviceFragment r0, View r1) {
        return wechatVerificationItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ CustomLogoItem iI(DeviceFragment r0) {
        return logoFileItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ScheduleItem iI0I(DeviceFragment r0) {
        return scheduleItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIIIi(DeviceFragment r0, View r1) {
        return shockLevelItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ AntiLostItem iIIIiIO0(DeviceFragment r0) {
        return antiLostItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIIX0XI(DeviceFragment r0, View r1) {
        return bloodOxyGenItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iIX0i(DeviceFragment r0, View r1) {
        return nucleicAcidCodeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ EBookManagerItem iIXX0i(DeviceFragment r0) {
        return ebookManagerItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIXi1iiXI(DeviceFragment r0, View r1) {
        return receiptCodeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ AuraVideoUseHelpItem iIi0(DeviceFragment r0) {
        return videoUseHelpItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIi011O(int r0, DeviceFragment r1, BleConnector r2) {
        return gameTimeSetItem_delegate$lambda$0$0$0$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iIi1(DeviceFragment r0) {
        return unpairItem_delegate$lambda$0$0$0(r0);
    }

    public static /* synthetic */ boolean iIiiO(DeviceFragment r0, int r1) {
        return gameTimeSetItem_delegate$lambda$0$0$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit iO(int r0, DeviceFragment r1, BleConnector r2) {
        return backLightItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iO00(DeviceFragment r0, BleConnector r1) {
        return ebookManagerItem_delegate$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ WechatVerificationItem iO0IiO0X(DeviceFragment r0) {
        return wechatVerificationItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iO0iiOi(String r0) {
        return checkAppAvailable$lambda$0$0$0$0(r0);
    }

    public static /* synthetic */ View iO1(DeviceFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iO11i(DeviceFragment r0, View r1) {
        return appStoreItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ void iOI(DeviceFragment r0, String r1) {
        checkAppAvailable$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iOIIiI1(int r0, DeviceFragment r1, BleConnector r2) {
        return sleepSet_delegate$lambda$0$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ MedicationAlarmItem iOIi00Ii(DeviceFragment r0) {
        return medicationAlarmItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iOO1ii1(DeviceFragment r0, int r1) {
        return incomingCallRingItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ BacklightItem iOOX010X(DeviceFragment r0) {
        return backLightItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ShockLevelItem iOX(DeviceFragment r0) {
        return shockLevelItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MessagePushItem iOXiO1O1I(DeviceFragment r0) {
        return messagePushItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOiXX(int r0, DeviceFragment r1, BleConnector r2) {
        return incomingCallRingItem_delegate$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void iOiXi11II(DeviceFragment r0) {
        onActivityResult$lambda$0(r0);
    }

    public static /* synthetic */ ShockItem iX(DeviceFragment r0) {
        return shockItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ GestureWakeItem iX00X1X(DeviceFragment r0) {
        return gestureWakeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iX01(DeviceFragment r0, dj4 r1, int r2) {
        return incomingCallItem_delegate$lambda$0$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ SedentarinessItem iX0iii0(DeviceFragment r0) {
        return sedentarinessItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX1O1(DeviceFragment r0, View r1) {
        return gestureWakeItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ FirmwareItem iXOII(DeviceFragment r0) {
        return firmwareItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iXOiXII(go0 r0) {
        return checkNotificationPermission$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit iXX0OOiXX(DeviceFragment r0, m04 r1, PermissionStatus r2) {
        return showPairTypePop$lambda$2$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean iXi(DeviceFragment r0, int r1) {
        return fallManagerItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iXi1iI0(DeviceFragment r0, View r1) {
        return languageUpdateItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean iXiX011(DeviceFragment r0, int r1) {
        return powerSaveModeItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit iXiiiO(DeviceFragment r0, View r1) {
        return medicationAlarmItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ DrinkWaterItem ii00OXXO(DeviceFragment r0) {
        return drinkWaterItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit ii0111XI(DeviceFragment r0, View r1) {
        return smsQuickReplyItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit ii110(DeviceFragment r0, View r1) {
        return dialogueTranslation_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ MyCardCode2Item ii1I(DeviceFragment r0) {
        return myCardCode2Item_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iiII(DeviceFragment r0, View r1) {
        return findWatchItem_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ HrMonitoringItem iiIOi(DeviceFragment r0) {
        return hrMonitoringItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DialItem iiIOiX(DeviceFragment r0) {
        return dialItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SMSQuickReplyItem iiIi0(DeviceFragment r0) {
        return smsQuickReplyItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MacQrcodeItem iiX0i1IX(DeviceFragment r0) {
        return macQrcodeItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DateFormatItem iii0(DeviceFragment r0) {
        return dateFormatItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iiiO(DeviceFragment r0, int r1) {
        return dateFormatItem_delegate$lambda$0$0$0$0$0(r0, r1);
    }

    private static final IncomingCallItem incomingCallItem_delegate$lambda$0(final DeviceFragment r2) {
        IncomingCallItem r0 = new IncomingCallItem();
        r0.setItemClick(new I010OOO(r2));
        return r0;
    }

    private static final Unit incomingCallItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.checkNotificationPermission() == false) goto L16;
        if (r6.mIncomingCallPopup != null) goto L7;
        int r2 = R.array.enable;
        int r3 = 0;
        final dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.incoming_call);
        r0.i010I(new OIi1iXI(r6, r0));
        r6.mIncomingCallPopup = r0;
    L7:
        dj4 r8 = r6.mIncomingCallPopup;
        if (r8 == null) goto L16;
        int r4 = 0;
        if (a01.OXO1.iO().getBoolean(b01.XIi00iiXO, false) == false) goto L14;
        String[] r1 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r1, r1.length)) == false) goto L14;
        r4 = 1;
    L14:
        r8.II1Xi0(r4);
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L16:
        return Unit.OXO1;
    }

    private static final boolean incomingCallItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r7, final dj4 r8, int r9) {
        if (r9 != 1) goto L5;
        PermissionUtils r1 = PermissionUtils.permission(new String[]{"PHONE", PermissionConstants.CONTACTS});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new iIX1IiOii(r8, r7), 3, null);
    L6:
        r7.getIncomingCallItem().initView();
        return true;
    L5:
        a01.OXO1.iO().put(b01.XIi00iiXO, false);
        BleInitializer.IO.IOI();
        goto L6
    }

    private static final Unit incomingCallItem_delegate$lambda$0$0$0$0$0$0(dj4 r2, DeviceFragment r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        if (r4 != PermissionStatus.GRANTED) goto L5;
        a01.OXO1.iO().put(b01.XIi00iiXO, true);
        BleInitializer r5 = BleInitializer.IO;
        r5.IOI();
        r5.IIX(r2.XO0O10());
        r3.getIncomingCallItem().initView();
    L7:
        return Unit.OXO1;
    L5:
        r3.noPermissionRemind();
        goto L7
    }

    private static final IncomingCallRingItem incomingCallRingItem_delegate$lambda$0(final DeviceFragment r2) {
        IncomingCallRingItem r0 = new IncomingCallRingItem();
        r0.setItemClick(new IiXXii1I1(r2));
        return r0;
    }

    private static final Unit incomingCallRingItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mIncomingCallRingtPopup != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.incoming_call_ring);
        r0.i010I(new XiOI01iXi(r6));
        r6.mIncomingCallRingtPopup = r0;
    L5:
        dj4 r8 = r6.mIncomingCallRingtPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.INCOMING_CALL_RING, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean incomingCallRingItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new iX1iOIIO(r3, r2), 1, null);
    }

    private static final Unit incomingCallRingItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.INCOMING_CALL_RING, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getIncomingCallRingItem().initView();
        return Unit.OXO1;
    }

    private static final IncomingCallRingVibrationItem incomingCallRingVibrationItem_delegate$lambda$0(final DeviceFragment r2) {
        IncomingCallRingVibrationItem r0 = new IncomingCallRingVibrationItem();
        r0.setItemClick(new iiOOiIO(r2));
        return r0;
    }

    private static final Unit incomingCallRingVibrationItem_delegate$lambda$0$0$0(DeviceFragment r1, View r2) {
        Intrinsics.X0O(r2, "it");
        if (i72.OXO1.O0i() == false) goto L5;
        r1.singleChoiceIncomingCallRing();
    L7:
        return Unit.OXO1;
    L5:
        r1.multiChoiceIncomingCallRing();
        goto L7
    }

    private static final InfoItem infoItem_delegate$lambda$0(final DeviceFragment r2) {
        InfoItem r0 = new InfoItem();
        r0.setItemClick(new XX00I0O(r2));
        r0.setOnClickListener(new XOO0ii0(r2));
        return r0;
    }

    private static final Unit infoItem_delegate$lambda$0$0$0(DeviceFragment r1, View r2) {
        Intrinsics.X0O(r2, "it");
        if (BleConnector.INSTANCE.isBound() == true) goto L9;
        if (i72.OXO1.Oiii() == false) goto L7;
        r1.showPairTypePop();
        goto L9
    L7:
        toAddDevice$default(r1, null, null, 3, null);
    L9:
        return Unit.OXO1;
    }

    private static final LanguageItem languageItem_delegate$lambda$0(final DeviceFragment r2) {
        LanguageItem r0 = new LanguageItem();
        r0.setItemClick(new X000XIX(r2));
        return r0;
    }

    private static final Unit languageItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new I10000X1(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit languageItem_delegate$lambda$0$0$0$0(DeviceFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", R.string.watch_language_set);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), LanguageListActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final LanguageUpdateItem languageUpdateItem_delegate$lambda$0(final DeviceFragment r2) {
        LanguageUpdateItem r0 = new LanguageUpdateItem();
        r0.setItemClick(new iOiXOXXO(r2));
        return r0;
    }

    private static final Unit languageUpdateItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new OiXiiX0i(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit languageUpdateItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), LanguageUpdateActivity2.class));
        return Unit.OXO1;
    }

    private static final LearnCardItem learnCardItem_delegate$lambda$0(final DeviceFragment r2) {
        LearnCardItem r0 = new LearnCardItem();
        r0.setItemClick(new XI1iI1(r2));
        return r0;
    }

    private static final Unit learnCardItem_delegate$lambda$0$0$0(DeviceFragment r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), AudioBookLearnActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final CustomLogoItem logoFileItem_delegate$lambda$0(final DeviceFragment r2) {
        CustomLogoItem r0 = new CustomLogoItem();
        r0.setItemClick(new O10ii0I1X(r2));
        return r0;
    }

    private static final Unit logoFileItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XIi0O100(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit logoFileItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), CustomLogoActivity.class));
        return Unit.OXO1;
    }

    private static final MacQrcodeItem macQrcodeItem_delegate$lambda$0(final DeviceFragment r2) {
        MacQrcodeItem r0 = new MacQrcodeItem();
        r0.setItemClick(new O1iO1(r2));
        return r0;
    }

    private static final Unit macQrcodeItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mMacQrcodePopup != null) goto L5;
        dj4 r0 = new dj4(r6.getMActivity(), R.array.mac_qrcodes, 0, 4, null);
        r0.iX(R.string.mac_qrcode);
        r0.i010I(new I11100(r6));
        r6.mMacQrcodePopup = r0;
    L5:
        dj4 r8 = r6.mMacQrcodePopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.MAC_QRCODE, 1, null, 4, null) - 1);
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean macQrcodeItem_delegate$lambda$0$0$0$0$0(DeviceFragment r9, int r10) {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.MAC_QRCODE, BleKeyFlag.UPDATE, r10 + 1, false, false, 24, null);
        r9.getMacQrcodeItem().initView();
        return true;
    }

    private static final MeasureUnitItem measureUnitItem_delegate$lambda$0(final DeviceFragment r2) {
        MeasureUnitItem r0 = new MeasureUnitItem();
        r0.setItemClick(new I0Xi0XIOX(r2));
        return r0;
    }

    private static final Unit measureUnitItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), MeasureUnitSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final MedicationAlarmItem medicationAlarmItem_delegate$lambda$0(final DeviceFragment r2) {
        MedicationAlarmItem r0 = new MedicationAlarmItem();
        r0.setItemClick(new O010Xi1I0(r2));
        return r0;
    }

    private static final Unit medicationAlarmItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), MedicationAlarmsActivity.class));
        return Unit.OXO1;
    }

    private static final MeetingReminderItem meetingReminderItem_delegate$lambda$0() {
        MeetingReminderItem r0 = new MeetingReminderItem();
        r0.setItemClick(new IO0iXi10());
        return r0;
    }

    private static final Unit meetingReminderItem_delegate$lambda$0$0$0(View r1) {
        Intrinsics.X0O(r1, "it");
        return Unit.OXO1;
    }

    private static final MemoryManagerItem memoryManagerItem_delegate$lambda$0(final DeviceFragment r2) {
        MemoryManagerItem r0 = new MemoryManagerItem();
        r0.setItemClick(new IiiO0(r2));
        return r0;
    }

    private static final Unit memoryManagerItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), MemoryManagerActivity.class));
        return Unit.OXO1;
    }

    private static final MessagePushItem messagePushItem_delegate$lambda$0(final DeviceFragment r2) {
        MessagePushItem r0 = new MessagePushItem();
        r0.setItemClick(new OiXII(r2));
        return r0;
    }

    private static final Unit messagePushItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        if (r2.checkNotificationPermission() == false) goto L6;
        r2.startActivity(new Intent(r2.getActivity(), NotificationSettingsActivity.class));
    L6:
        return Unit.OXO1;
    }

    private static final boolean multiChoiceIncomingCallRing$lambda$0$0(final DeviceFragment r2, final Set r3) {
        Intrinsics.X0O(r3, "picked");
        return X0IOiX1O.XIi00iiXO(false, new O1IX00(r3, r2), 1, null);
    }

    private static final Unit multiChoiceIncomingCallRing$lambda$0$0$0(Set r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendObject$default(r11, BleKey.RING_VIBRATION_SET, BleKeyFlag.UPDATE, new BleRingVibrationSettings(OiOX0i.iO(r9.contains(0)), OiOX0i.iO(r9.contains(1))), false, false, 24, null);
        r10.getIncomingCallRingVibrationItem().initView();
        return Unit.OXO1;
    }

    private static final MusicControlItem musicControlItem_delegate$lambda$0(final DeviceFragment r2) {
        MusicControlItem r0 = new MusicControlItem();
        r0.setItemClick(new XiiXi0XI(r2));
        return r0;
    }

    private static final Unit musicControlItem_delegate$lambda$0$0$0(DeviceFragment r9, View r10) {
        Intrinsics.X0O(r10, "it");
        BleConnector r1 = BleConnector.INSTANCE;
        if (r1.getMHidState() != 0) goto L5;
        r9.showHIDPopup();
    L5:
        BaseBleConnector.sendData$default(r1, BleKey.HID, BleKeyFlag.READ, null, false, false, 28, null);
        return Unit.OXO1;
    }

    private static final MusicManagerItem musicManagerItem_delegate$lambda$0(final DeviceFragment r2) {
        MusicManagerItem r0 = new MusicManagerItem();
        r0.setItemClick(new IIIXIOi0(r2));
        return r0;
    }

    private static final Unit musicManagerItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new Oi11iiIX(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit musicManagerItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), MusicManagerV2Activity.class));
        return Unit.OXO1;
    }

    private static final MyCardCode2Item myCardCode2Item_delegate$lambda$0(final DeviceFragment r2) {
        MyCardCode2Item r0 = new MyCardCode2Item();
        r0.setItemClick(new I0iX1II(r2));
        return r0;
    }

    private static final Unit myCardCode2Item_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), MyCardCodeActivity.class));
        return Unit.OXO1;
    }

    private static final MyCardCodeItem myCardCodeItem_delegate$lambda$0(final DeviceFragment r2) {
        MyCardCodeItem r0 = new MyCardCodeItem();
        r0.setItemClick(new OIIiXO0I(r2));
        return r0;
    }

    private static final Unit myCardCodeItem_delegate$lambda$0$0$0(DeviceFragment r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), QrcodeTypeInfosActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final NavigationItem navigationItem_delegate$lambda$0() {
        NavigationItem r0 = new NavigationItem();
        r0.setItemClick(new ii1X00());
        return r0;
    }

    private static final Unit navigationItem_delegate$lambda$0$0$0(View r2) {
        Intrinsics.X0O(r2, "it");
        I01XX0.XIi00iiXO(I01XX0.Xii11I, null, 2, null);
        return Unit.OXO1;
    }

    private static final NFCGuideItem nfcGuideItem_delegate$lambda$0(final DeviceFragment r2) {
        NFCGuideItem r0 = new NFCGuideItem();
        r0.setItemClick(new IO0iI0X(r2));
        return r0;
    }

    private static final Unit nfcGuideItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), GuideNfcActivity.class));
        return Unit.OXO1;
    }

    private static final NoDisturb2Item noDisturb2Item_delegate$lambda$0(final DeviceFragment r2) {
        NoDisturb2Item r0 = new NoDisturb2Item();
        r0.setItemClick(new OXIXIO0I1(r2));
        return r0;
    }

    private static final Unit noDisturb2Item_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), NoDisturbSettings2Activity.class));
        return Unit.OXO1;
    }

    private static final NoDisturbItem noDisturbItem_delegate$lambda$0(final DeviceFragment r2) {
        NoDisturbItem r0 = new NoDisturbItem();
        r0.setItemClick(new O1iOO10X(r2));
        return r0;
    }

    private static final Unit noDisturbItem_delegate$lambda$0$0$0(final DeviceFragment r7, View r8) {
        Intrinsics.X0O(r8, "it");
        if (q62.OXO1.ii() == false) goto L6;
        r7.startActivity(new Intent(r7.getActivity(), NoDisturbSettingsActivity.class));
    L12:
        return Unit.OXO1;
    L6:
        if (r7.mNoDisturbPopup != null) goto L8;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r7.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.do_not_disturb);
        r0.i010I(new iIi1O00(r7));
        r7.mNoDisturbPopup = r0;
    L8:
        dj4 r9 = r7.mNoDisturbPopup;
        if (r9 == null) goto L12;
        r9.II1Xi0(((BleNoDisturbSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.NO_DISTURB_RANGE, BleNoDisturbSettings.class, null, null, 12, null)).getMBleTimeRange1().getMEnabled());
        View r10 = r7.getRootView();
        Intrinsics.O10IXXX0X(r10, "<get-rootView>(...)");
        r9.I1XOi1(r10);
        goto L12
    }

    private static final boolean noDisturbItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new OOOiiOO(r3, r2), 1, null);
    }

    private static final Unit noDisturbItem_delegate$lambda$0$0$0$0$0$0(int r10, DeviceFragment r11, BleConnector r12) {
        Intrinsics.X0O(r12, "it");
        BleCache r1 = BleCache.INSTANCE;
        BleKey r2 = BleKey.NO_DISTURB_RANGE;
        BleNoDisturbSettings r5 = (BleNoDisturbSettings) BaseBleCache.getObjectNotNull$default(r1, r2, BleNoDisturbSettings.class, null, null, 12, null);
        r5.getMBleTimeRange1().setMEnabled(r10);
        BaseBleConnector.sendObject$default(r12, r2, BleKeyFlag.UPDATE, r5, false, false, 24, null);
        r11.getNoDisturbItem().initView();
        return Unit.OXO1;
    }

    private final void noPermissionRemind() {
        if (this.mPermissionPopup != null) goto L5;
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.O1O(R.string.permission_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new Oi1iIXiO0());
        this.mPermissionPopup = r0;
    L5:
        go0 r1 = this.mPermissionPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean noPermissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private static final NotificationLightScreenItem notificationLightScreenItem_delegate$lambda$0(final DeviceFragment r2) {
        NotificationLightScreenItem r0 = new NotificationLightScreenItem();
        r0.setItemClick(new iO1X1iiX(r2));
        return r0;
    }

    private static final Unit notificationLightScreenItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mNotificationLightScreenItem != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.notification_light_screen);
        r0.i010I(new XXXIII1(r6));
        r6.mNotificationLightScreenItem = r0;
    L5:
        dj4 r8 = r6.mNotificationLightScreenItem;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.NOTIFICATION_LIGHT_SCREEN_SET, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean notificationLightScreenItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new OiI011(r3, r2), 1, null);
    }

    private static final Unit notificationLightScreenItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.NOTIFICATION_LIGHT_SCREEN_SET, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getNotificationLightScreenItem().initView();
        return Unit.OXO1;
    }

    private static final NucleicAcidCodeItem nucleicAcidCodeItem_delegate$lambda$0(final DeviceFragment r2) {
        NucleicAcidCodeItem r0 = new NucleicAcidCodeItem();
        r0.setItemClick(new Ii1XIi0I1(r2));
        return r0;
    }

    private static final Unit nucleicAcidCodeItem_delegate$lambda$0$0$0(DeviceFragment r12, View r13) {
        Intrinsics.X0O(r13, "it");
        String r5 = r12.getString(R.string.nucleic_acid_code);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        QrcodeTypeInfo r1 = new QrcodeTypeInfo(0, 0, 0, r5, 0, 0, null, 112, null);
        Bundle r14 = new Bundle();
        r14.putString("mArg0", null);
        r14.putParcelable("mArg2", null);
        r14.putSerializable("mArg3", r1);
        Intent r0 = new Intent(r12.getActivity(), QrcodeSyncActivity.class);
        r0.putExtras(r14);
        r12.startActivity(r0);
        return Unit.OXO1;
    }

    private static final OfflineMapsItem offlineMapsItem_delegate$lambda$0(final DeviceFragment r2) {
        OfflineMapsItem r0 = new OfflineMapsItem();
        r0.setItemClick(new iXiX1(r2));
        return r0;
    }

    private static final Unit offlineMapsItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XOiIX(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit offlineMapsItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), OfflineMapsActivity.class));
        return Unit.OXO1;
    }

    private static final void onActivityResult$lambda$0(DeviceFragment r1) {
        r1.updatePairState(false);
        r1.twoPopup(true);
    }

    private static final boolean onCodePairChange$lambda$0$0(DeviceFragment r1) {
        r1.twoPopup(true);
        return true;
    }

    private static final void onCodePairChange$lambda$1(DeviceFragment r3) {
    L8:
        e = move-exception;
        r3.fourPopup();
        e.printStackTrace();
        return;
    L3:
        if (r3.getRootView() == null) goto L13;
        go0 r0 = r3.mBindDeviceRemindPopup;     // Catch: Exception -> L8
        if (r0 == null) goto L14;
        View r1 = r3.getRootView();     // Catch: Exception -> L8
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");     // Catch: Exception -> L8
        r0.I1XOi1(r1);     // Catch: Exception -> L8
        return;
    L14:
        return;
    }

    private static final PowerSaveModeItem powerSaveModeItem_delegate$lambda$0(final DeviceFragment r2) {
        PowerSaveModeItem r0 = new PowerSaveModeItem();
        r0.setItemClick(new XO1i0OIIO(r2));
        return r0;
    }

    private static final Unit powerSaveModeItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mPowerSaveModeSetPopup != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.power_save_mode);
        r0.i010I(new Xi111i1(r6));
        r6.mPowerSaveModeSetPopup = r0;
    L5:
        dj4 r8 = r6.mPowerSaveModeSetPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.POWER_SAVE_MODE, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean powerSaveModeItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r1, final int r2) {
        return X0IOiX1O.OXO1(false, new XIiII1iX1(r2, r1));
    }

    private static final Unit powerSaveModeItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.POWER_SAVE_MODE, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getPowerSaveModeItem().initView();
        return Unit.OXO1;
    }

    private static final PressureItem pressureItem_delegate$lambda$0(final DeviceFragment r2) {
        PressureItem r0 = new PressureItem();
        r0.setItemClick(new i10010OO(r2));
        return r0;
    }

    private static final Unit pressureItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), PressureSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final QiblaItem qiblaItem_delegate$lambda$0(final DeviceFragment r2) {
        QiblaItem r0 = new QiblaItem();
        r0.setItemClick(new IIXIO0X0i(r2));
        return r0;
    }

    private static final Unit qiblaItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), QiblaSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final ReceiptCode2Item receiptCode2Item_delegate$lambda$0(final DeviceFragment r2) {
        ReceiptCode2Item r0 = new ReceiptCode2Item();
        r0.setItemClick(new X111(r2));
        return r0;
    }

    private static final Unit receiptCode2Item_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), ReceiptCodeActivity.class));
        return Unit.OXO1;
    }

    private static final ReceiptCodeItem receiptCodeItem_delegate$lambda$0(final DeviceFragment r2) {
        ReceiptCodeItem r0 = new ReceiptCodeItem();
        r0.setItemClick(new Ii0OI(r2));
        return r0;
    }

    private static final Unit receiptCodeItem_delegate$lambda$0$0$0(DeviceFragment r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), QrcodeTypeInfosActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final RecordingItem recordingItem_delegate$lambda$0(final DeviceFragment r2) {
        RecordingItem r0 = new RecordingItem();
        r0.setItemClick(new XXXOi0(r2));
        return r0;
    }

    private static final Unit recordingItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), RecordingListActivity.class));
        return Unit.OXO1;
    }

    private static final RelaxReminderItem relaxReminderItem_delegate$lambda$0(final DeviceFragment r2) {
        RelaxReminderItem r0 = new RelaxReminderItem();
        r0.setItemClick(new iO11XIOOX(r2));
        return r0;
    }

    private static final Unit relaxReminderItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), RelaxReminderSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final RemoteCameraItem remoteCameraItem_delegate$lambda$0(final DeviceFragment r2) {
        RemoteCameraItem r0 = new RemoteCameraItem();
        r0.setItemClick(new X1i10(r2));
        return r0;
    }

    private static final Unit remoteCameraItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new O1Oi0(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit remoteCameraItem_delegate$lambda$0$0$0$0(DeviceFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), CameraActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final ResetItem resetItem_delegate$lambda$0(final DeviceFragment r2) {
        ResetItem r0 = new ResetItem();
        r0.setItemClick(new iIX1X1X01(r2));
        return r0;
    }

    private static final Unit resetItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XX000O00(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit resetItem_delegate$lambda$0$0$0$0(DeviceFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        go0 r5 = new go0(r3.getMActivity(), 0, 2, null);
        r5.I0iXXO(false);
        r5.O1O(R.string.device_reset_title);
        r5.iX(Integer.valueOf(R.string.device_reset_tip));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new X10I00());
        r5.IIX1OXO();
        return Unit.OXO1;
    }

    private static final boolean resetItem_delegate$lambda$0$0$0$0$0$0() {
        if (q62.OXO1.Xi1Oi() == false) goto L5;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.DEVICE_OP, BleKeyFlag.UPDATE, new BleDeviceOp(2), false, false, 24, null);
        new Handler().postDelayed(new i11iOOI(), 300);
    L6:
        return true;
    L5:
        BleInitializer.OX0X1O10X(BleInitializer.IO, false, 1, null);
        goto L6
    }

    private static final void resetItem_delegate$lambda$0$0$0$0$0$0$0() {
        BleConnector.INSTANCE.closeConnection(true);
        BleInitializer.OX0X1O10X(BleInitializer.IO, false, 1, null);
    }

    private static final View rootView_delegate$lambda$0(DeviceFragment r1) {
        return r1.getMView().findViewById(R.id.root_view);
    }

    private static final Unit scanQrcode$lambda$0(DeviceFragment r0, String r1) {
        if (r1 == null) goto L4;
        r0.doScanResult(r1);
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.qrcode_failed);
        goto L6
    }

    private static final ScheduleItem scheduleItem_delegate$lambda$0(final DeviceFragment r2) {
        ScheduleItem r0 = new ScheduleItem();
        r0.setItemClick(new XO0OiX(r2));
        return r0;
    }

    private static final Unit scheduleItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SchedulesActivity.class));
        return Unit.OXO1;
    }

    private static final SedentarinessItem sedentarinessItem_delegate$lambda$0(final DeviceFragment r2) {
        SedentarinessItem r0 = new SedentarinessItem();
        r0.setItemClick(new X00IX1(r2));
        return r0;
    }

    private static final Unit sedentarinessItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SedentarinessSettingsActivity.class));
        return Unit.OXO1;
    }

    private final c72 setProgressBackCallBack(c72 r5) {
        if (r5 != null) goto L5;
        int r3 = 0;
        c72 r6 = new c72(getMActivity(), r3, 2, null);
        r6.X1ii(new IiOXXOX(this));
        r6.XXI(new XOOiOI(this));
        return r6;
    L5:
        return r5;
    }

    private static final Unit setProgressBackCallBack$lambda$0$0(DeviceFragment r1) {
        BleConnector.INSTANCE.addHandleCallback(r1.bleHandleCallback);
        return Unit.OXO1;
    }

    private static final Unit setProgressBackCallBack$lambda$0$1(DeviceFragment r1) {
        BleConnector.INSTANCE.removeHandleCallback(r1.bleHandleCallback);
        return Unit.OXO1;
    }

    private static final ShockItem shockItem_delegate$lambda$0(final DeviceFragment r2) {
        ShockItem r0 = new ShockItem();
        r0.setItemClick(new O0IO1(r2));
        return r0;
    }

    private static final Unit shockItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mShockPopup != null) goto L5;
        dj4 r0 = new dj4(r6.getMActivity(), R.array.vibration_times, 0, 4, null);
        r0.iX(q62.OXO1.Oi1());
        r0.i010I(new O1Oi111X(r6));
        r6.mShockPopup = r0;
    L5:
        dj4 r8 = r6.mShockPopup;
        if (r8 == null) goto L12;
        int r1 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VIBRATION, 0, null, 6, null);
        if (r1 <= 3) goto L10;
        r1 = 3;
    L10:
        r8.II1Xi0(r1);
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L12:
        return Unit.OXO1;
    }

    private static final boolean shockItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IO11X0(r3, r2), 1, null);
    }

    private static final Unit shockItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.VIBRATION, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getShockItem().initView();
        return Unit.OXO1;
    }

    private static final ShockLevelItem shockLevelItem_delegate$lambda$0(final DeviceFragment r2) {
        ShockLevelItem r0 = new ShockLevelItem();
        r0.setItemClick(new OXO00iI(r2));
        return r0;
    }

    private static final Unit shockLevelItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mShockPopup != null) goto L5;
        int r2 = R.array.vibration_level;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(q62.OXO1.Oi1());
        r0.i010I(new O1I0I0iO(r6));
        r6.mShockPopup = r0;
    L5:
        dj4 r8 = r6.mShockPopup;
        if (r8 == null) goto L13;
        if (BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VIBRATION_V2, 0, null, 6, null) != 2) goto L10;
        int r1 = 0;
    L11:
        r8.II1Xi0(r1);
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
        goto L13
    L10:
        r1 = 1;
    L13:
        return Unit.OXO1;
    }

    private static final boolean shockLevelItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new IOX1iXX(r3, r2), 1, null);
    }

    private static final Unit shockLevelItem_delegate$lambda$0$0$0$0$0$0(int r8, DeviceFragment r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        if (r8 != 0) goto L6;
        int r11 = 2;
    L5:
        int r3 = r11;
        BaseBleConnector.sendInt8$default(r10, BleKey.VIBRATION_V2, BleKeyFlag.UPDATE, r3, false, false, 24, null);
        r9.getShockLevelItem().initView();
        return Unit.OXO1;
    L6:
        r11 = 1;
        goto L5
    }

    private static final ShockSettingsItem shockSettingsItem_delegate$lambda$0(final DeviceFragment r2) {
        ShockSettingsItem r0 = new ShockSettingsItem();
        r0.setItemClick(new IXOOOiI0(r2));
        return r0;
    }

    private static final Unit shockSettingsItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), ShockSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final boolean showDeviceUnbindPopup$lambda$0$0() {
        return true;
    }

    private final void showHIDPopup() {
        go0 r0 = this.mHIDPopup;
        if (r0 == null) goto L8;
        if (r0.isShowing() != true) goto L8;
        return;
    L8:
        if (this.mHIDPopup != null) goto L10;
        go0 r1 = new go0(getMActivity(), 0, 2, null);
        r1.O1O(R.string.hid_remind);
        r1.I0iXXO(false);
        go0.X11iII1O1(r1, Integer.valueOf(R.string.cancel), null, 2, null);
        r1.X1IX(R.string.confirm, new XXX0X1());
        this.mHIDPopup = r1;
    L10:
        go0 r2 = this.mHIDPopup;
        if (r2 == null) goto L14;
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r2.I1XOi1(r3);
        return;
    }

    private static final boolean showHIDPopup$lambda$0$0() {
        BleConnector.INSTANCE.connectHID();
        return true;
    }

    private static final Unit showList$lambda$0(final DeviceFragment r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r3.clearAllItems();
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(300, new X1iiiOOX(r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(DeviceFragment r9, DslAdapter r10) {
        List<DslAdapterItem> r0 = r9.showList;
        if (r0 != null) goto L5;
        Intrinsics.XXO("showList");
        r0 = null;
    L5:
        Iterator<DslAdapterItem> r3 = r0.iterator();
    L7:
        if (r3.hasNext() == false) goto L14;
        DslAdapterItem r1 = r3.next();
        if ((r1 instanceof BaseDslItem) == false) goto L7;
        ((BaseDslItem) r1).initView();     // Catch: Exception -> L12
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L7
    L14:
        List<DslAdapterItem> r11 = r9.showList;
        if (r11 != null) goto L17;
        Intrinsics.XXO("showList");
        r11 = null;
    L17:
        Iterator<DslAdapterItem> r12 = r11.iterator();
    L19:
        if (r12.hasNext() == false) goto L21;
        DslAdapterExKt.IIX1OXO(r10, r12.next(), null, 2, null);
        goto L19
    L21:
        DslAdapter.render$default(r10, false, null, new IOO0i0X1X(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit showPairTypePop$lambda$0(DeviceFragment r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.showPairTypePop();
    L5:
        return Unit.OXO1;
    }

    private static final Unit showPairTypePop$lambda$1(DeviceFragment r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.showPairTypePop();
    L5:
        return Unit.OXO1;
    }

    private static final Unit showPairTypePop$lambda$2$0(final DeviceFragment r4, final m04 r5) {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = r4.getString(R.string.camera_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = r4.getString(R.string.camera_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new IXI0IIiX(r4, r5));
        return Unit.OXO1;
    }

    private static final Unit showPairTypePop$lambda$2$0$0(DeviceFragment r3, m04 r4, PermissionStatus r5) {
        Intrinsics.X0O(r5, "it");
        if (r5 != PermissionStatus.GRANTED) goto L9;
        m04 r6 = r3.mSelectPairPopup;
        if (r6 == null) goto L7;
        r6.dismiss();
    L7:
        r3.scanQrcode();
    L12:
        return Unit.OXO1;
    L9:
        if (r5 != PermissionStatus.DENIED_FOREVER) goto L12;
        go0 r7 = new go0(r4.XO0O10(), 0, 2, null);
        r7.I0iXXO(false);
        r7.O1O(R.string.camera_explain_title);
        r7.iX(Integer.valueOf(R.string.camera_explain_content));
        go0.X11iII1O1(r7, Integer.valueOf(R.string.cancel), null, 2, null);
        r7.X1IX(R.string.confirm, new iII000OI());
        View r8 = r3.getRootView();
        Intrinsics.O10IXXX0X(r8, "<get-rootView>(...)");
        r7.I1XOi1(r8);
        goto L12
    }

    private static final boolean showPairTypePop$lambda$2$0$0$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private static final Unit showPairTypePop$lambda$2$1(DeviceFragment r2) {
        m04 r0 = r2.mSelectPairPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        toAddDevice$default(r2, null, null, 3, null);
        return Unit.OXO1;
    }

    private static final ShutdownItem shutdownItem_delegate$lambda$0(final DeviceFragment r2) {
        ShutdownItem r0 = new ShutdownItem();
        r0.setItemClick(new OI1iXX1(r2));
        return r0;
    }

    private static final Unit shutdownItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new i1iXOiO(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit shutdownItem_delegate$lambda$0$0$0$0(DeviceFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        go0 r5 = new go0(r3.getMActivity(), 0, 2, null);
        r5.I0iXXO(false);
        r5.O1O(R.string.device_shutdown_title);
        r5.iX(Integer.valueOf(R.string.device_shutdown_tip));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new OO1O100IO());
        r5.IIX1OXO();
        return Unit.OXO1;
    }

    private static final boolean shutdownItem_delegate$lambda$0$0$0$0$0$0() {
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.SHUTDOWN, BleKeyFlag.UPDATE, 0, false, false, 24, null);
        return true;
    }

    private static final TranslationSimultaneousItem simultaneousTranslation_delegate$lambda$0(final DeviceFragment r2) {
        TranslationSimultaneousItem r0 = new TranslationSimultaneousItem();
        r0.setItemClick(new OX1ii1(r2));
        return r0;
    }

    private static final Unit simultaneousTranslation_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new I100XO(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit simultaneousTranslation_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SparkChainSimultaneousActivity.class));
        return Unit.OXO1;
    }

    private static final boolean singleChoiceIncomingCallRing$lambda$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new ii0OOO(r3, r2), 1, null);
    }

    private static final Unit singleChoiceIncomingCallRing$lambda$0$0$0(int r11, DeviceFragment r12, BleConnector r13) {
        Intrinsics.X0O(r13, "it");
        int r0 = 1;
        int r1 = 0;
        if (r11 != 1) goto L5;
        r1 = 1;
        r0 = 0;
    L11:
        BaseBleConnector.sendObject$default(r13, BleKey.RING_VIBRATION_SET, BleKeyFlag.UPDATE, new BleRingVibrationSettings(r0, r1), false, false, 24, null);
        r12.getIncomingCallRingVibrationItem().initView();
        return Unit.OXO1;
    L5:
        if (r11 == 2) goto L11;
        if (r11 == 3) goto L9;
        r0 = 0;
        goto L11
    L9:
        r1 = 1;
        goto L11
    }

    private static final SleepSetItem sleepSet_delegate$lambda$0(final DeviceFragment r2) {
        SleepSetItem r0 = new SleepSetItem();
        r0.setItemClick(new II0iiIX(r2));
        return r0;
    }

    private static final Unit sleepSet_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new XiOOiI(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit sleepSet_delegate$lambda$0$0$0$0(final DeviceFragment r8, BleConnector r9) {
        Intrinsics.X0O(r9, "it");
        int r3 = R.array.enable;
        int r4 = 0;
        dj4 r1 = new dj4(r8.getMActivity(), r3, r4, 4, null);
        r1.iX(R.string.sleep_monitoring);
        r1.i010I(new OOXXiii01(r8));
        r1.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.SLEEP_SET, 0, null, 6, null));
        r1.IIX1OXO();
        return Unit.OXO1;
    }

    private static final boolean sleepSet_delegate$lambda$0$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new X1Iii1(r3, r2), 1, null);
    }

    private static final Unit sleepSet_delegate$lambda$0$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.SLEEP_SET, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getSleepSet().initView();
        return Unit.OXO1;
    }

    private static final SMSQuickReplyItem smsQuickReplyItem_delegate$lambda$0(final DeviceFragment r2) {
        SMSQuickReplyItem r0 = new SMSQuickReplyItem();
        r0.setItemClick(new XI1OIXiI(r2));
        return r0;
    }

    private static final Unit smsQuickReplyItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.SMS});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        ds1.iO(r0, null, null, new XX0OiX0(r6), 3, null);
        return Unit.OXO1;
    }

    private static final Unit smsQuickReplyItem_delegate$lambda$0$0$0$0(final DeviceFragment r2, PermissionStatus r3) {
        Intrinsics.X0O(r3, "it");
        if (r3 != PermissionStatus.GRANTED) goto L5;
        X0IOiX1O.XIi00iiXO(false, new O1X1XX0X(r2), 1, null);
    L7:
        return Unit.OXO1;
    L5:
        r2.noPermissionRemind();
        goto L7
    }

    private static final Unit smsQuickReplyItem_delegate$lambda$0$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SMSQuickReplyActivity.class));
        return Unit.OXO1;
    }

    private static final SOSManagerItem sosManagerItem_delegate$lambda$0(final DeviceFragment r2) {
        SOSManagerItem r0 = new SOSManagerItem();
        r0.setItemClick(new I0XOiII(r2));
        return r0;
    }

    private static final Unit sosManagerItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), SOSSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final StandbySetItem standbySetItem_delegate$lambda$0(final DeviceFragment r2) {
        StandbySetItem r0 = new StandbySetItem();
        r0.setItemClick(new OIIOi1(r2));
        return r0;
    }

    private static final Unit standbySetItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mStandbySetPopup != null) goto L5;
        int r2 = R.array.enable;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.standby_set);
        r0.i010I(new O1O1O101(r6));
        r6.mStandbySetPopup = r0;
    L5:
        dj4 r8 = r6.mStandbySetPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STANDBY_SET, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean standbySetItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new O0iOiXOX(r3, r2), 1, null);
    }

    private static final Unit standbySetItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.STANDBY_SET, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getStandbySetItem().initView();
        return Unit.OXO1;
    }

    private static final StandbyWatchFaceItem standbyWatchFaceItem_delegate$lambda$0(final DeviceFragment r2) {
        StandbyWatchFaceItem r0 = new StandbyWatchFaceItem();
        r0.setItemClick(new O1O1O(r2));
        return r0;
    }

    private static final Unit standbyWatchFaceItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), StandbyWatchFaceSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final StockMarketItem stockMarketItem_delegate$lambda$0(final DeviceFragment r2) {
        StockMarketItem r0 = new StockMarketItem();
        r0.setItemClick(new Xi1I1OO(r2));
        return r0;
    }

    private static final Unit stockMarketItem_delegate$lambda$0$0$0(DeviceFragment r33, View r34) {
        Intrinsics.X0O(r34, "it");
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == true) goto L9;
    L11:
        r33.startActivity(new Intent(r33.getActivity(), LoginReminderActivity.class));
    L13:
        return Unit.OXO1;
    L9:
        if (r5.getIdentity().length() <= 0) goto L11;
        r33.startActivity(new Intent(r33.getActivity(), StockMarketActivity.class));
        goto L13
    }

    private static final SyncContactItem syncContactItem_delegate$lambda$0(final DeviceFragment r2) {
        SyncContactItem r0 = new SyncContactItem();
        r0.setItemClick(new iI00OX1II(r2));
        return r0;
    }

    private static final Unit syncContactItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.CONTACTS});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        ds1.iO(r0, null, null, new IiX100(r6), 3, null);
        return Unit.OXO1;
    }

    private static final Unit syncContactItem_delegate$lambda$0$0$0$0(DeviceFragment r2, PermissionStatus r3) {
        Intrinsics.X0O(r3, "it");
        if (r3 == PermissionStatus.GRANTED) goto L5;
        r2.noPermissionRemind();
    L10:
        return Unit.OXO1;
    L5:
        if (q62.OXO1.I0i() == false) goto L7;
        r2.startActivity(new Intent(r2.getActivity(), ContactListV2Activity.class));
        goto L10
    L7:
        r2.startActivity(new Intent(r2.getActivity(), ContactListActivity.class));
        goto L10
    }

    private static final TempMonitoringItem tempMonitoringItem_delegate$lambda$0(final DeviceFragment r2) {
        TempMonitoringItem r0 = new TempMonitoringItem();
        r0.setItemClick(new XIOi00Ii(r2));
        return r0;
    }

    private static final Unit tempMonitoringItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), TempMonitoringSettingsActivity.class));
        return Unit.OXO1;
    }

    private final void threePopup(boolean r4) {
        q62 r5 = q62.OXO1;
        if (r5.IX0iIX() == false) goto L9;
        if (r5.iO0iiOi() == false) goto L9;
        DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OIi0(this), null, 2, null);
        return;
    L9:
        if (r5.OOXiOO() == false) goto L12;
        DeviceInfoChecker.XiOIii1(DeviceInfoChecker.OXO1, new OIX0iXi(this), null, 2, null);
        return;
    L12:
        fourPopup();
    }

    private static final TimeFormatItem timeFormatItem_delegate$lambda$0(final DeviceFragment r2) {
        TimeFormatItem r0 = new TimeFormatItem();
        r0.setItemClick(new XOOi0i11(r2));
        return r0;
    }

    private static final Unit timeFormatItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mTimeFormatPopup != null) goto L5;
        int r2 = R.array.time_format;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.time_format);
        r0.i010I(new iOiOXX(r6));
        r6.mTimeFormatPopup = r0;
    L5:
        dj4 r8 = r6.mTimeFormatPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.HOUR_SYSTEM, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean timeFormatItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new XIOi11(r3, r2), 1, null);
    }

    private static final Unit timeFormatItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.HOUR_SYSTEM, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getTimeFormatItem().initView();
        return Unit.OXO1;
    }

    public static /* synthetic */ void toAddDevice$default(DeviceFragment r0, String r1, String r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = null;
    L7:
        if ((r3 & 2) == 0) goto L9;
        r2 = "";
    L9:
        r0.toAddDevice(r1, r2);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAddDevice");
    }

    private final void toFirmwareUpgrade() {
        BleCache r0 = BleCache.INSTANCE;
        String r1 = r0.getMPlatform();
        switch(r1.hashCode()) {
            case 65152: goto L30;
            case 76676: goto L25;
            case 2755709: goto L20;
            case 78896685: goto L15;
            case 2138586828: goto L6;
            default: goto L32;
        };
    L6:
        if (r1.equals(BleDeviceInfo.PLATFORM_GOODIX) == false) goto L32;
        if (Intrinsics.XOO0ii0(r0.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q) == false) goto L12;
        DeviceInfoChecker.OXO1.IiI10X(getMActivity());
        return;
    L12:
        startActivity(new Intent(getActivity(), FirmwareUpgradeGActivity.class));
        return;
    L15:
        if (r1.equals(BleDeviceInfo.PLATFORM_SIFLI) == false) goto L32;
        startActivity(new Intent(getActivity(), FirmwareUpgradeSActivity.class));
        return;
    L20:
        if (r1.equals(BleDeviceInfo.PLATFORM_ZKLX) == false) goto L32;
        startActivity(new Intent(getActivity(), FirmwareUpgradeZActivity.class));
        return;
    L25:
        if (r1.equals(BleDeviceInfo.PLATFORM_MTK) == false) goto L32;
        startActivity(new Intent(getActivity(), FirmwareUpgradeMActivity.class));
        return;
    L30:
        if (r1.equals(BleDeviceInfo.PLATFORM_ATS) == false) goto L32;
        startActivity(new Intent(getActivity(), FirmwareUpgradeATSActivity.class));
        return;
    L32:
        if (q62.OXO1.I0i0() == false) goto L35;
        DeviceInfoChecker.OXO1.IiI10X(getMActivity());
        return;
    L35:
        startActivity(new Intent(getActivity(), FirmwareUpgradeNActivity.class));
    }

    private final void toSyncAGPS() {
        c72 r0 = setProgressBackCallBack(this.mAGpsPopup);
        this.mAGpsPopup = r0;
        if (r0 == null) goto L5;
        r0.I1(R.string.downloading);
        r0.OX(0);
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r0.I1XOi1(r2);
    L5:
        AGPSInitializer.IO.OX(false, this.mAGpsPopup);
    }

    private static final TouchSetItem touchSetItem_delegate$lambda$0(final DeviceFragment r2) {
        TouchSetItem r0 = new TouchSetItem();
        r0.setItemClick(new IX0i01(r2));
        return r0;
    }

    private static final Unit touchSetItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), TouchSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final UnpairItem unpairItem_delegate$lambda$0(final DeviceFragment r2) {
        UnpairItem r0 = new UnpairItem();
        r0.setMOnUnbindListener(new ii0i0O0iI(r2));
        return r0;
    }

    private static final Unit unpairItem_delegate$lambda$0$0$0(final DeviceFragment r7) {
        go0 r0 = new go0(r7.getMActivity(), 0, 2, null);
        q62 r1 = q62.OXO1;
        if (r1.iii0() == false) goto L8;
        if (a01.OXO1.XIi00iiXO().getBoolean(b01.IiI10X, false) == false) goto L8;
        r0.I0iXXO(false);
        r0.O1O(R.string.unbind_tip_by_update_failed);
        go0.X11iII1O1(r0, null, null, 2, null);
        r0.X1IX(R.string.firmware_repair, new XOIiXXIO());
    L12:
        r7.setMUnbindPopup(r0);
        go0 r2 = r7.getMUnbindPopup();
        if (r2 == null) goto L16;
        View r8 = r7.getRootView();
        Intrinsics.O10IXXX0X(r8, "<get-rootView>(...)");
        r2.I1XOi1(r8);
    L16:
        return Unit.OXO1;
    L8:
        if (r1.X1iOII0() == false) goto L10;
        int r3 = R.string.unbind_tip2;
    L11:
        r0.O1O(r3);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new XOOX0i0i(r7));
        goto L12
    L10:
        r3 = R.string.unbind_tip;
        goto L11
    }

    private static final boolean unpairItem_delegate$lambda$0$0$0$0$0() {
        I01XX0.XIi00iiXO(I01XX0.iOiXi11II, null, 2, null);
        return true;
    }

    private static final boolean unpairItem_delegate$lambda$0$0$0$0$1(DeviceFragment r0) {
        r0.whenUnbind();
        return true;
    }

    public static /* synthetic */ void updatePairState$default(DeviceFragment r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r0.updatePairState(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePairState");
    }

    private static final AuraVideoUseHelpItem videoUseHelpItem_delegate$lambda$0(final DeviceFragment r2) {
        AuraVideoUseHelpItem r0 = new AuraVideoUseHelpItem();
        r0.setItemClick(new iO0O1ii(r2));
        return r0;
    }

    private static final Unit videoUseHelpItem_delegate$lambda$0$0$0(DeviceFragment r4, View r5) {
        Intrinsics.X0O(r5, "it");
        q62 r6 = q62.OXO1;
        if (q62.OiO0IOX(r6, null, 1, null) == false) goto L6;
        String r7 = "2";
    L9:
        int r0 = WebViewActivity.Companion.iO();
        Bundle r2 = new Bundle();
        r2.putString("mArg0", "https://api.iot-solution.net/courseList/?type=" + r7);
        r2.putInt("mArg1", r0);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r8 = new Intent(r4.getActivity(), WebViewActivity.class);
        r8.putExtras(r2);
        r4.startActivity(r8);
        return Unit.OXO1;
    L6:
        if (r6.X0100I() == false) goto L8;
        r7 = "3";
        goto L9
    L8:
        r7 = "1";
        goto L9
    }

    private static final VoiceControlItem voiceControl_delegate$lambda$0(final DeviceFragment r2) {
        VoiceControlItem r0 = new VoiceControlItem();
        r0.setItemClick(new OOI1OXO(r2));
        return r0;
    }

    private static final Unit voiceControl_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new II1I1Oi0X(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit voiceControl_delegate$lambda$0$0$0$0(final DeviceFragment r8, BleConnector r9) {
        Intrinsics.X0O(r9, "it");
        int r3 = R.array.sound_set;
        int r4 = 0;
        dj4 r1 = new dj4(r8.getMActivity(), r3, r4, 4, null);
        r1.iX(R.string.sound);
        r1.i010I(new XOO0Iii(r8));
        r1.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.VOICE_CONTROL, 0, null, 6, null));
        r1.IIX1OXO();
        return Unit.OXO1;
    }

    private static final boolean voiceControl_delegate$lambda$0$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new II1XiXI01(r3, r2), 1, null);
    }

    private static final Unit voiceControl_delegate$lambda$0$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.VOICE_CONTROL, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getVoiceControl().initView();
        return Unit.OXO1;
    }

    private static final VoiceItem voiceItem_delegate$lambda$0(final DeviceFragment r2) {
        VoiceItem r0 = new VoiceItem();
        r0.setItemClick(new Xi110(r2));
        return r0;
    }

    private static final Unit voiceItem_delegate$lambda$0$0$0(final DeviceFragment r3, View r4) {
        Intrinsics.X0O(r4, "it");
        q62 r5 = q62.OXO1;
        if (r5.IiX1ii() == true) goto L12;
        if (r5.OIXOOi() == true) goto L12;
        if (TextUtils.isEmpty(r5.iIiiO()) == false) goto L12;
        if (r5.XOX() == true) goto L12;
        UtilsKt.XXiO0i(r3.getMActivity());
    L19:
        return Unit.OXO1;
    L12:
        if (r5.IOI0i0I() == false) goto L17;
        VoiceManager r6 = VoiceManager.INSTANCE;
        if (r6.isExpired() == false) goto L16;
        r6.checkBaiduAuth(r3.getMActivity(), r3.getRootView(), new iO1iX(r3));
        goto L19
    L16:
        r3.startActivity(new Intent(r3.getActivity(), VoiceActivity.class));
        goto L19
    L17:
        r3.startActivity(new Intent(r3.getActivity(), VoiceActivity.class));
        goto L19
    }

    private static final Unit voiceItem_delegate$lambda$0$0$0$0(DeviceFragment r2, boolean r3) {
        if (r3 == false) goto L4;
        r2.startActivity(new Intent(r2.getActivity(), VoiceActivity.class));
    L6:
        return Unit.OXO1;
    L4:
        r2.startActivity(new Intent(r2.getActivity(), VoiceSetActivity.class));
        goto L6
    }

    private static final WashItem washItem_delegate$lambda$0(final DeviceFragment r2) {
        WashItem r0 = new WashItem();
        r0.setItemClick(new OXO0(r2));
        return r0;
    }

    private static final Unit washItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), WashSettingsActivity.class));
        return Unit.OXO1;
    }

    private static final WatchPasswordItem watchPasswordItem_delegate$lambda$0(final DeviceFragment r2) {
        WatchPasswordItem r0 = new WatchPasswordItem();
        r0.setItemClick(new XOXOO0X(r2));
        return r0;
    }

    private static final Unit watchPasswordItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), WatchPasswordActivity.class));
        return Unit.OXO1;
    }

    private static final WearWayItem wearWayItem_delegate$lambda$0(final DeviceFragment r2) {
        WearWayItem r0 = new WearWayItem();
        r0.setItemClick(new OXX111(r2));
        return r0;
    }

    private static final Unit wearWayItem_delegate$lambda$0$0$0(final DeviceFragment r6, View r7) {
        Intrinsics.X0O(r7, "it");
        if (r6.mWearWayPopup != null) goto L5;
        int r2 = R.array.wear_way;
        int r3 = 0;
        dj4 r0 = new dj4(r6.getMActivity(), r2, r3, 4, null);
        r0.iX(R.string.wear_way);
        r0.i010I(new IOI0OiXOI(r6));
        r6.mWearWayPopup = r0;
    L5:
        dj4 r8 = r6.mWearWayPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.WEAR_WAY, 0, null, 6, null));
        View r9 = r6.getRootView();
        Intrinsics.O10IXXX0X(r9, "<get-rootView>(...)");
        r8.I1XOi1(r9);
    L9:
        return Unit.OXO1;
    }

    private static final boolean wearWayItem_delegate$lambda$0$0$0$0$0(final DeviceFragment r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new i1i1X1(r3, r2), 1, null);
    }

    private static final Unit wearWayItem_delegate$lambda$0$0$0$0$0$0(int r9, DeviceFragment r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.WEAR_WAY, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        r10.getWearWayItem().initView();
        return Unit.OXO1;
    }

    private static final WechatPaySetItem wechatPaySetItem_delegate$lambda$0(final DeviceFragment r2) {
        WechatPaySetItem r0 = new WechatPaySetItem();
        r0.setItemClick(new O0iOXiiIO(r2));
        return r0;
    }

    private static final Unit wechatPaySetItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new I1OXXI(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit wechatPaySetItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), WeChatPayActivity.class));
        return Unit.OXO1;
    }

    private static final WechatVerificationItem wechatVerificationItem_delegate$lambda$0(final DeviceFragment r2) {
        WechatVerificationItem r0 = new WechatVerificationItem();
        r0.setItemClick(new iXI0iXX(r2));
        return r0;
    }

    private static final Unit wechatVerificationItem_delegate$lambda$0$0$0(final DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        X0IOiX1O.XIi00iiXO(false, new O0X0iI11O(r2), 1, null);
        return Unit.OXO1;
    }

    private static final Unit wechatVerificationItem_delegate$lambda$0$0$0$0(DeviceFragment r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), WechatVerificationActivity.class));
        return Unit.OXO1;
    }

    private static final WorldClockItem worldClockItem_delegate$lambda$0(final DeviceFragment r2) {
        WorldClockItem r0 = new WorldClockItem();
        r0.setItemClick(new OXiiIi1(r2));
        return r0;
    }

    private static final Unit worldClockItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), WorldClockActivity.class));
        return Unit.OXO1;
    }

    private static final XmlyAudioItem xmlyAudioItem_delegate$lambda$0(final DeviceFragment r2) {
        XmlyAudioItem r0 = new XmlyAudioItem();
        r0.setItemClick(new I1XIXOX(r2));
        return r0;
    }

    private static final Unit xmlyAudioItem_delegate$lambda$0$0$0(DeviceFragment r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r2.startActivity(new Intent(r2.getActivity(), XmlyAudioWebViewActivity.class));
        return Unit.OXO1;
    }

    public final void checkAppAvailable() {
        DeviceInfoChecker.OXO1.XIi00iiXO(new I01X1O(this));
    }

    @sf5(tag = I01XX0.X1)
    public final void checkFirmware(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("checkFirmware -> update check");
        twoPopup(true);
        DeviceInfoChecker.OXO1.I1();
    }

    public boolean checkNotificationPermission() {
        boolean r0 = MyNotificationListenerService.O001I.O00(getMActivity());
        if (r0 == false) goto L5;
    L10:
        return r0;
    L5:
        if (this.mNotificationPopup != null) goto L7;
        final go0 r1 = new go0(getMActivity(), 0, 2, null);
        String r2 = getString(R.string.allow_notification_access, new Object[]{getString(R.string.app_name)});
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r1.iI(r2);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new OO0i1O0(r1));
        this.mNotificationPopup = r1;
    L7:
        go0 r3 = this.mNotificationPopup;
        if (r3 == null) goto L10;
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r3.I1XOi1(r4);
        goto L10
    }

    public final void doScanResult(@aa1 String r7) {
        Intrinsics.X0O(r7, "result");
        Uri r8 = Uri.parse(r7);     // Catch: Exception -> L6
        String r2 = r8.getQueryParameter("name");     // Catch: Exception -> L6
        String r3 = r8.getQueryParameter("mac");     // Catch: Exception -> L6
        if (TextUtils.isEmpty(r3) == false) goto L8;
        r3 = r8.getQueryParameter("MAC");     // Catch: Exception -> L6
    L8:
        i1O0OXO1O.OXO1.OXO1("doScanResult -> " + r2 + ", " + r3);     // Catch: Exception -> L6
        if (TextUtils.isEmpty(r2) == true) goto L11;
    L14:
        Intrinsics.XXI(r3);     // Catch: Exception -> L6
        toAddDevice(r2, r3);     // Catch: Exception -> L6
        return;
    L11:
        if (TextUtils.isEmpty(r3) == false) goto L14;
        Toast.makeText(getMActivity(), R.string.qrcode_failed, 1).show();     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        Toast.makeText(getMActivity(), R.string.qrcode_failed, 1).show();
    }

    @aa1
    public final AGPSUpgradeItem getAGPSUpgradeItem() {
        return (AGPSUpgradeItem) getValue();
    }

    @aa1
    public final ActivityRecognitionItem getActivityRecognitionItem() {
        return (ActivityRecognitionItem) getValue();
    }

    @aa1
    public final AINoteItem getAiNote() {
        return (AINoteItem) getValue();
    }

    @aa1
    public final AlarmClockItem getAlarmClockItem() {
        return (AlarmClockItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getAlipaySetItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getAntiLostItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final AppStoreItem getAppStoreItem() {
        return (AppStoreItem) getValue();
    }

    @aa1
    public final AudioBookLearnItem getAudioBookLearnItem() {
        return (AudioBookLearnItem) getValue();
    }

    @aa1
    public List<DslAdapterItem> getBCItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem()});
    }

    @aa1
    public final BaseDeviceItem getBackLightItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BloodOxyGenItem getBloodOxyGenItem() {
        return (BloodOxyGenItem) getValue();
    }

    @aa1
    public final ClassicPairItem getClassicPairItem() {
        return (ClassicPairItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getDateFormatItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final DialItem getDialItem() {
        return (DialItem) getValue();
    }

    @aa1
    public final TranslationDialogueItem getDialogueTranslation() {
        return (TranslationDialogueItem) getValue();
    }

    @aa1
    public final DoubleClickScreenItem getDoubleClickScreenItem() {
        return (DoubleClickScreenItem) getValue();
    }

    @aa1
    public final DrinkWaterItem getDrinkWaterItem() {
        return (DrinkWaterItem) getValue();
    }

    @aa1
    public final EarphoneItem getEarphoneItem() {
        return (EarphoneItem) getValue();
    }

    @aa1
    public final EBookManagerItem getEbookManagerItem() {
        return (EBookManagerItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getEcgMonitoringItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getFallManagerItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final FindWatchItem getFindWatchItem() {
        return (FindWatchItem) getValue();
    }

    @aa1
    public final FirmwareItem getFirmwareItem() {
        return (FirmwareItem) getValue();
    }

    @aa1
    public final GameSettingsItem getGameSettingsItem() {
        return (GameSettingsItem) getValue();
    }

    @aa1
    public final GameStoreItem getGameStoreItem() {
        return (GameStoreItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getGameTimeSetItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getGestureWake2Item() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getGestureWakeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getGirlCareItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final HardWareAlipayItem getHardWareAlipay() {
        return (HardWareAlipayItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getHrMonitoringItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final HrvSetItem getHrvSetItem() {
        return (HrvSetItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getHydrationReminderItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallRingItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getIncomingCallRingVibrationItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final InfoItem getInfoItem() {
        return (InfoItem) getValue();
    }

    @aa1
    public List<DslAdapterItem> getItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getInfoItem(), getEarphoneItem(), getGameStoreItem(), getClassicPairItem(), getQiblaItem(), getDialItem(), getMessagePushItem(), new SplitLine4DPItem(), getIncomingCallItem(), getAntiLostItem(), getNoDisturbItem(), getNoDisturb2Item(), getDoubleClickScreenItem(), getAlarmClockItem(), getGameTimeSetItem(), getMedicationAlarmItem(), getSedentarinessItem(), getDrinkWaterItem(), getBloodOxyGenItem(), getRelaxReminderItem(), getWashItem(), getMeasureUnitItem(), getDateFormatItem(), getTimeFormatItem(), getPressureItem(), getStandbyWatchFaceItem(), new SplitLine4DPItem(), getShockItem(), getShockSettingsItem(), getBackLightItem(), getGestureWakeItem(), getGestureWake2Item(), getWearWayItem(), getHrMonitoringItem(), getEcgMonitoringItem(), getTempMonitoringItem(), getMusicControlItem(), getAppStoreItem(), getAudioBookLearnItem(), getLearnCardItem(), getGameSettingsItem(), getFindWatchItem(), getSmsQuickReplyItem(), new SplitLine4DPItem(), getScheduleItem(), getRecordingItem(), getGirlCareItem(), getSosManagerItem(), getMemoryManagerItem(), getRemoteCameraItem(), getLanguageItem(), getTouchSetItem(), getFirmwareItem(), getAGPSUpgradeItem(), getSyncContactItem(), getMacQrcodeItem(), getStockMarketItem(), getWorldClockItem(), getLogoFileItem(), getWatchPasswordItem(), getPowerSaveModeItem(), getStandbySetItem(), getAlipaySetItem(), getWechatPaySetItem(), getHardWareAlipay(), getNavigationItem(), getVoiceItem(), getDialogueTranslation(), getSimultaneousTranslation(), getAiNote(), getMusicManagerItem(), getOfflineMapsItem(), getEbookManagerItem(), getIncomingCallRingItem(), getNfcGuideItem(), getNotificationLightScreenItem(), getIncomingCallRingVibrationItem(), getResetItem(), new SplitLine4DPItem(), getNucleicAcidCodeItem(), getWechatVerificationItem(), getMyCardCodeItem(), getMyCardCode2Item(), getReceiptCodeItem(), getReceiptCode2Item(), getLanguageUpdateItem(), getUnpairItem()});
    }

    @aa1
    public final LanguageItem getLanguageItem() {
        return (LanguageItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getLanguageUpdateItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final LearnCardItem getLearnCardItem() {
        return (LearnCardItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getLogoFileItem() {
        return (BaseDeviceItem) getValue();
    }

    @tb1
    public final c72 getMAGpsPopup() {
        return this.mAGpsPopup;
    }

    @tb1
    public final ml1 getMConfirmPopup() {
        return this.mConfirmPopup;
    }

    @tb1
    public final go0 getMOTAMessagePopup() {
        return this.mOTAMessagePopup;
    }

    @tb1
    public final m04 getMSelectPairPopup() {
        return this.mSelectPairPopup;
    }

    @tb1
    public final ExtraPackageData[] getMServerLanguageList() {
        return this.mServerLanguageList;
    }

    @tb1
    public go0 getMUnbindPopup() {
        return this.mUnbindPopup;
    }

    @aa1
    public final BaseDeviceItem getMacQrcodeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final MeasureUnitItem getMeasureUnitItem() {
        return (MeasureUnitItem) getValue();
    }

    @aa1
    public final MedicationAlarmItem getMedicationAlarmItem() {
        return (MedicationAlarmItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getMeetingReminderItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final MemoryManagerItem getMemoryManagerItem() {
        return (MemoryManagerItem) getValue();
    }

    @aa1
    public final MessagePushItem getMessagePushItem() {
        return (MessagePushItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getMusicControlItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final MusicManagerItem getMusicManagerItem() {
        return (MusicManagerItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getMyCardCode2Item() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getMyCardCodeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final NavigationItem getNavigationItem() {
        return (NavigationItem) getValue();
    }

    @aa1
    public final NFCGuideItem getNfcGuideItem() {
        return (NFCGuideItem) getValue();
    }

    @aa1
    public final NoDisturb2Item getNoDisturb2Item() {
        return (NoDisturb2Item) getValue();
    }

    @aa1
    public final NoDisturbItem getNoDisturbItem() {
        return (NoDisturbItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getNotificationLightScreenItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getNucleicAcidCodeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getOfflineMapsItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getPowerSaveModeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final PressureItem getPressureItem() {
        return (PressureItem) getValue();
    }

    @aa1
    public final QiblaItem getQiblaItem() {
        return (QiblaItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getReceiptCode2Item() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getReceiptCodeItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final RecordingItem getRecordingItem() {
        return (RecordingItem) getValue();
    }

    @aa1
    public final RelaxReminderItem getRelaxReminderItem() {
        return (RelaxReminderItem) getValue();
    }

    @aa1
    public final RemoteCameraItem getRemoteCameraItem() {
        return (RemoteCameraItem) getValue();
    }

    @aa1
    public final ResetItem getResetItem() {
        return (ResetItem) getValue();
    }

    @aa1
    public List<DslAdapterItem> getRingItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getInfoItem(), new SplitLine4DPItem(), getGameStoreItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getTouchSetItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem()});
    }

    public View getRootView() {
        return (View) getValue();
    }

    @aa1
    public final ScheduleItem getScheduleItem() {
        return (ScheduleItem) getValue();
    }

    @aa1
    public List<DslAdapterItem> getScreenlessBraceletItems() {
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), getHrvSetItem(), getTempMonitoringItem(), new SplitLine4DPItem(), getAlarmClockItem(), getShockLevelItem(), getActivityRecognitionItem(), getFindWatchItem(), getMeasureUnitItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem()});
    }

    @aa1
    public final SedentarinessItem getSedentarinessItem() {
        return (SedentarinessItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getShockItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final ShockLevelItem getShockLevelItem() {
        return (ShockLevelItem) getValue();
    }

    @aa1
    public final ShockSettingsItem getShockSettingsItem() {
        return (ShockSettingsItem) getValue();
    }

    @aa1
    public final ShutdownItem getShutdownItem() {
        return (ShutdownItem) getValue();
    }

    @aa1
    public final TranslationSimultaneousItem getSimultaneousTranslation() {
        return (TranslationSimultaneousItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getSleepSet() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final SMSQuickReplyItem getSmsQuickReplyItem() {
        return (SMSQuickReplyItem) getValue();
    }

    @aa1
    public final SOSManagerItem getSosManagerItem() {
        return (SOSManagerItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getStandbySetItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final StandbyWatchFaceItem getStandbyWatchFaceItem() {
        return (StandbyWatchFaceItem) getValue();
    }

    @aa1
    public final StockMarketItem getStockMarketItem() {
        return (StockMarketItem) getValue();
    }

    @aa1
    public final SyncContactItem getSyncContactItem() {
        return (SyncContactItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getTempMonitoringItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getTimeFormatItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final TouchSetItem getTouchSetItem() {
        return (TouchSetItem) getValue();
    }

    @aa1
    public final UnpairItem getUnpairItem() {
        return (UnpairItem) getValue();
    }

    @aa1
    public final AuraVideoUseHelpItem getVideoUseHelpItem() {
        return (AuraVideoUseHelpItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getVoiceControl() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final VoiceItem getVoiceItem() {
        return (VoiceItem) getValue();
    }

    @aa1
    public final WashItem getWashItem() {
        return (WashItem) getValue();
    }

    @aa1
    public final WatchPasswordItem getWatchPasswordItem() {
        return (WatchPasswordItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getWearWayItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getWechatPaySetItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final BaseDeviceItem getWechatVerificationItem() {
        return (BaseDeviceItem) getValue();
    }

    @aa1
    public final WorldClockItem getWorldClockItem() {
        return (WorldClockItem) getValue();
    }

    @aa1
    public final XmlyAudioItem getXmlyAudioItem() {
        return (XmlyAudioItem) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getRecyclerView().setItemViewCacheSize(200);
        getRecyclerView().setItemAnimator(null);
        a01 r0 = a01.OXO1;
        if (r0.XO0O10().getBoolean(b01.iXiX011, false) == false) goto L7;
        r0.XO0O10().put(b01.iXiX011, false);
        if (BleConnector.INSTANCE.isBound() == true) goto L7;
        toAddDevice$default(this, null, null, 3, null);
    L7:
        checkAppAvailable();
    }

    public final boolean isBindDevice() {
        return this.isBindDevice;
    }

    @aa1
    public List<DslAdapterItem> isM100Items() {
        return CollectionsKt__CollectionsKt.Ii1iii0(new DslAdapterItem[]{getInfoItem(), new SplitLine4DPItem(), getHrMonitoringItem(), getBloodOxyGenItem(), getPressureItem(), new SplitLine4DPItem(), getGestureWakeItem(), getGestureWake2Item(), getBackLightItem(), getFirmwareItem(), getResetItem(), getShutdownItem(), getUnpairItem()});
    }

    public final boolean isScanQrcode() {
        return this.isScanQrcode;
    }

    public int layoutId() {
        return R.layout.fragment_rv;
    }

    public final void multiChoiceIncomingCallRing() {
        if (this.mMultiRingVibrationPopup != null) goto L5;
        jv0 r0 = new jv0(getMActivity(), R.array.ring_vibration);
        r0.O1O(R.string.incoming_call_ring_vibration);
        r0.iOO1ii1(new i01X111i(this));
        this.mMultiRingVibrationPopup = r0;
    L5:
        jv0 r1 = this.mMultiRingVibrationPopup;
        if (r1 == null) goto L15;
        BleRingVibrationSettings r2 = (BleRingVibrationSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RING_VIBRATION_SET, BleRingVibrationSettings.class, null, null, 12, null);
        LinkedHashSet r3 = new LinkedHashSet();
        if (r2.getMVibration() != 1) goto L11;
        r3.add(0);
    L11:
        if (r2.getMRing() != 1) goto L13;
        r3.add(1);
    L13:
        r1.IXXOO(r3);
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r1.I1XOi1(r4);
        return;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r7, int r8, @tb1 Intent r9) {
        super.onActivityResult(r7, r8, r9);
        i1O0OXO1O r10 = i1O0OXO1O.OXO1;
        r10.OXO1("device -> onActivityResult: " + r8 + ", " + r7);
        if (r7 == 7) goto L6;
        if (r7 != 2) goto L13;
        if (r8 == 0) goto L6;
    L13:
        if (r8 != (-1)) goto L32;
        if (r7 == 1) goto L30;
        if (r7 == 2) goto L25;
        if (r7 == 3) goto L25;
        if (r7 == 5) goto L22;
        if (r7 == 7) goto L30;
        return;
    L22:
        showPairTypePop();
        return;
    L25:
        if (i72.OXO1.Ii0i() == false) goto L28;
        q62.OXO1.iI1XiXiII(getMActivity());
        return;
    L28:
        new Handler().postDelayed(new iIX0iX(this), 200);
        return;
    L30:
        this.isBindDevice = false;
        r10.OXO1("device -> onActivityResult: onCodePairChange");
        onCodePairChange(new Object());
        return;
    L32:
        return;
    L6:
        if (r8 == (-1)) goto L8;
        boolean r5 = true;
    L9:
        this.isTipAppGuideActivity = r5;
        if (i72.OXO1.Ii0i() == false) goto L13;
        q62.OXO1.iI1XiXiII(getMActivity());
        return;
    L8:
        r5 = false;
        goto L9
    }

    @sf5(tag = I01XX0.XXO)
    public final void onCodePairChange(@aa1 Object r7) {
        Intrinsics.X0O(r7, "data");
        i1O0OXO1O.OXO1.OXO1("onCodePairChange isScanQrcode=" + this.isScanQrcode);
        int r8 = 0;
        this.isScanQrcode = false;
        int r2 = 2;
        DefaultConstructorMarker r3 = null;
        if (i72.OXO1.I0iOXO() == false) goto L11;
        if (this.isTipAppGuideActivity == false) goto L9;
        LogUtils.i(new Object[]{"BaseAppGuideActivity toForResult 2"});
        if (AppGuideActivity.Companion.XIi00iiXO() == false) goto L14;
        FragmentActivity r4 = getActivity();
        Intrinsics.XXI(r4);
        Intent r0 = new Intent(r4, AppGuideActivity.class);
        r0.setFlags(603979776);
        startActivityForResult(r0, 2);
    L14:
        RequestCommonMethod.INSTANCE.updateDeviceInfo(new AnonymousClass3());
        DeviceInfoChecker.OXO1.I1();
        updatePairState$default(this, false, 1, null);
        return;
    L9:
        this.isTipAppGuideActivity = true;
        goto L14
    L11:
        if (this.mBindDeviceRemindPopup != null) goto L13;
        go0 r1 = new go0(getMActivity(), r8, r2, r3);
        r1.O1O(R.string.use_reminder);
        r1.iX(Integer.valueOf(R.string.android_bind_remind));
        r1.I0iXXO(false);
        go0.X11iII1O1(r1, null, null, 2, null);
        r1.X1IX(R.string.confirm, new XO000OXI(this));
        this.mBindDeviceRemindPopup = r1;
    L13:
        new Handler().postDelayed(new IX00I(this), 2000);
        goto L14
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        showList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean r4) {
        super.onMultiWindowModeChanged(r4);
        i1O0OXO1O.OXO1.OXO1("test onMultiWindowModeChanged " + r4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.lastClickTime = 0;
    }

    @sf5(tag = I01XX0.XX1Oi)
    public final void onRebind(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
        toAddDevice$default(this, null, null, 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.lastClickTime = 0;
        if (this.isBindDevice == false) goto L6;
        this.isBindDevice = false;
        updatePairState$default(this, false, 1, null);
        return;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void scanQrcode() {
        ta2.OXO1.IO(getMActivity(), false, new i1OX1XI(this));
    }

    public final void setBindDevice(boolean r1) {
        this.isBindDevice = r1;
    }

    public final void setMAGpsPopup(@tb1 c72 r1) {
        this.mAGpsPopup = r1;
    }

    public final void setMConfirmPopup(@tb1 ml1 r1) {
        this.mConfirmPopup = r1;
    }

    public final void setMOTAMessagePopup(@tb1 go0 r1) {
        this.mOTAMessagePopup = r1;
    }

    public final void setMSelectPairPopup(@tb1 m04 r1) {
        this.mSelectPairPopup = r1;
    }

    public final void setMServerLanguageList(@tb1 ExtraPackageData[] r1) {
        this.mServerLanguageList = r1;
    }

    public void setMUnbindPopup(@tb1 go0 r1) {
        this.mUnbindPopup = r1;
    }

    public final void setScanQrcode(boolean r1) {
        this.isScanQrcode = r1;
    }

    @sf5(tag = I01XX0.O0O)
    public final void showDeviceUnbindPopup(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        i1O0OXO1O.OXO1.OXO1("showDeviceUnbindPopup");
        go0 r6 = new go0(getMActivity(), 0, 2, null);
        r6.I0iXXO(false);
        r6.O1O(R.string.device_unbind_tip);
        go0.X11iII1O1(r6, null, null, 2, null);
        r6.X1IX(R.string.confirm, new XX1O0Iii());
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
    }

    public final void showList() {
        q62 r0 = q62.OXO1;
        if (r0.X0100I() == false) goto L6;
        List<DslAdapterItem> r1 = getRingItems();
    L15:
        this.showList = r1;
        renderAdapter(new i0IXiOXOX(this));
        return;
    L6:
        if (r0.I0i1OXiI() == false) goto L9;
        r1 = getBCItems();
        goto L15
    L9:
        if (r0.XI1OX0IO() == false) goto L12;
        r1 = getScreenlessBraceletItems();
        goto L15
    L12:
        if (r0.IIO11() == false) goto L14;
        r1 = isM100Items();
        goto L15
    L14:
        r1 = getItems();
        goto L15
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public void showPairTypePop() {
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == true) goto L7;
        hr1.XXIIO1i11(hr1.OXO1, getMActivity(), false, new Ii00I10O0(this), 2, null);
        return;
    L7:
        if (Build.VERSION.SDK_INT < 31) goto L13;
        hr1 r0 = hr1.OXO1;
        if (r0.i11I(getMActivity()) == true) goto L13;
        r0.OX(getMActivity(), new XOOXO00Ii(this));
        return;
    L13:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L24;
        X1OOO.XiOIO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 5, 0, 4, null);     // Catch: Exception -> L18
        return;
    L18:
        e = move-exception;
        ToastUtils.showLong("Please turn on bluetooth", new Object[0]);
        i1O0OXO1O.OXO1.XIi00iiXO("requestEnableBluetooth -> " + e.getMessage());
        return;
    L24:
        if (UtilsKt.X1() == true) goto L28;
        startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return;
    L28:
        if (this.mSelectPairPopup != null) goto L30;
        final m04 r1 = new m04(getMActivity());
        r1.i010I(new O1IOXIXX(this, r1));
        r1.iX(new I1XXIIiO0(this));
        this.mSelectPairPopup = r1;
    L30:
        m04 r2 = this.mSelectPairPopup;
        if (r2 == null) goto L37;
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r2.I1XOi1(r3);
        return;
    }

    public final void singleChoiceIncomingCallRing() {
        if (this.mRingVibrationPopup != null) goto L5;
        int r3 = R.array.ring_vibration_s;
        int r4 = 0;
        dj4 r1 = new dj4(getMActivity(), r3, r4, 4, null);
        r1.iX(R.string.incoming_call_ring_vibration);
        r1.i010I(new i1iI1I1(this));
        this.mRingVibrationPopup = r1;
    L5:
        dj4 r0 = this.mRingVibrationPopup;
        if (r0 == null) goto L25;
        BleRingVibrationSettings r2 = (BleRingVibrationSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RING_VIBRATION_SET, BleRingVibrationSettings.class, null, null, 12, null);
        int r5 = 1;
        if (r2.getMVibration() != 1) goto L13;
        if (r2.getMRing() != 1) goto L13;
        r5 = 3;
    L23:
        r0.II1Xi0(r5);
        View r6 = getRootView();
        Intrinsics.O10IXXX0X(r6, "<get-rootView>(...)");
        r0.I1XOi1(r6);
        return;
    L13:
        if (r2.getMVibration() != 1) goto L18;
        if (r2.getMRing() != 0) goto L18;
        r5 = 2;
    L18:
        if (r2.getMVibration() == 0) goto L20;
    L22:
        r5 = 0;
        goto L23
    L20:
        if (r2.getMRing() != 1) goto L22;
    }

    public final void toAddDevice(@tb1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "mac");
        if (TextUtils.isEmpty(r4) == false) goto L6;
        this.isScanQrcode = false;
        this.isBindDevice = true;
        FragmentActivity r5 = getActivity();
        Intrinsics.XXI(r5);
        startActivityForResult(new Intent(r5, AddDeviceActivity.class), 1);
        return;
    L6:
        this.isScanQrcode = true;
        conntectDevice(r3, r4);
    }

    public void twoPopup(boolean r4) {
        go0 r0 = this.mOTAMessagePopup;
        if (r0 == null) goto L8;
        if (r0 == null) goto L8;
        if (r0.isShowing() != true) goto L8;
        return;
    L8:
        DeviceInfoChecker.I0IIOi(DeviceInfoChecker.OXO1, new I0iXXO(r4, this), null, 2, null);
    }

    @sf5(tag = I01XX0.iXiX011)
    public final void updatePairState(boolean r4) {
        i1O0OXO1O.OXO1.OXO1("updatePairState " + r4);
        showList();
        this.mBacklightPopup = null;
    }

    public void whenUnbind() {
        I01XX0.OXO1(I01XX0.X100O, Boolean.TRUE);
    }
}
