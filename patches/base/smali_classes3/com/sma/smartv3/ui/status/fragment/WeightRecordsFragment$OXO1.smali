.class public final Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$OXO1;
.super Lcom/android/mltcode/paycertificationapi/he6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/he6;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(F)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->access$isImperial$p(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    float-to-int p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->access$getMActivity(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f140dff

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    float-to-int p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->access$getMActivity(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f140d68

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
