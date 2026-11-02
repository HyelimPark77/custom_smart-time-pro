.class public final Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeightHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n1491#3:206\n1516#3,3:207\n1519#3,3:217\n382#4,7:210\n99#5,7:220\n106#5,3:228\n79#5,7:231\n109#5:238\n1#6:227\n*S KotlinDebug\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n*L\n27#1:204\n27#1:205\n107#1:206\n107#1:207,3\n107#1:217,3\n107#1:210,7\n162#1:220,7\n162#1:228,3\n162#1:231,7\n162#1:238\n162#1:227\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeightHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n1491#3:206\n1516#3,3:207\n1519#3,3:217\n382#4,7:210\n99#5,7:220\n106#5,3:228\n79#5,7:231\n109#5:238\n1#6:227\n*S KotlinDebug\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n*L\n27#1:204\n27#1:205\n107#1:206\n107#1:207,3\n107#1:217,3\n107#1:210,7\n162#1:220,7\n162#1:228,3\n162#1:231,7\n162#1:238\n162#1:227\n*E\n"
    }
.end annotation


# instance fields
.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private pageNum:I

.field private pageSize:I

.field private final scrollView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const/16 v1, 0x1e

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageSize:I

    const/4 v1, 0x1

    iput v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cz6;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/cz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->scrollView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->weightDao()Lcom/sma/smartv3/db/dao/WeightDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$2$0(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$2$1(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$2$0$0(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$1$0(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$1(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onInitBaseLayoutAfter$lambda$0$1$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onMeasureWeightChanged$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onMeasureWeightChanged$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method private final doItem(Ljava/util/List;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->Ii1iii0(Lcom/angcyo/dsladapter/DslAdapter;Ljava/lang/String;ZILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/zy6;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/zy6;-><init>(Ljava/util/Map$Entry;)V

    const v3, 0x7f0d10b5

    invoke-static {v1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/az6;

    invoke-direct {v4, v0, v2, p0}, Lcom/android/mltcode/paycertificationapi/az6;-><init>(Ljava/util/Map$Entry;Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    const v2, 0x7f0d10b6

    invoke-static {v3, v2, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_5
    return-void
.end method

.method private static final doItem$lambda$1(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuEnable(Z)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ty6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ty6;-><init>(Ljava/util/Map$Entry;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$1$0(Ljava/util/Map$Entry;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0c63

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$2(Ljava/util/Map$Entry;Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    const/4 p0, 0x4

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/uy6;

    invoke-direct {p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/uy6;-><init>(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/vy6;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/vy6;-><init>(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$2$0(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 2

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a18c9

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result p5

    iget-object p6, p1, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p6

    invoke-static {p5, p6}, Lcom/android/mltcode/paycertificationapi/cp5;->IXXOO(FI)F

    move-result p5

    invoke-static {p5}, Lcom/android/mltcode/paycertificationapi/cp5;->OIX0iXi(F)F

    move-result p5

    iget-object p6, p1, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result p6

    invoke-static {p6}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result p6

    invoke-virtual {p1, p6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p4, 0x7f0a0c45

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide p5

    const-wide/16 v0, 0x0

    cmpg-double p5, p5, v0

    if-nez p5, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result p5

    iget-object p6, p1, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p6}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result p6

    invoke-static {p5, p6}, Lcom/android/mltcode/paycertificationapi/cp5;->I0IIOi(FF)Ljava/lang/String;

    move-result-object p5

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMBmi()D

    move-result-wide p5

    invoke-static {p5, p6}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->keepOneDecimal(D)Ljava/lang/String;

    move-result-object p5

    :goto_0
    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMIsMeasure()I

    move-result p4

    const/4 p5, 0x1

    const p6, 0x7f0a0c40

    const v0, 0x7f0a0652

    const v1, 0x7f0a0653

    if-ne p4, p5, :cond_5

    invoke-virtual {p3, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    if-eqz p4, :cond_3

    const p5, 0x7f0812e7

    invoke-virtual {p4, p5}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    if-eqz p4, :cond_4

    const/4 p5, 0x0

    invoke-virtual {p4, p5}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_4
    invoke-virtual {p3, p6}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMRatioOfFat()D

    move-result-wide p5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p5, "%"

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p3, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    if-eqz p4, :cond_6

    const p5, 0x7f0812e6

    invoke-virtual {p4, p5}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_6
    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    if-eqz p4, :cond_7

    const/4 p5, 0x4

    invoke-virtual {p4, p5}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_7
    invoke-virtual {p3, p6}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_8

    const p5, 0x7f1403bc

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(I)V

    :cond_8
    :goto_1
    new-instance p4, Lcom/android/mltcode/paycertificationapi/xy6;

    invoke-direct {p4, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/xy6;-><init>(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;)V

    const p0, 0x7f0a019c

    invoke-virtual {p3, p0, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final doItem$lambda$2$0$0(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)V
    .locals 3

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Lcom/sma/smartv3/db/entity/Weight;->setMIsSync(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/db/entity/Weight;->setMIsDelete(I)V

    iget-object v1, p1, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    filled-new-array {p0}, [Lcom/sma/smartv3/db/entity/Weight;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v1, p0}, Lcom/sma/smartv3/db/dao/WeightDao;->update(Ljava/util/List;)I

    const-string p0, "weight_change"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->get_itemSwipeMenuHelper()Lcom/angcyo/dsladapter/SwipeMenuHelper;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p3}, Lcom/angcyo/dsladapter/SwipeMenuHelper;->closeSwipeMenu(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0, p2, p4, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;ZILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroups()Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->removeGroup(Ljava/util/List;)V

    return-void
.end method

.method private static final doItem$lambda$2$1(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Weight;->getMIsMeasure()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p2, v0, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/status/WeightMeasureReportActivity;

    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Ljava/util/Map$Entry;Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem$lambda$2(Ljava/util/Map$Entry;Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f0d0f6a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fz6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/fz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslLoadMoreItem()Lcom/angcyo/dsladapter/DslLoadMoreItem;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sy6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslLoadMoreItem;->setOnLoadMore(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yy6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMoreEnable(Z)V

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->loadData(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslViewHolder;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bz6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ry6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ry6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->loadData(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onMeasureWeightChanged$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ez6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ez6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onMeasureWeightChanged$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->onRefresh()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final removeGroup(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->iIXi1iiXI(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    invoke-static {v5, p1, v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->iIXi1iiXI(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-static {p1, v3, v4, v3}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-static {p1, v4, v3, v2, v3}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-static {p1, v3, v4, v3}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private static final scrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09e9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

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

.method public final getScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->scrollView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

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

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ea7

    return v0
.end method

.method public final loadData(I)V
    .locals 11

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    add-int/lit8 v1, p1, -0x1

    iget v2, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageSize:I

    mul-int/2addr v1, v2

    invoke-interface {v0, v1, v2}, Lcom/sma/smartv3/db/dao/WeightDao;->getWeightsDESC(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-static {p1, v0, v4, v3, v4}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-static {p1, v2, v4, v3, v4}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->doItem(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMore$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Object;ZILjava/lang/Object;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wy6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lcom/angcyo/dsladapter/SwipeMenuHelper;->Companion:Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->recyclerViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/SwipeMenuHelper$OXO1;->OXO1(Landroidx/recyclerview/widget/RecyclerView;)Lcom/angcyo/dsladapter/SwipeMenuHelper;

    return-void
.end method

.method public final onMeasureWeightChanged(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "measure_weight_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onMeasureWeightChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dz6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dz6;-><init>(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onRefresh()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->pageNum:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->loadData(I)V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const v0, 0x7f0a0b16

    return v0
.end method

.method public final share()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->getScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-scrollView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->iO(Landroidx/core/widget/NestedScrollView;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method
