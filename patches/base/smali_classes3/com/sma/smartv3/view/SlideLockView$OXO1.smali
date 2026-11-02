.class public final Lcom/sma/smartv3/view/SlideLockView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/SlideLockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/SlideLockView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v0, p1}, Lcom/sma/smartv3/view/SlideLockView;->X0O(Lcom/sma/smartv3/view/SlideLockView;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/view/SlideLockView;->X1ii(Lcom/sma/smartv3/view/SlideLockView;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->OIi0(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result p1

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SlideLockView;->XXI(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr p1, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->I0iXXO(Lcom/sma/smartv3/view/SlideLockView;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1, v0}, Lcom/sma/smartv3/view/SlideLockView;->X0O(Lcom/sma/smartv3/view/SlideLockView;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->XXI(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->OXO1()V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->OXO1(Lcom/sma/smartv3/view/SlideLockView;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->XXI(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->setEnable(Z)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->IO(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$iO;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->IO(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$iO;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/sma/smartv3/view/SlideLockView$iO;->OXO1()V

    :cond_2
    return-void
.end method

.method public XIi00iiXO(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v0, p1}, Lcom/sma/smartv3/view/SlideLockView;->X1ii(Lcom/sma/smartv3/view/SlideLockView;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$OXO1;->OXO1:Lcom/sma/smartv3/view/SlideLockView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
