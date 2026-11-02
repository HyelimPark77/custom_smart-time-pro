.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/appintro/SlideSelectionListener;


# instance fields
.field private final mDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLevelTv$delegate:Lkotlin/Lazy;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/es1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/es1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mLevelTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fs1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fs1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mDuration$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gs1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gs1;-><init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mTipTitle$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mLevelTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final mDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00e1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mLevelTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00e2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;)Landroid/widget/TextView;
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
.method public final getMDuration()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMLevelTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mLevelTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMTipTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->mTipTitle$delegate:Lkotlin/Lazy;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->getMTipTitle()Landroid/widget/TextView;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->getMTipTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0176

    return v0
.end method

.method public onSlideDeselected()V
    .locals 0

    return-void
.end method

.method public onSlideSelected()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->getMLevelTv()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getLevel()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    const v2, 0x7f140300

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const v2, 0x7f1402ff

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const v2, 0x7f140301

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const v2, 0x7f140303

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    const v2, 0x7f140302

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalActivityConfirmFragment;->getMDuration()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getWeeklyTargetNumber()I

    move-result v1

    const v2, 0x7f1414f1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
