.class public final Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCategoryFragment.kt\ncom/sma/smartv3/ui/device/dial/category/DialCategoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,442:1\n90#2:443\n85#2,3:445\n1#3:444\n1#3:455\n99#4,7:448\n106#4,3:456\n79#4,7:459\n109#4:466\n*S KotlinDebug\n*F\n+ 1 DialCategoryFragment.kt\ncom/sma/smartv3/ui/device/dial/category/DialCategoryFragment\n*L\n186#1:443\n239#1:445,3\n241#1:455\n241#1:448,7\n241#1:456,3\n241#1:459,7\n241#1:466\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCategoryFragment.kt\ncom/sma/smartv3/ui/device/dial/category/DialCategoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,442:1\n90#2:443\n85#2,3:445\n1#3:444\n1#3:455\n99#4,7:448\n106#4,3:456\n79#4,7:459\n109#4:466\n*S KotlinDebug\n*F\n+ 1 DialCategoryFragment.kt\ncom/sma/smartv3/ui/device/dial/category/DialCategoryFragment\n*L\n186#1:443\n239#1:445,3\n241#1:455\n241#1:448,7\n241#1:456,3\n241#1:459,7\n241#1:466\n*E\n"
    }
.end annotation


# instance fields
.field private dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBinFileName:Ljava/lang/String;

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCategorys:[Lcom/sma/smartv3/model/WatchFaceCategory;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCurSyncCompleted:I

.field private mCurSyncDevicePosition:I

.field private mCurSyncDialId:I

.field private mCurSyncPosition:I

.field private mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurSyncTotal:I

.field private final mDialIds:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->NO_SYNC:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->onInitBaseLayoutAfter$lambda$1(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$1(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$1$0$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;ILcom/sma/smartv3/model/WatchFaceCategory;ILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$1$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;ILcom/sma/smartv3/model/WatchFaceCategory;ILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->onInitBaseLayoutAfter$lambda$1$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$0(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$1$0(Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->onInitBaseLayoutAfter$lambda$1$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMBinFileName$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDevicePosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDialId:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncPosition:I

    return p0
.end method

.method public static final synthetic access$getMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Lcom/sma/smartv3/model/SyncStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-object p0
.end method

.method public static final synthetic access$getMDialIds$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$sendDial(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->sendDial()V

    return-void
.end method

.method public static final synthetic access$setMCurSyncCompleted$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncCompleted:I

    return-void
.end method

.method public static final synthetic access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    return-void
.end method

.method public static final synthetic access$setMCurSyncTotal$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncTotal:I

    return-void
.end method

.method public static final synthetic access$syncDial(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

    return-void
.end method

.method private final doItem([Lcom/sma/smartv3/model/WatchFaceCategory;)V
    .locals 7

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XOXOXI0O;

    invoke-direct {v4, v2, p0}, Lcom/android/mltcode/paycertificationapi/XOXOXI0O;-><init>(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    const v5, 0x7f0d0f56

    invoke-static {v3, v5, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/WatchFaceCategory;->getList()[Lcom/sma/smartv3/model/WatchFaceInfo;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/ArraysKt___ArraysKt;->XOO0XX([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x6

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    new-instance v6, Lcom/android/mltcode/paycertificationapi/XI0I10;

    invoke-direct {v6, v2, v4, p0}, Lcom/android/mltcode/paycertificationapi/XI0I10;-><init>(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    const v4, 0x7f0d0ed9

    invoke-static {v5, v4, v6}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final doItem$lambda$0(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategory;->getDir()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OiIOXiI;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/i1OiIOXiI;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategory;->getDir()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0O1I0110;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I0O1I0110;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result p1

    invoke-static {p3, p1}, Lcom/sma/smartv3/model/OnlineWatchFaceKt;->getWatchFaceCategoryName(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$0$1(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result p2

    if-eqz p2, :cond_0

    const p0, 0x7f1412fe

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategory;->getList()[Lcom/sma/smartv3/model/WatchFaceInfo;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WATCHFACE_LIST"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, [Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result p1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/device/dial/DialActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$1(Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategory;->getDir()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0I1O;

    invoke-direct {v0, p1, p2, p0}, Lcom/android/mltcode/paycertificationapi/XO0I1O;-><init>(Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$1$0(Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 7

    const-string v0, "itemHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "payloads"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v2

    const p5, 0x7f0a08f9

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p5

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v5, p5

    check-cast v5, Lcom/sma/smartv3/view/ProgressButton;

    check-cast p6, Ljava/util/Collection;

    invoke-interface {p6}, Ljava/util/Collection;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_0

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    invoke-direct {p1, v5, p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    const/4 p5, 0x2

    const/4 p6, 0x0

    const v0, 0x7f1412f6

    const/4 v1, 0x0

    invoke-static {v5, v0, v1, p5, p6}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p5, p1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDialId:I

    if-ne p5, v2, :cond_1

    iget-object p5, p1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    invoke-direct {p1, v5, p5}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V

    goto :goto_0

    :cond_1
    iget-object p5, p1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-interface {p5, p6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_2

    const p5, 0x7f1412fb

    const/4 p6, 0x1

    invoke-virtual {v5, p5, p6}, Lcom/sma/smartv3/view/ProgressButton;->iO(IZ)V

    :cond_2
    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi11OXI;

    move-object v6, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/Oi11OXI;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;ILcom/sma/smartv3/model/WatchFaceCategory;ILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p0, 0x7f0a05fc

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p0, Lcom/sma/smartv3/view/SquareImageView;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {v6}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$1$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;ILcom/sma/smartv3/model/WatchFaceCategory;ILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Landroid/view/View;)V
    .locals 7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result p6

    if-eqz p6, :cond_0

    const p0, 0x7f1412fe

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    iget-object p6, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p6, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_1

    const p0, 0x7f140440

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1ii1XO0;

    move-object v1, p0

    move v3, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/I1ii1XO0;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final doItem$lambda$1$0$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 11

    const-string v1, "it"

    move-object/from16 v2, p6

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/bestmafen/androidbase/base/BaseActivity;

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->disableOrientation()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :cond_0
    new-instance v7, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v8

    iget-object v9, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v10

    new-instance v0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;

    move-object v1, p0

    move-object v6, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;Lcom/sma/smartv3/model/WatchFaceCategory;)V

    move-object v1, v0

    invoke-direct {v7, v8, v9, v10, v1}, Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;-><init>(Landroid/app/Activity;Ljava/util/List;ILcom/android/mltcode/paycertificationapi/iXiIO0i;)V

    iput-object v7, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategory;->getType()I

    move-result v6

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

    :goto_0
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem$lambda$0$1(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/sma/smartv3/model/WatchFaceCategory;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$1(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X011XXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X011XXX;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$1$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO0i0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO0i0X;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$1$0$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCategorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->doItem([Lcom/sma/smartv3/model/WatchFaceCategory;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendDial()V
    .locals 11

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->I1XOi1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget v5, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDialId:I

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    return-void

    :cond_1
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCH_FACE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    if-nez v4, :cond_2

    const-string v4, "mBinFileName"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2
    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->O00(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget v4, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDevicePosition:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XO10X()V

    return-void
.end method

.method private final syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncDial -> position:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurSyncPosition:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurSyncDialId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDialId:I

    iput p2, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncPosition:I

    sget-object p1, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    iput p3, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDevicePosition:I

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "_"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ".bin"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    sget-object p3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    const-string v3, "mBinFileName"

    const/4 v4, 0x0

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_0
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getId()I

    move-result v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    invoke-static {v6}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getPreviewPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1, p2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;Z)Z

    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    if-nez p3, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p3, v4

    :cond_2
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object p5

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncDial -> dial try get from dialFile file = "

    invoke-virtual {p6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " size:"

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const p1, 0x7f1412fd

    invoke-static {p4, p1, p2, v0, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->sendDial()V

    return-void

    :cond_3
    const p1, 0x7f140476

    invoke-static {p4, p1, p2, v0, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p5}, Lcom/sma/smartv3/model/WatchFaceInfo;->getBinPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/uz0;->X01IiOiIi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p3

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBinFileName:Ljava/lang/String;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v4

    goto :goto_0

    :cond_4
    move-object v7, v0

    :goto_0
    new-instance v0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$syncDial$1;

    move-object v5, p0

    move-object v4, p4

    move-object v1, p5

    move v3, p6

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$syncDial$1;-><init>(Lcom/sma/smartv3/model/WatchFaceInfo;Ljava/io/File;ILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;Ljava/io/File;)V

    invoke-virtual {p1, p2, p3, v7, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public static synthetic syncDial$default(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;IILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;I)V

    return-void
.end method

.method private final syncStatusChange(Lcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/SyncStatus;)V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$OXO1;->OXO1:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq p2, v2, :cond_3

    if-eq p2, v3, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    const p2, 0x7f1412fb

    invoke-virtual {p1, p2, v2}, Lcom/sma/smartv3/view/ProgressButton;->iO(IZ)V

    return-void

    :cond_1
    iget p2, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncCompleted:I

    int-to-float p2, p2

    iget v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncTotal:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgressDecimalPlaces(F)V

    return-void

    :cond_2
    const p2, 0x7f1412f6

    invoke-static {p1, p2, v1, v3, v0}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void

    :cond_3
    const p2, 0x7f1412f9

    invoke-static {p1, p2, v1, v3, v0}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/dsl/AdapterStatusItem;

    invoke-direct {v0}, Lcom/sma/smartv3/dsl/AdapterStatusItem;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WATCHFACE_CATEGORY"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, [Lcom/sma/smartv3/model/WatchFaceCategory;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/sma/smartv3/model/WatchFaceCategory;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCategorys:[Lcom/sma/smartv3/model/WatchFaceCategory;

    if-eqz p1, :cond_0

    array-length p1, p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->I1()V

    :cond_0
    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isSync()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->SYNCING:Lcom/sma/smartv3/model/SyncStatus;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/model/SyncStatus;->DOWNLOAD:Lcom/sma/smartv3/model/SyncStatus;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e78

    return v0
.end method

.method public final onAGPSSyncState(Z)V
    .locals 4
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AGPS_SYNC_STATE"
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onAGPSSyncState -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->sendDial()V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt;->XIi00iiXO(Landroidx/recyclerview/widget/GridLayoutManager;Lcom/angcyo/dsladapter/DslAdapter;)Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIXI1iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIXI1iX;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onResume()V
    .locals 9

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i01()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WATCHFACE_ID:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "syncId"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mDialIds -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mDialIds:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncDialId:I

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->SYNCED:Lcom/sma/smartv3/model/SyncStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->mCurSyncStatus:Lcom/sma/smartv3/model/SyncStatus;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a0996

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
