.class public abstract Lcom/sma/smartv3/ui/sport/BaseSportFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseSportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n19#2:149\n15#2:150\n19#2:151\n15#2:152\n1869#3,2:153\n78#4,3:155\n81#4,5:159\n99#4,7:164\n106#4,3:172\n79#4,7:175\n109#4:182\n78#4,3:183\n81#4,5:187\n99#4,7:192\n106#4,3:200\n79#4,7:203\n109#4:210\n1#5:158\n1#5:171\n1#5:186\n1#5:199\n*S KotlinDebug\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n*L\n53#1:149\n53#1:150\n124#1:151\n124#1:152\n126#1:153,2\n64#1:155,3\n64#1:159,5\n81#1:164,7\n81#1:172,3\n81#1:175,7\n81#1:182\n85#1:183,3\n85#1:187,5\n145#1:192,7\n145#1:200,3\n145#1:203,7\n145#1:210\n64#1:158\n81#1:171\n85#1:186\n145#1:199\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseSportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n19#2:149\n15#2:150\n19#2:151\n15#2:152\n1869#3,2:153\n78#4,3:155\n81#4,5:159\n99#4,7:164\n106#4,3:172\n79#4,7:175\n109#4:182\n78#4,3:183\n81#4,5:187\n99#4,7:192\n106#4,3:200\n79#4,7:203\n109#4:210\n1#5:158\n1#5:171\n1#5:186\n1#5:199\n*S KotlinDebug\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n*L\n53#1:149\n53#1:150\n124#1:151\n124#1:152\n126#1:153,2\n64#1:155,3\n64#1:159,5\n81#1:164,7\n81#1:172,3\n81#1:175,7\n81#1:182\n85#1:183,3\n85#1:187,5\n145#1:192,7\n145#1:200,3\n145#1:203,7\n145#1:210\n64#1:158\n81#1:171\n85#1:186\n145#1:199\n*E\n"
    }
.end annotation


# instance fields
.field private final cumulativeRunningLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distanceNow$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final gpsLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivGpsSignal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSportMode:I

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final root_view$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportGoalSet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportSet$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportStart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i10Xi0i10;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i10Xi0i10;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->root_view$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIO0X1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIO0X1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivGpsSignal$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1XXOIiI0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O1XXOIiI0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceNow$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXIXX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IXIXX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIiOOIXI0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XIiOOIXI0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->gpsLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiI0XIi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OiI0XIi;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->cumulativeRunningLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXii01X0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IXii01X0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportSet$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi1II;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/Oi1II;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportStart$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I100IIO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I100IIO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportGoalSet$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOOiI1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iOOiI1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivBg$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI1i1i0O;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OI1i1i0O;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mWorkoutDao$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->initView$lambda$3(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->startSport$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->cumulativeRunningLl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->onStartSport$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->root_view_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivBg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->gpsLl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceNow_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivGpsSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportStart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportGoalSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final cumulativeRunningLl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02bf

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final distanceNow_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a031e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final distanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method private static final gpsLl_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0421

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/SportSettingActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startSport"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->onStartSport()V

    return-void

    :cond_0
    const p0, 0x7f140217

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->onStartSport()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 3

    iget p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/sport/SportGoalSetActivity;

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/status/SportRecordsActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final ivBg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0616

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final ivGpsSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0605

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p0, 0x1

    return p0
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

.method private final onStartSport()V
    .locals 8

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->locationServerRemind()V

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->XIXO0iiO(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v5, Lcom/android/mltcode/paycertificationapi/IXXI1O1;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/IXXI1O1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/android/mltcode/paycertificationapi/hr1;->X0i1O(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->startSport()V

    return-void
.end method

.method private static final onStartSport$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->startSport()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final root_view_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportGoalSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a95

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final sportSet_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0adb

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final sportStart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)Landroid/widget/ImageButton;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0add

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    return-object p0
.end method

.method private final startSport()V
    .locals 4

    const-string v0, "ACTIVITY_RECOGNITION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string v1, "permission(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f14006a

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140069

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iI0000X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/iI0000X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final startSport$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportFragment;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/sport/SportOnGoingGpsActivity;

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getCumulativeRunningLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->cumulativeRunningLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getDistanceNow()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceNow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->distanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getGpsLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->gpsLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getIvBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getIvGpsSignal()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->ivGpsSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMSportMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    return v0
.end method

.method public final getRoot_view()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->root_view$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getSportGoalSet()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportGoalSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getSportSet()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportSet$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getSportStart()Landroid/widget/ImageButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->sportStart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    return-object v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getSportSet()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO00OI0i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iO00OI0i;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getSportStart()Landroid/widget/ImageButton;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOOIXX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IOOIXX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getSportGoalSet()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO1X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IO1X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getCumulativeRunningLl()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO0XO0X0X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XO0XO0X0X;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->showDistance(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e73

    return v0
.end method

.method public final locationServerRemind()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140e2e

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiIOX00iI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IiIOX00iI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportFragment;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    const v0, 0x7f141009

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    const v1, 0x7f0a09b5

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    :cond_1
    return-void
.end method

.method public final setMSportMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    return-void
.end method

.method public final showDistance(Ljava/lang/Object;)V
    .locals 32
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "workout_change"
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "data"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->mSportMode:I

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListByMode(II)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static {v3, v1, v2, v4, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getDistanceNow()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    const/4 v3, 0x0

    cmpg-float v3, v1, v3

    if-nez v3, :cond_2

    const-string v1, "0"

    goto :goto_2

    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
