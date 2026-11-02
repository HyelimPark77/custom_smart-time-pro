.class public final Lcom/sma/smartv3/ui/me/Me2Fragment;
.super Lcom/sma/smartv3/ui/me/MainMeFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iiO11XiX;


# instance fields
.field private final meBottom2Item:Lcom/sma/smartv3/ui/me/item/MeBottom2Item;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;-><init>()V

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ui/me/item/MeBottom2Item;->setMOnClick(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/Me2Fragment;->meBottom2Item:Lcom/sma/smartv3/ui/me/item/MeBottom2Item;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/Me2Fragment;->renderAdapterMethod$lambda$0(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/Me2Fragment;->renderAdapterMethod$lambda$0$0$0(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/Me2Fragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/Me2Fragment;->renderAdapterMethod$lambda$0$0(Lcom/sma/smartv3/ui/me/Me2Fragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final renderAdapterMethod$lambda$0(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xd0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xd0;-><init>(Lcom/sma/smartv3/ui/me/Me2Fragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final renderAdapterMethod$lambda$0$0(Lcom/sma/smartv3/ui/me/Me2Fragment;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yd0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yd0;-><init>(Lcom/sma/smartv3/ui/me/Me2Fragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final renderAdapterMethod$lambda$0$0$0(Lcom/sma/smartv3/ui/me/Me2Fragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/me/item/MeAvatar2Item;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/item/MeAvatar2Item;-><init>()V

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ui/me/item/MainAvatarItem;->setMOnClick(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/sma/smartv3/ui/me/item/MeUserOrder2Item;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/item/MeUserOrder2Item;-><init>()V

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setMOnClick(Landroid/view/View$OnClickListener;)V

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;-><init>()V

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->setMOnClick(Landroid/view/View$OnClickListener;)V

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/Me2Fragment;->meBottom2Item:Lcom/sma/smartv3/ui/me/item/MeBottom2Item;

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOIi00Ii()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X11I()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->getBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->getAdBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->setBannerItem(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->getBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p1, p0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance p0, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/SplitLine4DPItem;-><init>()V

    invoke-static {p1, p0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a09c1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1092

    return v0
.end method

.method public onFragmentVisibilityChanged(Z)V
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "AD_STATE_CHANGE_ME"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/me/MainMeFragment;->onResume()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->I0iOXO()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->ii00OXXO(Z)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->iI()V

    :cond_0
    return-void
.end method

.method public renderAdapterMethod()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wd0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wd0;-><init>(Lcom/sma/smartv3/ui/me/Me2Fragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
