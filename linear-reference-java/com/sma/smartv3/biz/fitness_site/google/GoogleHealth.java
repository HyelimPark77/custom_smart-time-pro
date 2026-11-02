package com.sma.smartv3.biz.fitness_site.google;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ad6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.tb1;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModelFactory;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModel;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModelFactory;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModel;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModelFactory;
import com.example.health.presentation.screen.vitalsigns.VitalSignsViewModel;
import com.example.health.presentation.screen.vitalsigns.VitalSignsViewModelFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
public final class GoogleHealth {

    @tb1
    public SmaHealthConnectModel I0IIOi;

    @tb1
    public InputReadingsViewModel IiI10X;

    @tb1
    public SleepSessionViewModel O00;

    @tb1
    public XiOIO OIi0;

    @tb1
    public AppCompatActivity OXO1;

    @aa1
    public final i00OIXiO XIi00iiXO;

    @tb1
    public ExerciseSessionViewModel XO0O10;

    @tb1
    public VitalSignsViewModel XOO0ii0;

    @tb1
    public HealthConnectManager iO;

    public GoogleHealth(@tb1 AppCompatActivity r3) {
        this.OXO1 = r3;
        this.XIi00iiXO = I0IIOi.OXO1(IXOX0Xiii.iO().plus(ng5.iO(null, 1, null)));
    }

    public static final /* synthetic */ VitalSignsViewModel IiI10X(GoogleHealth r0) {
        return r0.XOO0ii0;
    }

    public static final /* synthetic */ SleepSessionViewModel O00(GoogleHealth r0) {
        return r0.O00;
    }

    public static final /* synthetic */ HealthConnectManager OXO1(GoogleHealth r0) {
        return r0.iO;
    }

    public static final /* synthetic */ ExerciseSessionViewModel XIi00iiXO(GoogleHealth r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ InputReadingsViewModel XO0O10(GoogleHealth r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ SmaHealthConnectModel iO(GoogleHealth r0) {
        return r0.I0IIOi;
    }

    @tb1
    public final XiOIO I0IIOi() {
        return this.OIi0;
    }

    public final void I0iXXO() {
    }

    public final void IO() {
        if (ad6.iO() == false) goto L6;
        AppCompatActivity r1 = this.OXO1;
        Intrinsics.XXI(r1);
        this.iO = new HealthConnectManager(r1);
        SmaHealthConnectModel.HealthConnectModelFactory r0 = new SmaHealthConnectModel.HealthConnectModelFactory(this.OXO1);
        AppCompatActivity r2 = this.OXO1;
        Intrinsics.XXI(r2);
        this.I0IIOi = (SmaHealthConnectModel) new ViewModelProvider(r2, r0).get(SmaHealthConnectModel.class);
        HealthConnectManager r3 = this.iO;
        Intrinsics.XXI(r3);
        ExerciseSessionViewModelFactory r4 = new ExerciseSessionViewModelFactory(r3);
        AppCompatActivity r5 = this.OXO1;
        Intrinsics.XXI(r5);
        this.XO0O10 = (ExerciseSessionViewModel) new ViewModelProvider(r5, r4).get(ExerciseSessionViewModel.class);
        HealthConnectManager r6 = this.iO;
        Intrinsics.XXI(r6);
        SleepSessionViewModelFactory r7 = new SleepSessionViewModelFactory(r6);
        AppCompatActivity r8 = this.OXO1;
        Intrinsics.XXI(r8);
        this.O00 = (SleepSessionViewModel) new ViewModelProvider(r8, r7).get(SleepSessionViewModel.class);
        HealthConnectManager r9 = this.iO;
        Intrinsics.XXI(r9);
        InputReadingsViewModelFactory r10 = new InputReadingsViewModelFactory(r9);
        AppCompatActivity r11 = this.OXO1;
        Intrinsics.XXI(r11);
        this.IiI10X = (InputReadingsViewModel) new ViewModelProvider(r11, r10).get(InputReadingsViewModel.class);
        HealthConnectManager r12 = this.iO;
        Intrinsics.XXI(r12);
        VitalSignsViewModelFactory r13 = new VitalSignsViewModelFactory(r12);
        AppCompatActivity r14 = this.OXO1;
        Intrinsics.XXI(r14);
        this.XOO0ii0 = (VitalSignsViewModel) new ViewModelProvider(r14, r13).get(VitalSignsViewModel.class);
        return;
    }

    public final void OIX0iXi() {
        i1O0OXO1O.OXO1.OXO1("DataWorker GoogleHealth postHealthConnectData");
        if (ad6.iO() == true) goto L5;
        return;
    L5:
        XiOIO r0 = this.OIi0;
        if (r0 != null) goto L8;
    L10:
        this.OIi0 = I100X1.O00(this.XIi00iiXO, null, null, new GoogleHealth$postHealthConnectData$1(this, null), 3, null);
        return;
    L8:
        if (r0.isActive() != true) goto L10;
    }

    public final void OIi0() {
        IO();
    }

    public final void X1ii(@tb1 XiOIO r1) {
        this.OIi0 = r1;
    }

    @tb1
    public final AppCompatActivity XOO0ii0() {
        return this.OXO1;
    }

    public final void XXI(@tb1 AppCompatActivity r1) {
        this.OXO1 = r1;
    }
}
