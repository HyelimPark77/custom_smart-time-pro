.class public final Lcom/sma/smartv3/ui/sport/ShareVideoActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShareVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n104#2,9:40\n113#2,3:50\n99#2,3:53\n1#3:49\n*S KotlinDebug\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n*L\n19#1:40,9\n19#1:50,3\n19#1:53,3\n19#1:49\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShareVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n104#2,9:40\n113#2,3:50\n99#2,3:53\n1#3:49\n*S KotlinDebug\n*F\n+ 1 ShareVideoActivity.kt\ncom/sma/smartv3/ui/sport/ShareVideoActivity\n*L\n19#1:40,9\n19#1:50,3\n19#1:53,3\n19#1:49\n*E\n"
    }
.end annotation


# instance fields
.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g94;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/g94;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method private static final mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkoutById(I)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    sget-object p1, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "mWorkout"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "mArg1"

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_1

    check-cast p1, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailVideoMapFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareVideoActivity;->sportDetailMapFragment:Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;

    if-nez v1, :cond_0

    const-string v1, "sportDetailMapFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    const v2, 0x7f0a0af2

    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00ff

    return v0
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

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
