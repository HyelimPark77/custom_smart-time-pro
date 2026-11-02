.class public final Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2;->handleError(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $act:Landroidx/appcompat/app/AppCompatActivity;

.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $error:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$act:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$error:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$act:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$act:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$error:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->errorData(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    :cond_1
    :goto_0
    return-void
.end method
