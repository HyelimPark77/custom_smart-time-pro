.class public final Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final btRemove$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final exerciseL1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final exerciseL2Amf$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final exerciseL2Easy$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final exerciseL3$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivExerciseBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemovePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final syncRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final syncTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvExerciseDesc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i01iIXOX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i01iIXOX1;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXI0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXI0I;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0X1iII;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0X1iII;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX0XO1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX0XO1OI;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->btRemove$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O01XiX010;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O01XiX010;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->tvExerciseDesc$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOXXOXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOXXOXI;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->ivExerciseBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi1IOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi1IOO;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiXO1O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiXO1O1i;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Easy$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXO0XXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXO0XXI;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Amf$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XII001;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XII001;-><init>(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL3$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->ivExerciseBg_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Amf_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->btRemove_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->removeClick$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Easy_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncTv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->tvExerciseDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL1_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL3_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final btRemove_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0187

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final exerciseL1_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0384

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final exerciseL2Amf_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0385

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final exerciseL2Easy_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0386

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final exerciseL3_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0387

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final getBtRemove()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->btRemove$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getExerciseL1()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getExerciseL2Amf()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Amf$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getExerciseL2Easy()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL2Easy$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getExerciseL3()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->exerciseL3$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getIvExerciseBg()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->ivExerciseBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getRootView()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getSyncRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSyncTv()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvExerciseDesc()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->tvExerciseDesc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->syncRl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final ivExerciseBg_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0604

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final removeClick$lambda$0$0()Z
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Remove"

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final showContent()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getSyncRl()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getBtRemove()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x7b62c127

    const/4 v4, 0x0

    if-eq v2, v3, :cond_6

    const/16 v3, 0x965

    if-eq v2, v3, :cond_4

    const/16 v3, 0x967

    if-eq v2, v3, :cond_2

    const v3, 0xf06fb3b

    if-eq v2, v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v2, "L2_EASY"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getTvExerciseDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140d7b

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getIvExerciseBg()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v2, 0x7f08141d

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL1()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Easy()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Amf()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL3()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    const-string v2, "L3"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getTvExerciseDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140d7e

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getIvExerciseBg()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v2, 0x7f08141f

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL1()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Easy()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Amf()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL3()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_4
    const-string v2, "L1"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getTvExerciseDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140d79

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getIvExerciseBg()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v2, 0x7f08141b

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL1()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Easy()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Amf()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL3()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_6
    const-string v2, "L2_MAF"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getTvExerciseDesc()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140d7c

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getIvExerciseBg()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v2, 0x7f08141e

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL1()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Easy()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL2Amf()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getExerciseL3()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_8
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final syncRl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0b53

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final syncTv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0b54

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvExerciseDesc_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0c06

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
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
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140c60

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f08139e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->showContent()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d009c

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
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getSyncRl()Landroid/widget/RelativeLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getSyncTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const-string v1, "\u540c\u6b65\u6210\u529f"

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getSyncTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const-string v1, "\u540c\u6b65\u5931\u8d25"

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getSyncTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const-string v1, "\u8bbe\u5907\u672a\u8fde\u63a5"

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getBtRemove()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x7b62c127

    if-eq v1, v2, :cond_6

    const/16 v2, 0x965

    if-eq v1, v2, :cond_4

    const/16 v2, 0x967

    if-eq v1, v2, :cond_2

    const v2, 0xf06fb3b

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "L2_EASY"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "\u540c\u6b65L2 Easy\u953b\u70bc\u6a21\u5f0f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string v1, "L3"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "\u540c\u6b65L3\u953b\u70bc\u6a21\u5f0f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    const-string v1, "L1"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const-string p1, "\u540c\u6b65L1\u953b\u70bc\u6a21\u5f0f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_6
    const-string v1, "L2_MAF"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const-string p1, "\u540c\u6b65L2 MAF\u953b\u70bc\u6a21\u5f0f"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    :goto_0
    return-void
.end method

.method public final removeClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->mRemovePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f14118c

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi101;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/Oi101;-><init>()V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->mRemovePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->mRemovePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingCommonSetActivity;->getRootView()Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method
