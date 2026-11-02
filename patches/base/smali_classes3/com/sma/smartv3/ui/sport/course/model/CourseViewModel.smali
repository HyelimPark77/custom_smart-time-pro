.class public final Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n50#2,3:58\n53#2:64\n55#2,2:66\n1563#3:61\n1634#3,2:62\n1636#3:65\n*S KotlinDebug\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n*L\n22#1:58,3\n22#1:64\n22#1:66,2\n22#1:61\n22#1:62,2\n22#1:65\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n50#2,3:58\n53#2:64\n55#2,2:66\n1563#3:61\n1634#3,2:62\n1636#3:65\n*S KotlinDebug\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n*L\n22#1:58,3\n22#1:64\n22#1:66,2\n22#1:61\n22#1:62,2\n22#1:65\n*E\n"
    }
.end annotation


# instance fields
.field private final courseLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecommendSearch;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->courseLiveData:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;[Lcom/sma/smartv3/model/RecommendSearch;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getRecommendSearchListList$lambda$0(Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;[Lcom/sma/smartv3/model/RecommendSearch;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getRecommendSearchListList()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIOO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OIOO;-><init>(Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;)V

    const-string v2, "INDEX"

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/biz/CourseManager;->I1XOi1(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getRecommendSearchListList$lambda$0(Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;[Lcom/sma/smartv3/model/RecommendSearch;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->courseLiveData:Landroidx/lifecycle/MutableLiveData;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getTime(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/RecommendSearch;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/RecommendSearch;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/RecommendSearch;->getOnCreateTime()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/32 v1, 0x5265c00

    cmp-long p1, v3, v1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method


# virtual methods
.method public final getCourseLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecommendSearch;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->courseLiveData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getData()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->O00()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "RECOMMEND_SEARCH"

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

    const-class v4, Lcom/sma/smartv3/model/RecommendSearch;

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
    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getTime(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getRecommendSearchListList()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->courseLiveData:Landroidx/lifecycle/MutableLiveData;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getRecommendSearchListList()V

    :goto_1
    return-void
.end method
