package com.sma.smartv3.biz.fitness_site.google;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
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
    public final i00OIXiO XIi00iiXO = I0IIOi.OXO1(IXOX0Xiii.m712iO().plus(ng5.m2716iO(null, 1, null)));

    @tb1
    public ExerciseSessionViewModel XO0O10;

    @tb1
    public VitalSignsViewModel XOO0ii0;

    /* JADX INFO: renamed from: iO */
    @tb1
    public HealthConnectManager f50933iO;

    public GoogleHealth(@tb1 AppCompatActivity appCompatActivity) {
        this.OXO1 = appCompatActivity;
    }

    @tb1
    public final XiOIO I0IIOi() {
        return this.OIi0;
    }

    public final void I0iXXO() {
    }

    /* JADX INFO: renamed from: IO */
    public final void m38122IO() {
        if (ad6.m1464iO()) {
            AppCompatActivity appCompatActivity = this.OXO1;
            Intrinsics.XXI(appCompatActivity);
            this.f50933iO = new HealthConnectManager(appCompatActivity);
            SmaHealthConnectModel.HealthConnectModelFactory healthConnectModelFactory = new SmaHealthConnectModel.HealthConnectModelFactory(this.OXO1);
            AppCompatActivity appCompatActivity2 = this.OXO1;
            Intrinsics.XXI(appCompatActivity2);
            this.I0IIOi = (SmaHealthConnectModel) new ViewModelProvider(appCompatActivity2, healthConnectModelFactory).get(SmaHealthConnectModel.class);
            HealthConnectManager healthConnectManager = this.f50933iO;
            Intrinsics.XXI(healthConnectManager);
            ExerciseSessionViewModelFactory exerciseSessionViewModelFactory = new ExerciseSessionViewModelFactory(healthConnectManager);
            AppCompatActivity appCompatActivity3 = this.OXO1;
            Intrinsics.XXI(appCompatActivity3);
            this.XO0O10 = (ExerciseSessionViewModel) new ViewModelProvider(appCompatActivity3, exerciseSessionViewModelFactory).get(ExerciseSessionViewModel.class);
            HealthConnectManager healthConnectManager2 = this.f50933iO;
            Intrinsics.XXI(healthConnectManager2);
            SleepSessionViewModelFactory sleepSessionViewModelFactory = new SleepSessionViewModelFactory(healthConnectManager2);
            AppCompatActivity appCompatActivity4 = this.OXO1;
            Intrinsics.XXI(appCompatActivity4);
            this.O00 = (SleepSessionViewModel) new ViewModelProvider(appCompatActivity4, sleepSessionViewModelFactory).get(SleepSessionViewModel.class);
            HealthConnectManager healthConnectManager3 = this.f50933iO;
            Intrinsics.XXI(healthConnectManager3);
            InputReadingsViewModelFactory inputReadingsViewModelFactory = new InputReadingsViewModelFactory(healthConnectManager3);
            AppCompatActivity appCompatActivity5 = this.OXO1;
            Intrinsics.XXI(appCompatActivity5);
            this.IiI10X = (InputReadingsViewModel) new ViewModelProvider(appCompatActivity5, inputReadingsViewModelFactory).get(InputReadingsViewModel.class);
            HealthConnectManager healthConnectManager4 = this.f50933iO;
            Intrinsics.XXI(healthConnectManager4);
            VitalSignsViewModelFactory vitalSignsViewModelFactory = new VitalSignsViewModelFactory(healthConnectManager4);
            AppCompatActivity appCompatActivity6 = this.OXO1;
            Intrinsics.XXI(appCompatActivity6);
            this.XOO0ii0 = (VitalSignsViewModel) new ViewModelProvider(appCompatActivity6, vitalSignsViewModelFactory).get(VitalSignsViewModel.class);
        }
    }

    public final void OIX0iXi() {
        i1O0OXO1O.OXO1.OXO1("DataWorker GoogleHealth postHealthConnectData");
        if (ad6.m1464iO()) {
            XiOIO xiOIO = this.OIi0;
            if (xiOIO == null || !xiOIO.isActive()) {
                this.OIi0 = XX01Oi.IiI10X(this.XIi00iiXO, null, null, new GoogleHealth$postHealthConnectData$1(this, null), 3, null);
            }
        }
    }

    public final void OIi0() {
        m38122IO();
    }

    public final void X1ii(@tb1 XiOIO xiOIO) {
        this.OIi0 = xiOIO;
    }

    @tb1
    public final AppCompatActivity XOO0ii0() {
        return this.OXO1;
    }

    public final void XXI(@tb1 AppCompatActivity appCompatActivity) {
        this.OXO1 = appCompatActivity;
    }
}
