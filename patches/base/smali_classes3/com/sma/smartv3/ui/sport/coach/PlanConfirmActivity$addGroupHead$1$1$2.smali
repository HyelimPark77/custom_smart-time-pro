.class public final Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addGroupHead()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $title:Landroid/widget/TextView;

.field final synthetic $viewPager:Landroidx/viewpager2/widget/ViewPager2;

.field final synthetic $weekPagerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroidx/viewpager2/widget/ViewPager2;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;",
            "Landroidx/viewpager2/widget/ViewPager2;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$title:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;

    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p4, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$weekPagerList:Ljava/util/List;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

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
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$title:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->this$0:Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;

    const v1, 0x7f1414f1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;->$weekPagerList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
