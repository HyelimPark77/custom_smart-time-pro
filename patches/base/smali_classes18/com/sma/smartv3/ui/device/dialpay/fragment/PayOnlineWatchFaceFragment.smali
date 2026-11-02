.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPayOnlineWatchFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n50#2,3:239\n53#2:245\n55#2,2:247\n85#2,3:249\n50#2,3:290\n53#2:296\n55#2,2:298\n50#2,3:300\n53#2:306\n55#2,2:308\n1563#3:242\n1634#3,2:243\n1636#3:246\n1563#3:293\n1634#3,2:294\n1636#3:297\n1563#3:303\n1634#3,2:304\n1636#3:307\n1563#3:310\n1634#3,3:311\n99#4,7:252\n106#4,3:260\n79#4,7:263\n109#4:270\n99#4,7:271\n106#4,3:279\n79#4,7:282\n109#4:289\n99#4,7:314\n106#4,3:322\n79#4,7:325\n109#4:332\n1#5:259\n1#5:278\n1#5:321\n*S KotlinDebug\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n*L\n67#1:239,3\n67#1:245\n67#1:247,2\n155#1:249,3\n96#1:290,3\n96#1:296\n96#1:298,2\n113#1:300,3\n113#1:306\n113#1:308,2\n67#1:242\n67#1:243,2\n67#1:246\n96#1:293\n96#1:294,2\n96#1:297\n113#1:303\n113#1:304,2\n113#1:307\n130#1:310\n130#1:311,3\n156#1:252,7\n156#1:260,3\n156#1:263,7\n156#1:270\n159#1:271,7\n159#1:279,3\n159#1:282,7\n159#1:289\n226#1:314,7\n226#1:322,3\n226#1:325,7\n226#1:332\n156#1:259\n159#1:278\n226#1:321\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPayOnlineWatchFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n50#2,3:239\n53#2:245\n55#2,2:247\n85#2,3:249\n50#2,3:290\n53#2:296\n55#2,2:298\n50#2,3:300\n53#2:306\n55#2,2:308\n1563#3:242\n1634#3,2:243\n1636#3:246\n1563#3:293\n1634#3,2:294\n1636#3:297\n1563#3:303\n1634#3,2:304\n1636#3:307\n1563#3:310\n1634#3,3:311\n99#4,7:252\n106#4,3:260\n79#4,7:263\n109#4:270\n99#4,7:271\n106#4,3:279\n79#4,7:282\n109#4:289\n99#4,7:314\n106#4,3:322\n79#4,7:325\n109#4:332\n1#5:259\n1#5:278\n1#5:321\n*S KotlinDebug\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n*L\n67#1:239,3\n67#1:245\n67#1:247,2\n155#1:249,3\n96#1:290,3\n96#1:296\n96#1:298,2\n113#1:300,3\n113#1:306\n113#1:308,2\n67#1:242\n67#1:243,2\n67#1:246\n96#1:293\n96#1:294,2\n96#1:297\n113#1:303\n113#1:304,2\n113#1:307\n130#1:310\n130#1:311,3\n156#1:252,7\n156#1:260,3\n156#1:263,7\n156#1:270\n159#1:271,7\n159#1:279,3\n159#1:282,7\n159#1:289\n226#1:314,7\n226#1:322,3\n226#1:325,7\n226#1:332\n156#1:259\n159#1:278\n226#1:321\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dialPickerPopup:Lcom/sma/smartv3/ui/device/dial/DialPickerPopup;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final emptyView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBannerList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            ">;"
        }
    .end annotation
.end field

