.class public final Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public I0IIOi:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public IiI10X:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public O00:Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OIi0:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OXO1:Landroidx/appcompat/app/AppCompatActivity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XOO0ii0:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iO:Lcom/example/health/data/HealthConnectManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 2
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/ng5;->iO(Lkotlinx/coroutines/XiOIO;ILjava/lang/Object;)Lkotlinx/coroutines/O00;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XOO0ii0:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->O00:Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    return-object p0
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XO0O10:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    return-object p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IiI10X:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->I0IIOi:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()Lkotlinx/coroutines/XiOIO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIi0:Lkotlinx/coroutines/XiOIO;

    return-object v0
.end method

.method public final I0iXXO()V
    .locals 0

    return-void
.end method

.method public final IO()V
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ad6;->iO()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/example/health/data/HealthConnectManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/example/health/data/HealthConnectManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$HealthConnectModelFactory;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$HealthConnectModelFactory;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->I0IIOi:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    new-instance v0, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModelFactory;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XO0O10:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    new-instance v0, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModelFactory;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->O00:Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    new-instance v0, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModelFactory;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IiI10X:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    new-instance v0, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModelFactory;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v0, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XOO0ii0:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    :cond_0
    return-void
.end method

.method public final OIX0iXi()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "DataWorker GoogleHealth postHealthConnectData"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ad6;->iO()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIi0:Lkotlinx/coroutines/XiOIO;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkotlinx/coroutines/XiOIO;->isActive()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIi0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final OIi0()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IO()V

    return-void
.end method

.method public final X1ii(Lkotlinx/coroutines/XiOIO;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/XiOIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIi0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XOO0ii0()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    return-object v0
.end method

.method public final XXI(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 0
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1:Landroidx/appcompat/app/AppCompatActivity;

    return-void
.end method
