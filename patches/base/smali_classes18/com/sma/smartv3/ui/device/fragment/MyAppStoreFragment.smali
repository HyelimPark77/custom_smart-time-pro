.class public final Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;
.super Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;
.source "SourceFile"


# instance fields
.field private mAppNumber:I

.field private mAppStoreItemList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;"
        }
    .end annotation
.end field

.field private final mDeviceStorage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEmptyLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mItemPositionPackageName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cz0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mDeviceStorage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dz0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mEmptyLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$1$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreItemList;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreItemList;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$1$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->upData$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$1$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->upData$lambda$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mDeviceStorage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$0$1(Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mEmptyLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getIsShowHeader(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreDataItem;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMHide()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic iIiiO(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData$lambda$1$1(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final mDeviceStorage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b43

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mEmptyLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00cc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setDeviceStorage$default(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.device.AppStoreActivity"

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/ui/device/AppStoreActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getTotalDeviceStorage()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/sma/smartv3/ui/device/AppStoreActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getFreeSizeDeviceStorage()Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->setDeviceStorage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuEnable(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vy0;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/vy0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreItemList;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/yy0;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/yy0;-><init>()V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreItemList;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p4

    const/high16 p5, 0x41000000    # 8.0f

    invoke-static {p4, p5}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result p4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p5}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result p5

    const/4 v0, 0x0

    invoke-virtual {p3, v0, p4, v0, p5}, Landroid/view/View;->setPadding(IIII)V

    const p3, 0x7f0a0cc7

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p3, 0x7f0a00cd

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemList;->isShowAll()Z

    move-result p3

    if-eqz p3, :cond_1

    const p3, 0x7f140150

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const p3, 0x7f140151

    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 p1, 0x5

    if-le p0, p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$1(Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/zy0;

    invoke-direct {p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/zy0;-><init>(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/az0;

    invoke-direct {p0, p3}, Lcom/android/mltcode/paycertificationapi/az0;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "adapterItem"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "payloads"

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a05fc

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getPath()I

    move-result p5

    const/4 p6, -0x1

    if-eq p5, p6, :cond_0

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getPath()I

    move-result p5

    invoke-virtual {p4, p5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getOnlinePath()Ljava/lang/String;

    move-result-object p5

    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    move-result p5

    if-lez p5, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p5

    invoke-static {p5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getOnlinePath()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p5

    const p6, 0x7f080714

    invoke-virtual {p5, p6}, Lcom/bumptech/glide/request/BaseRequestOptions;->error(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p5

    check-cast p5, Lcom/bumptech/glide/RequestBuilder;

    invoke-virtual {p5, p4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_1
    :goto_0
    const p4, 0x7f0a065a

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    const/4 p5, 0x0

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag()Z

    move-result p6

    if-eqz p6, :cond_2

    move p6, p5

    goto :goto_1

    :cond_2
    const/16 p6, 0x8

    :goto_1
    invoke-virtual {p4, p6}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    const p4, 0x7f0a0cc7

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object p6

    invoke-virtual {p6}, Lcom/szabh/smable3/entity/BleAppInfo;->getMName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p4, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const p4, 0x7f0a0d0c

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object p6

    invoke-virtual {p6}, Lcom/szabh/smable3/entity/BleAppInfo;->getMSize()I

    move-result p6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p6, "kb"

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p4, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const p4, 0x7f0a0c48

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p6

    if-eqz p6, :cond_6

    const v0, 0x7f14014d

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_7

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_7
    new-instance p4, Lcom/android/mltcode/paycertificationapi/fz0;

    invoke-direct {p4, p1, p0, p2}, Lcom/android/mltcode/paycertificationapi/fz0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    const p0, 0x7f0a019a

    invoke-virtual {p3, p0, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    const p0, 0x7f0a06fe

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance p1, Lcom/android/mltcode/paycertificationapi/gz0;

    invoke-direct {p1, p3}, Lcom/android/mltcode/paycertificationapi/gz0;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_8
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object p3

    invoke-virtual {p3}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lcom/szabh/smable3/entity/BleAppInfo;->setMHide(I)V

    const p1, 0x7f140147

    const v0, 0x7f14017a

    const v1, 0x7f14017b

    invoke-virtual {p0, v1, p1, v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->showDeleteTipPopup(III)V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p1, 0x0

    invoke-static {p0, p1, p3, p1}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final showData$lambda$1$0$1$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final showData$lambda$1$1(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu$default(Lcom/angcyo/dsladapter/SwipeMenuHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final upData$lambda$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bz0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final upData$lambda$0$0(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final addAppStoreSuccess(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "add_app_store_success"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method

.method public confirmDeleteFile()V
    .locals 9

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->confirmDeleteFile()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->APP_OP:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleAppOp;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/szabh/smable3/entity/BleAppOp;-><init>(ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    invoke-static {v0}, Lcom/sma/smartv3/model/FileTransmissionKt;->changAppStoreCurrentCategory(Ljava/lang/String;)V

    const-string v0, "updata_app_store_success"

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->showData()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method

.method public final getMAppNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    return v0
.end method

.method public final getMAppStoreItemList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    return-object v0
.end method

.method public final getMDeviceStorage()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mDeviceStorage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMEmptyLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mEmptyLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final getMItemPositionPackageName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

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

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e76

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->setDeviceStorage$default(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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

.method public final setDeviceStorage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "total"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surplus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1O1111i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->getMDeviceStorage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f140154

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final setMAppNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    return-void
.end method

.method public final setMAppStoreItemList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    return-void
.end method

.method public final setMItemPositionPackageName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mItemPositionPackageName:Ljava/lang/String;

    return-void
.end method

.method public final showData()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AppStoreItemList;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->getIsShowHeader(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/wy0;

    invoke-direct {v4, v2, p0}, Lcom/android/mltcode/paycertificationapi/wy0;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    const v5, 0x7f0d0ec3

    invoke-static {v3, v5, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreItemList;->isShowAll()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "category.listFor"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleAppInfo;->getMHide()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v5

    if-nez v5, :cond_3

    iget v5, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    new-instance v6, Lcom/android/mltcode/paycertificationapi/xy0;

    invoke-direct {v6, v2, v4, p0}, Lcom/android/mltcode/paycertificationapi/xy0;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    const v4, 0x7f0d0ec2

    invoke-static {v5, v4, v6}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->getMEmptyLayout()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppNumber:I

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v0, 0x8

    :goto_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final upData(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ez0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ez0;-><init>(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    return-void
.end method
