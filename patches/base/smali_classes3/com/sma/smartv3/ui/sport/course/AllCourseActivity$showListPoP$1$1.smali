.class public final Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->showListPoP(Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/CourSelectByType;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $type:Ljava/lang/String;

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourSelectByType;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->$type:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;

    const p2, 0x7f0d0ec0

    invoke-direct {p0, p4, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourSelectByType;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->convert$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourSelectByType;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourSelectByType;Landroid/view/View;)V
    .locals 1

    const-string p3, "course_diff"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourSelectByType;->getDictValue()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->setCourseDiff(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p3, "course_part"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourSelectByType;->getDictValue()Ljava/lang/String;

    move-result-object v0

    :cond_2
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->setCoursePart(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourSelectByType;->getDictValue()Ljava/lang/String;

    move-result-object v0

    :cond_4
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->setCourseSortType(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->getOnLineCourseList()V

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;->access$getMListPop$p(Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;)Lcom/android/mltcode/paycertificationapi/fp;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5
    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourSelectByType;I)V
    .locals 3

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/CourSelectByType;->getDictLabel()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "   "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a02b1

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 3
    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->$type:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->this$0:Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X1I00OX0;

    invoke-direct {v2, p3, v1, p2}, Lcom/android/mltcode/paycertificationapi/X1I00OX0;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/sport/course/AllCourseActivity;Lcom/sma/smartv3/model/CourSelectByType;)V

    invoke-virtual {p1, v0, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/CourSelectByType;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/AllCourseActivity$showListPoP$1$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/CourSelectByType;I)V

    return-void
.end method
