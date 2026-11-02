.class public final Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->addRecyclerTypeAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/CourseType;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n50#2,3:301\n53#2:307\n55#2,2:309\n1563#3:304\n1634#3,2:305\n1636#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n*L\n144#1:301,3\n144#1:307\n144#1:309,2\n144#1:304\n144#1:305,2\n144#1:308\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n50#2,3:301\n53#2:307\n55#2,2:309\n1563#3:304\n1634#3,2:305\n1636#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n*L\n144#1:301,3\n144#1:307\n144#1:309,2\n144#1:304\n144#1:305,2\n144#1:308\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $curPosition:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseType;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->$curPosition:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;

    const p2, 0x7f0d0ebf

    invoke-direct {p0, p4, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/internal/Ref$IntRef;ILcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourseType;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->convert$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;ILcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourseType;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;ILcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourseType;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;Landroid/view/View;)V
    .locals 1

    iput p1, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CourseType;->getDictValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->setCourseType(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getOnLineCourseList()V

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-static {p2}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->access$getMRecyclerViewCourse(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    const-string p1, "access$getMRecyclerViewCourse(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->O00()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p3, "COURSE_LIST_DATA"

    :try_start_0
    invoke-virtual {p1, p3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p1, p4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/google/gson/JsonElement;

    new-instance p5, Lcom/google/gson/Gson;

    invoke-direct {p5}, Lcom/google/gson/Gson;-><init>()V

    const-class v0, Lcom/sma/smartv3/model/CourseList;

    invoke-virtual {p5, p4, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p3

    :cond_0
    check-cast p3, Ljava/util/Collection;

    invoke-static {p3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->addRecyclerCourseAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseType;I)V
    .locals 9

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a02b1

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a02b2

    .line 3
    invoke-virtual {p1, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseType;->getDictLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->$curPosition:Lkotlin/jvm/internal/Ref$IntRef;

    iget v3, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-ne v3, p3, :cond_0

    .line 6
    iget-object v3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06006c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const v2, 0x7f0816bd

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    .line 9
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    iget-object v2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 12
    :goto_0
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->$curPosition:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iO0i1;

    move-object v8, p0

    move-object v7, p2

    move v5, p3

    invoke-direct/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/iO0i1;-><init>(Lkotlin/jvm/internal/Ref$IntRef;ILcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourseType;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;)V

    invoke-virtual {p1, v0, v3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/CourseType;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseType;I)V

    return-void
.end method
