.class public final Lcom/sma/smartv3/ui/device/ServerMusicActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n1563#2:359\n1634#2,3:360\n774#2:365\n865#2,2:366\n1869#2,2:368\n1563#2:373\n1634#2,2:374\n1636#2:377\n35#3,2:363\n50#3,3:370\n53#3:376\n55#3,2:378\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n*L\n148#1:359\n148#1:360,3\n81#1:365\n81#1:366,2\n84#1:368,2\n104#1:373\n104#1:374,2\n104#1:377\n352#1:363,2\n104#1:370,3\n104#1:376\n104#1:378,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n1563#2:359\n1634#2,3:360\n774#2:365\n865#2,2:366\n1869#2,2:368\n1563#2:373\n1634#2,2:374\n1636#2:377\n35#3,2:363\n50#3,3:370\n53#3:376\n55#3,2:378\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n*L\n148#1:359\n148#1:360,3\n81#1:365\n81#1:366,2\n84#1:368,2\n104#1:373\n104#1:374,2\n104#1:377\n352#1:363,2\n104#1:370,3\n104#1:376\n104#1:378,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private getMusicNumber:I

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCacheList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mCheckedListID:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mClearImageView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurDir:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEditText$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEmptyView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMapData:Ljava/util/HashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSearchImageView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final musicPath:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private nextMarker:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "ServerMusicActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/o34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/o34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/p34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/p34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEditText$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/q34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mClearImageView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/r34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mSearchImageView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/s34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/t34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/t34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEmptyView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/u34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/u34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mButton$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCheckedListID:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCacheList:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    const-string v0, "/"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    const-string v0, "var-www/cloud-music/"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->musicPath:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->nextMarker:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->upMusicData$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mClearImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lkotlin/Pair;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->showRootList$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mSearchImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$formatMusicData(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->formatMusicData()V

    return-void
.end method

.method public static final synthetic access$getGetMusicNumber$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMusicNumber:I

    return p0
.end method

.method public static final synthetic access$getMCacheList$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCacheList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCheckedListID:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getOssMusicList(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getOssMusicList(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMCurDir$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    return-void
.end method

.method private final formatMusicData()V
    .locals 14

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    const-string v2, "/"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCacheList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x2

    if-le v5, v7, :cond_3

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_0

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_1

    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    new-instance v8, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-direct {v8, v4, v9, v6}, Lcom/sma/smartv3/model/ServerOSSMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-direct {v8, v4, v9, v6}, Lcom/sma/smartv3/model/ServerOSSMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    new-instance v8, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v8 .. v13}, Lcom/sma/smartv3/model/ServerOSSMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    new-instance v7, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v7, v4, v3, v6}, Lcom/sma/smartv3/model/ServerOSSMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->showRootList()V

    return-void
.end method

.method private final getMButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMClearImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mClearImageView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEditText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMEmptyView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEmptyView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSearchImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mSearchImageView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getOssMusicList(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V
    .locals 2

    new-instance v0, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;

    invoke-direct {v0, p1}, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->musicPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;->setPrefix(Ljava/lang/String;)V

    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;->setMaxKeys(Ljava/lang/Integer;)V

    iget v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMusicNumber:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMusicNumber:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->nextMarker:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->nextMarker:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;->setMarker(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;

    invoke-direct {v1, p0, p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V

    invoke-virtual {p2, v0, v1}, Lcom/alibaba/sdk/android/oss/OSSClient;->asyncListObjects(Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback;)Lcom/alibaba/sdk/android/oss/internal/OSSAsyncTask;

    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mEmptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMEditText()Landroid/widget/EditText;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Landroid/view/View;)V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMEditText()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCacheList:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v4, v5}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    const-string v1, "/"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v3, v2, v1, v5}, Lcom/sma/smartv3/model/ServerOSSMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initData(Ljava/util/List;)V

    return-void

    :cond_4
    const p0, 0x7f140ffb

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_5
    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 6

    const-string v0, "pair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const v1, 0x7f141196

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/MusicServerManager;->XIi00iiXO(Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;)Lcom/alibaba/sdk/android/oss/OSSClient;

    move-result-object v0

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getBucket()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getOssMusicList(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V

    goto/16 :goto_1

    :cond_1
    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto/16 :goto_1

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "SEVER_MUSIC_LIST_DATA"

    :try_start_0
    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Ljava/lang/String;

    invoke-virtual {v4, v3, v5}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_3
    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->TAG:Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " mCacheList = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCacheList:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->formatMusicData()V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/MusicServerManager;->XIi00iiXO(Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;)Lcom/alibaba/sdk/android/oss/OSSClient;

    move-result-object v0

    if-eqz p1, :cond_5

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getBucket()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getOssMusicList(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mClearImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a1a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mEditText_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0a19

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mEmptyView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a035d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a0a1b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSearchImageView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a1c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final showRootList$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 2

    const-string v0, "/"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141225

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initData(Ljava/util/List;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method private static final upMusicData$lambda$0(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mMapData:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->initData(Ljava/util/List;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getNextMarker()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->nextMarker:Ljava/lang/String;

    return-object v0
.end method

.method public final getRootList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->rootList:Ljava/util/List;

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

.method public final initData(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ServerOSSMusicItem;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$initData$1;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMEmptyView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMEmptyView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141225

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMButton()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMClearImageView()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/j34;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/j34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMSearchImageView()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/m34;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/m34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    sget-object v0, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/n34;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/n34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/MusicServerManager;->XX0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00fa

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCheckedListID:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SEVER_MUSIC_CHECK_LIST_ID"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCurDir:Ljava/lang/String;

    const-string v1, "/"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->showRootList()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final setButtonText()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMButton()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCheckedListID:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const v2, 0x7f14131f

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMButton()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getMButton()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->mCheckedListID:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final setNextMarker(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->nextMarker:Ljava/lang/String;

    return-void
.end method

.method public final showRootList()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/l34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/l34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final upMusicData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/k34;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/k34;-><init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
