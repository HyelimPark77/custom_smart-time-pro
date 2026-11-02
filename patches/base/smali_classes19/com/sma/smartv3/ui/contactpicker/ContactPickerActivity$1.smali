.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onContactSelected(Lcom/sma/smartv3/ui/contactpicker/Contact;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "contact",
            "totalSelectedContacts"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->XX0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->XXI(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;->selectionMode:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity$1;->this$0:Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;->iIiiO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerActivity;)V

    :cond_0
    return-void
.end method
