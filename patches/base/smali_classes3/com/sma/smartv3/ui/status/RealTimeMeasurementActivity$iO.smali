.class public final Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;->IO:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "measure MeasurementComplete"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;->IO:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->access$onMeasurementComplete(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    return-void
.end method
