.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;
.super Lcom/sma/smartv3/ui/device/dial/AIGCFragment;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnGen$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemModle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurModle:I

.field private mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private openAIDeductionPoints:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;-><init>()V

    const-string v0, "PayAIGCFragment"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/do1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/do1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->itemModle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/go1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->btnGen$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/AIManager;->XXI(Lcom/sma/smartv3/biz/AIManager;ZILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$5(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->itemModle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getDeductionConfig$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$3(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->btnGen_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private static final btnGen_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01cd

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final dismissLoadPopup()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eo1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getBtnGen()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->btnGen$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getDeductionConfig()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fo1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/fo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->OIX0iXi(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getDeductionConfig$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/DeductionConfig;->getOpenAI_ImgPoints()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->setBtnGenText()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getItemModle()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->itemModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->onSetModel$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$4(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->initView$lambda$6(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->onSetStyle(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->onSetModel(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->onSearch(Landroid/view/View;)V

    return-void

    :cond_0
    const p0, 0x7f14109c

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->onGen(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$4(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p0

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    return p3
.end method

.method private static final initView$lambda$5(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->onAgain(Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$6(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->onNextStep()V

    return-void
.end method

.method private static final itemModle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05c7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onSetModel$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;I)Z
    .locals 2

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "AI_MODEL"

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getItemModle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f030000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    aget-object v0, v0, v1

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "CHANGE_AI_MODEL"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->setBtnGenText()V

    const/4 p0, 0x1

    return p0
.end method

.method private final showLoadPopup(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->iOOX010X(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setMLoadingPopup(Lcom/android/mltcode/paycertificationapi/uq;)V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    return-void
.end method

.method public static synthetic showLoadPopup$default(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x7f141515

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->showLoadPopup(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getOpenAIDeductionPoints()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    return v0
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
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getItemStyle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getMCurStyle()I

    move-result v2

    aget-object v1, v1, v2

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getItemStyle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jo1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getItemStyle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->O0()Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getItemModle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->I0O()Z

    move-result v1

    if-eqz v1, :cond_1

    move v4, v5

    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getItemModle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v3, 0x7f030000

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    aget-object v1, v1, v3

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getItemModle()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ko1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ko1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getBtnSearch()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lo1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getBtnGen()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mo1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getBtnGen()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/no1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/no1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getBtnAgain()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/po1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/po1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->getBtnNextStep()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qo1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qo1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getDeductionConfig()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e63

    return v0
.end method

.method public final onSetModel(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-nez p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dj4;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string p1, "requireActivity(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/high16 v2, 0x7f030000

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p1, 0x7f1410ac

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ho1;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/ho1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final setBtnGenText()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " setBtnGenText openAIDeductionPoints = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->getBtnGen()Landroid/widget/Button;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->mCurModle:I

    const v2, 0x7f140c42

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    if-eqz v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    const v3, 0x7f1410f8

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (-"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setOpenAIDeductionPoints(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;->openAIDeductionPoints:I

    return-void
.end method
