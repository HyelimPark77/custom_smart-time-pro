.class public final Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;
.super Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAllAppStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1869#2,2:239\n1869#2,2:241\n*S KotlinDebug\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n*L\n203#1:239,2\n222#1:241,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAllAppStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1869#2,2:239\n1869#2,2:241\n*S KotlinDebug\n*F\n+ 1 AllAppStoreFragment.kt\ncom/sma/smartv3/ui/device/fragment/AllAppStoreFragment\n*L\n203#1:239,2\n222#1:241,2\n*E\n"
    }
.end annotation


# instance fields
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

.field private mHaveAppNumber:I

.field private final mHaveAppNumberMax:I

.field private mItemPosition:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii0X00i11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii0X00i11;-><init>(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mDeviceStorage$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i000X()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumberMax:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mDeviceStorage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$1$0$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->syncAdapterData$lambda$0(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$0$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$0$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$1$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData$lambda$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final mDeviceStorage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b43

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic setDeviceStorage$default(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->setDeviceStorage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final showData()V
    .locals 6

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AppStoreItemList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OOO11OI;

    invoke-direct {v3, v1, p0}, Lcom/android/mltcode/paycertificationapi/OOO11OI;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    const v4, 0x7f0d0ec3

    invoke-static {v2, v4, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->getCurHaveAppNumber()V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->isShowAll()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    const/4 v3, 0x5

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v4

    new-instance v5, Lcom/android/mltcode/paycertificationapi/XI001;

    invoke-direct {v5, v1, v3, p0}, Lcom/android/mltcode/paycertificationapi/XI001;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    const v3, 0x7f0d0ec2

    invoke-static {v4, v3, v5}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiXOO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/XiXOO;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1IOXI1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X1IOXI1;-><init>(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p3, 0x7f0a00cd

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->isShowAll()Z

    move-result p3

    if-eqz p3, :cond_1

    const p3, 0x7f140150

    invoke-virtual {p1, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p3, 0x7f140151

    invoke-virtual {p1, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 p1, 0x5

    if-le p0, p1, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    const/16 p0, 0x8

    :goto_1
    invoke-virtual {p2, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->isShowAll()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/model/AppStoreItemList;->setShowAll(Z)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->syncAdapterData()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1(Lcom/sma/smartv3/model/AppStoreItemList;Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/O1O1;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/O1O1;-><init>(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 2

    const-string v0, "itemHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "payloads"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a05fc

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getPath()I

    move-result p5

    const/4 v0, -0x1

    if-eq p5, v0, :cond_0

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

    move-result-object v0

    invoke-virtual {p5, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p5

    const v0, 0x7f080714

    invoke-virtual {p5, v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->error(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p5

    check-cast p5, Lcom/bumptech/glide/RequestBuilder;

    invoke-virtual {p5, p4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_1
    :goto_0
    const p4, 0x7f0a065a

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    const/4 p5, 0x0

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->isShowNewFlag()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, p5

    goto :goto_1

    :cond_2
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    const p4, 0x7f0a0cc7

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const p4, 0x7f0a0d0c

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMSize()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "kb"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const p4, 0x7f0a0c48

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result p4

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v0

    if-ne p4, v0, :cond_6

    const p4, 0x7f14014a

    invoke-virtual {p1, p4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p4

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v0

    if-ne p4, v0, :cond_7

    const p4, 0x7f14014d

    invoke-virtual {p1, p4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p4

    goto :goto_2

    :cond_7
    const p4, 0x7f14014f

    invoke-virtual {p1, p4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p4

    :goto_2
    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    if-eqz p2, :cond_a

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result p4

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v0

    if-eq p4, v0, :cond_9

    const/4 p5, 0x1

    :cond_9
    invoke-virtual {p2, p5}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_a
    if-eqz p2, :cond_b

    new-instance p4, Lcom/android/mltcode/paycertificationapi/iX11Ii0O;

    invoke-direct {p4, p0, p1, p3}, Lcom/android/mltcode/paycertificationapi/iX11Ii0O;-><init>(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;I)V

    invoke-virtual {p2, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$1$0$0(Lcom/sma/smartv3/model/AppStoreDataItem;Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;ILandroid/view/View;)V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result p3

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v1

    const/4 v2, 0x0

    if-eq p3, v1, :cond_2

    sget-object v1, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v1

    if-ne p3, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/sma/smartv3/model/AppStoreItemType;->NOT_RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p0

    if-ne p3, p0, :cond_1

    const p0, 0x7f14014e

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result v0

    if-ne p3, v0, :cond_3

    iget p3, p1, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    iget v0, p1, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumberMax:I

    if-lt p3, v0, :cond_3

    const p0, 0x7f140148

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->syncData()V

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->setSync(Z)V

    iput p2, p1, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mItemPosition:I

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getPath()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_5

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object p2, Lcom/szabh/smable3/BleKey;->APP_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v3, Lcom/szabh/smable3/entity/BleAppFile;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result v1

    if-ne v0, v1, :cond_4

    move v5, p3

    goto :goto_1

    :cond_4
    move v5, v2

    :goto_1
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/szabh/smable3/entity/BleAppFile;-><init>(Ljava/lang/String;I[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleWritable;->toByteArray()[B

    move-result-object p3

    const/4 v0, 0x2

    invoke-virtual {p1, p2, p3, v0}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    goto :goto_4

    :cond_5
    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->setNeedToDownloadFile(Z)V

    sget-object p1, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBinOnlinePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMIsGame()I

    move-result v1

    if-ne v1, p3, :cond_6

    move v1, v2

    goto :goto_2

    :cond_6
    move v1, p3

    :goto_2
    sget-object v3, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result v4

    if-ne v3, v4, :cond_7

    goto :goto_3

    :cond_7
    move p3, v2

    :goto_3
    invoke-virtual {p1, p2, v0, v1, p3}, Lcom/sma/smartv3/model/AppStoreFileManager;->downloadAppFile(Ljava/lang/String;Ljava/lang/String;II)V

    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/szabh/smable3/entity/BleAppInfo;->setMHide(I)V

    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/model/AppStoreDataItem;->setAppStoreType(I)V

    return-void
.end method

.method private static final syncAdapterData$lambda$0(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->getCurHaveAppNumber()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mItemPosition:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void
.end method

.method public final getCurHaveAppNumber()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AppStoreItemList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreDataItem;->getAppStoreType()I

    move-result v2

    sget-object v3, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v3

    if-ne v2, v3, :cond_1

    iget v2, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    goto :goto_0

    :cond_2
    return-void
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    return-object v0
.end method

.method public final getMDeviceStorage()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mDeviceStorage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMHaveAppNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    return v0
.end method

.method public final getMHaveAppNumberMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumberMax:I

    return v0
.end method

.method public final getMItemPosition()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mItemPosition:I

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e64

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

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->setDeviceStorage$default(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->getMDeviceStorage()Lcom/sma/smartv3/view/text/PFMedium;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    return-void
.end method

.method public final setMHaveAppNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mHaveAppNumber:I

    return-void
.end method

.method public final setMItemPosition(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mItemPosition:I

    return-void
.end method

.method public final syncAdapterData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0O1O1OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0O1O1OO;-><init>(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final upData(Ljava/util/List;)V
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

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->syncAdapterData()V

    return-void
.end method

.method public final upDataAppStoreSuccess(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "updata_app_store_success"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->mAppStoreItemList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AppStoreItemList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemList;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreDataItem;->getBleAppInfo()Lcom/szabh/smable3/entity/BleAppInfo;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/szabh/smable3/entity/BleAppInfo;->setMHide(I)V

    sget-object v1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/model/AppStoreDataItem;->setAppStoreType(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->showData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->getCurHaveAppNumber()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method
