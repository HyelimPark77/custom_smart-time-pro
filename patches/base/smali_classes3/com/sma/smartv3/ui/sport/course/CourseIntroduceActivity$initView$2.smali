.class public final Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->setCurPosition(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMIntroduceCur()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getCurPosition()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
