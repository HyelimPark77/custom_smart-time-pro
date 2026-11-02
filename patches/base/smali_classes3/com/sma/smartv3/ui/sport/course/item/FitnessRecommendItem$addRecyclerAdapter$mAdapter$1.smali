.class public final Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->addRecyclerAdapter(Landroidx/recyclerview/widget/RecyclerView;ILcom/sma/smartv3/model/RecommendSearch;Lcom/sma/smartv3/view/text/PFMedium;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/CourseRecommendList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n87#2,7:143\n94#2,3:151\n70#2,7:154\n97#2:161\n1#3:150\n*S KotlinDebug\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n*L\n105#1:143,7\n105#1:151,3\n105#1:154,7\n105#1:161\n105#1:150\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n87#2,7:143\n94#2,3:151\n70#2,7:154\n97#2:161\n1#3:150\n*S KotlinDebug\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1\n*L\n105#1:143,7\n105#1:151,3\n105#1:154,7\n105#1:161\n105#1:150\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $type:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;ILandroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;",
            "I",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CourseRecommendList;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;

    iput p2, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->$type:I

    const p1, 0x7f0d0ee7

    invoke-direct {p0, p3, p1, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseRecommendList;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseRecommendList;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseRecommendList;Landroid/view/View;)V
    .locals 2

    iget-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/app/Activity;

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const v0, 0x7f140bcd

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/model/CourseRecommendList;->setCourseTitle(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/CourseDetails;->getId()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "mArg1"

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p0, "mArg3"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p0, Landroid/content/Intent;

    const-class p1, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;

    invoke-direct {p0, p2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p2, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseRecommendList;I)V
    .locals 4

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a02ad

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;

    iget v2, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->$type:I

    invoke-virtual {v1, p3, v2}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->setBackgroundResource(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p3

    .line 4
    invoke-virtual {v0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getCoursePic1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    const v0, 0x7f0a02ab

    .line 6
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 7
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CourseDetails;->getCourseClass()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f1410b5

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0c5e

    .line 8
    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CourseDetails;->getCourseName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a05df

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/CourseDetails;->getCourseDiff()Ljava/lang/String;

    move-result-object p3

    .line 11
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseTime()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f1403a1

    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseRecommendList;->getCourse()Lcom/sma/smartv3/model/CourseDetails;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseHeat()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const v3, 0x7f140d64

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "  "

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a05dc

    .line 15
    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 16
    new-instance p3, Lcom/android/mltcode/paycertificationapi/OX0O1XiI;

    invoke-direct {p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/OX0O1XiI;-><init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseRecommendList;)V

    const p2, 0x7f0a02ac

    invoke-virtual {p1, p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/CourseRecommendList;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseRecommendList;I)V

    return-void
.end method
