.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->listener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "v"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->IIX1OXO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$iO;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioManager;->stopBluetoothSco()V

    return-void
.end method
