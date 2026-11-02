.class public final Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$initAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initAdapter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
        "Lcom/sma/smartv3/model/AISpeech;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AISpeech;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    new-instance p1, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$initAdapter$1$OXO1;

    invoke-direct {p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$initAdapter$1$OXO1;-><init>()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-void
.end method
