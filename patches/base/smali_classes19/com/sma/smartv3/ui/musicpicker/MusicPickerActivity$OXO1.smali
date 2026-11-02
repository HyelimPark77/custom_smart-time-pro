.class public Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/android/mltcode/paycertificationapi/fw0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "music",
            "totalSelectedMusics"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XX0(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->XXI(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;->selectionMode:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;->iIiiO(Lcom/sma/smartv3/ui/musicpicker/MusicPickerActivity;)V

    :cond_0
    return-void
.end method
