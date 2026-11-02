.class public Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/swipelist/DragListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/swipelist/DragListView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/swipelist/DragListView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->O00(Lcom/sma/smartv3/view/swipelist/DragListView;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    invoke-static {v0}, Lcom/sma/smartv3/view/swipelist/DragListView;->XIi00iiXO(Lcom/sma/smartv3/view/swipelist/DragListView;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/view/swipelist/DragListView;->XO0O10(Lcom/sma/smartv3/view/swipelist/DragListView;J)V

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    invoke-static {v0}, Lcom/sma/smartv3/view/swipelist/DragListView;->iO(Lcom/sma/smartv3/view/swipelist/DragListView;)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->OIi0(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/DragListView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
