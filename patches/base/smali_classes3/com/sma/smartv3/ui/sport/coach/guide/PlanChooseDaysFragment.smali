.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlanChooseDaysFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n13854#2,2:107\n13940#2,3:109\n*S KotlinDebug\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n*L\n88#1:107,2\n97#1:109,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPlanChooseDaysFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n13854#2,2:107\n13940#2,3:109\n*S KotlinDebug\n*F\n+ 1 PlanChooseDaysFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment\n*L\n88#1:107,2\n97#1:109,3\n*E\n"
    }
.end annotation


# instance fields
.field private final llChoices$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mChooseActivity:[Z
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTipTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->llChoices$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mTipTitle$delegate:Lkotlin/Lazy;

    const/4 v0, 0x7

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mChooseActivity:[Z

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x0t
        0x1t
        0x1t
        0x0t
    .end array-data
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMChooseActivity$p(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)[Z
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mChooseActivity:[Z

    return-object p0
.end method

.method private final getLlChoices()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->llChoices$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->llChoices_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private static final llChoices_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a06dc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b25

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getChoicesSize()I
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mChooseActivity:[Z

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    aget-boolean v4, v0, v2

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final getMTipTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mTipTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 9

    const v0, 0x7f1414f9

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f1414f3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f1414f4

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f1414f5

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f1414f6

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x7f1414f7

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v0, 0x7f1414f8

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getLlChoices()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getLlChoices()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->iO0XiOIi([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;

    invoke-direct {v3, v0, p0, v1, v2}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment$initView$1;-><init>([Ljava/lang/String;Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;Landroid/content/Context;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getLlChoices()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v3, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f06074b

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v7, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v8, 0x7f140fe5

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x21

    invoke-virtual {v0, v7, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0172

    return v0
.end method

.method public onSlideDeselected()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PlanChooseDaysFragment;->mChooseActivity:[Z

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-boolean v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    sget-object v6, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v6

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onSlideSelected()V
    .locals 0

    return-void
.end method