.field private mWatchFaceList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const-string v0, "PayOnlineWatchFaceFragment"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zp1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->emptyView$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "WATCHFACE_LIST_BANNER"

    :try_start_0
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonElement;

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/WatchFaceBanner;

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mBannerList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getWatchFaceList$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$3$0(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->initData$lambda$0$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$1(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$3(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->emptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$2$0(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->initData$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->initData$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->onInitBaseLayoutAfter$lambda$2(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$3$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$2(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->onInitBaseLayoutAfter$lambda$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onClickMove(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->onClickMove(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final emptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a035d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final findData(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mBannerList:Ljava/util/List;

    invoke-direct {v1, v2}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;-><init>(Ljava/util/List;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/vp1;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/vp1;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;-><init>(Ljava/util/List;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/wp1;

    invoke-direct {v2, p1, p0}, Lcom/android/mltcode/paycertificationapi/wp1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-static {v0, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->TAG:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " listSize = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v1

    if-eqz v1, :cond_2

    array-length v1, v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/xp1;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/xp1;-><init>(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    const v3, 0x7f0d0f56

    invoke-static {v1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->XXiO0([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/yp1;

    invoke-direct {v4, v0, v2, p0}, Lcom/android/mltcode/paycertificationapi/yp1;-><init>(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    const v2, 0x7f0d0eda

    invoke-static {v3, v2, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_2

    :cond_4
    return-void
.end method

.method private static final findData$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$1(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->setOnItemClickListener(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$2(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qp1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qp1;-><init>(Lcom/sma/smartv3/model/OnlineWatchFaceV2;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rp1;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/rp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$2$0(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0cc7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p0, 0x7f0a1915

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$2$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->onClickMove(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$3(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/aq1;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/aq1;-><init>(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/bq1;

    invoke-direct {p0, p2, p1}, Lcom/android/mltcode/paycertificationapi/bq1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$3$0(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 8

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "adapterItem"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payloads"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a08f9

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object v0, p3

    check-cast v0, Lcom/sma/smartv3/view/ProgressButtonV2;

    const p3, 0x7f0a05fc

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p3, Lcom/sma/smartv3/view/SquareImageView;

    const p4, 0x7f0a0582

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getNewFlag()Z

    move-result p4

    if-eqz p4, :cond_0

    sget-object p4, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p4}, Lcom/android/mltcode/paycertificationapi/i72;->X1i()Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x0

    goto :goto_0

    :cond_0
    const/16 p4, 0x8

    :goto_0
    invoke-virtual {p2, p4}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollar()F

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmount()F

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getDollarDis()F

    move-result v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getAmountDis()F

    move-result v4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getLimitFreeFlag()Z

    move-result v5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getMemberAttr()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPayStatus()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v0 .. v7}, Lcom/android/mltcode/paycertificationapi/XXiO;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;FFFFZLjava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$3$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getPreviewUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    invoke-virtual {v1, p2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {v1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v1, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getEmptyView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->emptyView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final getWatchFaceList$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;
    .locals 4

    if-eqz p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "ONLINE_DEVICE_WATCH_FACE_LIST"

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_0
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mWatchFaceList:Ljava/util/List;

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->initData()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData$lambda$2$1(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final initData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/op1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/op1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final initData$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/up1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/up1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initData$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pp1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initData$lambda$0$0$0(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 6

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, v2}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mWatchFaceList:Ljava/util/List;

    const/16 v0, 0x8

    if-eqz p1, :cond_5

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mWatchFaceList:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v5

    if-eqz v5, :cond_1

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-lez v5, :cond_2

    move v3, v1

    :cond_2
    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getEmptyView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getEmptyView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mWatchFaceList:Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData(Ljava/util/List;)V

    :goto_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " isEmptyData = "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getEmptyView()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final onClickMove(Lcom/sma/smartv3/model/OnlineWatchFaceV2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-static {p3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "mArg3"

    const-string v2, "mArg2"

    const-string v3, "mArg1"

    const-string v4, "mArg0"

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    sget-object p3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WATCHFACE_LIST_V2"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x5f

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v7, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {p3, v6, v0, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v2, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v1, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p3, v2, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p3, v1, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/device/dialpay/DialMoveV2Activity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final onInitBaseLayoutAfter$lambda$1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$2(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Z)Lkotlin/Unit;
    .locals 4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "WATCHFACE_LIST_BANNER"

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/WatchFaceBanner;

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_0
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->mBannerList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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

.method public final getWatchFaceList()V
    .locals 6

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Landroidx/appcompat/app/AppCompatActivity;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/cq1;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/cq1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/WatchFaceManager;->iO(Lcom/sma/smartv3/biz/WatchFaceManager;ZLandroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e79

    return v0
.end method

.method public final onChangedData(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "WATCH_FACE_PAY_LIST_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getWatchFaceList()V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sp1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/sp1;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->getWatchFaceList()V

    sget-object v0, Lcom/sma/smartv3/biz/WatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/WatchFaceManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tp1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tp1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/WatchFaceManager;->I0IIOi(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

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
