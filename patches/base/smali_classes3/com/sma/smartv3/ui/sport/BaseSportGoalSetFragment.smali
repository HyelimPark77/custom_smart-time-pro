.class public abstract Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# instance fields
.field private final customerGoalBt$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distanceItemData:Ljava/util/HashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final goals:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nowGoalUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nowGoalValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final startExerciseBt$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xii101;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xii101;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1XiiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1XiiO;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X11XIXIi0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X11XIXIi0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->customerGoalBt$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX00iOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IX00iOI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->startExerciseBt$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->distanceItemData:Ljava/util/HashMap;

    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->goals:[I

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->customerGoalBt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->startExerciseBt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILandroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILandroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final customerGoalBt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02c5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->toCustomerGoal()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->startExercise()V

    return-void
.end method

.method private static final nowGoalUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final nowGoalValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08a3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0IX1X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0IX1X1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOO0;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiOOiiX1;

    invoke-direct {v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/iiOOiiX1;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;I)V

    const v2, 0x7f0d0f1f

    invoke-static {p1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0Ii0iXii;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I0Ii0iXii;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX1OX1;

    invoke-direct {v0, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/IX1OX1;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;I)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a055d

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->distanceItemData:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    :cond_1
    const p0, 0x7f0a09ae

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, 0x7f08084d

    goto :goto_0

    :cond_2
    const p1, 0x7f080848

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;ILandroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p3, v2, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->updateGoalValue(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final startExerciseBt_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b19

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method


# virtual methods
.method public final getCustomerGoalBt()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->customerGoalBt$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getDistanceItemData()Ljava/util/HashMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->distanceItemData:Ljava/util/HashMap;

    return-object v0
.end method

.method public final getGoals()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->goals:[I

    return-object v0
.end method

.method public final getNowGoalUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getNowGoalValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->nowGoalValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getStartExerciseBt()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->startExerciseBt$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->setGoalValueItem()V

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getCustomerGoalBt()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X00i1XI;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/X00i1XI;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OXOOX;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OXOOX;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->setInfo()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e8d

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii0XXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii0XXi;-><init>(Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract setGoalValueItem()V
.end method

.method public abstract setInfo()V
.end method

.method public abstract startExercise()V
.end method

.method public abstract toCustomerGoal()V
.end method

.method public abstract updateGoalValue(I)V
.end method
