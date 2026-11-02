.class public Lcom/sma/smartv3/view/MarqueeTextView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/MarqueeTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/MarqueeTextView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/MarqueeTextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;->IO:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;->IO:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {v0}, Lcom/sma/smartv3/view/MarqueeTextView;->I0IIOi(Lcom/sma/smartv3/view/MarqueeTextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;->IO:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {v0}, Lcom/sma/smartv3/view/MarqueeTextView;->XIi00iiXO(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;->IO:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {v1}, Lcom/sma/smartv3/view/MarqueeTextView;->iO(Lcom/sma/smartv3/view/MarqueeTextView;)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
