.class public final Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;
.super Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;
.source "SourceFile"


# instance fields
.field private final healthBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthBtnView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthQuestions$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthTipLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/u95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/v95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/w95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/x95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/x95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z95;-><init>(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtnView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtnView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getHealthBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getHealthBtnView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtnView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getHealthLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getHealthTipLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private static final healthBtnView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0431

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01c6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05a6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c54

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a097f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c55

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-gtz v4, :cond_2

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    move v6, v1

    goto :goto_5

    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const-string v6, "iterator(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v6, v1

    move v7, v6

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    const-string v9, "next(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v8

    if-gt v7, v8, :cond_6

    if-nez v7, :cond_5

    if-eqz v3, :cond_5

    if-lt v8, v3, :cond_5

    sub-int v7, v8, v3

    goto :goto_4

    :cond_5
    sub-int v7, v8, v7

    :goto_4
    add-int/2addr v6, v7

    :cond_6
    move v7, v8

    goto :goto_3

    :cond_7
    invoke-static {v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v3

    :goto_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getValues()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v7, v2

    int-to-float v6, v6

    invoke-direct {v5, v7, v6}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    move v3, v2

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v4

    if-gt v3, v4, :cond_9

    sub-int v3, v4, v3

    add-int/2addr v2, v3

    :cond_9
    move v3, v4

    goto :goto_6

    :cond_a
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v0

    if-nez v0, :cond_b

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_b
    sget-object v2, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v6

    const-string v0, "<get-healthBtn>(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v7

    const-string v11, "<get-healthTv>(...)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthTipLayout()Landroid/widget/LinearLayout;

    move-result-object v8

    const-string v9, "<get-healthTipLayout>(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v9

    const-string v10, "<get-healthQuestions>(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v10

    invoke-virtual/range {v2 .. v10}, Lcom/sma/smartv3/util/HeathReportsUtils;->X1(Ljava/lang/String;JLandroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/app/Activity;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->I0i0()Z

    move-result v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthBtnView()Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->OIIOI()Z

    move-result v5

    if-eqz v5, :cond_c

    const v4, 0x7f1412c1

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "getString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->I0i0()Z

    move-result v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthBtnView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    move v12, v3

    goto :goto_7

    :cond_c
    const-string v1, ""

    move v12, v4

    move-object v4, v1

    :goto_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthLayout()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v1, "<get-healthLayout>(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v11

    move-object v11, v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v9

    invoke-virtual/range {v2 .. v12}, Lcom/sma/smartv3/util/HeathReportsUtils;->iOiXi11II(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    :cond_d
    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08138e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1412c6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f141368

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTotalUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140383

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f060729

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06072b

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->OI1IiOO1i(II)V

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Step day Data"

    return-object v0
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
