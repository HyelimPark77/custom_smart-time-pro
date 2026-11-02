.class public final Lcom/sma/smartv3/view/WheelView/OXO1;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field public static final XIi00iiXO:I = 0x3e8

.field public static final XO0O10:I = 0xbb8

.field public static final iO:I = 0x7d0


# instance fields
.field public OXO1:Lcom/sma/smartv3/view/WheelView/WheelView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/WheelView/WheelView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "loopview"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/OXO1;->OXO1:Lcom/sma/smartv3/view/WheelView/WheelView;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msg"
        }
    .end annotation

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d0

    if-eq p1, v0, :cond_1

    const/16 v0, 0xbb8

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/WheelView/OXO1;->OXO1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->IiI10X()V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/WheelView/OXO1;->OXO1:Lcom/sma/smartv3/view/WheelView/WheelView;

    sget-object v0, Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;->FLING:Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIX0iXi(Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/view/WheelView/OXO1;->OXO1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
