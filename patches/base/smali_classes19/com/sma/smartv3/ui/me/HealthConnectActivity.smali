.class public final Lcom/sma/smartv3/ui/me/HealthConnectActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/HealthConnectActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n87#2,7:247\n94#2,3:255\n70#2,7:258\n97#2:265\n1#3:254\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n*L\n137#1:247,7\n137#1:255,3\n137#1:258,7\n137#1:265\n137#1:254\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n87#2,7:247\n94#2,3:255\n70#2,7:258\n97#2:265\n1#3:254\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n*L\n137#1:247,7\n137#1:255,3\n137#1:258,7\n137#1:265\n137#1:254\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/me/HealthConnectActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DIFFERENTIAL_CHANGES:I = 0x3

.field public static final DOWNLOAD_URL:Ljava/lang/String; = "https://play.google.com/store/apps/details?id=com.google.android.apps.healthdata&pcampaignid=web_share"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final EXERCISE_SESSION:I = 0x0

.field public static final HEALTH_CONNECT:Ljava/lang/String; = "com.google.android.apps.healthdata"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INPUT_READINGS:I = 0x2

.field public static final SETTING:I = 0x4

.field public static final SLEEP_SESSION:I = 0x1

.field public static final TAG:Ljava/lang/String; = "HealthConnectActivity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VERSION:I = 0x22


# instance fields
.field private final abh_title_center$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abh_title_other_right$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final check_health_connect$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private healthConnectManager:Lcom/example/health/data/HealthConnectManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mTimer:Ljava/util/Timer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private viewModel:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private viewModelInput:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private viewModelSleep:Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->Companion:Lcom/sma/smartv3/ui/me/HealthConnectActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->mTimer:Ljava/util/Timer;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX01OiXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX01OiXi;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_center$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiI1XIX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiI1XIX1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_other_right$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0XIXO11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0XIXO11;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->check_health_connect$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_center_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->check_health_connect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_other_right_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abh_title_center_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abh_title_other_right_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getCheck_health_connect(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getCheck_health_connect()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHealthConnectManager$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/data/HealthConnectManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->viewModel:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    return-object p0
.end method

.method private static final check_health_connect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    const v0, 0x7f0a0233

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method

.method private final getAbh_title_center()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_center$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getAbh_title_other_right()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->abh_title_other_right$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getApiLevel()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method private final getCheck_health_connect()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->check_health_connect$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object v0
.end method

.method private final onLaunch(I)V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;ILkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final onPermission(I)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getApiLevel()I

    move-result v0

    const/16 v1, 0x22

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "com.google.android.apps.healthdata"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/ad6;->XIi00iiXO(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onLaunch(I)V

    return-void

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const-string v1, "https://play.google.com/store/apps/details?id=com.google.android.apps.healthdata&pcampaignid=web_share"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/ad6;->O00(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onLaunch(I)V

    :cond_2
    return-void
.end method

.method private final onTime()V
    .locals 6

    new-instance v1, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->mTimer:Ljava/util/Timer;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x3e8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method private final setCheckView()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/example/health/data/HealthConnectManager;

    invoke-direct {p1, p0}, Lcom/example/health/data/HealthConnectManager;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    new-instance p1, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModelFactory;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class p1, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->viewModel:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    new-instance p1, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModelFactory;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class p1, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->viewModelSleep:Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    new-instance p1, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModelFactory;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModelFactory;-><init>(Lcom/example/health/data/HealthConnectManager;)V

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class p1, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->viewModelInput:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getAbh_title_center()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140ca5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getAbh_title_other_right()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081345

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->setCheckView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onTime()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b2

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    if-nez p1, :cond_4

    if-nez p2, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->viewModel:Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    if-eqz p1, :cond_4

    if-eqz p3, :cond_0

    const-string p2, "result"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_2

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getCheck_health_connect()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p3

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;->getPermissions(I)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p1, v1}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;->getPermissions(I)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-ne p2, p1, :cond_3

    move v1, v3

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "HealthConnectActivity onResult"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final onCheckHealthConnect(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getCheck_health_connect()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "HealthConnectActivity onPermission"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->getCheck_health_connect()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onPermission(I)V

    return-void

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onCheckHealthConnect$1;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onCheckHealthConnect$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->mTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public final onExerciseSessions(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onPermission(I)V

    return-void
.end method

.method public final onInputChanges(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "HealthConnectActivity onInputChanges"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onPermission(I)V

    return-void
.end method

.method public final onInputReadings(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "HealthConnectActivity onInputReadings"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onPermission(I)V

    return-void
.end method

.method public final onSleepSessions(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onPermission(I)V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTitleRightOtherClick$1;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTitleRightOtherClick$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
