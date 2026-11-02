.class public final Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->addRecyclerCourseAdapter(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/CourseList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n87#2,7:301\n94#2,3:309\n70#2,7:312\n97#2:319\n1#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n*L\n174#1:301,7\n174#1:309,3\n174#1:312,7\n174#1:319\n174#1:308\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n87#2,7:301\n94#2,3:309\n70#2,7:312\n97#2:319\n1#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1\n*L\n174#1:301,7\n174#1:309,3\n174#1:312,7\n174#1:319\n174#1:308\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/app/Activity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseList;",
            ">;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    const v0, 0x7f0d0ebe

    invoke-direct {p0, p2, v0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseList;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseList;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseList;Landroid/view/View;)V
    .locals 2

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string p2, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseList;->getId()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseList;I)V
    .locals 5

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseList;->getCoursePic1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    const v0, 0x7f0a02a8

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p3, 0x7f0a02a4

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseList;->getCourseName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseList;->getCourseDiff()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseList;->getCourseTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const v2, 0x7f140f5d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourseList;->getCourseHeat()Ljava/lang/String;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const v4, 0x7f140d64

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "  "

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0298

    .line 7
    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 8
    new-instance p3, Lcom/android/mltcode/paycertificationapi/X1OII0;

    invoke-direct {p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/X1OII0;-><init>(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;Lcom/sma/smartv3/model/CourseList;)V

    const p2, 0x7f0a02ac

    invoke-virtual {p1, p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/CourseList;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourseList;I)V

    return-void
.end method
