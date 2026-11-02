.class public final Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1#2:301\n1#2:305\n69#3,3:302\n72#3,5:306\n50#4,3:311\n53#4:317\n55#4,2:319\n1563#5:314\n1634#5,2:315\n1636#5:318\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n*L\n255#1:305\n255#1:302,3\n255#1:306,5\n247#1:311,3\n247#1:317\n247#1:319,2\n247#1:314\n247#1:315,2\n247#1:318\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1#2:301\n1#2:305\n69#3,3:302\n72#3,5:306\n50#4,3:311\n53#4:317\n55#4,2:319\n1563#5:314\n1634#5,2:315\n1636#5:318\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n*L\n255#1:305\n255#1:302,3\n255#1:306,5\n247#1:311,3\n247#1:317\n247#1:319,2\n247#1:314\n247#1:315,2\n247#1:318\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private courseDiff:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private coursePart:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private courseSortType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private courseType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/model/CourseType;",
            ">;"
        }
    .end annotation
.end field

.field private mListCoursePartPopData:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CourSelectByType;",
            ">;"
        }
    .end annotation
.end field

.field private mListCourseSortTypeData:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CourSelectByType;",
            ">;"
        }
    .end annotation
.end field

.field private mListPop:Lcom/android/mltcode/paycertificationapi/fp;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mListPop2:Lcom/android/mltcode/paycertificationapi/fp;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mListPop3:Lcom/android/mltcode/paycertificationapi/fp;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mListPopData:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CourSelectByType;",
            ">;"
        }
    .end annotation
.end field

.field private final mRecyclerViewCourse$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecyclerViewType$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIi1Oi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIi1Oi;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xii0IXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xii0IXI;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewType$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0I1iiI0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0I1iiI0I;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewCourse$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPopData:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCoursePartPopData:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCourseSortTypeData:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewCourse_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewType_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourSelectByType;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourSelectByType;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getOnLineCourseList$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourseType;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourseType$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourseType;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getMListPop$p(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Lcom/android/mltcode/paycertificationapi/fp;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPop:Lcom/android/mltcode/paycertificationapi/fp;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerViewCourse(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getMRecyclerViewCourse()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getCourSelectByType(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOiI;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/OOiI;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/CourseManager;->OIi0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getCourSelectByType$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourSelectByType;)Lkotlin/Unit;
    .locals 2

    if-eqz p2, :cond_3

    array-length v0, p2

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    invoke-static {p2}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const-string v0, "course_diff"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p1, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPopData:Ljava/util/ArrayList;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_1
    const-string v0, "course_part"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    iget-object p0, p1, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCoursePartPopData:Ljava/util/ArrayList;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    iget-object p0, p1, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCourseSortTypeData:Ljava/util/ArrayList;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    const p0, 0x7f14018a

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getCourseType()V
    .locals 4

    .line 2
    sget-object v0, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOXI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IOXI;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/sma/smartv3/biz/CourseManager;->X1ii(Lcom/sma/smartv3/biz/CourseManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final getCourseType$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;[Lcom/sma/smartv3/model/CourseType;)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    xor-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    invoke-static {v1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/sma/smartv3/model/CourseType;

    const v2, 0x7f140114

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v2, "getString(...)"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x3fb

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lcom/sma/smartv3/model/CourseType;->copy$default(Lcom/sma/smartv3/model/CourseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/CourseType;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getMRecyclerViewType()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    const-string v3, "<get-mRecyclerViewType>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->addRecyclerTypeAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    const v0, 0x7f14018a

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private final getMRecyclerViewCourse()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewCourse$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMRecyclerViewType()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mRecyclerViewType$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private static final getOnLineCourseList$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Z)Lkotlin/Unit;
    .locals 5

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getMRecyclerViewCourse()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const-string v0, "<get-mRecyclerViewCourse>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->O00()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "COURSE_LIST_DATA"

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

    const-class v4, Lcom/sma/smartv3/model/CourseList;

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

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->addRecyclerCourseAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mRecyclerViewCourse_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a00b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mRecyclerViewType_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a00b6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method


# virtual methods
.method public final addRecyclerCourseAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseList;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mRecyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;

    invoke-direct {v1, p2, v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;-><init>(Ljava/util/List;Landroid/app/Activity;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public final addRecyclerTypeAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mRecyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;

    invoke-direct {v2, p2, v0, p0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;-><init>(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Landroid/app/Activity;)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method

.method public final getCourseDiff()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseDiff:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoursePart()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->coursePart:Ljava/lang/String;

    return-object v0
.end method

.method public final getCourseSortType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseSortType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCourseType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseType:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnLineCourse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "dictValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "diff"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "heat"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final getOnLineCourseList()V
    .locals 6

    sget-object v0, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseType:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseDiff:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->coursePart:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseSortType:Ljava/lang/String;

    new-instance v5, Lcom/android/mltcode/paycertificationapi/I0O0O1XI;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/I0O0O1XI;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)V

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/biz/CourseManager;->O10IXXX0X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourseType()V

    const-string p1, "course_diff"

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    const-string p1, "course_part"

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    const-string p1, "course_sortType"

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140114

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getOnLineCourseList()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08133f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0030

    return v0
.end method

.method public final onCurriculum(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCourseSortTypeData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v1, "course_sortType"

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCourseSortTypeData:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->showListPoP(Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public final onDifficulty(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPopData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v1, "course_diff"

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPopData:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->showListPoP(Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public final onExercisePart(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCoursePartPopData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v1, "course_part"

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getCourSelectByType(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListCoursePartPopData:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->showListPoP(Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/sport/course/CourseSearchActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final setCourseDiff(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseDiff:Ljava/lang/String;

    return-void
.end method

.method public final setCoursePart(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->coursePart:Ljava/lang/String;

    return-void
.end method

.method public final setCourseSortType(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseSortType:Ljava/lang/String;

    return-void
.end method

.method public final setCourseType(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->courseType:Ljava/lang/String;

    return-void
.end method

.method public final showListPoP(Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourSelectByType;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fp;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/fp;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;

    invoke-direct {v2, p2, p3, p0, v1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/fp;->I0IIOi(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->mListPop:Lcom/android/mltcode/paycertificationapi/fp;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/fp;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method
