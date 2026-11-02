.class public Lcom/sma/smartv3/view/PagerIndicator$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/PagerIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/PagerIndicator;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/PagerIndicator;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    invoke-static {v0}, Lcom/sma/smartv3/view/PagerIndicator;->XIi00iiXO(Lcom/sma/smartv3/view/PagerIndicator;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/sma/smartv3/view/PagerIndicator;->iO(Lcom/sma/smartv3/view/PagerIndicator;I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    invoke-static {v0}, Lcom/sma/smartv3/view/PagerIndicator;->XIi00iiXO(Lcom/sma/smartv3/view/PagerIndicator;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    invoke-static {v1}, Lcom/sma/smartv3/view/PagerIndicator;->OXO1(Lcom/sma/smartv3/view/PagerIndicator;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/sma/smartv3/view/PagerIndicator;->iO(Lcom/sma/smartv3/view/PagerIndicator;I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/sma/smartv3/view/PagerIndicator$OXO1;->IO:Lcom/sma/smartv3/view/PagerIndicator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
