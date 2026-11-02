.class public final Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBannerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,149:1\n50#2,3:150\n53#2:156\n55#2,2:158\n85#2,3:166\n1563#3:153\n1634#3,2:154\n1636#3:157\n1563#3:160\n1634#3,3:161\n37#4,2:164\n*S KotlinDebug\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n*L\n65#1:150,3\n65#1:156\n65#1:158,2\n76#1:166,3\n65#1:153\n65#1:154,2\n65#1:157\n69#1:160\n69#1:161,3\n78#1:164,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBannerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,149:1\n50#2,3:150\n53#2:156\n55#2,2:158\n85#2,3:166\n1563#3:153\n1634#3,2:154\n1636#3:157\n1563#3:160\n1634#3,3:161\n37#4,2:164\n*S KotlinDebug\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n*L\n65#1:150,3\n65#1:156\n65#1:158,2\n76#1:166,3\n65#1:153\n65#1:154,2\n65#1:157\n69#1:160\n69#1:161,3\n78#1:164,2\n*E\n"
    }
.end annotation


# instance fields
.field public mBanner:Lcom/youth/banner/Banner;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/youth/banner/Banner<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            "Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private final mBannerList:Ljava/util/List;
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

.field public mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mBannerList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBannerList:Ljava/util/List;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;Lcom/sma/smartv3/model/WatchFaceBanner;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;Lcom/sma/smartv3/model/WatchFaceBanner;I)V

    return-void
.end method

.method public static synthetic O00(Lcom/youth/banner/Banner;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->initView$lambda$0$0(Lcom/youth/banner/Banner;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;Lcom/sma/smartv3/model/WatchFaceBanner;I)V
    .locals 8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceBanner;->getSlideType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x712eb6fd

    const-string v2, "mArg0"

    const-string v3, "mArg1"

    const/4 v4, 0x0

    if-eq v0, v1, :cond_7

    const v1, 0x46217d06

    if-eq v0, v1, :cond_1

    const v1, 0x66b12fac

    if-eq v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "WatchFace"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceBanner;->getSlideEleId()I

    move-result p1

    invoke-virtual {p2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    const-string v0, "WatchFaceType"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto/16 :goto_2

    :cond_2
    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    const-string v0, "ONLINE_DEVICE_WATCH_FACE_LIST"

    const/16 v1, 0xa

    :try_start_0
    invoke-virtual {p2, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    const-class v7, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v6, v5, v7}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_3
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_4

    goto/16 :goto_2

    :cond_4
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceBanner;->getSlideEleId()I

    move-result v6

    if-ne v5, v6, :cond_5

    move-object v4, v1

    :cond_5
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    if-eqz v4, :cond_8

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getWatchFaceList()[Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->XOO0XX([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v5, v1, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WATCHFACE_LIST_V2"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, [Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v5, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/WatchFaceBanner;->getSlideEleId()I

    move-result p1

    invoke-virtual {p2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_2

    :cond_7
    const-string p1, "Points"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    :goto_2
    return-void

    :cond_9
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object p2, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v0, 0x3

    invoke-static {p2, v4, v4, v0, v4}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p2, 0x2

    invoke-virtual {p1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/youth/banner/Banner;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3ff00000    # 1.875f

    div-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a00ff

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/youth/banner/Banner;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->setMBanner(Lcom/youth/banner/Banner;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->setMContext(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBannerList:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBannerList:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lcom/youth/banner/Banner;->setAdapter(Lcom/youth/banner/adapter/BannerAdapter;)Lcom/youth/banner/Banner;

    move-result-object p1

    new-instance v0, Lcom/youth/banner/indicator/CircleIndicator;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/youth/banner/indicator/CircleIndicator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lcom/youth/banner/Banner;->setIndicator(Lcom/youth/banner/indicator/Indicator;)Lcom/youth/banner/Banner;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1iXI00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1iXI00;-><init>(Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;)V

    invoke-virtual {p1, v0}, Lcom/youth/banner/Banner;->setOnBannerListener(Lcom/youth/banner/listener/OnBannerListener;)Lcom/youth/banner/Banner;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p1

    invoke-virtual {p1}, Lcom/youth/banner/Banner;->start()Lcom/youth/banner/Banner;

    :cond_0
    return-void
.end method

.method public final getMBanner()Lcom/youth/banner/Banner;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/youth/banner/Banner<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            "Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBanner:Lcom/youth/banner/Banner;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mBanner"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMBannerList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBannerList:Ljava/util/List;

    return-object v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0XIiOI;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i0XIiOI;-><init>(Lcom/youth/banner/Banner;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0f55

    return v0
.end method

.method public onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBannerList:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->getMBanner()Lcom/youth/banner/Banner;

    move-result-object p1

    invoke-virtual {p1}, Lcom/youth/banner/Banner;->stop()Lcom/youth/banner/Banner;

    :cond_0
    return-void
.end method

.method public final setMBanner(Lcom/youth/banner/Banner;)V
    .locals 1
    .param p1    # Lcom/youth/banner/Banner;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/youth/banner/Banner<",
            "Lcom/sma/smartv3/model/WatchFaceBanner;",
            "Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem$ImageAdapter;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mBanner:Lcom/youth/banner/Banner;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/BannerItem;->mContext:Landroid/content/Context;

    return-void
.end method
