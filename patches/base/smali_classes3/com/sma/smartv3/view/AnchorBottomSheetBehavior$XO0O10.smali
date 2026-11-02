.class public Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "XO0O10"
.end annotation


# instance fields
.field public final I1:I

.field public final IO:Landroid/view/View;

.field public final synthetic iX1O1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0,
            0x0
        }
        names = {
            "this$0",
            "view",
            "targetState"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->iX1O1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->IO:Landroid/view/View;

    iput p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->I1:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->iX1O1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OIX0iXi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Landroidx/customview/widget/ViewDragHelper;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->iX1O1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OIX0iXi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Landroidx/customview/widget/ViewDragHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/customview/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->IO:Landroid/view/View;

    invoke-static {v0, p0}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->iX1O1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    iget v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;->I1:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->X1ii(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V

    return-void
.end method
