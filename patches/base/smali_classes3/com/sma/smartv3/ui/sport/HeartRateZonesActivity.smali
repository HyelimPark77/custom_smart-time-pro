.class public final Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHeartRateNullLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHeartRateZonesLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mValue1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mValue2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mValue3$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mValue4$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mValue5$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIiI10I0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiIiI10I0;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateZonesLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIO0ii1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiIO0ii1;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateNullLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiiI1I1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OiiI1I1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II0i0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/II0i0X;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0IIXI0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0IIXI0i;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiXIX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiXIX0;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIi01O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIi01O;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue3$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0Oi0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0Oi0;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue4$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiXiO10XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiXiO10XX;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue5$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateZonesLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue3_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateNullLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue2_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue1_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue5_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue4_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getMHeartRateNullLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMHeartRateNullLayout()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMHeartRateZonesLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMHeartRateZonesLayout()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMValue1(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMValue1()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMValue2(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMValue2()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMValue3(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMValue3()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMValue4(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMValue4()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMValue5(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMValue5()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMWorkoutDao(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p0

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMHeartRateNullLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateNullLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMHeartRateZonesLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mHeartRateZonesLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMValue1()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMValue2()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMValue3()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue3$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMValue4()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue4$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMValue5()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mValue5$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method private static final mHeartRateNullLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a3c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mHeartRateZonesLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a3b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mValue1_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0445

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mValue2_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0446

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mValue3_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0447

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mValue4_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0448

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mValue5_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0449

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
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
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b3

    return v0
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

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x7f140cf0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
