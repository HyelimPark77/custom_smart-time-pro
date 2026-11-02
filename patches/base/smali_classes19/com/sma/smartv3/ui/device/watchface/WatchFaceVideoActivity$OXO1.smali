.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->initEditFrameView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$setMTotalCount$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getMDefaultFrameCount$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$setMTotalCount$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;I)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$getEtFrameEdit(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)Landroid/widget/EditText;

    move-result-object p1

    const-string v1, "1"

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setSelection(I)V

    :goto_0
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;->access$releaseBackgroundImagePlayback(Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
