.class public final Lcom/sma/smartv3/ui/sport/ShareCardActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShareCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n104#2,9:144\n113#2,3:154\n99#2,3:157\n104#2,9:160\n113#2,3:170\n99#2,3:173\n104#2,9:176\n113#2,3:186\n99#2,3:189\n104#2,9:192\n113#2,3:202\n99#2,3:205\n104#2,9:208\n113#2,3:218\n99#2,3:221\n104#2,9:224\n113#2,3:234\n99#2,3:237\n104#2,9:240\n113#2,3:250\n99#2,3:253\n1#3:153\n1#3:169\n1#3:185\n1#3:201\n1#3:217\n1#3:233\n1#3:249\n37#4,2:256\n*S KotlinDebug\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n*L\n47#1:144,9\n47#1:154,3\n47#1:157,3\n48#1:160,9\n48#1:170,3\n48#1:173,3\n49#1:176,9\n49#1:186,3\n49#1:189,3\n50#1:192,9\n50#1:202,3\n50#1:205,3\n52#1:208,9\n52#1:218,3\n52#1:221,3\n53#1:224,9\n53#1:234,3\n53#1:237,3\n54#1:240,9\n54#1:250,3\n54#1:253,3\n47#1:153\n48#1:169\n49#1:185\n50#1:201\n52#1:217\n53#1:233\n54#1:249\n114#1:256,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShareCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n104#2,9:144\n113#2,3:154\n99#2,3:157\n104#2,9:160\n113#2,3:170\n99#2,3:173\n104#2,9:176\n113#2,3:186\n99#2,3:189\n104#2,9:192\n113#2,3:202\n99#2,3:205\n104#2,9:208\n113#2,3:218\n99#2,3:221\n104#2,9:224\n113#2,3:234\n99#2,3:237\n104#2,9:240\n113#2,3:250\n99#2,3:253\n1#3:153\n1#3:169\n1#3:185\n1#3:201\n1#3:217\n1#3:233\n1#3:249\n37#4,2:256\n*S KotlinDebug\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n*L\n47#1:144,9\n47#1:154,3\n47#1:157,3\n48#1:160,9\n48#1:170,3\n48#1:173,3\n49#1:176,9\n49#1:186,3\n49#1:189,3\n50#1:192,9\n50#1:202,3\n50#1:205,3\n52#1:208,9\n52#1:218,3\n52#1:221,3\n53#1:224,9\n53#1:234,3\n53#1:237,3\n54#1:240,9\n54#1:250,3\n54#1:253,3\n47#1:153\n48#1:169\n49#1:185\n50#1:201\n52#1:217\n53#1:233\n54#1:249\n114#1:256,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isLocationEmpty:Z

.field private mDetailCaloriesCardFragment:Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

.field private mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

.field private mDetailDataCardFragment:Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

.field private mDetailMapCardFragment:Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;

.field private mDetailRouteCardFragment:Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

.field private final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r84;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/r84;-><init>(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s84;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/s84;-><init>(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/t84;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/t84;-><init>(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u84;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/u84;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mLocationDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v84;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/v84;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    return-void
.end method

.method public static synthetic I0iXXO()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method private static final mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

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

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/ShareCardActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 10
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkoutById(I)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    const-string v1, "mWorkout"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v5

    invoke-interface {p1, v3, v4, v5, v6}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    if-ge p1, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCustomizeCardFragment"

    const-class v3, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    const-string v4, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCaloriesCardFragment"

    const-class v5, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    const-string v6, "mArg3"

    const-string v7, "mArg2"

    const-string v8, "mArg0"

    if-nez p1, :cond_c

    sget-object p1, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_4
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v9, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v9, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v9}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_b

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailMapCardFragment:Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_5
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v9, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v9, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v9}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_a

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCaloriesCardFragment:Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_6
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v4, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_9

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailRouteCardFragment:Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_7
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_8

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailRouteCardFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailMapCardFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    sget-object p1, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_d
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v9, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v9, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v9}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_12

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailDataCardFragment:Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_e

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_e
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v9, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v9, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v9}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_11

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCaloriesCardFragment:Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-nez p1, :cond_f

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_f
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, v6, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_10

    check-cast p1, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    return-void

    :cond_10
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailDataCardFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initFragments()Ljava/util/List;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    const-string v2, "mDetailCustomizeCardFragment"

    const-string v3, "mDetailCaloriesCardFragment"

    const/4 v4, 0x0

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailMapCardFragment:Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;

    if-nez v1, :cond_0

    const-string v1, "mDetailMapCardFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCaloriesCardFragment:Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailRouteCardFragment:Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    if-nez v1, :cond_2

    const-string v1, "mDetailRouteCardFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    if-nez v1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v4, v1

    :goto_0
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailDataCardFragment:Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

    if-nez v1, :cond_5

    const-string v1, "mDetailDataCardFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCaloriesCardFragment:Lcom/sma/smartv3/ui/sport/DetailCaloriesCardFragment;

    if-nez v1, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_6
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    if-nez v1, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v4, v1

    :goto_1
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public initView()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SuspiciousIndentation"
        }
    .end annotation

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f14122f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    const v2, 0x7f140513

    const v3, 0x7f140274

    const-string v4, "getString(...)"

    if-nez v1, :cond_0

    const v1, 0x7f140e79

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const v1, 0x7f1411ae

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const v1, 0x7f1403b5

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060792

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00fe

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    const-string v1, "mDetailCustomizeCardFragment"

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailRouteCardFragment:Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    if-nez v0, :cond_0

    const-string v0, "mDetailRouteCardFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    invoke-virtual {v3, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    invoke-virtual {v3, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailDataCardFragment:Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;

    if-nez v0, :cond_4

    const-string v0, "mDetailDataCardFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v3, v0

    :goto_2
    invoke-virtual {v3, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/DetailDataCardFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-ne v0, v2, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailCustomizeCardFragment:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object v3, v0

    :goto_3
    invoke-virtual {v3, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->onActivityResult(IILandroid/content/Intent;)V

    :cond_7
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->isLocationEmpty:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShareCardActivity;->mDetailRouteCardFragment:Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;

    if-nez p1, :cond_0

    const-string p1, "mDetailRouteCardFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/DetailRouteCardFragment;->getSnapShot()V

    :cond_1
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
